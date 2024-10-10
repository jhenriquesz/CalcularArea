package com.lanchenlayer;

public class App {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(4);
        QuadradoParaCirculo adaptador = new QuadradoParaCirculo(quadrado);

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Área do círculo equivalente: " + adaptador.calcularArea());
    }
}
