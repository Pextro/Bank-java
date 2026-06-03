package com.bank.repository.impl;

import com.bank.model.Agencia;
import com.bank.repository.AgenciaDao;

import java.util.ArrayList;
import java.util.List;

public class AgenciaDaoImpl implements AgenciaDao {

    private List<Agencia> dataBase = new ArrayList<>();

    @Override
    public void create(Agencia agencia) {
        dataBase.add(agencia);
    }

    @Override
    public Agencia read(int codigoAgencia) {
        for(Agencia agencia : dataBase){
            if(codigoAgencia == agencia.getCodigoAgencia()){
                return agencia;
            }
        }
        return null;
    }

    @Override
    public void delete(int codigoAgencia) {
        for(Agencia agencia : dataBase){
            if(codigoAgencia == agencia.getCodigoAgencia()){
                dataBase.remove(agencia);
                break;
            }
        }
    }

    @Override
    public Agencia update(int codigoAgencia, Agencia novaAgencia) {
        for(int i = 0;i <= dataBase.size();i++){
            if(codigoAgencia == dataBase.get(i).getCodigoAgencia()){
                dataBase.set(i, novaAgencia);
                return novaAgencia;
            }
        }
        return null;
    }

    @Override
    public List<Agencia> readAll() {
        return dataBase;
    }
}
