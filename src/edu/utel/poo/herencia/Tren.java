package edu.utel.poo.herencia;

import java.util.ArrayList;
import java.util.Arrays;

public class Tren {

    private Maquina mqn;
    private ArrayList<Vagon> vagones = new ArrayList<>();

    public Tren(Maquina mqn) {
        this.mqn = mqn;
    }

    public void conectarVagones( Vagon ... args ) {
        vagones.addAll(Arrays.asList( args ) );
    }

    public double volumenTotal() {
//        double total = 0;
//        for( Vagon v : vagones ) {
//            total += v.volumen();
//        }
//        return total;
        return vagones.stream().mapToDouble( Vagon::volumen ).sum();
    }

    @Override
    public String toString() {
        String cadena = "Tren %s con %d vagones y un volúmen total de %.2fm³";
        return cadena.formatted(mqn, vagones.size(), volumenTotal());
    }
}
