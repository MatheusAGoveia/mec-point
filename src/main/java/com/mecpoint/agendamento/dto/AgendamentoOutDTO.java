package com.mecpoint.agendamento.dto;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * DTO de saída usado nas respostas da API.
 */
@Data
public class AgendamentoOutDTO {
    private Long id;
    private String numeroAgd;
    private String cliente;
    private String servico;
    private LocalDateTime dataHora;
    private String status;
}
