package com.bank.controller;

import com.bank.model.Agencia;
import com.bank.service.AgenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agencias")
public class AgenciaController {

    private final AgenciaService agenciaService;

    public AgenciaController(AgenciaService agenciaService) {
        this.agenciaService = agenciaService;
    }


    @PostMapping
    public ResponseEntity<Agencia> create(@RequestBody Agencia agencia) {
        agenciaService.create(agencia);
        return ResponseEntity.status(HttpStatus.CREATED).body(agencia);
    }


    @GetMapping
    public ResponseEntity<List<Agencia>> readAll() {
        List<Agencia> agencias = agenciaService.readAll();
        return ResponseEntity.ok(agencias);
    }


    @GetMapping("/{codigoAgencia}")
    public ResponseEntity<Agencia> read(@PathVariable int codigoAgencia) {
        Agencia agencia = agenciaService.read(codigoAgencia);

        if (agencia != null) {
            return ResponseEntity.ok(agencia);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @PutMapping("/{codigoAgencia}")
    public ResponseEntity<Agencia> update(@PathVariable int codigoAgencia, @RequestBody Agencia novaAgencia) {
        Agencia agenciaAtualizada = agenciaService.update(codigoAgencia, novaAgencia);
        return ResponseEntity.ok(agenciaAtualizada);
    }


    @DeleteMapping("/{codigoAgencia}")
    public ResponseEntity<Void> delete(@PathVariable int codigoAgencia) {
        agenciaService.delete(codigoAgencia);
        return ResponseEntity.noContent().build();
    }
}