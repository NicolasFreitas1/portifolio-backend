package com.example.transacoes_bancarias.services;

import com.example.transacoes_bancarias.models.Conta;
import com.example.transacoes_bancarias.models.Transacao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransacoesService {

    private List<Conta> contas;

    public TransacoesService() {
        this.contas = new ArrayList<>();
        contas.add(new Conta("500-1", "Fulano", 1000.0));
        contas.add(new Conta("320-2", "Ciclano", 2000.0));
    }

    public Optional<Conta> buscarContaPorCodigo(String codigo) {
        return contas.stream().filter(conta -> conta.getCodigo().equals(codigo)).findFirst();
    }

    public Transacao realizarTransacao(String codigoOrigem, String codigoDestino, Double valor) throws Exception {
        Conta origem = buscarContaPorCodigo(codigoOrigem)
                .orElseThrow(() -> new Exception("Conta de origem não encontrada"));
        Conta destino = buscarContaPorCodigo(codigoDestino)
                .orElseThrow(() -> new Exception("Conta de destino não encontrada"));

        if (origem.getSaldo() < valor) {
            throw new Exception("Saldo insuficiente");
        }

        origem.setSaldo(origem.getSaldo() - valor);
        destino.setSaldo(destino.getSaldo() + valor);

        return new Transacao(origem, destino, valor);
    }
}
