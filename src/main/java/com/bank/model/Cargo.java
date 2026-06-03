package com.bank.model;

public enum Cargo {
    CAIXA("Trabalha no caixa da agencia",1600.0,2000.0),TERCEIRO("Empresa terceirizada",2500.0,3000.0),DIRETOR("Diretor do banco",4000.0,5000.0),GERENTE("Gerente da agencia",3000.0,3500.0);

    private String descricao;
    private Double salarioMin;
    private Double salarioMax;

    Cargo(String descricao,Double salarioMin,Double salarioMax){
        this.descricao = descricao;
        this.salarioMin = salarioMin;
        this.salarioMax = salarioMax;
    }
    public String getDescricao(){
        return descricao;
    }
    public Double getSalarioMin(){
        return salarioMin;
    }
    public Double getSalarioMax(){
        return salarioMax;
    }
}
