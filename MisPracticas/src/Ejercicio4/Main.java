package Ejercicio4;

class Empleado {
    private String nombre;
    private double salario;

    //Constructor
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo
    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: $" + salario);
    }

    //Metodo de negocio, no retorna nada
    public void aumento(double monto) {
        salario += monto;
    }

    public double getSalario() {
        return salario;
    }
}
public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Diego Campos", 400);

        e1.mostrar();

        e1.aumento(300);

        System.out.println("Nuevo salario: $" + e1.getSalario());
    }
}
