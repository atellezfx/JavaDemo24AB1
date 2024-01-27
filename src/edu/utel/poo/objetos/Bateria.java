package edu.utel.poo.objetos;

public record Bateria(float voltaje, int amperaje, boolean recargable) {

    @Override
    public String toString() {
        String cadena = "Batería con %.2fv, %dmAh, %s";
        return cadena.formatted( voltaje, amperaje, recargable ? "recargable" : "alcalina");
    }

}
