package com.bank.model;

public abstract class Conta {

    private String cpf;
    private String numeroConta;
    private String nomeProprietario;
    private String numeroAgencia;
    private String saldo;

    /*public Conta (String cpf, String saldo){
        this.cpf = cpf;
        this.saldo = saldo;
    };*/
    public String getcpf(){
        return this.cpf = cpf;
    }
    public void setcpf(String cpf){
        this.cpf= cpf;
    }
    public String getNumeroConta(){
        return this.numeroConta = numeroConta;
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    public String getNomeProprietario(){
        return  this.nomeProprietario = nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario){
        this.nomeProprietario = nomeProprietario;
    }
    public String getNumeroAgencia(){
        return  this.numeroAgencia = numeroAgencia;
    }
    public void setNumeroAgencia(String numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
    public String getSaldo(){
        return this.saldo = saldo;
    }
    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
