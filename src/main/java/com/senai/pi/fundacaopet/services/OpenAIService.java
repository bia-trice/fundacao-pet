package com.senai.pi.fundacaopet.services;

import com.senai.pi.fundacaopet.models.PetIARequest;
import okhttp3.*;
import org.json.JSONArray;
import org.json.JSONObject;

public class OpenAIService {

    private static final String API_KEY = "AQ.Ab8RN6IkUdM-BwsMA_3T5K7P0_cJfDC2ZQodavUvMmqZFoCJ2g";
    private static final String URL_API = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key="
            + API_KEY;

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
                            pet.getAlimentacaoAtual());

            JSONObject textObject = new JSONObject();
            textObject.put("text", prompt);

            JSONArray partsArray = new JSONArray();
            partsArray.put(textObject);

            JSONObject partsObject = new JSONObject();
            partsObject.put("parts", partsArray);

            JSONArray contentsArray = new JSONArray();
            contentsArray.put(partsObject);

            JSONObject bodyJson = new JSONObject();
            bodyJson.put("contents", contentsArray);

            RequestBody body = RequestBody.create(
                    bodyJson.toString(),
                    MediaType.get("application/json; charset=utf-8"));

            Request request = new Request.Builder()
                    .url(URL_API)
                    .post(body)
                    .addHeader("Content-Type", "application/json")
                    .build();

            Response response = client.newCall(request).execute();

            if (!response.isSuccessful()) {
                System.out.println("Erro do Gemini: " + response.code());
                return "Erro na resposta da IA: " + response.code();
            }

            String responseBody = response.body().string();
            JSONObject responseJson = new JSONObject(responseBody);

            return responseJson
                    .getJSONArray("candidates")
                    .getJSONObject(0)
                    .getJSONObject("content")
                    .getJSONArray("parts")
                    .getJSONObject(0)
                    .getString("text");

        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao gerar análise.";
        }
    }
}
