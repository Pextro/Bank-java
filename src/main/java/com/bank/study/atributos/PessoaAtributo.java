package com.bank.study.atributos;

public class PessoaAtributo {
    public String namePublic;
    private int idadePrivado;
    protected String apelidoProtegido;
    protected String e = "erro";

    public static String namePublicStatic;
    public static final String NAME_PUBLIC_FINAL = "final";

    public int getIdadePrivado(){
        return this.idadePrivado;
    }
    public void setIdadePrivado(int idade){
        this.idadePrivado = idade;
    }
}
