 package main.java.com.senai.pi.fundacaopet.services;

public class RelatorioService {

    private int id;
    private String mes_referencia;
    private Double total_arrecadado;
    private String descricao;
    private date data_publicacao;
    public RelatorioService() {
    }
    public RelatorioService(int id, String mes_referencia, Double total_arrecadado, String descricao,
            date data_publicacao) {
        this.id = id;
        this.mes_referencia = mes_referencia;
        this.total_arrecadado = total_arrecadado;
        this.descricao = descricao;
        this.data_publicacao = data_publicacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMes_referencia() {
        return mes_referencia;
    }
    public void setMes_referencia(String mes_referencia) {
        this.mes_referencia = mes_referencia;
    }
    public Double getTotal_arrecadado() {
        return total_arrecadado;
    }
    public void setTotal_arrecadado(Double total_arrecadado) {
        this.total_arrecadado = total_arrecadado;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public date getData_publicacao() {
        return data_publicacao;
    }
    public void setData_publicacao(date data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
    
}