package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Publicacao;
import com.senai.pi.fundacaopet.repositories.PublicacaoRepository;

@Service
public class PublicacaoService {

    @Autowired
    private PublicacaoRepository publicacaoRepository;

    public List<Publicacao> listarPublicacoes() {
        return publicacaoRepository.findAll();
    }

    public Publicacao buscarPorId(Integer id) {
        return publicacaoRepository.findById(id).orElse(null);
    }

    public Publicacao salvarPublicacao(Publicacao publicacao) {
        return publicacaoRepository.save(publicacao);
    }

    public Publicacao atualizarPublicacao(Integer id, Publicacao publicacaoAtualizada) {
        Publicacao publicacao = buscarPorId(id);

        if (publicacao != null) {
            publicacao.setIdUsuario(publicacaoAtualizada.getIdUsuario());
            publicacao.setTitulo(publicacaoAtualizada.getTitulo());
            publicacao.setDescricao(publicacaoAtualizada.getDescricao());
            publicacao.setDataPublicacao(publicacaoAtualizada.getDataPublicacao());

            return publicacaoRepository.save(publicacao);
        }

        return null;
    }

    public void deletarPublicacao(Integer id) {
        publicacaoRepository.deleteById(id);
    }
}