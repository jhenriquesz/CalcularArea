package com.lanchenlayer;

public class QuadradoParaCirculo extends Circulo {
    private Quadrado quadrado;

    public QuadradoParaCirculo(Quadrado quadrado) {
        super(Math.sqrt(quadrado.calcularArea() / Math.PI));
        this.quadrado = quadrado;
    }
}
