package com.senai.pi.fundacaopet.controllers;

import com.senai.pi.fundacaopet.models.PetIARequest;
import com.senai.pi.fundacaopet.models.PetIAResponse;
import com.senai.pi.fundacaopet.services.OpenAIService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ia")

public class PetIAController {

private OpenAIService openAIService = new OpenAIService();

@PostMapping("/analisar")
    public PetIAResponse analisar(@RequestBody PetIARequest pet) {

String resposta = openAIService.gerarAnalise(pet);

return new PetIAResponse(resposta);
    }
}