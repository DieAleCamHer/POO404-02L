package Ejercicio2;

class CuentaBancaria {
    private double saldo;

    public void depositar(double monto) {
        saldo += monto;
    }
    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("Fondos insuficientes");
        }
    }
    public double getSaldo() {
        return saldo;
    }
}
public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.depositar(500);
        cuenta.retirar(200);

        System.out.println("Saldo actual: " + cuenta.getSaldo());
    }
}
