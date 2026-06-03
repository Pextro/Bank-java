package com.bank.study;

import com.bank.model.Cargo;
import com.bank.model.Funcionario;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario [] funcionarios = new Funcionario[4];

        while (true){
            System.out.println("Escolha as opções: ");
            System.out.println("1 - INSESRIR FUNCIONARIO");
            System.out.println("2 - LISTAR TODOS");
            System.out.println("0 - SAIR");
            int menu = scan.nextInt();

            if(menu == 0){
                break;
            } else if (menu == 1) {
                System.out.println("Digite o nome do funcionario: ");
                String nomeFuncionario = scan.next();

                System.out.println("Digite o Cpf do funcionario: ");
                String cpfFuncionario = scan.next();

                System.out.println("Digite o cargo do funcionario: ");
                String cargoName = scan.next();
                Cargo cargoFuncionario = Cargo.TERCEIRO;

                for(Cargo cargo:Cargo.values()){
                    if(cargoName.equals(cargo.name())){
                      cargoFuncionario = cargo;
                    }
                }
                System.out.println("Digite o salario do funcionario: ");
                Double salarioFuncionario = scan.nextDouble();

                if(!(salarioFuncionario >= cargoFuncionario.getSalarioMin() && salarioFuncionario <= cargoFuncionario.getSalarioMax())){
                    System.out.println("O salario não condiz com a media desse cargo");
                }
                Funcionario funcionario = new Funcionario(nomeFuncionario,cpfFuncionario,salarioFuncionario,cargoFuncionario);
            }
        }

    }
}
