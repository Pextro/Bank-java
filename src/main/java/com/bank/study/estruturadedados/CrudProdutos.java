package com.bank.study.estruturadedados;

import java.util.Scanner;

public class CrudProdutos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Produto[] produtos = new Produto[20];
        int contador = 0;
        while(true){
            System.out.println("Menu");
            System.out.println();
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Buscar um produto");
            System.out.println("3 - Atualizar produto");
            System.out.println("4 - Excluir produto");
            System.out.println("5 - Mostrar todos os produtos");
            System.out.println("0 - Sair do programa");
            int menu = scan.nextInt();

            switch (menu) {
                case 1:
                    if (contador < produtos.length){
                    System.out.println("Digite nome: ");
                    String nome = scan.next();
                    System.out.println("Digite a categoria: ");
                    String categoria = scan.next();
                    Produto p = new Produto(nome,categoria);
                    produtos[contador] = p;
                    contador++;
                    System.out.println("Produto adicionado com sucesso!");
            } else {
                System.out.println(" Erro: A lista de produtos está cheia!");
            }
                    break;
                case 2:
                    System.out.println("Digite o nome do produto? ");
                    String buscarNome = scan.next();
                    boolean encontrado = false;

                    for(int i = 0; i <contador;i++){
                        if (produtos[i].getNome().equalsIgnoreCase(buscarNome)){
                            System.out.println(" Produto encontrado: ");
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado){
                        System.out.println("Produto não encontrado");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do produto que deseja atualizar: ");
                    String atualizarNome = scan.next();
                    boolean atualizado = false;

                    for (int i = 0; i < contador; i++) {
                        if (produtos[i].getNome().equalsIgnoreCase(atualizarNome)) {
                            System.out.print("Digite o novo nome: ");
                            produtos[i].setNome(scan.next());
                            System.out.print("Digite a nova categoria: ");
                            produtos[i].setCategoria(scan.next());
                            System.out.println("Produto atualizado com sucesso!");
                            atualizado = true;
                            break;
                        }
                    }
                    if (!atualizado) {
                        System.out.println("Produto não encontrado para atualização.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do produto para excluir: ");
                    String excluirNome = scan.next();
                    boolean excluido = false;

                    for (int i = 0; i < contador; i++) {
                        if (produtos[i].getNome().equalsIgnoreCase(excluirNome)) {

                            for (int j = i; j < contador - 1; j++) {
                                produtos[j] = produtos[j + 1];
                            }
                            produtos[contador - 1] = null;
                            contador--;
                            System.out.println("Produto excluído com sucesso!");
                            excluido = true;
                            break;
                        }
                    }
                    if (!excluido) {
                        System.out.println(" Produto não encontrado.");
                    }
                    break;

                case 5:
                    if (contador == 0) {
                        System.out.println("Nenhum produto cadastrado no momento.");
                    } else {
                        System.out.println("\n--- Lista de Produtos ---");
                        for (int i = 0; i < contador; i++) {
                            System.out.println((i + 1) + ". Nome: " + produtos[i].getNome() + " | Categoria: " + produtos[i].getCategoria());
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa... Até logo!");
                    scan.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println(" Opção inválida! Tente novamente.");
            }

        }
    }
}
