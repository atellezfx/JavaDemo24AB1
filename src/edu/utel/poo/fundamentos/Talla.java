package edu.utel.poo.fundamentos;

public enum Talla {

    CHICA(5), MEDIANA(5), GRANDE(6), EXTRA_GRANDE(7);

    private int diferencia;

    Talla(int dif) {
        this.diferencia = dif;
    }

    public int obtenerDiferencia() {
        return diferencia;
    }

}
