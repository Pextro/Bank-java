package com.bank.study.loops;

import java.util.ArrayList;
import java.util.List;

public class TesteLoops {
    public static void main(String[] args) {
        int contador = 10;
        while (contador < 10){
            System.out.println(contador);
            contador++;
        }
        do{
            System.out.println(contador);
            contador++;
        }
        while (contador < 10);

        /*for (int i =0;i<=9;i++){
            System.out.println(i);
        }*/
        List<String> nomes = new ArrayList<>();
        nomes.add("pedro");
        nomes.add("joão");
        nomes.add("jose");

        for(int i = 0;i<nomes.size();i++){
            String nome = nomes.get(i);
            System.out.println(nome);
        }
        for(String nome:nomes){
            System.out.println(nome);
        }
        nomes.forEach(nome ->{
            System.out.println(nome);
        });
    }
}
