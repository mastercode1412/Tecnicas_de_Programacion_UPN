package appcalculadora; // Declaramos el paquete donde está la clase

// Importamos Scanner para leer datos del usuario
import java.util.Scanner;

// Clase principal que interactúa con el usuario
public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operaciones op = new Operaciones();

        int opcion; // variable para controlar el menú

        // Bucle infinito hasta que el usuario decida salir
        while (true) {
            // Pedimos los números al usuario
            System.out.print("Ingrese el primer número: ");
            double num1 = sc.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = sc.nextDouble();

            // Mostramos el menú de operaciones
            System.out.println("Elija la operación:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("0. Salir");

            opcion = sc.nextInt();
            double resultado = 0;

            // Condición para salir
            if (opcion == 0) {
                System.out.println("Saliendo de la calculadora...");
                break; // rompe el bucle y termina el programa
            }

            // Usamos switch para decidir qué método llamar
            switch (opcion) {
                case 1:
                    resultado = op.sumar(num1, num2);
                    break;
                case 2:
                    resultado = op.restar(num1, num2);
                    break;
                case 3:
                    resultado = op.multiplicar(num1, num2);
                    break;
                case 4:
                    resultado = op.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Opción inválida.");
                    continue; // vuelve al inicio del bucle
            }

            // Mostramos el resultado final
            System.out.println("El resultado es: " + resultado);
        }

        sc.close();
    }
}