package com.bank.service;

import com.bank.model.Funcionario;

import java.util.Set;

public interface FuncionarioService {

    public void create(Funcionario funcionario );

    public Funcionario read(String cpfFuncionario);

    public void delete(String cpfFuncionario);

    public Funcionario update(String cpfFuncionario, Funcionario novoFuncionario);

    public Set<Funcionario> readAll();
}
