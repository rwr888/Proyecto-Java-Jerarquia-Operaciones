


/*
Ejercicio 47: Identificacion de 
Al Menos Un Par 
Desafio Logico
Solicita tres numeros enteros 
(n1, n2, n3). Muestra true si al 
menos uno de los tres numeros 
ingresados es de paridad par.
*/

import java.util.Scanner;

public class ejer47 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, n3;
        boolean esPar;

        System.out.print("Ingrese el primer numero entero (n1): ");
        n1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero entero (n2): ");
        n2 = teclado.nextInt();

        System.out.print("Ingrese el tercer numero entero (n3): ");
        n3 = teclado.nextInt();

        esPar = ((n1 % 2) == 0) || ((n2 % 2) == 0) || ((n3 % 2) == 0);

        System.out.println("Al menos uno de los numeros es par: " + esPar);

        teclado.close();
    }
}



