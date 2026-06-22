package com.bank.pedro;

import com.bank.controller.AgenciaController;
import com.bank.model.Agencia;

import java.util.List;
import java.util.Scanner;

public class Pedro {

    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AgenciaController agenciaController = new AgenciaController();


        while(true){
            System.out.println("#### MENU - Agencia ####");
            System.out.println("1 - Criar");
            System.out.println("2 - Atualizar");
            System.out.println("3 - Deletar");
            System.out.println("4 - Informações gerais");
            System.out.println("0 - Sair");
            int opcao = scan.nextInt();

                int escolha = 0;
                switch (opcao){
                    case 1:
                        com.bank.model.Agencia agencia = new com.bank.model.Agencia();
                        try{
                            System.out.println("Digite o codigo da agencia:");
                            agencia.setCodigoAgencia(scan.nextInt());

                            System.out.println("Digite o nome da agencia:");
                            agencia.setNomeAgencia(scan.next());

                            agenciaController.create(agencia);
                            } catch (Exception e){
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
                        }catch (Exception e) {
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
                     try{
                         System.out.println("Lista completa: ");
                       List<Agencia> agencias = agenciaController.readAll().getBody();
                       for(Agencia agencia1 : agencias){
                           System.out.println(agencia1.getCodigoAgencia());
                           System.out.println(agencia1.getNomeAgencia());
                       }
                     }catch (Exception e){
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
    }
}
