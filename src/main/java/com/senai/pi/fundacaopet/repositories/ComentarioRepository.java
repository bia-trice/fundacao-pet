 package main.java.com.senai.pi.fundacaopet.repositories;

public class ComentarioRepository {

    private int id;
    private int id_publicacao;
    private int id_usuario;
    private String texto;
    private date data_publicacao;
    public ComentarioRepository() {
    }
    public ComentarioRepository(int id, int id_publicacao, int id_usuario, String texto, date data_publicacao) {
        this.id = id;
        this.id_publicacao = id_publicacao;
        this.id_usuario = id_usuario;
        this.texto = texto;
        this.data_publicacao = data_publicacao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getId_publicacao() {
        return id_publicacao;
    }
    public void setId_publicacao(int id_publicacao) {
        this.id_publicacao = id_publicacao;
    }
    public int getId_usuario() {
        return id_usuario;
    }
    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public date getData_publicacao() {
        return data_publicacao;
    }
    public void setData_publicacao(date data_publicacao) {
        this.data_publicacao = data_publicacao;
    }
    
}