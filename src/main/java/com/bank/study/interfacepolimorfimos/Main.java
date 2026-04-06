package com.bank.study.interfacepolimorfimos;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] calculo = new FormaGeometrica[3];

        calculo[0] = new Quadrado(2);
        calculo[1] = new Retangulo(2,2);
        calculo[2] = new Triangulo(2,3);

        for(int i = 0;i < calculo.length; i++){
            System.out.println(calculo[i].calculoArea());
            System.out.println(calculo[i].nomeForma());
        }
    }
}
