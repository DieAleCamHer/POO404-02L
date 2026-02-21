package ejemplo1;

public class PagoConBitcoin implements IPago {

    @Override
    public String ProcesarPago(double monto) {
        return String.format("Pago con Bitcoin del monto recibido es $ %.2f", monto);
    }
}