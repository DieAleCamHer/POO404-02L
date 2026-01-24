package EjercicioComplementario3;

import javax.swing.JOptionPane;

public class TanquesCombustible {

    public static void main(String[] args) {

        double radio = solicitarDato("Digite el radio del tanque (m):");
        double altura = solicitarDato("Digite la altura del tanque (m):");

        double volumenLitros = calcularVolumenLitros(radio, altura);
        double masaGasolina = calcularMasaGasolina(volumenLitros);

        imprimirResultados(volumenLitros, masaGasolina);
    }

    public static double solicitarDato(String mensaje) {
        String dato = JOptionPane.showInputDialog(mensaje);
        return Double.parseDouble(dato);
    }

    public static double calcularVolumenLitros(double radio, double altura) {
        double volumenMetrosCubicos = Math.PI * Math.pow(radio, 2) * altura;
        return volumenMetrosCubicos * 1000; // m³ a litros
    }

    public static double calcularMasaGasolina(double volumenLitros) {
        final double DENSIDAD_GASOLINA = 0.750; // g/mL
        double volumenML = volumenLitros * 1000;
        double masaGramos = volumenML * DENSIDAD_GASOLINA;
        return masaGramos / 1000; // kg
    }

    public static void imprimirResultados(double volumenDiesel, double masaGasolina) {
        System.out.println("Volumen maximo de Diesel: " + volumenDiesel + " litros");
        System.out.println("Cantidad maxima de Gasolina: " + masaGasolina + " kg");
    }
}
