package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Filme> filmesDisponiveis;
    private List<Ingresso> ingressosVendidos;
    private List<String> assentosDisponiveis;

    public Cinema() {
        filmesDisponiveis = new ArrayList<>();
        ingressosVendidos = new ArrayList<>();
        assentosDisponiveis = new ArrayList<>();
        for (char row = 'A'; row <= 'F'; row++) {
            for (int seat = 1; seat <= 5; seat++) {
                assentosDisponiveis.add("" + row + seat);
            }
        }
    }

    public void adicionarFilme(Filme filme) {
        filmesDisponiveis.add(filme);
    }

    public List<Filme> getFilmesDisponiveis() {
        return filmesDisponiveis;
    }

    public List<Ingresso> getIngressosVendidos() {
        return ingressosVendidos;
    }

    public List<String> getAssentosDisponiveis() {
        return assentosDisponiveis;
    }

    public void venderIngresso(Ingresso ingresso) throws Exception {
        if (!assentosDisponiveis.contains(ingresso.getAssento())) {
            throw new Exception("O assento não está mais disponível!");
        }

        if (ingresso.getCliente().getIdade() < ingresso.getFilme().getIdadeMinima()) {
            throw new Exception("A idade do cliente não é compatível com a idade mínima do filme!");
        }

        // Remove assento da lista de disponíveis e adiciona o ingresso à lista de vendidos
        assentosDisponiveis.remove(ingresso.getAssento());
        ingressosVendidos.add(ingresso);
    }
}
