

/*
Ejercicio 20: Evaluacion de Deuda 
Acumulada 
Finanzas / Relacional
Pide el ingreso mensual y el 
pago de tarjeta de credito. 
Muestra si el pago de la tarjeta 
supera el 30% del ingreso mensual.
*/

import java.util.Scanner;

public class ejer20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ingresoMensual, pagoTDC;
        boolean masDe30;

        System.out.print("Ingrese el ingreso mensual: ");
        ingresoMensual = teclado.nextDouble();

        System.out.print("Ingrese el pago de tarjeta de credito: ");
        pagoTDC = teclado.nextDouble();

        masDe30 = pagoTDC > (ingresoMensual * 0.30);

        System.out.println("El pago supera el 30% del ingreso: " + masDe30);

        teclado.close();
    }
}


