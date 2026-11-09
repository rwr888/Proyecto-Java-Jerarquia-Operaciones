


/*
Ejercicio 17: Verificacion de 
Velocidad Maxima Transito / Relacional
Solicita la velocidad registrada 
de un vehiculo. Evalua si excede 
el limite permitido en autopista 
de 110.0 km/h.
*/

import java.util.Scanner;

public class ejer17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double velocidad;
        boolean excede;

        System.out.print("Ingrese la velocidad registrada: ");
        velocidad = teclado.nextDouble();

        excede = velocidad > 110.0;

        System.out.println("La velocidad excede el limite de 110.0 km/h: " + excede);

        teclado.close();
    }
}



