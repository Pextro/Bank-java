package com.bank.study.interfacepolimorfimos;

public class Quadrado implements FormaGeometrica {
    private final double lado;

    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double calculoArea() {
        return lado * lado;
    }

    @Override
    public String nomeForma() {
        return "Quadrado";
    }
}
