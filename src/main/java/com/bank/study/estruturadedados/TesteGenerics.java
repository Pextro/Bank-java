package com.bank.study.estruturadedados;

import com.bank.study.generics.CaixaGenerica;

import java.util.ArrayList;

public class TesteGenerics {
    public static void main(String[] args) {

        CaixaGenerica <String> caixaGenerica = new CaixaGenerica<>();
        CaixaGenerica <Integer> caixaGenerica1 = new CaixaGenerica<>();

        caixaGenerica.setConteudo("oi");

        caixaGenerica1.setConteudo(3);


    }
}
