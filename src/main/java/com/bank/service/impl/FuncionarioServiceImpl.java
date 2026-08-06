package com.bank.service.impl;

import com.bank.model.Funcionario;
import com.bank.service.FuncionarioService;

import java.util.Set;

public class FuncionarioServiceImpl implements FuncionarioService {
    @Override
    public void create(Funcionario funcionario) {

    }

    @Override
    public Funcionario read(String cpfFuncionario) {
        return null;
    }

    @Override
    public void delete(String cpfFuncionario) {

    }

    @Override
    public Funcionario update(String cpfFuncionario, Funcionario novoFuncionario) {
        return null;
    }

    @Override
    public Set<Funcionario> readAll() {
        return Set.of();
    }
}
