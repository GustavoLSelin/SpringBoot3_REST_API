package com.exemplo.SpringBoot3_REST_API.controller;

import com.exemplo.SpringBoot3_REST_API.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @GetMapping
    public String buscarMedico() {

        return "{\n" +
                "\"nome\": \"Rodrigo Ferreira\",\n" +
                "\"email\": \"rodrigo.ferreira@voll.med\",\n" +
                "\"crm\": \"123456\",\n" +
                "\"especialidade\": \"ortopedia\",\n" +
                "\"endereco\": {\n" +
                "    \"logradouro\": \"rua 1\",\n" +
                "    \"bairro\": \"bairro\",\n" +
                "    \"cep\": \"12345678\",\n" +
                "    \"cidade\": \"Brasilia\",\n" +
                "    \"uf\": \"DF\",\n" +
                "    \"numero\": \"1\",\n" +
                "    \"complemento\": \"complemento\"\n" +
                "    }\n" +
                "}";
    }
    @PostMapping
    public String cadastroMedico(@RequestBody DadosCadastroMedico dados) {

        return "Medico cadastrado com sucesso";

    }

}
