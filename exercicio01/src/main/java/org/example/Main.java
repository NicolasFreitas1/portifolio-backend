package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] filmes = { "Homens de preto", "Arrival", "Sherk", "Gladiador", "Opção nao encotrada"};

        Integer[] opcoes = {1,2};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pergunta 1: Que ambientação você prefere?");
        System.out.println("1. Sci-fi");
        System.out.println("2. Medieval");
        Integer ambietacao = scanner.nextInt();

        System.out.println("Pergunta 2: Que gênero você prefere?");
        System.out.println("1. Comédia");
        System.out.println("2. Drama");
        Integer genero = scanner.nextInt();


        String filmeRecomendado = filmes[ambietacao + genero - 2];

        System.out.println("Filme recomendado: " + filmeRecomendado);

        /*
        if(ambietacao == 1 &&  genero == 1) System.out.println(filmes[0]);
        if(ambietacao == 1 &&  genero == 2) System.out.println(filmes[1]);
        if(ambietacao == 2 &&  genero == 1) System.out.println(filmes[2]);
        if(ambietacao == 2 &&  genero == 2) System.out.println(filmes[3]);
        if(ambietacao == 2 &&  genero == 2) System.out.println(filmes[3]);
            */

    }

}