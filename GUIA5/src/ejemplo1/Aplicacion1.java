package ejemplo1;

import java.util.Scanner;

public class Aplicacion1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        IPago metodopago = null;
        String resultado;
        int tipopago;
        double monto;

        System.out.println("Ingrese monto a pagar:");
        monto = sc.nextDouble();

        System.out.println("Seleccione metodo de pago:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Bitcoin");
        System.out.println("3. Efectivo");

        tipopago = sc.nextInt();

        switch (tipopago) {
            case 1:
                metodopago = new PagoConTarjeta();
                break;
            case 2:
                metodopago = new PagoConBitcoin();
                break;
            case 3:
                metodopago = new PagoConEfectivo();
                break;
        }

        if (metodopago == null)
            System.out.println("ERROR: No eligio un metodo de pago valido");
        else {
            resultado = metodopago.ProcesarPago(monto);
            System.out.println(resultado);
        }
    }
}