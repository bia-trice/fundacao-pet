package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Comentario;
import com.senai.pi.fundacaopet.repositories.ComentarioRepository;

@Service
public class ComentarioService {

    @Autowired
    private ComentarioRepository comentarioRepository;

    public List<Comentario> listarComentarios() {
        return comentarioRepository.findAll();
    }

    public Comentario buscarPorId(Integer id) {
        return comentarioRepository.findById(id).orElse(null);
    }

    public Comentario salvarComentario(Comentario comentario) {
        return comentarioRepository.save(comentario);
    }

    public Comentario atualizarComentario(Integer id, Comentario comentarioAtualizado) {
        Comentario comentario = buscarPorId(id);

        if (comentario != null) {
            comentario.setIdPublicacao(comentarioAtualizado.getIdPublicacao());
            comentario.setIdUsuario(comentarioAtualizado.getIdUsuario());
            comentario.setTexto(comentarioAtualizado.getTexto());
            comentario.setDataPublicacao(comentarioAtualizado.getDataPublicacao());

            return comentarioRepository.save(comentario);
        }

        return null;
    }

    public void deletarComentario(Integer id) {
        comentarioRepository.deleteById(id);
    }
}