package main.java.com.senai.pi.fundacaopet.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "campanha")
public class Campanha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "meta_valor")
    private Double metaValor;

    @Column(name = "valor_arrecadado")
    private Double valorArrecadado;

    @Column(name = "data_inicio")
    private LocalDate dataInicio;

    @Column(name = "data_fim")
    private LocalDate dataFim;

    @Column(name = "status")
    private String status;

    public Campanha() {
    }

    public Campanha(Integer id, String titulo, String descricao, Double metaValor, Double valorArrecadado,
            LocalDate dataInicio, LocalDate dataFim, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.metaValor = metaValor;
        this.valorArrecadado = valorArrecadado;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getMetaValor() {
        return metaValor;
    }

    public void setMetaValor(Double metaValor) {
        this.metaValor = metaValor;
    }

    public Double getValorArrecadado() {
        return valorArrecadado;
    }

    public void setValorArrecadado(Double valorArrecadado) {
        this.valorArrecadado = valorArrecadado;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}

