package edu.utel.poo.herencia;

// Un efecto colateral de clases abstractas es que no es posible crear objetos de ellas
public abstract class Vagon {

    protected final String CONTENIDO;

    public Vagon(String contenido) {
        this.CONTENIDO = contenido;
    }

    public abstract float volumen();

    public final String tipo() {
        String nombre = this.getClass().getSimpleName();
        return nombre.replace("Vagon", "").toLowerCase();
    }

    @Override
    public String toString() {
        return String.format("Vagón %s con un volúmen de %.2fm³", tipo(), volumen());
    }
}
