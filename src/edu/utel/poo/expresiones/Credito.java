package edu.utel.poo.expresiones;

public class Credito {

    private double monto, interes;

    public Credito(double monto, double interes) {
        this.monto = monto;
        this.interes = interes;
    }

    @Override
    public String toString() {
        return String.format("Crédito autorizado por $%,.2f con una tasa del %.0f%%",
                monto, interes*100);
    }
}
