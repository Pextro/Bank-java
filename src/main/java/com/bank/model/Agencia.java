package com.bank.model;

import java.security.PublicKey;

public class Agencia {

    private int codigoAgencia;
    private String nomeAgencia;

    public Agencia(int codigoAgencia, String nomeAgencia){
        this.codigoAgencia = codigoAgencia;
        this.nomeAgencia = nomeAgencia;
    }

    public Agencia() {

    }

    public int getCodigoAgencia(){
        return this.codigoAgencia;
    }

    public void setCodigoAgencia(int codigoAgencia){
        this.codigoAgencia = codigoAgencia;
    }

    public String getNomeAgencia(){
        return this.nomeAgencia;
    }

    public void setNomeAgencia(String nomeAgencia) {
        this.nomeAgencia = nomeAgencia;
    }
}
