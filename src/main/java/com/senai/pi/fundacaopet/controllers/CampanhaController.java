package main.java.com.senai.pi.fundacaopet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import main.java.com.senai.pi.fundacaopet.models.Campanha;
import main.java.com.senai.pi.fundacaopet.services.CampanhaService;

@RestController
@RequestMapping("/campanhas")
public class CampanhaController {

    @Autowired
    private CampanhaService campanhaService;

    @GetMapping
    public List<Campanha> listarCampanhas() {
        return campanhaService.listarCampanhas();
    }

    @GetMapping("/{id}")
    public Campanha buscarPorId(@PathVariable Integer id) {
        return campanhaService.buscarPorId(id);
    }

    @PostMapping
    public Campanha salvarCampanha(@RequestBody Campanha campanha) {
        return campanhaService.salvarCampanha(campanha);
    }

    @PutMapping("/{id}")
    public Campanha atualizarCampanha(@PathVariable Integer id,
                                      @RequestBody Campanha campanha) {
        return campanhaService.atualizarCampanha(id, campanha);
    }

    @DeleteMapping("/{id}")
    public void deletarCampanha(@PathVariable Integer id) {
        campanhaService.deletarCampanha(id);
    }
}