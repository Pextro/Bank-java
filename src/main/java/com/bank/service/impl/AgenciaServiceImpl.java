package com.bank.service.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaDao;
import com.bank.repository.impl.AgenciaDaoImpl;
import com.bank.service.AgenciaService;

import java.util.List;

public class AgenciaServiceImpl implements AgenciaService {

    private AgenciaDao agenciaDao;

    public AgenciaServiceImpl(){
        this.agenciaDao = new AgenciaDaoImpl();
    }

    @Override
    public void create(Agencia agencia) {
        this.agenciaDao.create(agencia);
    }

    @Override
    public Agencia read(int codigoAgencia) {
       return this.agenciaDao.read(codigoAgencia);
    }

    @Override
    public void delete(int codigoAgencia) {
        this.agenciaDao.delete(codigoAgencia);
    }

    @Override
    public Agencia update(int codigoAgencia, Agencia novaAgencia) {
        return this.agenciaDao.update(codigoAgencia, novaAgencia);
    }

    @Override
    public List<Agencia> readAll() {
        return this.agenciaDao.readAll();
    }
}
