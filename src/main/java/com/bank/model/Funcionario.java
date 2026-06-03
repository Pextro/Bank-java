package com.bank.model;


public class Funcionario extends Pessoa {

    private Cargo cargo;
    private double salario;

    public Funcionario(String nome, String cpf, double salario, Cargo cargo) {
        super(nome, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }
    public Funcionario(String nome, String cpf, double salario){
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

    public Cargo getCargo(){
        return cargo;
    }
    public void setCargo(Cargo cargo){
        this.cargo = cargo;
    }
}
