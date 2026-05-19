package com.senai.pi.fundacaopet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.pi.fundacaopet.models.Publicacao;
import com.senai.pi.fundacaopet.services.PublicacaoService;

@RestController
@RequestMapping("/publicacoes")
public class PublicacaoController {

    @Autowired
    private PublicacaoService publicacaoService;

    @GetMapping
    public List<Publicacao> listarPublicacoes() {
        return publicacaoService.listarPublicacoes();
    }

    @GetMapping("/{id}")
    public Publicacao buscarPorId(@PathVariable Integer id) {
        return publicacaoService.buscarPorId(id);
    }

    @PostMapping
    public Publicacao salvarPublicacao(@RequestBody Publicacao publicacao) {
        return publicacaoService.salvarPublicacao(publicacao);
    }

    @PutMapping("/{id}")
    public Publicacao atualizarPublicacao(@PathVariable Integer id,
                                          @RequestBody Publicacao publicacao) {
        return publicacaoService.atualizarPublicacao(id, publicacao);
    }

    @DeleteMapping("/{id}")
    public void deletarPublicacao(@PathVariable Integer id) {
        publicacaoService.deletarPublicacao(id);
    }
}