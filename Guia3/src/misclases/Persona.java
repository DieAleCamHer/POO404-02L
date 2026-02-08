package misclases;

import javax.swing.*;

public class Persona {

    // atributos
    private String nombre;
    private String apellido;
    private int edad;

    // constructor por defecto
    public Persona() {
        nombre = "Rafael";
        apellido = "Torres";
        edad = 23;
    }

    // constructor sobrecargado
    public Persona(String nom, String apell, int edad) {
        this.nombre = nom;
        this.apellido = apell;
        this.edad = edad;
    }

    public void ingresoDatos() {
        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        apellido = JOptionPane.showInputDialog("Ingrese apellido:");
        edad = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese edad:")
        );
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("------------------------");
    }
}