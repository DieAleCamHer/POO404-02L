package EjerciciosMatematicos;

public class EcuacionCuadratica {

    public static void main(String[] args) {

        // Casos de prueba
        resolverEcuacion(1, -3, 2);   // Raíces reales
        resolverEcuacion(1, 2, 1);    // Raíz doble
        resolverEcuacion(1, 2, 5);    // Raíces complejas
        resolverEcuacion(0, 2, 3);    // No es ecuación cuadrática
    }

    // Método que retorna el determinante
    static double determinante(double a, double b, double c) {
        return (b * b) - (4 * a * c);
    }

    // Método que resuelve la ecuación
    static void resolverEcuacion(double a, double b, double c) {

        try {
            // Validación: a no puede ser 0
            if (a == 0) {
                throw new ArithmeticException(
                        "El coeficiente 'a' no puede ser 0");
            }

            double det = determinante(a, b, c);

            if (det > 0) {
                double x1 = (-b + Math.sqrt(det)) / (2 * a);
                double x2 = (-b - Math.sqrt(det)) / (2 * a);

                System.out.println("Raíces reales:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if (det == 0) {
                double x = -b / (2 * a);
                System.out.println("Raíz doble:");
                System.out.println("x = " + x);
            }
            else {
                // Raíces complejas
                double parteReal = -b / (2 * a);
                double parteImaginaria =
                        Math.sqrt(Math.abs(det)) / (2 * a);

                System.out.println("Raíces complejas:");
                System.out.println("x1 = " + parteReal +
                        " + " + parteImaginaria + "i");
                System.out.println("x2 = " + parteReal +
                        " - " + parteImaginaria + "i");
            }

        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error inesperado en el cálculo");
        }

        System.out.println("-----------------------------");
    }
}
