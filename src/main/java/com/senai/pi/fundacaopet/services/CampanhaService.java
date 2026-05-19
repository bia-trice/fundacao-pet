package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Campanha;
import com.senai.pi.fundacaopet.repositories.CampanhaRepository;

@Service
public class CampanhaService {

    @Autowired
    private CampanhaRepository campanhaRepository;

    public List<Campanha> listarCampanhas() {
        return campanhaRepository.findAll();
    }

    public Campanha buscarPorId(Integer id) {
        return campanhaRepository.findById(id).orElse(null);
    }

    public Campanha salvarCampanha(Campanha campanha) {
        return campanhaRepository.save(campanha);
    }

    public Campanha atualizarCampanha(Integer id, Campanha campanhaAtualizada) {
        Campanha campanha = buscarPorId(id);

        if (campanha != null) {
            campanha.setTitulo(campanhaAtualizada.getTitulo());
            campanha.setDescricao(campanhaAtualizada.getDescricao());
            campanha.setMetaValor(campanhaAtualizada.getMetaValor());
            campanha.setValorArrecadado(campanhaAtualizada.getValorArrecadado());
            campanha.setDataInicio(campanhaAtualizada.getDataInicio());
            campanha.setDataFim(campanhaAtualizada.getDataFim());
            campanha.setStatus(campanhaAtualizada.getStatus());

            return campanhaRepository.save(campanha);
        }

        return null;
    }

    public void deletarCampanha(Integer id) {
        campanhaRepository.deleteById(id);
    }
}