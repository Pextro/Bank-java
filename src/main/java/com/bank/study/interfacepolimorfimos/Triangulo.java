package com.bank.study.interfacepolimorfimos;

public class Triangulo implements FormaGeometrica{

    private final double base;
    private final double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calculoArea() {
        return base * altura;
    }

    @Override
    public String nomeForma() {
        return "Triangulo";
    }
}
