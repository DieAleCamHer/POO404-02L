package aplicacion;

import modelos.*;
import org.w3c.dom.ls.LSOutput;

public class Principal {
    public static void main(String[] args) throws Exception{
        // new VerPersonas();
        /*System.out.println("numero de telefono ");
        if (Testing.compareTelephone("2526-1485"))
            System.out.println("es valido");
        else
            System.out.println("es incorrecto");
        System.out.println("fecha ");
        if (Testing.compareDate("2021-06-14"))
            System.out.println("es valido");
        else
            System.out.println("es incorrecto");*/

        //declara e instancia a objeto ing de clase IngresoDatos
        //IngresoDatos ing=new IngresoDatos();
        //invoca a metodos
        //ing.mostrardatos();
        //ing.cierreconexion();

        new VerificarNulos();
    }
}
