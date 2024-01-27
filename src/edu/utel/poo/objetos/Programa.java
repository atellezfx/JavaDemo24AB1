package edu.utel.poo.objetos;

public class Programa {

    public static void main(String[] args) {
        Foco f1 = new Foco(5000, Luz.CALIDA, Modelo.LED);
//        System.out.println(f1);
        Bateria bat1 = new Bateria(1.2f, 2300, false);
//        System.out.println(bat1);

        Linterna lnt1 = new Linterna("Phillips", "Blanca", f1);
        System.out.println(lnt1);

        lnt1.encender();
        lnt1.colocarBateria( bat1 );
        lnt1.encender();

        System.out.println(lnt1);



    }

}
