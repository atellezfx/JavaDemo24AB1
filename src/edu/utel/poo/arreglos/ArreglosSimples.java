package edu.utel.poo.arreglos;

import java.util.Arrays;

public class ArreglosSimples {

    public static void main(String[] args) {
        ArreglosSimples prog = new ArreglosSimples();
        Empleado[] nomina = prog.crearArreglo();
        prog.imprimeArreglo( nomina );
    }

    private void imprimeArreglo(Empleado[] nomina) {
        // IMPRIMIENDO CON EL CICLO FOR TRADICIONAL
//        for (int i = 0; i < nomina.length; i++) {
//            System.out.println( nomina[i] );
//        }

        // IMPRIMIENDO CON EL CICLO FOR-EACH
//        for (Empleado e : nomina) {
//            if( e.nombre().startsWith("J") ) System.out.println(e);
//        }

        // IMPRIMIENDO ARREGLO CON STREAMS (PROG. FUNCIONAL)
        // Arrays.stream( nomina ).forEach(System.out::println );
        Arrays.stream( nomina )
                .filter( emp -> emp.nombre().startsWith("C"))
                .forEach( emp -> System.out.println(emp) );

    }

    private Empleado[] crearArreglo() {
        Empleado[] arreglo = new Empleado[7];
        arreglo[0] = new Empleado(1,"Claudina");
        arreglo[1] = new Empleado(2,"César");
        arreglo[2] = new Empleado(3,"Jair");
        arreglo[3] = new Empleado(4,"Jairo");
        arreglo[4] = new Empleado(5,"Juan");
        arreglo[5] = new Empleado(6,"Orlando");
        arreglo[6] = new Empleado(7,"Alejandro");
        return arreglo;
    }


}
