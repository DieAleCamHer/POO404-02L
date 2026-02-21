package ejemplo1;

public class PagoConTarjeta implements IPago {

    @Override
    public String ProcesarPago(double monto) {
        return String.format("Pago con Tarjeta del monto recibido es $ %.2f", monto);
    }
}