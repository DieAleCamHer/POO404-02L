package interfaceswing;

import javax.swing.*;

public class MiVentana extends JFrame {

    public MiVentana(){

        // Crear etiqueta
        JLabel lblHola = new JLabel("Hola mundo desde Swing");
        add(lblHola);

        // tamaño de ventana
        this.setSize(500,200);

        // titulo
        this.setTitle("Mi primer ventana con JFrame");

        // cerrar aplicación
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // centrar ventana
        this.setLocationRelativeTo(null);

        // mostrar ventana
        this.setVisible(true);
    }
}