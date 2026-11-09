

/*
Ejercicio 18: Igualdad de 
Tres Numeros Relacional
Solicita tres valores enteros 
(a, b, c). Determina mediante 
comparaciones de igualdad si 
los tres numeros son identicos 
entre si.
*/

import java.util.Scanner;

public class ejer18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;
        boolean sonIdenticos;

        System.out.print("Ingrese el primer valor entero (a): ");
        a = teclado.nextInt();

        System.out.print("Ingrese el segundo valor entero (b): ");
        b = teclado.nextInt();

        System.out.print("Ingrese el tercer valor entero (c): ");
        c = teclado.nextInt();

        sonIdenticos = (a == b) && (b == c);

        System.out.println("Los tres numeros son identicos: " + sonIdenticos);

        teclado.close();
    }
}


