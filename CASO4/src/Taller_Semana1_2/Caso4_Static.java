package Taller_Semana1_2;

class Contador {

    // Variable estática
    static int contador = 0;

    // Constructor
    public Contador() {
        contador++;
    }

    // Método para mostrar contador
    public static void mostrarContador() {
        System.out.println("Objetos creados: " + contador);
    }
}

public class Caso4_Static {

    public static void main(String[] args) {

        // Crear objetos
        Contador c1 = new Contador();
        Contador c2 = new Contador();
        Contador c3 = new Contador();

        // Mostrar cantidad
        Contador.mostrarContador();
    }
}