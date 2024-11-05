package com.example.gerador_jogador.mapper;

import com.example.gerador_jogador.dto.JogadorDTO;
import com.example.gerador_jogador.model.Jogador;

public class JogadorMapper {
    public static Jogador toEntity(JogadorDTO dto) {
        Jogador jogador = new Jogador();
        jogador.setNome(dto.getNome());
        jogador.setApelido(dto.getApelido());
        jogador.setHabilidade(100); // Valor padrão
        return jogador;
    }

    public static JogadorDTO toDTO(Jogador jogador) {
        JogadorDTO dto = new JogadorDTO();
        dto.setNome(jogador.getNome());
        dto.setApelido(jogador.getApelido());
        return dto;
    }
}
