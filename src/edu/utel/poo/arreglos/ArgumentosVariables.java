package edu.utel.poo.arreglos;

public class ArgumentosVariables {

    public static void main(String[] args) {
        ArgumentosVariables prog = new ArgumentosVariables();
        String[] nombres = {"Claudina", "César", "Jair", "Jairo", "Orlando", "Miguel"};
//        prog.imprimirV1( nombres );
        prog.imprimirV2( nombres );
        prog.imprimirV2("Claudina");
        prog.imprimirV2();
        prog.imprimirV2("Claudina", "César");
        prog.imprimirV2("Claudina", "César", "Jair", "Jairo", "Orlando");

    }

    private void imprimirV1(String[] nombres) {
        System.out.println("Imprimiendo desde versión 1: ");
        for (String cad : nombres) System.out.printf("• %s \n", cad);
    }

    private void imprimirV2(String ... nombres) {
        System.out.println("Imprimiendo desde versión 2: ");
        for (String cad : nombres) System.out.printf("• %s \n", cad);
    }


}
