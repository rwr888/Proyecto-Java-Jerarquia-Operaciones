


import java.util.Scanner;

public class ejer38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pedir datos de entrada
        System.out.print("Ingrese la aportaci¢n del Socio A: ");
        double socioA = scanner.nextDouble();

        System.out.print("Ingrese la aportaci¢n del Socio B: ");
        double socioB = scanner.nextDouble();

        System.out.print("Ingrese la ganancia total: ");
        double gananciaTotal = scanner.nextDouble();

        // 2. Calcular capital total y proporci¢n exacta
        double totalAportacion = socioA + socioB;
        double gananciaSocioA = gananciaTotal * (socioA / totalAportacion);
        double gananciaSocioB = gananciaTotal * (socioB / totalAportacion);

        // 3. Imprimir resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Ganancia para el Socio A: " + gananciaSocioA);
        System.out.println("Ganancia para el Socio B: " + gananciaSocioB);

        scanner.close();
    }
}



