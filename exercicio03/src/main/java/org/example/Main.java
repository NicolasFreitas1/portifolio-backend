package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar barcos
        Barco barco1 = new Barco("Barco1", 2);
        Barco barco2 = new Barco("Barco2", 5);
        Barco barco3 = new Barco("Barco3", 7);
        Barco barco4 = new Barco("Barco4", 12);
        Barco barco5 = new Barco("Barco5", 20);

        // Criar portos
        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");

        // Lista de barcos
        List<Barco> barcos = new ArrayList<>();
        barcos.add(barco1);
        barcos.add(barco2);
        barcos.add(barco3);
        barcos.add(barco4);
        barcos.add(barco5);

        // Tentar atracar barcos
        for (Barco barco : barcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}