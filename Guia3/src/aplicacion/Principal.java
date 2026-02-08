package aplicacion;

import misclases.*;
import operacionesbanco.*;

import java.util.Scanner;

public class Principal {

    public static void parte1() {

        Persona obj1 = new Persona();
        Persona obj2 =
                new Persona("Manuel", "Valdez", 25);

        obj1.mostrarDatos();
        obj1.ingresoDatos();
        obj1.mostrarDatos();
        obj2.mostrarDatos();
    }

    public static void parte2() {

        Tiempo hora1 = new Tiempo();

        hora1.establecerHora(18, 27, 6);

        hora1.setHora(9);

        System.out.println(
                hora1.aStringUniversal());
    }

    public static void parte3() {

        Cliente iris =
                new Cliente("Iris", "Bonilla",
                        "0858786-6");

        CuentaBancaria c1 =
                new CuentaBancaria(iris, 20);

        c1.realizaroperacion('d',
                100.2, "premio");

        c1.realizaroperacion('r',
                300, "viaje");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.println(
                    "\nOperacion #" + i);

            System.out.print("d/r: ");
            char tipo =
                    sc.nextLine().charAt(0);

            System.out.print("Monto: ");
            double monto =
                    Double.parseDouble(
                            sc.nextLine());

            System.out.print("Motivo: ");
            String motivo =
                    sc.nextLine();

            c1.realizaroperacion(
                    tipo, monto, motivo);

            System.out.println(
                    "Saldo: $" +
                            c1.getSaldoactual());
        }

        c1.vertransacciones();
    }

    public static void main(String[] args) {

        //parte1();
        //parte2();
        parte3();
    }
}