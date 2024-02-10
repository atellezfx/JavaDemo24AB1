package edu.utel.poo.arreglos;

public record Empleado(int id, String nombre) {

    @Override
    public String toString() {
        return String.format("Empleado { 'id':%d, 'nombre':'%s'  }", id, nombre);
    }
}
