 package main.java.com.senai.pi.fundacaopet.services;

public class UsuarioService {

    private int id;
    private String nome;
    private String email;
    private String senha;
    public UsuarioService(int id, String nome, String email, String senha, String cidade) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
    }
    private String cidade;
    public UsuarioService() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
}