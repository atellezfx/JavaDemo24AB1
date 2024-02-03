package edu.utel.poo.expresiones;

public enum Categoria {

    CAT_A(14,17),
    CAT_B(18,24),
    CAT_C(25,59),
    CAT_D(60,75);

    private int edadMin, edadMax;

    Categoria(int edadMin, int edadMax) {
        this.edadMin = edadMin;
        this.edadMax = edadMax;
    }

    public boolean clasifica(int edadCliente) {
        return edadCliente >= edadMin && edadCliente <= edadMax;
    }

}
