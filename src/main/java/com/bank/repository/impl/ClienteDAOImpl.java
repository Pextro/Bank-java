package com.bank.repository.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;

import java.util.HashMap;
import java.util.Map;

public class ClienteDAOImpl implements ClienteDAO {

    //Map ele não é em ordem,Não possui indice, Não permite repetição na key, mas no valor pode e possui uma chave unica propria
    private Map<String,Cliente> database = new HashMap<>();

    @Override
    public void create(Cliente cliente) {
        database.put(cliente.getCpf(),cliente);
    }

    @Override
    public Cliente read(String cpfCliente) {
        return database.get(cpfCliente);
    }

    @Override
    public void delete(String cpfCliente) {
        database.remove(cpfCliente);
    }

    @Override
    public Cliente update(String cpfCliente, Cliente novoCliente) {
     if(database.containsKey(cpfCliente)){
         database.put(cpfCliente,novoCliente);
         return novoCliente;
     }
     return null;
    }

    @Override
    public Map<String,Cliente> readAll() {
        return database;
    }

    @Override
    public boolean contem(String cpf){
        for(Cliente cliente : database.values()){
            if (cliente.getCpf().equals(cpf)){
                return true;
            }
        }
        return false;
    }
}
