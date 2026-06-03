package com.bank.study.estruturadedados;

import java.util.*;

public class TesteSet {
    public static void main(String[] args) {

        List<String> nomesList = new ArrayList<>();

        nomesList.add("Pedro");
        nomesList.add("Pedro");
        nomesList.add("Joao");
        nomesList.add("Joao");
        nomesList.add("Tiago");
        nomesList.add("Fabio");

        for (int i = 0; nomesList.size() < i; i++) {
            System.out.println(nomesList.get(i));
        }
        for (String nome : nomesList) {
            System.out.println(nome);
        }
        nomesList.forEach(nome -> System.out.println(nome));

        Set<String> nomeSet = new HashSet<>();

        for(String nome : nomesList){
            nomeSet.add(nome);
        }
        System.out.println("----------------------------------------------");
        for(String name : nomeSet){
            System.out.println(name);
        }
    }

}






