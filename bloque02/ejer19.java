


/*
Ejercicio 19: Comprobacion de 
Signo Negativo 
Relacional
Pide un valor decimal. 
Retorna un booleano que indique 
si el numero ingresado es un valor 
estrictamente menor que cero.
*/

import java.util.Scanner;

public class ejer19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double x;
        boolean esMenorDe0;

        System.out.print("Ingrese un valor decimal: ");
        x = teclado.nextDouble();

        esMenorDe0 = x < 0.0;

        System.out.println("El numero es estrictamente menor que cero: " + esMenorDe0);

        teclado.close();
    }
}


