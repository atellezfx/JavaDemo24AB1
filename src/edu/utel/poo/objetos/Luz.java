package edu.utel.poo.objetos;

public enum Luz {
    FRIA, CALIDA, NEUTRA, RGB;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}