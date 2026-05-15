package main.java.com.senai.pi.fundacaopet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import main.java.com.senai.pi.fundacaopet.models.Doacao;
import main.java.com.senai.pi.fundacaopet.services.DoacaoService;

@RestController
@RequestMapping("/doacoes")
public class DoacaoController {

    @Autowired
    private DoacaoService doacaoService;

    @GetMapping
    public List<Doacao> listarDoacoes() {
        return doacaoService.listarDoacoes();
    }

    @GetMapping("/{id}")
    public Doacao buscarPorId(@PathVariable Integer id) {
        return doacaoService.buscarPorId(id);
    }

    @PostMapping
    public Doacao salvarDoacao(@RequestBody Doacao doacao) {
        return doacaoService.salvarDoacao(doacao);
    }

    @PutMapping("/{id}")
    public Doacao atualizarDoacao(@PathVariable Integer id,
                                  @RequestBody Doacao doacao) {
        return doacaoService.atualizarDoacao(id, doacao);
    }

    @DeleteMapping("/{id}")
    public void deletarDoacao(@PathVariable Integer id) {
        doacaoService.deletarDoacao(id);
    }
}