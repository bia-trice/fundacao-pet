 package com.senai.pi.fundacaopet.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pi.fundacaopet.models.Relatorio;
import com.senai.pi.fundacaopet.repositories.RelatorioRepository;

@Service
public class RelatorioService {

    @Autowired
    private RelatorioRepository relatorioRepository;

    public List<Relatorio> listarRelatorios() {
        return relatorioRepository.findAll();
    }

    public Relatorio buscarPorId(int id) {
        return relatorioRepository.findById(id).orElse(null);
    }

    public Relatorio salvarRelatorio(Relatorio relatorio) {
        return relatorioRepository.save(relatorio);
    }

    public Relatorio atualizarRelatorio(int id, Relatorio relatorio) {
        relatorio.setId(id);
        return relatorioRepository.save(relatorio);
    }

    public void deletarRelatorio(int id) {
        relatorioRepository.deleteById(id);
    }
}