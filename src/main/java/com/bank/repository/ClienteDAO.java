package com.bank.repository;

import com.bank.model.Cliente;

import java.util.Map;

public interface ClienteDAO {

    public void create(Cliente cliente );

    public Cliente read(String cpfCliente);

    public void delete(String cpfCliente);

    public Cliente update(String cpfCliente, Cliente novoCliente);

    public Map<String,Cliente> readAll();

    boolean contem(String cpf);
}
