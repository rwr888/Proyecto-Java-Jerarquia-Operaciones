


/*
Ejercicio 27: Acceso Preferencial 
a Evento Logico Combinado
Pide la edad del asistente y 
si cuenta con pase VIP (1 para si, 
0 para no). Muestra true si la 
edad es menor a 12 O si posee pase VIP.
*/

import java.util.Scanner;

public class ejer27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int edad, vip;
        boolean condicion;

        System.out.print("Ingrese la edad del asistente: ");
        edad = teclado.nextInt();

        System.out.print("Ingrese si cuenta con pase VIP (1 para si, 0 para no): ");
        vip = teclado.nextInt();

        condicion = (edad < 12) || (vip == 1);

        System.out.println("Tiene acceso preferencial: " + condicion);

        teclado.close();
    }
}



