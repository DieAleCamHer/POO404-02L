package EjerciciosSwitch;

import java.util.Random;

public class DescuentoTienda {

    public static void main(String[] args) {
        aplicarDescuento("Carlos", 100);
    }

    static void aplicarDescuento(String nombre, double monto) {

        String[] colores = {"CAFE", "ROJA", "AZUL", "VERDE"};
        Random r = new Random();
        String bolita = colores[r.nextInt(colores.length)];

        double descuento = 0;

        switch (bolita) {
            case "CAFE": descuento = 0.10; break;
            case "ROJA": descuento = 0.15; break;
            case "AZUL": descuento = 0.25; break;
            case "VERDE": descuento = 0.50; break;
        }

        double total = monto - (monto * descuento);

        System.out.println("Cliente: " + nombre);
        System.out.println("Bolita: " + bolita);
        System.out.println("Total a pagar: $" + total);
    }
}
