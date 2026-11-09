

/*
Ejercicio 07: Promedio Ponderado 
de Asignatura Academico
Pide la nota de Examenes (40%), 
Tareas (30%) y Proyecto (30%). 
Muestra la calificacion final 
calculando la suma de los 
productos respectivos.
*/

import java.util.Scanner;

public class ejer07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double examenes, tareas, proyecto, calificacion;

        System.out.print("Ingrese la nota de Examenes: ");
        examenes = teclado.nextDouble();

        System.out.print("Ingrese la nota de Tareas: ");
        tareas = teclado.nextDouble();

        System.out.print("Ingrese la nota de Proyecto: ");
        proyecto = teclado.nextDouble();

        calificacion = (examenes * 0.4) + (tareas * 0.3) + (proyecto * 0.3);

        System.out.println("La calificacion final es: " + calificacion);

        teclado.close();
    }
}


