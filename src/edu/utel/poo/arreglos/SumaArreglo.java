package edu.utel.poo.arreglos;

import java.util.Arrays;

public class SumaArreglo {

    public static void main(String[] args) {
        SumaArreglo prog = new SumaArreglo();
        int resultado1 = prog.sumar1( 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 );
        System.out.printf("El resultado de la suma es: %d \n", resultado1);

        int resultado2 = prog.sumar2( 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 );
        System.out.printf("El resultado de la suma es: %d \n", resultado2);

    }

    private int sumar1( int ... valores ) {
        int total = 0;
        for (int val : valores) {
            if( esPrimo(val) ) total += val;
        }
        return total;
    }

    private int sumar2( int ... valores ) {
        return Arrays.stream( valores )
                .filter( this::esPrimo )
                .sum();
    }

    private boolean esPrimo( int numero ) {
        if( numero <= 1 ) return false;
        int numDiv = 0;
        for( int i = numero; i > 0; i-- ) {
            if( numero % i == 0 ) numDiv++;
        }
        return numDiv == 2;
    }


}
