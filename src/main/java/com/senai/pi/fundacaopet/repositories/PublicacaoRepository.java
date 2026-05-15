package main.java.com.senai.pi.fundacaopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.senai.pi.fundacaopet.models.Publicacao;

@Repository
public interface PublicacaoRepository extends JpaRepository<Publicacao, Integer> {

}