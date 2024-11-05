package com.example.gerador_jogador.service;

import com.example.gerador_jogador.model.Jogador;
import com.example.gerador_jogador.repository.JogadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JogadorService {
    @Autowired
    private JogadorRepository repository;

    public Jogador salvarJogador(Jogador jogador) {
        return repository.save(jogador);
    }

    public List<Jogador> listarJogadores() {
        return repository.findAll();
    }
}
