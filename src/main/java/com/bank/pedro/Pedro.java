package com.bank.pedro;

import com.bank.controller.AgenciaController;
import com.bank.exceptions.ClienteExistsException;
import com.bank.model.Agencia;
import com.bank.model.Cliente;
import com.bank.repository.impl.ClienteDAOImpl;


import java.util.List;
import java.util.Scanner;

public class Pedro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("PARA: ");
        System.out.println();
        System.out.println("1-Menu agencia");
        System.out.println("2-Menu cliente");
        int primeiroMenu = scan.nextInt();

        if (primeiroMenu == 1) {

            AgenciaController agenciaController = new AgenciaController();
            while (true) {
                System.out.println("#### MENU - Agencia ####");
                System.out.println("1 - Criar");
                System.out.println("2 - Atualizar");
                System.out.println("3 - Deletar");
                System.out.println("4 - Informações gerais");
                System.out.println("0 - Sair");
                int opcao = scan.nextInt();

                int escolha = 0;
                switch (opcao) {
                    case 1:
                        com.bank.model.Agencia agencia = new com.bank.model.Agencia();
                        try {
                            System.out.println("Digite o codigo da agencia:");
                            agencia.setCodigoAgencia(scan.nextInt());

                            System.out.println("Digite o nome da agencia:");
                            agencia.setNomeAgencia(scan.next());

                            agenciaController.create(agencia);
                        } catch (Exception e) {
                            System.out.println("Deu ruim " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.println("Digite o código da agência que deseja atualizar: ");
                            int codAtualizar = scan.nextInt();

                            System.out.print("Digite o novo nome da agência: ");
                            String novoNome = scan.nextLine();

                            com.bank.model.Agencia agenciaParaAtualizar = new com.bank.model.Agencia();
                            agenciaParaAtualizar.setNomeAgencia(novoNome);
                            agenciaParaAtualizar.setCodigoAgencia(codAtualizar);

                            agenciaController.update(codAtualizar, agenciaParaAtualizar);
                        } catch (Exception e) {
                            System.out.println("Erro ao atualizar: " + e.getMessage());
                        }
                        break;

                    case 3:
                        try {
                            System.out.print("Digite o código da agência que deseja deletar: ");
                            int codDeletar = scan.nextInt();

                            agenciaController.delete(codDeletar);

                            System.out.println("Comando para deletar a agência " + codDeletar + " enviado!");
                        } catch (Exception e) {
                            System.out.println("Erro ao deletar: " + e.getMessage());
                        }
                        break;

                    case 4:
                        try {
                            System.out.println("Lista completa: ");
                            List<Agencia> agencias = agenciaController.readAll().getBody();
                            for (Agencia agencia1 : agencias) {
                                System.out.println(agencia1.getCodigoAgencia());
                                System.out.println(agencia1.getNomeAgencia());
                            }
                        } catch (Exception e) {
                            System.out.println("Erro");
                        }
                        break;
                    case 0: {
                        System.out.println("Encerrando o sistema. Até logo!");
                        scan.close();
                        System.exit(0);
                        break;
                    }
                }

            }
        } else if (primeiroMenu == 2) {
            ClienteDAOImpl clienteDAOimpl = new ClienteDAOImpl();
            try {
                while (true) {
                    System.out.println("#### MENU - Cliente ####");
                    System.out.println("1 - Criar Cliente");
                    System.out.println("2 - Atualizar Cliente");
                    System.out.println("3 - Deletar Cliente");
                    System.out.println("4 - Informações gerais do Cliente");
                    System.out.println("0 - Sair");
                    int opc = scan.nextInt();

                    switch (opc) {
                        case 1:
                            try {
                                System.out.println("Digite seu nome: ");
                                String nome = scan.next();
                                System.out.println("Digite seu cpf: ");
                                String cpf = scan.next();
                                System.out.println("Digite o limite da conta: ");
                                double limite = scan.nextDouble();

                                Cliente cliente = new Cliente(nome, cpf, limite);
                                clienteDAOimpl.create(cliente);
                                System.out.println("deu certo");
                                break;
                            } catch (Exception e) {
                                throw new ClienteExistsException();
                            }
                        case 4:
                            try {
                                System.out.println("Digite o cpf do cliente: ");
                                String cpf = scan.next();
                                Cliente cliente = clienteDAOimpl.read(cpf);
                                System.out.println("Nome: " + cliente.getNome() + " Cpf: " + cliente.getCpf() + " Limite da conta: " + cliente.getLimiteCredito());

                            } catch (Exception e) {
                                System.out.println("Erro");
                            }
                    }
                }
            } catch (Exception e) {
                throw new ClienteExistsException();

            }
        }
    }
}



