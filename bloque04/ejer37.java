


/*
Ejercicio 37: Calculo de Utilidad 
Comercial 
Contabilidad
Solicita el precio de costo y 
el precio de venta al publico. 
Muestra si el margen de ganancia 
es mayor o igual al 30%.
*/

import java.util.Scanner;

public class ejer37 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double venta, costo, margen;
        boolean es30oMas;

        System.out.print("Ingrese el precio de costo: ");
        costo = teclado.nextDouble();

        System.out.print("Ingrese el precio de venta al publico: ");
        venta = teclado.nextDouble();

        margen = (venta - costo) / costo;
        es30oMas = margen >= 0.30;

        System.out.println("El margen de ganancia es mayor o igual al 30%: " + es30oMas);

        teclado.close();
    }
}


