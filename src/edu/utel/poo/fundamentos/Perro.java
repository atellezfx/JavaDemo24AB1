package edu.utel.poo.fundamentos;

import java.time.LocalDate;
import java.time.Period;

public class Perro {

    private String nombre;
    private LocalDate fechaNac;
    private Talla talla;

    public Perro(String nombre, LocalDate fechaNac, Talla talla) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.talla = talla;
    }

    public int edad() {
        Period per = Period.between(fechaNac, LocalDate.now());
        return per.getYears();
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public Talla getTalla() {
        return talla;
    }

    public String toString() {
        // Se crean en la siguiente línea de código hasta 9 cadenas de texto en memoria
        // String mensaje = "Perro: " + nombre + ", edad: " + edad() + ", talla: " + talla;
        // return mensaje;
        String cadena = "Perro: %s, edad: %d, talla: %s";
        return cadena.formatted(nombre, edad(), talla);
    }

}
