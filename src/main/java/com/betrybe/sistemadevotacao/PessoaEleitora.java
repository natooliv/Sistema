package com.betrybe.sistemadevotacao;

public class PessoaEleitora extends Pessoa {
  private String identificadorCpf; // Identificador CPF da pessoa eleitora

  // Construtor que aceita nome e identificadorCPF
  public PessoaEleitora(String nomeIndividual, String identificadorCpf) {
    super(nomeIndividual);  // chama o construtor da classe base
    this.identificadorCpf = identificadorCpf;
  }

  // Getter para identificadorCPF
  public String getIdentificadorCpf() {
    return identificadorCpf;
  }

  // Setter para identificadorCPF
  public void setIdentificadorCpf(String identificadorCpf) {
    this.identificadorCpf = identificadorCpf;
  }
}
