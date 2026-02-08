package Ejercicio3;

class Producto {
    String nombre;
    double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public double aplicarDescuento(double porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public void mostrar() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
    }
}

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Laptop",800);

        p1.mostrar();

        double nuevoPrecio = p1.aplicarDescuento(10);
        System.out.println("Precio con descuento: $" + nuevoPrecio);

        Producto p2 = new Producto("SSD", 100);

        p2.mostrar();

        double nuevoPreci = p2.aplicarDescuento(30);
        System.out.println("Precio con descuento: $" + nuevoPreci);
    }
}
