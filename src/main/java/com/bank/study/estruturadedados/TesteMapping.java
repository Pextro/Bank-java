package com.bank.study.estruturadedados;

import java.util.HashMap;
import java.util.Map;

public class TesteMapping {
    public static void main(String[] args) {

        Map <String,String> mapaNome =  new HashMap<>();
        Map <String,String> selecao = new HashMap<>();

        mapaNome.put("999.999.999-99","pedro");
        mapaNome.put("999.999.999-98","joao");
        mapaNome.put("999.999.999-97","fabio");
        mapaNome.put("999.999.999-99","Cesar");

        for(String nome: mapaNome.values()){

        }
        for(String nome: mapaNome.keySet()){
            System.out.println(nome);
        }
        for(Map.Entry<String,String> entry : mapaNome.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("---------------");
        mapaNome.forEach((key,value)->{
            System.out.println(key +" " + value);
        });


        System.out.println("--- 1.(Criando registros) ---");
        selecao.put("Brasil", "Grupo C");
        selecao.put("México", "Grupo A");
        selecao.put("Qatar", "Grupo B");
        selecao.put("Inglaterra", "Grupo L");

        System.out.println("Lendo os times: ");
        for(String time : selecao.keySet()){
            System.out.println("Time: "+ time + " | Grupo: "+selecao.get(time));
        }

        System.out.println("Atualizando time: ");
        selecao.put("México", "Classificado");

        System.out.println("Eliminado: ");
        System.out.println("O time Qatar foi eliminado: ");
        selecao.remove("Qatar");
        System.out.println("Seleções restantes: "+selecao.size());
    }
}
