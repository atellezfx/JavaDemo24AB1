package edu.utel.poo.expresiones;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Programa {

    private Scanner scn = new Scanner( System.in ).useDelimiter("\n");

    public static void main(String[] args) {
        Programa prog = new Programa();
        Banco bnk = new Banco("Banco de la Felicidad");
        prog.procesarSolicitud( bnk );
    }

    private Cliente crearCliente() {
        System.out.print("Ingrese su nombre completo: ");
        String nombre = scn.next();
        System.out.print("Ingrese su fecha de nacimiento (YYYY-MM-DD): ");
        LocalDate fechaNac = LocalDate.parse( scn.next() );
        return new Cliente(nombre, fechaNac);
    }

    private void procesarSolicitud(Banco bnk) {
        System.out.println("============= SOLICITUD DE CRÉDITO =============");
        System.out.print("Ingrese el monto: ");
        double monto = scn.nextDouble();
        Cliente cli = crearCliente();
        Credito cred = bnk.solicitarCredito(cli, monto);
        System.out.println(cli);
        System.out.println(cred);

    }

}
