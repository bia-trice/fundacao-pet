package main.java.com.senai.pi.fundacaopet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.senai.pi.fundacaopet.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}