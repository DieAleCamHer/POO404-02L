package EjercicioComplementario2;

import javax.swing.JOptionPane;

public class Capacitores {

    public static void main(String[] args) {

        double c1 = solicitarCapacitor("Digite el valor del capacitor 1 (µF):");
        double c2 = solicitarCapacitor("Digite el valor del capacitor 2 (µF):");
        double c3 = solicitarCapacitor("Digite el valor del capacitor 3 (µF):");

        if (c1 <= 0 || c2 <= 0 || c3 <= 0) {
            System.out.println("Error: valores invalidos. El programa finaliza.");
            System.exit(0);
        }

        System.out.println("Capacitores ingresados:");
        System.out.println("C1 = " + c1 + " µF");
        System.out.println("C2 = " + c2 + " µF");
        System.out.println("C3 = " + c3 + " µF");

        double serie = capacitorSerie(c1, c2, c3);
        double paralelo = capacitorParalelo(c1, c2, c3);

        System.out.println("\nCapacitor equivalente en SERIE: " + serie + " µF");
        System.out.println("Capacitor equivalente en PARALELO: " + paralelo + " µF");
    }

    public static double solicitarCapacitor(String mensaje) {
        String valor = JOptionPane.showInputDialog(mensaje);

        if (valor == null || valor.isEmpty()) {
            return -1;
        }
        return Double.parseDouble(valor);
    }

    public static double capacitorSerie(double c1, double c2, double c3) {
        return 1 / ((1 / c1) + (1 / c2) + (1 / c3));
    }

    public static double capacitorParalelo(double c1, double c2, double c3) {
        return c1 + c2 + c3;
    }
}
