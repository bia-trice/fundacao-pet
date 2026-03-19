package main.java.com.senai.pi.fundacaopet.repositories;

public class CampanhaRepository {

    public CampanhaRepository(int id, String titulo, String descricao, Double meta_valor, Double valor_arrecadado,
            date data_inicio, date data_fim, String status) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.meta_valor = meta_valor;
        this.valor_arrecadado = valor_arrecadado;
        this.data_inicio = data_inicio;
        this.data_fim = data_fim;
        this.status = status;
    }
    private int id;
    private String titulo;
    private String descricao;
    private Double meta_valor;
    private Double valor_arrecadado;
    private date data_inicio;
    private date data_fim;
    private String status;
    public CampanhaRepository() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
    public Double getMeta_valor() {
        return meta_valor;
    }
    public void setMeta_valor(Double meta_valor) {
        this.meta_valor = meta_valor;
    }
    public Double getValor_arrecadado() {
        return valor_arrecadado;
    }
    public void setValor_arrecadado(Double valor_arrecadado) {
        this.valor_arrecadado = valor_arrecadado;
    }
    public date getData_inicio() {
        return data_inicio;
    }
    public void setData_inicio(date data_inicio) {
        this.data_inicio = data_inicio;
    }
    public date getData_fim() {
        return data_fim;
    }
    public void setData_fim(date data_fim) {
        this.data_fim = data_fim;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    
}