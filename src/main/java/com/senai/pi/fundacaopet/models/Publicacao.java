package main.java.com.senai.pi.fundacaopet.models;

public class Publicacao{
    private int id;
    private int id_usuario;
    private String titulo;
    private String descricao;
    private date data_publicacao;
    public Publicacao() {
    }
    public Publicacao(int id, int id_usuario, String titulo, String descricao, date data_publicacao) {
        this.id = id;
        this.id_usuario = id_usuario;
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_publicacao = data_publicacao;
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
    public date getData_publicacao() {
        return data_publicacao;
    }
    public void setData_publicacao(date data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
}

