package com.exemplo.SpringBoot3_REST_API.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public String cadastroMedico() {

        return "Medico cadastrado com sucesso";

    }

}
