package com.bank.repository.impl;

import com.bank.model.Funcionario;
import com.bank.repository.FuncionarioDAO;
import java.util.HashSet;
import java.util.Set;

public class FuncionarioDAOImpl implements FuncionarioDAO {

    //Hashset funciona basicamente oposto a arrylist, ele não tem indice, não possue ordem e não permite repetição.
    public static Set<Funcionario> database = new HashSet<>();

    @Override
    public void create(Funcionario funcionario) {
        database.add(funcionario);
    }

    @Override
    public Funcionario read(String cpfFuncionario) {
        for(Funcionario funcionario : database){
           if(funcionario.getCpf().equals(cpfFuncionario)){
                return funcionario;
            }
        }
        return null;
    }

    @Override
    public void delete(String cpfFuncionario) {
       Funcionario funcionario = read(cpfFuncionario);
       if(funcionario != null){
           database.remove(funcionario);
           System.out.println("Funcionario removido");
       }else{
           System.out.println("Funcionario não encontrado");
       }
    }

    @Override
    public Funcionario update(String cpfFuncionario, Funcionario novoFuncionario) {
        Funcionario funcionarioAntigo = read(cpfFuncionario);
        if(funcionarioAntigo != null){
            database.remove(funcionarioAntigo);
            database.add(novoFuncionario);
            return novoFuncionario;
        }
        return null;
    }

    @Override
    public Set<Funcionario> readAll() {
        return database;
    }
}
