package main.java.com.senai.pi.fundacaopet.services;

import main.java.com.senai.pi.fundacaopet.models.PetIARequest;

import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class OpenAIService {

private static final String API_KEY = "SUA_CHAVE_OPENAI";

public String gerarAnalise(PetIARequest pet) {

try {

OkHttpClient client = new OkHttpClient();

String prompt = """
            Você é uma IA Pet educativa.

Analise os dados abaixo:

Tipo do animal: %s
            Idade: %s
            Porte: %s
            Peso: %s
            Sintomas: %s
            Alimentação atual: %s

Gere:
            - sugestão alimentar
            - quantidade diária estimada
            - alertas possíveis
            - grau de risco
            - aviso:
            "Essa ferramenta não substitui consulta veterinária"

Não faça diagnóstico veterinário.
            """
            .formatted(
                    pet.getTipoAnimal(),
                    pet.getIdade(),
                    pet.getPorte(),
                    pet.getPeso(),
                    pet.getSintomas(),
                    pet.getAlimentacaoAtual()
            );

JSONObject bodyJson = new JSONObject();

bodyJson.put("model", "gpt-4.1-mini");

JSONArray messages = new JSONArray();

JSONObject message = new JSONObject();

message.put("role", "user");
            message.put("content", prompt);

messages.put(message);

bodyJson.put("messages", messages);

RequestBody body = RequestBody.create(
                    bodyJson.toString(),
                    MediaType.parse("application/json")
            );

Request request = new Request.Builder()
                    .url("https://api.openai.com/v1/chat/completions")
                    .post(body)
                    .addHeader("Authorization", "Bearer " + API_KEY)
                    .addHeader("Content-Type", "application/json")
                    .build();

Response response = client.newCall(request).execute();

String responseBody = response.body().string();

JSONObject responseJson = new JSONObject(responseBody);

return responseJson
                    .getJSONArray("choices")
                    .getJSONObject(0)
                    .getJSONObject("message")
                    .getString("content");

} catch (Exception e) {

return "Erro ao gerar análise.";

}
    }
}
