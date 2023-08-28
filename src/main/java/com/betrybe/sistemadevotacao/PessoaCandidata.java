package com.betrybe.sistemadevotacao;


public class PessoaCandidata extends Pessoa {

  private int identificadorVoto;     // identificador para votação
  private int quantidadeVotos;       // quantidade de votos recebidos pela pessoa candidata

  /**
   * Construtor para a classe PessoaCandidata.
   *
   * @param nomeCompleto Nome completo da pessoa candidata.
   * @param identificadorVoto Identificador para votação da pessoa candidata.
   */
  public PessoaCandidata(String nomeCompleto, int identificadorVoto) {
    super(nomeCompleto);           // chama o construtor da classe base
    this.identificadorVoto = identificadorVoto;
    this.quantidadeVotos = 0;      // inicializa quantidadeVotos com zero
  }


  public int getIdentificadorVoto() {
    return identificadorVoto;
  }


  public void setIdentificadorVoto(int identificadorVoto) {
    this.identificadorVoto = identificadorVoto;
  }


  public int getQuantidadeVotos() {
    return quantidadeVotos;
  }

  public void receberVoto() {
    this.quantidadeVotos++;
  }
}

