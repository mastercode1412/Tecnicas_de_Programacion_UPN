package appcalculadora; // Declaramos el paquete donde está la clase

// Clase que encapsula las operaciones matemáticas básicas
public class Operaciones {

    // Método para sumar dos números
    public double sumar(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public double restar(double a, double b) {
        return a - b;
    }

    // Método para multiplicar dos números
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para dividir dos números con validación
    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }
}
