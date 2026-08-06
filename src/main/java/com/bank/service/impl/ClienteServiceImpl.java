package com.bank.service.impl;

import com.bank.model.Cliente;
import com.bank.repository.ClienteDAO;
import com.bank.repository.impl.ClienteDAOImpl;
import com.bank.service.ClienteService;
import java.util.Map;

public class ClienteServiceImpl implements ClienteService {


    private ClienteDAO clienteDAO = new ClienteDAOImpl();

    @Override
    public void create(Cliente cliente) {

        if (cliente == null) {
            System.out.println("Erro: Dados do cliente estão vazios.");
            return;
        }


        if (clienteDAO.contem(cliente.getCpf())) {
            System.out.println("Erro: O CPF " + cliente.getCpf() + " já está cadastrado.");
            return;
        }


        if (cliente.getLimiteCredito() < 0) {
            System.out.println("Erro: O limite de crédito não pode ser menor que zero.");
            return;
        }


        clienteDAO.create(cliente);
        System.out.println("Sucesso: Cliente cadastrado no banco de dados!");
    }

    @Override
    public Cliente read(String cpfCliente) {

        if (cpfCliente == null || cpfCliente.trim().isEmpty()) {
            System.out.println("Erro: O CPF informado é inválido ou está em branco.");
            return null;
        }

        if (!clienteDAO.contem(cpfCliente)) {
            System.out.println("Aviso: Cliente não existe (CPF não encontrado).");
            return null;
        }

        return clienteDAO.read(cpfCliente);
    }

    @Override
    public void delete(String cpfCliente) {

        if (cpfCliente == null || cpfCliente.trim().isEmpty()) {
            System.out.println("Erro: CPF inválido para exclusão.");
            return;
        }


        if (!clienteDAO.contem(cpfCliente)) {
            System.out.println("Erro: Não é possível deletar. Cliente não encontrado no sistema.");
            return;
        }


        clienteDAO.delete(cpfCliente);
        System.out.println("Sucesso: Cliente removido com sucesso!");
    }

    @Override
    public Cliente update(String cpfCliente, Cliente novoCliente) {

        if (cpfCliente == null || cpfCliente.trim().isEmpty()) {
            System.out.println("Erro: CPF de busca inválido.");
            return null;
        }
        if (novoCliente == null) {
            System.out.println("Erro: Os novos dados do cliente estão vazios.");
            return null;
        }

        if (!clienteDAO.contem(cpfCliente)) {
            System.out.println("Erro: Cliente com CPF " + cpfCliente + " não encontrado para atualização.");
            return null;
        }


        if (novoCliente.getLimiteCredito() < 0) {
            System.out.println("Erro: O novo limite de crédito não pode ser negativo.");
            return null;
        }


        System.out.println("Sucesso: Dados do cliente atualizados!");
        return clienteDAO.update(cpfCliente, novoCliente);
    }

    @Override
    public Map<String, Cliente> readAll() {

        Map<String, Cliente> todosClientes = clienteDAO.readAll();

        if (todosClientes == null || todosClientes.isEmpty()) {
            System.out.println("Aviso: Nenhum cliente cadastrado no banco de dados até o momento.");
        }

        return todosClientes;
    }

}