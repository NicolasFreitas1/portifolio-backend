package com.example.gerador_jogador.repository;

import com.example.gerador_jogador.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long>{
}
