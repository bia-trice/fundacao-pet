package com.senai.pi.fundacaopet.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "relatorio")
public class Relatorio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mes_referencia")
    private String mesReferencia;

    @Column(name = "total_arrecadado")
    private Double totalArrecadado;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "data_publicacao")
    private LocalDate dataPublicacao;

    public Relatorio() {
    }

    public Relatorio(Integer id, String mesReferencia, Double totalArrecadado, String descricao,
            LocalDate dataPublicacao) {
        this.id = id;
        this.mesReferencia = mesReferencia;
        this.totalArrecadado = totalArrecadado;
        this.descricao = descricao;
        this.dataPublicacao = dataPublicacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMesReferencia() {
        return mesReferencia;
    }

    public void setMesReferencia(String mesReferencia) {
        this.mesReferencia = mesReferencia;
    }

    public Double getTotalArrecadado() {
        return totalArrecadado;
    }

    public void setTotalArrecadado(Double totalArrecadado) {
        this.totalArrecadado = totalArrecadado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDate dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    
}

