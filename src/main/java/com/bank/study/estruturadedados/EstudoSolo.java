package com.bank.study.estruturadedados;

import java.util.*;

public class EstudoSolo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numero = new ArrayList<>();
        numero.add(1);
        numero.add(2);
        numero.add(3);
        numero.add(4);
        numero.add(5);
        numero.add(6);
        numero.add(7);
        numero.add(8);
        numero.add(9);
        numero.add(10);
        List<Integer> numerosPares = new ArrayList<>();
        List<Double> precos = Arrays.asList(49.90, 19.90, 89.00, 12.50);
        Integer soma = 0;
        List<String> nomes = Arrays.asList("ana", "pedro", "lucas", "maria");

        /*for(int i = 0;i <= 10; i+=2){
            System.out.println(i);
        }

        for(Integer n: numero){
            System.out.println(n);
        }
        System.out.println("-----------------------------------------------------------------");
       for(int i = 0;i <= 10; i++){
           int tabuada = i * 7;
           System.out.println(tabuada);
       }

       for (Integer valor  :numero){
           soma += valor;
           System.out.println(soma);
       }

       nomes.forEach(nome -> System.out.println(nome.toUpperCase()));

       for(int i = 10;i >= 0; i--){
           System.out.println(i);
           if(i == 0){
               System.out.println("Foguete lançado!");
           }
       }

       List<Double> vendas = Arrays.asList(150.0, 300.50, 50.0, 200.0);
       double total = 0.0;

       for(Double produto : vendas){
           total += produto;

       }
        double media = total / 4;

        System.out.println(media);

        List<String> frutas = Arrays.asList("Maçã", "Banana", "Uva", "Abacaxi", "Morango", "Pêra");

        frutas.forEach(fruta ->{
            if(fruta.length() > 5){
                System.out.println(fruta);
            }
        });*/

        /*for (int i = 1; i <=10; i++){
            int xpNecessario = i * 1000;
            System.out.println("Para alcançar o nível: "+i+" você precisa de "+ xpNecessario +" pontos de experiência. ");
        }

        List<String> inventario = List.of("Espada Longa", "Poção de Vida", "Escudo de Madeira", "Amuleto");

        for(String bolsa : inventario){
            System.out.println("Item no inventário: "+ bolsa);
        }

        List<Integer> rolagensDeDano = List.of(8, 15, 25, 4, 30, 12);

        rolagensDeDano.forEach(rolagem ->{
            if(rolagem >= 20){
                System.out.println("é um critico");
            }
        });

        Set<String> conquistas = new HashSet<>();

        System.out.println("--- Registro de Batalha de Cadmus ---");
        System.out.println("Vamos registrar 4 títulos recém-adquiridos.");

        for(int i  = 1; i <= 4;i++){
            System.out.println("\nDigite o nome da conquista " + i + ": ");
            String tituloDigitado = scan.nextLine();
            conquistas.add(tituloDigitado);
        }
        for(String tests : conquistas){
            System.out.println(conquistas);
        }*/

        String nome = "herói";
        int forca;

        System.out.println("quanto é a força de cadmus??");
        forca = scan.nextInt();

        if(forca > 80){
            System.out.println("Cadmus está furioso como Guts");
        }else{
            System.out.println("Cadmus está reunindo forças.");
        }

    }
}
