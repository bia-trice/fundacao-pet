package com.senai.pi.fundacaopet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.pi.fundacaopet.models.Relatorio;
import com.senai.pi.fundacaopet.services.RelatorioService;

@RestController
@RequestMapping("/relatorios")
public class RelatorioController {

    @Autowired
    private RelatorioService relatorioService;

    @GetMapping
    public List<Relatorio> listarRelatorios() {
        return relatorioService.listarRelatorios();
    }

    @GetMapping("/{id}")
    public Relatorio buscarPorId(@PathVariable int id) {
        return relatorioService.buscarPorId(id);
    }

    @PostMapping
    public Relatorio salvarRelatorio(@RequestBody Relatorio relatorio) {
        return relatorioService.salvarRelatorio(relatorio);
    }

    @PutMapping("/{id}")
    public Relatorio atualizarRelatorio(@PathVariable int id,
                                        @RequestBody Relatorio relatorio) {
        return relatorioService.atualizarRelatorio(id, relatorio);
    }

    @DeleteMapping("/{id}")
    public void deletarRelatorio(@PathVariable int id) {
        relatorioService.deletarRelatorio(id);
    }
}