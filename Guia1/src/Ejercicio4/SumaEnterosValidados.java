package Ejercicio4;

import javax.swing.JOptionPane;

public class SumaEnterosValidados {

    public static void main(String[] args) {

        String primernumero;
        String segundonumero;

        int numero1;
        int numero2;
        int suma;

        primernumero = JOptionPane.showInputDialog("Digite el primer numero");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");

        if (primernumero == null || segundonumero == null ||
                primernumero.isEmpty() || segundonumero.isEmpty()) {

            JOptionPane.showMessageDialog(null,
                    "No se ingresaron datos validos. El programa finalizara.");
            System.exit(0);
        }

        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        if (numero1 < 0 || numero2 < 0) {
            JOptionPane.showMessageDialog(null,
                    "No se permiten numeros negativos. El programa finalizara.");
            System.exit(0);
        }

        suma = numero1 + numero2;

        JOptionPane.showMessageDialog(null,
                "La suma es: " + suma,
                "Resultado",
                JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
