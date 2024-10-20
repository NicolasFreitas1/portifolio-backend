package com.example.transacoes_bancarias.dtos;

public record TransacaoResponseDTO(ContaDTO origem, ContaDTO destino, Double valor) {}
