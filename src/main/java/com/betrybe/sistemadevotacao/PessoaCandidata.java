package com.betrybe.sistemadevotacao;

public class PessoaCandidata extends Pessoa {

  private int numero;     // identificador para votação
  private int votos;      // quantidade de votos recebidos pela pessoa candidata

  /**
   * Construtor para a classe PessoaCandidata.
   *
   * @param nomeCompleto Nome completo da pessoa candidata.
   * @param numero Identificador para votação da pessoa candidata.
   */
  public PessoaCandidata(String nomeCompleto, int numero) {
    super(nomeCompleto);  // chama o construtor da classe base
    this.numero = numero;
    this.votos = 0;       // inicializa votos com zero
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  // Método adicionado para definir votos
  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos++;
  }
}
