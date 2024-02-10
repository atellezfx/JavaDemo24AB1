package edu.utel.poo.arreglos;

public class ArreglosIrregulares {

    public static void main(String[] args) {
        ArreglosIrregulares prog = new ArreglosIrregulares();
        String[][] personajes = prog.crearArreglo();
        prog.imprimeArreglo( personajes );
    }

    private String casaProductora(int i) {
        return switch (i) {
            case 0 -> "Hanna-Barbera";
            case 1 -> "Disney";
            case 2 -> "The Simpsons";
            default -> "Desconocido";
        };
    }

    private void imprimeArreglo(String[][] personajes) {
        for (int i = 0; i < personajes.length; i++) {
            System.out.printf("# %s \n", casaProductora(i));
            for (int j = 0; j < personajes[i].length; j++) {
                System.out.printf("\t• %s \n", personajes[i][j]);
            }
        }
    }

    private String[][] crearArreglo() {
        String[][] personajes = new String[3][];
        final int HANNAB = 0, DISNEY = 1, SIMPSONS = 2;

        personajes[HANNAB] = new String[5]; // Personajes de Hanna-Barbera
        personajes[HANNAB][0] = "Oso Yogi";
        personajes[HANNAB][1] = "Johnny Bravo";
        personajes[HANNAB][2] = "Pedro Picapiedra";
        personajes[HANNAB][3] = "Wilma Picapiedra";
        personajes[HANNAB][4] = "Don Gato";

        personajes[DISNEY] = new String[3]; // Personajes de Disney
        personajes[DISNEY][0] = "Mickey Mouse";
        personajes[DISNEY][1] = "Pinocho";
        personajes[DISNEY][2] = "Pato Donald";

        personajes[SIMPSONS] = new String[4];
        personajes[SIMPSONS][0] = "Homero";
        personajes[SIMPSONS][1] = "Maggie";
        personajes[SIMPSONS][2] = "Bart";
        personajes[SIMPSONS][3] = "Lisa";

        return personajes;
    }


}
