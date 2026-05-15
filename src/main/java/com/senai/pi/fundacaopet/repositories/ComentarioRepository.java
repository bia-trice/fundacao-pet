 package main.java.com.senai.pi.fundacaopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.senai.pi.fundacaopet.models.Comentario;

@Repository
public interface ComentarioRepository extends JpaRepository<Comentario, Integer> {

}