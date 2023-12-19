package com.exemplo.SpringBoot3_REST_API.medico;

import com.exemplo.SpringBoot3_REST_API.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
