package com.senai.pi.fundacaopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pi.fundacaopet.models.Relatorio;

@Repository
public interface RelatorioRepository extends JpaRepository<Relatorio, Integer> {

}