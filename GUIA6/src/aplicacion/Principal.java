package aplicacion;

//import interfaceswing.recursos.MiVentana;
import interfaceswing.recursos.formPersona;

public class Principal {
    public static void main(String[] args) {
        //new MiVentana();
        formPersona formpersona = new formPersona(
                "Ingreso de datos de una persona"
        );
        formpersona.setVisible(true);
    }
}
