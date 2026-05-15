package main.java.com.senai.pi.fundacaopet.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "comentario")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_publicacao")
    private Integer idPublicacao;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "texto")
    private String texto;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    public Comentario() {
    }

    public Comentario(Integer id, Integer idPublicacao, Integer idUsuario, String texto, LocalDate dataPublicacao) {
        this.id = id;
        this.idPublicacao = idPublicacao;
        this.idUsuario = idUsuario;
        this.texto = texto;
        this.dataPublicacao = dataPublicacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(Integer idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    
}