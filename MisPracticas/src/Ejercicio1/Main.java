package Ejercicio1;

class Estudiante {
    String nombre;
    int edad;

    //Metodo
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante();
        Estudiante est2 = new Estudiante();

        est1.nombre = "Diego";
        est1.edad = 20;

        est2.nombre = "Alejandro";
        est2.edad = 19;

        est1.mostrarInfo();
        est2.mostrarInfo();
    }
}
