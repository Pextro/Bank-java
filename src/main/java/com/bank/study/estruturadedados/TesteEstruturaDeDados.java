package com.bank.study.estruturadedados;

public class TesteEstruturaDeDados {
    public static void main(String[] args) {
        String[]nomes = new String[10];
        nomes[0] = "pedro";
        nomes[1] = "joão";
        nomes[2] = "antonia";
        for (int i = 0;i< nomes.length;i++){
            System.out.println(nomes[i]);
        }
        Produto[]produtos = new Produto[10];
        Produto produto = new Produto("maça","Frutas");
        produtos[0] = produto;
        Produto produto1 = new Produto("morango","Frutas");
        produtos[1] = produto1;
        Produto produto2 = new Produto("Tv","eletronico");
        produtos[2] = produto2;

        for(int i = 0;i<produtos.length;i++){
            if(produtos[i]!= null){
                System.out.println(produtos[i].toString());
            }
        }
    }
}
