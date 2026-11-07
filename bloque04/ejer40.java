

/*
Ejercicio 40: Depreciacion 
Lineal Anual 
Contabilidad
Pide el valor inicial de una 
maquinaria, su valor de rescate 
final y sus anos de vida util. 
Calcula el costo de depreciacion 
que sufre el activo por cada 
ano transcurrido.

*/

import java.util.Scanner;

public class ejer40 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorInic, valorResc, vidaUtil, depreciacion;

        System.out.print("Ingrese el valor inicial de la maquinaria: ");
        valorInic = teclado.nextDouble();

        System.out.print("Ingrese el valor de rescate final: ");
        valorResc = teclado.nextDouble();

        System.out.print("Ingrese los anos de vida util: ");
        vidaUtil = teclado.nextDouble();

        depreciacion = (valorInic - valorResc) / vidaUtil;

        System.out.println("El costo de depreciacion anual es: " + depreciacion);

        teclado.close();
    }
}


