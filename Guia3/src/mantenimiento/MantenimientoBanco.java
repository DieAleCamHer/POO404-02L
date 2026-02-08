package mantenimiento;

import operacionesbanco.*;

import java.util.ArrayList;
import java.util.Scanner;

public class MantenimientoBanco {

    static Scanner sc = new Scanner(System.in);

    static ArrayList<Cliente> clientes = new ArrayList<>();
    static ArrayList<CuentaBancaria> cuentas = new ArrayList<>();


    // ===============================
    // REGISTRAR CLIENTE
    // ===============================
    public static void registrarCliente() {

        System.out.println("\n=== REGISTRAR CLIENTE ===");

        System.out.print("Nombre: ");
        String nom = sc.nextLine();

        System.out.print("Apellido: ");
        String ape = sc.nextLine();

        System.out.print("DUI: ");
        String dui = sc.nextLine();

        Cliente nuevo = new Cliente(nom, ape, dui);
        clientes.add(nuevo);

        mostrarClientes();
    }


    // ===============================
    // MOSTRAR CLIENTES
    // ===============================
    public static void mostrarClientes() {

        System.out.println("\nClientes registrados (" + clientes.size() + "):");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(
                    (i + 1) + ". " +
                            clientes.get(i).DatosCliente()
            );
        }

        System.out.println("\nPresione ENTER para continuar...");
        sc.nextLine();
    }


    // ===============================
    // ABRIR CUENTA
    // ===============================
    public static void abrirCuenta() {

        if (clientes.isEmpty()) {
            System.out.println("\nNo hay clientes registrados.");
            return;
        }

        mostrarClientes();

        System.out.print("Seleccione cliente #: ");
        int index = Integer.parseInt(sc.nextLine()) - 1;

        if (index < 0 || index >= clientes.size()) {
            System.out.println("Cliente inválido.");
            return;
        }

        Cliente titular = clientes.get(index);

        System.out.print("Monto inicial: ");
        double monto = Double.parseDouble(sc.nextLine());

        CuentaBancaria cuenta =
                new CuentaBancaria(titular, monto);

        cuentas.add(cuenta);

        System.out.println("\nCuenta creada exitosamente:");
        cuenta.vertransacciones();

        System.out.println("\nPresione ENTER...");
        sc.nextLine();
    }


    // ===============================
    // MENU
    // ===============================
    public static void menu() {

        int op;

        do {

            System.out.println("\n===== MANTENIMIENTO BANCO =====");
            System.out.println("1. Registrar cliente");
            System.out.println("2. Abrir cuenta de ahorro");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            op = Integer.parseInt(sc.nextLine());

            switch (op) {

                case 1:
                    registrarCliente();
                    break;

                case 2:
                    abrirCuenta();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (op != 3);
    }


    // ===============================
    // MAIN
    // ===============================
    public static void main(String[] args) {

        menu();
    }
}