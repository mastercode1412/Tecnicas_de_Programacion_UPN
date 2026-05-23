package apppersona;

public class Caso2Persona {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Arianna", 23);
        Persona persona2 = new Persona("Francisco", 25);

        System.out.println("Datos de la primera persona:");
        persona1.mostrarDatos();

        System.out.println();

        System.out.println("Datos de la segunda persona:");
        persona2.mostrarDatos();
    }
}