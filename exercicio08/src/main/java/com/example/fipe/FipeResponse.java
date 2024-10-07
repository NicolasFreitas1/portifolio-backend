package com.example.fipe;

public class FipeResponse {
    private double valor;
    private String mes;

    public FipeResponse(double valor, String mes) {
        this.valor = valor;
        this.mes = mes;
    }

    // Getters e Setters

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
}
