package com.bank.study.estruturadedados;

import com.bank.model.Funcionario;
import java.util.ArrayList;
import java.util.Scanner;

public class CrudFuncionario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

        while (true) {
            System.out.println("\n--- GESTÃO DE FUNCIONÁRIOS ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar Todos");
            System.out.println("3 - Buscar por CPF");
            System.out.println("4 - Atualizar Salário");
            System.out.println("5 - Remover");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            int opcao = scan.nextInt();

            if (opcao == 0) break;

            switch (opcao) {
                case 1: // CREATE
                    System.out.print("Nome: ");
                    String nome = scan.next();
                    System.out.print("CPF: ");
                    String cpf = scan.next();
                    System.out.print("Salário: ");
                    double salario = scan.nextDouble();


                    Funcionario f = new Funcionario(nome, cpf, salario);
                    listaFuncionarios.add(f);
                    System.out.println("Funcionário cadastrado!");
                    break;

                case 2:
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Lista vazia.");
                    } else {
                        for (Funcionario func : listaFuncionarios) {
                            func.exibirDados();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o CPF para busca: ");
                    String cpfBusca = scan.next();
                    boolean achou = false;
                    for (Funcionario func : listaFuncionarios) {
                        if (func.getCpf().equals(cpfBusca)) {
                            func.exibirDados();
                            achou = true;
                            break;
                        }
                    }
                    if (!achou) System.out.println("CPF não encontrado.");
                    break;

                case 4:
                    System.out.print("Digite o CPF para atualizar salário: ");
                    String cpfAlt = scan.next();
                    for (Funcionario func : listaFuncionarios) {
                        if (func.getCpf().equals(cpfAlt)) {
                            System.out.print("Novo salário: ");
                            func.setSalario(scan.nextDouble());
                            System.out.println("Salário atualizado!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.print("Digite o CPF para remover: ");
                    String cpfRemover = scan.next();
                    boolean removido = listaFuncionarios.removeIf(func -> func.getCpf().equals(cpfRemover));

                    if (removido) {
                        System.out.println("Funcionário removido com sucesso!");
                    } else {
                        System.out.println("CPF não encontrado.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
        scan.close();
    }
}