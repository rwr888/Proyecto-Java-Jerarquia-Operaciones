

/*
Ejercicio 08: Consumo Promedio 
de Combustible Fisica / Automotriz
Pide los kilometros recorridos 
y los litros de gasolina consumidos. 
Calcula e imprime el rendimiento 
del vehiculo expresado en 
kilometros por litro.
*/

import java.util.Scanner;

public class ejer08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double kilometros, litros, rendimiento;

        System.out.print("Ingrese los kilometros recorridos: ");
        kilometros = teclado.nextDouble();

        System.out.print("Ingrese los litros de gasolina consumidos: ");
        litros = teclado.nextDouble();

        rendimiento = kilometros / litros;

        System.out.println("El rendimiento del vehiculo es (km/l): " + rendimiento);

        teclado.close();
    }
}


