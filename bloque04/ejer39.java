

/*
Ejercicio 39: Calificacion de 
Tarjeta de Credito Gold 
Banca
Pide el ingreso anual y el 
puntaje crediticio. Califica 
para tarjeta Gold si el ingreso 
es de al menos $300,000 Y el 
puntaje es mayor a 700 puntos.
*/

import java.util.Scanner;

public class ejer39 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double ingresoAnual;
        int creditScore;
        boolean esDorado;

        System.out.print("Ingrese el ingreso anual: ");
        ingresoAnual = teclado.nextDouble();

        System.out.print("Ingrese el puntaje crediticio: ");
        creditScore = teclado.nextInt();

        esDorado = (ingresoAnual >= 300000.0) && (creditScore > 700);

        System.out.println("Califica para tarjeta Gold: " + esDorado);

        teclado.close();
    }
}



