package main.java.com.senai.pi.fundacaopet.models;

public class PetIARequest {

private String tipoAnimal;
    private String idade;
    private String porte;
    private String peso;
    private String sintomas;
    private String alimentacaoAtual;

public PetIARequest() {
    }

public String getTipoAnimal() {
        return tipoAnimal;
    }

public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

public String getIdade() {
        return idade;
    }

public void setIdade(String idade) {
        this.idade = idade;
    }

public String getPorte() {
        return porte;
    }

public void setPorte(String porte) {
        this.porte = porte;
    }

public String getPeso() {
        return peso;
    }

public void setPeso(String peso) {
        this.peso = peso;
    }

public String getSintomas() {
        return sintomas;
    }

public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

public String getAlimentacaoAtual() {
        return alimentacaoAtual;
    }

public void setAlimentacaoAtual(String alimentacaoAtual) {
        this.alimentacaoAtual = alimentacaoAtual;
    }
}