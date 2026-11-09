


/*
Ejercicio 28: Exclusion de 
Multiplos de 10 
Logico NOT / Modulo
Solicita un entero positivo. 
Evalua mediante el operador 
logico NOT o desigualdad si 
el numero NO termina en cero.
*/

import java.util.Scanner;

public class ejer28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int x;
        boolean noTerminaEnCero;

        System.out.print("Ingrese un entero positivo: ");
        x = teclado.nextInt();

        noTerminaEnCero = !((x % 10) == 0);

        System.out.println("El numero NO termina en cero: " + noTerminaEnCero);

        teclado.close();
    }
}


