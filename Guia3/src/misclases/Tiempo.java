package misclases;

import java.text.DecimalFormat;

public class Tiempo {

    private int hora;
    private int minuto;
    private int segundo;

    private void inicializarCampos() {
        hora = 0;
        minuto = 0;
        segundo = 0;
    }

    public Tiempo() {
        inicializarCampos();
    }

    public void establecerHora(int h, int m, int s) {
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public String aStringUniversal() {
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hora) + ":" +
                df.format(minuto) + ":" +
                df.format(segundo);
    }

    public String aStringEstandar() {
        DecimalFormat df = new DecimalFormat("00");

        return ((hora == 0 || hora == 12) ? 12 : hora % 12)
                + ":" + df.format(minuto)
                + ":" + df.format(segundo)
                + (hora < 12 ? " AM" : " PM");
    }

    // encapsulamiento

    public int getHora() { return hora; }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24)
            this.hora = hora;
    }

    public int getMinuto() { return minuto; }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60)
            this.minuto = minuto;
    }

    public int getSegundo() { return segundo; }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60)
            this.segundo = segundo;
    }
}