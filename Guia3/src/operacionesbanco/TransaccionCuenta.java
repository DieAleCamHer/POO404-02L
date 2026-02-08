package operacionesbanco;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransaccionCuenta {

    private int idtransac;
    private double montotransac;
    private LocalDateTime fechatransac;
    private double saldoinic;

    public double nuevosaldo;
    char tipotransaccion;
    String descripcion;
    int estado;

    public TransaccionCuenta(int numoperac, double saldoinicial) {
        idtransac = numoperac;
        saldoinic = saldoinicial;
        nuevosaldo = saldoinicial;
    }

    public void Ejecutar(char tipooperac, double monto, String descripcion) {

        estado = 0;
        fechatransac = LocalDateTime.now();
        tipotransaccion = tipooperac;
        this.descripcion = descripcion;

        if (monto < 0) {
            estado = 2;
            return;
        }

        switch (tipooperac) {

            case 'r':
            case 'R':
                if (monto > saldoinic) {
                    estado = 1;
                    return;
                }
                montotransac = monto;
                nuevosaldo = saldoinic - monto;
                break;

            case 'd':
            case 'D':
                montotransac = monto;
                nuevosaldo = saldoinic + monto;
                break;

            default:
                estado = -1;
        }
    }

    public String getRegistro() {

        DateTimeFormatter formato =
                DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String fecha = fechatransac.format(formato);

        String tipo = (tipotransaccion == 'd' || tipotransaccion == 'D')
                ? "Deposito"
                : "Retiro";

        return String.format(
                "%4d.|%20s| %-10s |%-25s |$%10.2f |$%10.2f|",
                idtransac, fecha, tipo, descripcion,
                montotransac, nuevosaldo);
    }
}