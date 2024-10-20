package com.example.transacoes_bancarias.mappers;

import com.example.transacoes_bancarias.dtos.ContaDTO;
import com.example.transacoes_bancarias.models.Conta;

public class ContaMapper {
    public static ContaDTO toDTO(Conta conta) {
        return new ContaDTO(conta.getCodigo(), conta.getCliente());
    }
}
