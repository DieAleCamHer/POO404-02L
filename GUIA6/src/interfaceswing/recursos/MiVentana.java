package interfaceswing.recursos;

import javax.swing.*;

public class MiVentana extends JFrame{

    public MiVentana(){
        JLabel lblHola = new JLabel("Hola, soy una Etiqueta JLabel");
        //metodo add, heredado de clase JFrame para insertar objeto a su coleccion
        //de controles disponibles para presentar en la ventana
        this.add(lblHola);
        //dimensiones (ancho, alto) de ventana
        this.setSize(500,200);
        //titulo de ventana a generar
        this.setTitle("Mi primer ventana con JFrame");
        //cuando cierre ventana, se finaliza instancia de esta clase
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //centra ventana en monitor

        this.setVisible(true);
    }
}
