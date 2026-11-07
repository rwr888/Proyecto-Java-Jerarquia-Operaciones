

/*
Ejercicio 30: Evaluacion de 
Triangulo Isosceles 
Geometria / Logico
Pide la medida de 3 lados (a, b, c). 
Evalua si al menos dos de sus 
lados son iguales entre si.
*/

import java.util.Scanner;

public class ejer30 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double a, b, c;
        boolean isosceles;

        System.out.print("Ingrese el lado a: ");
        a = teclado.nextDouble();

        System.out.print("Ingrese el lado b: ");
        b = teclado.nextDouble();

        System.out.print("Ingrese el lado c: ");
        c = teclado.nextDouble();

        isosceles = (a == b) || (a == c) || (b == c);

        System.out.println("El triangulo es isosceles: " + isosceles);

        teclado.close();
    }
}



