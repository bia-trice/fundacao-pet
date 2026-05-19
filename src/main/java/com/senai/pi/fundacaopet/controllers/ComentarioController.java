package com.senai.pi.fundacaopet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.senai.pi.fundacaopet.models.Comentario;
import com.senai.pi.fundacaopet.services.ComentarioService;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {

    @Autowired
    private ComentarioService comentarioService;

    @GetMapping
    public List<Comentario> listarComentarios() {
        return comentarioService.listarComentarios();
    }

    @GetMapping("/{id}")
    public Comentario buscarPorId(@PathVariable Integer id) {
        return comentarioService.buscarPorId(id);
    }

    @PostMapping
    public Comentario salvarComentario(@RequestBody Comentario comentario) {
        return comentarioService.salvarComentario(comentario);
    }

    @PutMapping("/{id}")
    public Comentario atualizarComentario(@PathVariable Integer id,
                                          @RequestBody Comentario comentario) {
        return comentarioService.atualizarComentario(id, comentario);
    }

    @DeleteMapping("/{id}")
    public void deletarComentario(@PathVariable Integer id) {
        comentarioService.deletarComentario(id);
    }
}