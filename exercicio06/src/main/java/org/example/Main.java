package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        // Adiciona filmes
        cinema.adicionarFilme(new Filme("Homen Aranha", 20.0, 12));
        cinema.adicionarFilme(new Filme("Avatar", 25.0, 10));
        cinema.adicionarFilme(new Filme("Matrix", 18.0, 16));
        cinema.adicionarFilme(new Filme("Inception", 22.0, 14));
        cinema.adicionarFilme(new Filme("Titanic", 15.0, 12));

        while (true) {
            System.out.println("Filmes disponíveis:");
            for (Filme filme : cinema.getFilmesDisponiveis()) {
                System.out.println(filme.getNome());
            }

            System.out.print("Que filme você deseja assistir? ");
            String nomeFilme = scanner.nextLine();

            Filme filmeSelecionado = cinema.getFilmesDisponiveis().stream()
                    .filter(f -> f.getNome().equals(nomeFilme))
                    .findFirst()
                    .orElse(null);

            if (filmeSelecionado == null) {
                System.out.println("Filme não encontrado.");
                continue;
            }

            System.out.print("Qual assento você deseja? ");
            String assento = scanner.nextLine();

            System.out.print("Qual o seu nome? ");
            String nomeCliente = scanner.nextLine();

            System.out.print("Qual a sua idade? ");
            int idadeCliente = scanner.nextInt();
            scanner.nextLine(); // consumir a nova linha

            Cliente cliente = new Cliente(nomeCliente, idadeCliente);
            Ingresso ingresso = new Ingresso(cliente, filmeSelecionado, assento);

            try {
                cinema.venderIngresso(ingresso);
                System.out.println("Ingresso vendido com sucesso! " + filmeSelecionado.getNome() + " - " + assento + " - " + nomeCliente);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.print("Deseja comprar outro ingresso? (s/n) ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }
        scanner.close();
    }
}
