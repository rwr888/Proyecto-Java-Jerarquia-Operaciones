



/*
Ejercicio 48: Simulacion de 
Interruptor Escalonado 
Logica Digital
Solicita el estado de tres 
sensores binarios (s1, s2, s3 
con valores 1 o 0). Evalua si 
exactamente los tres sensores 
estan encendidos al mismo tiempo.
*/

import java.util.Scanner;

public class ejer48 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int s1, s2, s3;
        boolean estan3Encendidos;

        System.out.print("Ingrese el estado del sensor 1 (1 o 0): ");
        s1 = teclado.nextInt();

        System.out.print("Ingrese el estado del sensor 2 (1 o 0): ");
        s2 = teclado.nextInt();

        System.out.print("Ingrese el estado del sensor 3 (1 o 0): ");
        s3 = teclado.nextInt();

        estan3Encendidos = (s1 == 1) && (s2 == 1) && (s3 == 1);

        System.out.println("Los tres sensores estan encendidos: " + estan3Encendidos);

        teclado.close();
    }
}




