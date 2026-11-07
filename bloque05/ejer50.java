

/*
Ejercicio 50: Verificacion de Ecuacion de Circulo en el Origen Geometria / Logico
Pide un punto (x, y) y el radio r de una circunferencia centrada en el origen. 
Muestra true si el punto cae exactamente sobre la circunferencia o dentro de ella.
*/

import java.util.Scanner;

public class ejer50 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x, y, r;
        boolean condicionado;

        System.out.print("Ingrese la coordenada x: ");
        x = teclado.nextDouble();

        System.out.print("Ingrese la coordenada y: ");
        y = teclado.nextDouble();

        System.out.print("Ingrese el radio r: ");
        r = teclado.nextDouble();

        condicionado = ((x * x) + (y * y)) <= (r * r);

        System.out.println("El punto cae sobre o dentro de la circunferencia: " + condicionado);

        teclado.close();
    }
}


