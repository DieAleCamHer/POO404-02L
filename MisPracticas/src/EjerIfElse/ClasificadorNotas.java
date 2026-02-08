package EjerIfElse;

import java.util.Scanner;

public class ClasificadorNotas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nota: ");
        int nota = sc.nextInt();

        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 6) {
            System.out.println("Regular");
        } else {
            System.out.println("Reprobado");
        }
    }
}
