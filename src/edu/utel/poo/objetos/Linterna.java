package edu.utel.poo.objetos;

public class Linterna {

    private String marca, color;
    private Foco foco;
    private Bateria bateria;

    public Linterna(String marca, String color, Foco foco) {
        this.marca = marca;
        this.color = color;
        this.foco = foco;
    }

    public void colocarBateria(Bateria bat) {
        System.out.println("Colocando batería...");
        this.bateria = bat;
    }

    public void encender() {
        if( bateria != null ) {
            System.out.println("Encendiendo linterna");
        } else {
            System.out.println("La linterna no tiene batería");
        }
    }

    @Override
    public String toString() {
        String cadena = "Linterna \n\t • Marca: %s \n\t • Color: %s \n\t • %s \n\t • %s";
        return cadena.formatted( marca, color, foco, bateria);
    }
}
