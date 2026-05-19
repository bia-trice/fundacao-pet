package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Doacao;
import com.senai.pi.fundacaopet.repositories.DoacaoRepository;

@Service
public class DoacaoService {

    @Autowired
    private DoacaoRepository doacaoRepository;

    public List<Doacao> listarDoacoes() {
        return doacaoRepository.findAll();
    }

    public Doacao buscarPorId(Integer id) {
        return doacaoRepository.findById(id).orElse(null);
    }

    public Doacao salvarDoacao(Doacao doacao) {
        return doacaoRepository.save(doacao);
    }

    public Doacao atualizarDoacao(Integer id, Doacao doacaoAtualizada) {
        Doacao doacao = buscarPorId(id);

        if (doacao != null) {
            doacao.setIdUsuario(doacaoAtualizada.getIdUsuario());
            doacao.setIdCampanha(doacaoAtualizada.getIdCampanha());
            doacao.setValor(doacaoAtualizada.getValor());
            doacao.setTipoDoacao(doacaoAtualizada.getTipoDoacao());
            doacao.setFormaPagamento(doacaoAtualizada.getFormaPagamento());
            doacao.setStatusPagamento(doacaoAtualizada.getStatusPagamento());
            doacao.setDataDoacao(doacaoAtualizada.getDataDoacao());

            return doacaoRepository.save(doacao);
        }

        return null;
    }

    public void deletarDoacao(Integer id) {
        doacaoRepository.deleteById(id);
    }
}