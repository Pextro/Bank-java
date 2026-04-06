package com.bank.study.condicoes;

import com.bank.study.atributos.PessoaAtributo;
import com.bank.study.atributos.TestePessoaAtributo;

import java.util.Scanner;

public class TesteCondicoes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //System.out.println("Digite o seu nome?");
        //String nome = scan.next();

        System.out.print("Digite sua idade: ");
        int idade = scan.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else {
            System.out.println("Você é menor de idade");
        }
        System.out.println("----------------------");

        if(idade <= 10){
            System.out.println("Você é uma criança");
        } else if (idade >=10) {
            System.out.println("Você é um adolecente");
        } else if (idade >= 60) {
            System.out.println("Você é um idoso");
        }
        System.out.println("----------------------");
        System.out.println("Escolha a opção que mais chega perto de sua idade:");
        System.out.println("1 - entre 10 a 18");
        System.out.println("2 - entre 18 a 50");
        System.out.println("3 - entre 50+");
        int escolha = scan.nextInt();

        switch (escolha){
            case 1:
                System.out.println("Você escolheu a primeira opção");
                break;
            case 2:
                System.out.println("Você escolheu a segunda opção");
                break;
            case 3:
                System.out.println("Você escolheu a terceira opção");
                break;
            default:
                System.out.println("Categoria não identificada.");
                break;
        }
        System.out.println(idade >= 18?"maior de idade":"menor de idade");

        scan.close();
    }
}
