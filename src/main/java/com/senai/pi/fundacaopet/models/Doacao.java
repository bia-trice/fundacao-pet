package main.java.com.senai.pi.fundacaopet.models;

public class Doacao{
    private int id;
    private int id_usuario;
    private int id_campanha;
    private Double valor;
    private string tipo_doacao;
    private string forma_pagamento;
    private string status_pagamento;
    private date data_doacao;
    public Doacao() {
    }
    public Doacao(int id, int id_usuario, int id_campanha, Double valor, string tipo_doacao, string forma_pagamento,
            string status_pagamento, date data_doacao) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.id_campanha = id_campanha;
        this.valor = valor;
        this.tipo_doacao = tipo_doacao;
        this.forma_pagamento = forma_pagamento;
        this.status_pagamento = status_pagamento;
        this.data_doacao = data_doacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public int getId_campanha() {
        return id_campanha;
    }
    public void setId_campanha(int id_campanha) {
        this.id_campanha = id_campanha;
    }
    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public string getTipo_doacao() {
        return tipo_doacao;
    }
    public void setTipo_doacao(string tipo_doacao) {
        this.tipo_doacao = tipo_doacao;
    }
    public string getForma_pagamento() {
        return forma_pagamento;
    }
    public void setForma_pagamento(string forma_pagamento) {
        this.forma_pagamento = forma_pagamento;
    }
    public string getStatus_pagamento() {
        return status_pagamento;
    }
    public void setStatus_pagamento(string status_pagamento) {
        this.status_pagamento = status_pagamento;
    }
    public date getData_doacao() {
        return data_doacao;
    }
    public void setData_doacao(date data_doacao) {
        this.data_doacao = data_doacao;
    }
}

