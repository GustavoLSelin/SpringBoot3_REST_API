package com.exemplo.SpringBoot3_REST_API.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/*
*  A N O T A C O E S  - L O P E S
*
*   Vemos que a Controller é sempre a primeira porta de entrada do nosso Back-end para qualquer requisição
*   nesse caso vamos usar a Tag: 'RestController', para informar que essa controller vai trabalhar com requisições
*   REST.
*
*   A Tag: 'RequestMapping' vai ser responsavel por ver qual URL será chamada depois do nosso localhost:8080/api
*   onde vamos passar a requisição que será mapeada aqui dentro.
*
*
*   A Tag: 'GetMapping' será a responsavel pelo mapeamento referente a qual método deverá ser chamado em caso essa
*   url ser convocada com o método GET
*
* */
@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @GetMapping
    public String getCPF() {

        return "503.758.078/10 só boa";

    }



}
