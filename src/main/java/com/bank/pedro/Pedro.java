package com.bank.pedro;

import com.bank.controller.AgenciaController;
import com.bank.model.Agencia;

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
                            System.out.println("Deu ruim");
                    }
                        break;
                }
        }
    }
}
