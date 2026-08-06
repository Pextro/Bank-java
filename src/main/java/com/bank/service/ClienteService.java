package com.bank.service;

import com.bank.model.Cliente;
import java.util.Map;

public interface ClienteService {
    public   void create(Cliente cliente);

    public  Cliente read(String cpfCliente);

    public  void delete(String cpfCliente);

    public  Cliente update(String cpfCliente, Cliente novoCliente);

    public  Map<String, Cliente> readAll();
}