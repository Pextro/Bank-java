package com.bank.study.interfacepolimorfimos;

public class Retangulo implements FormaGeometrica {
    private final double altura;
    private final double lado;

    public  Retangulo(double altura, double lado){
        this.altura = altura;
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return altura * lado;
    }

    @Override
    public String nomeForma() {
        return "Retangulo";
    }
}
