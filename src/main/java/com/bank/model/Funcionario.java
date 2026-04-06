package com.bank.model;


public class Funcionario extends Pessoa {


    private double salario;

    public Funcionario(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println(" | Salário: R$ " + salario);
    }
}
