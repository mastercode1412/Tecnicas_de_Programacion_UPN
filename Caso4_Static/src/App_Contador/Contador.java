package App_Contador;

public class Contador {

    static int Contador = 0;

    public Contador() {
        Contador++;
    }

    public static void mostrarContador() {
        System.out.println("Objetos creados: " + Contador);
    }
}