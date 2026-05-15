package main.java.com.senai.pi.fundacaopet.models;

public class PetIAResponse {

private String resposta;

public PetIAResponse() {
    }

public PetIAResponse(String resposta) {
        this.resposta = resposta;
    }

public String getResposta() {
        return resposta;
    }

public void setResposta(String resposta) {
        this.resposta = resposta;
    }
}