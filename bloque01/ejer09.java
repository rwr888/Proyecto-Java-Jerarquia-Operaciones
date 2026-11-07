

/*
Ejercicio 9: Conversion de 
Horas a Dias y Horas Sobrantes 
Aritmetica / Modulo
Solicita un total de horas 
ingresado como entero. 
Calcula cuantos dias completos 
representa y cuantas horas 
adicionales quedan sin completar 
un dia.
*/

import java.util.Scanner;

public class ejer09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horas, diasCompletos, horasAdicional;

        System.out.print("Ingrese el total de horas: ");
        horas = teclado.nextInt();

        diasCompletos = horas / 24;
        horasAdicional = horas % 24;

        System.out.println("Dias completos: " + diasCompletos);
        System.out.println("Horas adicionales sobrantes: " + horasAdicional);

        teclado.close();
    }
}


