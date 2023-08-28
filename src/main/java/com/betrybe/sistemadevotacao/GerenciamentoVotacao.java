package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {

  /**
   * Lista de  candidatas.
   */
  public static ArrayList<PessoaCandidata> pessoasCandidatas;
  /**
   * Lista de eleitoras.
   */
  public static ArrayList<PessoaEleitora> pessoasEleitoras;
  /**
   *Lista de Cpfs computados.
   */
  public static ArrayList<String> cpfsComputados;

  /**
   * Instantiates a new Gerenciamento votacao.
   */
  // Construtor do GerenciamentoVotacao
  public GerenciamentoVotacao() {
    GerenciamentoVotacao.pessoasCandidatas = new ArrayList<>();
    GerenciamentoVotacao.pessoasEleitoras = new ArrayList<>();
    GerenciamentoVotacao.cpfsComputados = new ArrayList<>();
  }

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    if (pessoasCandidatas.isEmpty()) {
      PessoaCandidata novaEleitora = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaEleitora);
    } else {
      for (PessoaCandidata pessoa : pessoasCandidatas) {
        if (pessoa.getNumero() == numero) {
          System.out.println("Número da pessoa candidata já utilizado!");
          return;
        }
      }
      PessoaCandidata novaEleitora = new PessoaCandidata(nome, numero);
      pessoasCandidatas.add(novaEleitora);
    }
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    if (pessoasEleitoras.isEmpty()) {
      PessoaEleitora novaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaEleitora);
    } else {
      for (PessoaEleitora pessoa : pessoasEleitoras) {
        if (pessoa.getCpf().equals(cpf)) {
          System.out.println("Pessoa eleitora já cadastrada!");
          return;
        }
      }
      PessoaEleitora novaEleitora = new PessoaEleitora(nome, cpf);
      pessoasEleitoras.add(novaEleitora);
    }
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (!cpfsComputados.isEmpty()) {
      for (String cpf : cpfsComputados) {
        if (cpf.equals(cpfPessoaEleitora)) {
          System.out.println("Pessoa eleitora já votou!");
          return;
        }
      }
    }
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numeroPessoaCandidata) {
        pessoa.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return;
      }
    }
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }
    for (PessoaCandidata candidato : pessoasCandidatas) {
      System.out.println("Nome: " + candidato.getNome()
              + " - " + candidato.getVotos() + " votos ( "
              + (Math.round((candidato.getVotos() * 100.0 / cpfsComputados.size()))) + "% )");
    }
    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}

