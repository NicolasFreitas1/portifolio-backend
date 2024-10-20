package com.example.transacoes_bancarias.controllers;

import com.example.transacoes_bancarias.dtos.TransacaoRequestDTO;
import com.example.transacoes_bancarias.dtos.TransacaoResponseDTO;
import com.example.transacoes_bancarias.mappers.ContaMapper;
import com.example.transacoes_bancarias.models.Transacao;
import com.example.transacoes_bancarias.services.TransacoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transacoes")
public class TransacaoController {
    @Autowired
    private TransacoesService transacoesService;

    @PostMapping
    public ResponseEntity<TransacaoResponseDTO> gerarTransacao(@RequestBody TransacaoRequestDTO transacaoRequest) {
        try {
            Transacao transacao = transacoesService.realizarTransacao(
                    transacaoRequest.origem(),
                    transacaoRequest.destino(),
                    transacaoRequest.valor()
            );

            TransacaoResponseDTO response = new TransacaoResponseDTO(
                    ContaMapper.toDTO(transacao.getOrigem()),
                    ContaMapper.toDTO(transacao.getDestino()),
                    transacao.getValor()
            );

            return ResponseEntity.ok(response);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}
