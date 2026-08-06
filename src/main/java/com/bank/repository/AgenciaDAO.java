package com.bank.repository;

import com.bank.model.Agencia;

import java.util.List;

public interface AgenciaDAO {

    public void create(Agencia agencia);

    public Agencia read(int codigoAgencia);

    public void delete(int codigoAgencia);

    public Agencia update(int codigoAgencia, Agencia novaAgencia);

    public List<Agencia> readAll();

}
