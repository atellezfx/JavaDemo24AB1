package edu.utel.poo.objetos;

public enum Modelo {
    LED, HALOGENO, INCANDESCENTE, AHORRADOR;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
