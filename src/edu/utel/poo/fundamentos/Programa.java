package edu.utel.poo.fundamentos;

import java.time.LocalDate;

public class Programa {

    public static void main(String[] args) {
        Perro denver = new Perro("Denver",
                LocalDate.of(2016, 1, 19),
                Talla.GRANDE);
        System.out.println(denver);
        CalculadoraEdadHumana calc = new CalculadoraEdadHumana();
        System.out.printf("Edad: %d ~ Edad Humana: %d años", denver.edad(), calc.calcular( denver ));

    }

}
