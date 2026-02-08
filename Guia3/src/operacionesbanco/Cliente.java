package operacionesbanco;

public class Cliente {

    public String dui;
    public String nombre;
    public String apellido;

    public Cliente(String nom, String apell, String dui) {
        this.nombre = nom;
        this.apellido = apell;
        this.dui = dui;
    }

    public String DatosCliente() {
        return String.format("%s %s (dui: %s)",
                nombre, apellido, dui);
    }
}