package Biblioteca;

import java.util.HashMap;
import java.util.Scanner;

public class GestionLibros {

    static HashMap<String, String> libros = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    static void menu() {
        int opcion;
        do {
            System.out.println("\n1. Crear libro");
            System.out.println("2. Leer libros");
            System.out.println("3. Actualizar libro");
            System.out.println("4. Eliminar libro");
            System.out.println("5. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1: crear(); break;
                case 2: leer(); break;
                case 3: actualizar(); break;
                case 4: eliminar(); break;
            }
        } while (opcion != 5);
    }

    static void crear() {
        System.out.print("ISBN: ");
        String isbn = sc.nextLine();
        System.out.print("Titulo: ");
        String titulo = sc.nextLine();
        libros.put(isbn, titulo);
    }

    static void leer() {
        System.out.println(libros);
    }

    static void actualizar() {
        System.out.print("ISBN a actualizar: ");
        String isbn = sc.nextLine();
        if (libros.containsKey(isbn)) {
            System.out.print("Nuevo titulo: ");
            libros.put(isbn, sc.nextLine());
        }
    }

    static void eliminar() {
        System.out.print("ISBN a eliminar: ");
        libros.remove(sc.nextLine());
    }
}
