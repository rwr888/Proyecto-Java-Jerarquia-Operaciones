


/*
Ejercicio 29: Rango de Presion 
Arterial Normal 
Salud / Logico
Pide la presion sistolica. 
Muestra true si la presion esta 
en el rango saludable de 90 a 120 
mmHg (ambos inclusive).
*/

import java.util.Scanner;

public class ejer29 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int presion;
        boolean saludable;

        System.out.print("Ingrese la presion sistolica: ");
        presion = teclado.nextInt();

        saludable = (presion >= 90) && (presion <= 120);

        System.out.println("La presion esta en el rango saludable: " + saludable);

        teclado.close();
    }
}



