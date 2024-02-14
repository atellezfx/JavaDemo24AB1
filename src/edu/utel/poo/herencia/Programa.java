package edu.utel.poo.herencia;

public class Programa {

    public static void main(String[] args) {
        Maquina mqn = new Maquina("El Olivo");

        VagonCerrado vc1 = new VagonCerrado("Grava");
        System.out.println(vc1);

        VagonCisterna vs1 = new VagonCisterna("Diésel");
        System.out.println(vs1);

        VagonAutorack va1 = new VagonAutorack("Audi A6 x6");
        System.out.println(va1);

        Tren t1 = new Tren(mqn);
        t1.conectarVagones(vc1, vs1, va1);

        System.out.println(t1);

    }

}
