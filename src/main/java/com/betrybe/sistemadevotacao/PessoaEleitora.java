package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String cpf; // Identificador CPF da pessoa eleitora

  // Construtor que aceita nome e CPF
  public PessoaEleitora(String nomeIndividual, String cpf) {
    super(nomeIndividual);  // chama o construtor da classe base
    this.cpf = cpf;
  }

  // Getter para CPF
  public String getCpf() {
    return cpf;
  }

  // Setter para CPF
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
}
