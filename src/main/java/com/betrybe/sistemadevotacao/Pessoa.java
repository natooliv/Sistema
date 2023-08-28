package com.betrybe.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  // Construtor padrão
  public Pessoa() {
    this.nome = "";
  }

  // Construtor com nomeCompleto
  public Pessoa(String nomeCompleto) {
    this.nome = nomeCompleto;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nomeCompleto) {
    this.nome = nomeCompleto;
  }
}
