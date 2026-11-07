

/*
Ejercicio 10: Area Total de 
un Paralelepipedo 
Geometria
Solicita el largo (a), ancho (b) 
y alto (c). Calcula el area 
superficial total sumando el 
doble de las areas de sus 
tres caras distintas.
*/

import java.util.Scanner;

public class ejer10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c, superficieTotal;

        System.out.print("Ingrese el largo (a): ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el ancho (b): ");
        b = teclado.nextDouble();

        System.out.print("Ingrese el alto (c): ");
        c = teclado.nextDouble();

        superficieTotal = 2.0 * ((a * b) + (a * c) + (b * c));

        System.out.println("El area superficial total es: " + superficieTotal);

        teclado.close();
    }
}


