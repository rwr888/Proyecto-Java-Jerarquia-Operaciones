/*
Ejercicio 49: Criterio de Beca 
Universitaria Integrada 
Academico / Logico
Pide el promedio academico, 
el ingreso familiar mensual 
y el numero de hermanos 
estudiantes. Otorga la beca 
si el promedio es mayor o igual 
a 9.5 O si el ingreso es menor 
a $8,000 Y los hermanos son 
mas de 2.
*/

import java.util.Scanner;

public class ejer49 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double prom, ingresoFam;
        int hermanos;
        boolean becado;

        System.out.print("Ingrese el promedio academico: ");
        prom = teclado.nextDouble();

        System.out.print("Ingrese el ingreso familiar mensual: ");
        ingresoFam = teclado.nextDouble();

        System.out.print("Ingrese el numero de hermanos estudiantes: ");
        hermanos = teclado.nextInt();

        becado = (prom >= 9.5) || ((ingresoFam < 8000.0) && (hermanos > 2));

        System.out.println("Otorga la beca universitaria: " + becado);

        teclado.close();
    }
}


