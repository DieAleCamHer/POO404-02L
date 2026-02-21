package ejemplo2;

import java.util.ArrayList;

public class Aplicacion2 {

    public static void main(String[] args){

        NumFraccionario f1=new NumFraccionario(2,3);
        NumFraccionario f2=new NumFraccionario(4,9);

        INumero r=f1.Dividir(f2);
        System.out.println("Division: "+r);

        INumero p=f1.ElevarA(2);
        System.out.println("Potencia: "+p);

        ArrayList<NumFraccionario> lista=new ArrayList<>();
        lista.add(new NumFraccionario(1,2));
        lista.add(new NumFraccionario(3,4));
        lista.add(new NumFraccionario(5,6));

        sumarColeccion(lista);
    }

    public static void sumarColeccion(ArrayList<NumFraccionario> lista){
        if(lista==null || lista.isEmpty()){
            System.out.println("Datos recibidos son incompletos, fin de ejecución del metodo");
            return;
        }

        INumero suma=lista.get(0);
        for(int i=1;i<lista.size();i++){
            suma=suma.Sumarle(lista.get(i));
        }

        System.out.println("Suma total: "+suma);
    }
}