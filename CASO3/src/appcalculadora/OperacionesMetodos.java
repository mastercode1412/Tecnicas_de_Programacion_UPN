package appcalculadora;

public class OperacionesMetodos {

    // Suma de 2 enteros
    int sumar(int a, int b) {
        return a + b;
    }

    // Suma de 2 decimales
    double sumar(double a, double b) {
        return a + b;
    }

    // Suma de 3 enteros
    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        OperacionesMetodos op = new OperacionesMetodos();

        System.out.println("Suma de 2 enteros: " + op.sumar(5, 3));

        System.out.println("Suma de 2 decimales: " + op.sumar(2.5, 4.3));

        System.out.println("Suma de 3 enteros: " + op.sumar(1, 2, 3));
    }
}