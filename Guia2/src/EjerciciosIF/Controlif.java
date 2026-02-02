package EjerciciosIF;
import javax.swing.*;

public class Controlif {
    public static void main(String[] args) {
        ejemplo3();
    }

    static void ejemplo3() {
        int result = JOptionPane.showConfirmDialog(
                null, "Replace existing selection?");

        switch (result) {
            case JOptionPane.YES_OPTION:
                System.out.println("Yes");
                break;

            case JOptionPane.NO_OPTION:
                System.out.println("No");
                break;

            case JOptionPane.CANCEL_OPTION:
                System.out.println("Cancel");
                break;

            case JOptionPane.CLOSED_OPTION:
                System.out.println("Closed");
                break;
        }

        System.exit(0);
    }

}
