package com.senai.pi.fundacaopet.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "doacao")
public class Doacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(name = "id_campanha")
    private Integer idCampanha;

    @Column(name = "valor")
    private Double valor;

    @Column(name = "tipo_doacao")
    private String tipoDoacao;

    @Column(name = "forma_pagamento")
    private String formaPagamento;

    @Column(name = "status_pagamento")
    private String statusPagamento;

    @Column(name = "data_doacao")
    private LocalDate dataDoacao;

    public Doacao() {
    }

    public Doacao(Integer id, Integer idUsuario, Integer idCampanha, Double valor, String tipoDoacao,
            String formaPagamento, String statusPagamento, LocalDate dataDoacao) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idCampanha = idCampanha;
        this.valor = valor;
        this.tipoDoacao = tipoDoacao;
        this.formaPagamento = formaPagamento;
        this.statusPagamento = statusPagamento;
        this.dataDoacao = dataDoacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdCampanha() {
        return idCampanha;
    }

    public void setIdCampanha(Integer idCampanha) {
        this.idCampanha = idCampanha;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipoDoacao() {
        return tipoDoacao;
    }

    public void setTipoDoacao(String tipoDoacao) {
        this.tipoDoacao = tipoDoacao;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public LocalDate getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(LocalDate dataDoacao) {
        this.dataDoacao = dataDoacao;
    }
    
}