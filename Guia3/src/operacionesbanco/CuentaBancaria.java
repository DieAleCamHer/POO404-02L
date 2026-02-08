package operacionesbanco;

import java.util.ArrayList;

public class CuentaBancaria {

    private Cliente titularcuenta;
    private double saldoactual;
    private int numtransac;

    private ArrayList<TransaccionCuenta> transacciones;

    private void inicializarcampos() {
        titularcuenta = null;
        saldoactual = 0;
        numtransac = 0;
        transacciones = new ArrayList<>();
    }

    public CuentaBancaria(Cliente propietario, double saldoInicial) {

        inicializarcampos();
        titularcuenta = propietario;

        TransaccionCuenta apertura =
                new TransaccionCuenta(++numtransac, 0);

        apertura.Ejecutar('d', saldoInicial,
                "apertura de cuenta");

        saldoactual = apertura.nuevosaldo;

        transacciones.add(apertura);
    }

    public void realizaroperacion(char tipo,
                                  double monto,
                                  String desc) {

        TransaccionCuenta t =
                new TransaccionCuenta(numtransac + 1,
                        saldoactual);

        t.Ejecutar(tipo, monto, desc);

        switch (t.estado) {

            case 1:
                System.out.println("Saldo insuficiente");
                break;

            case 2:
                System.out.println("Monto inválido");
                break;

            default:
                numtransac++;
                saldoactual = t.nuevosaldo;
                transacciones.add(t);
                System.out.println("Transacción exitosa");
        }
    }

    public void vertransacciones() {

        System.out.println("\nTitular: " +
                titularcuenta.DatosCliente());

        System.out.println("Saldo actual: $" + saldoactual);

        for (TransaccionCuenta t : transacciones)
            System.out.println(t.getRegistro());
    }

    public double getSaldoactual() {
        return saldoactual;
    }
}