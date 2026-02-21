package ejemplo2;

public interface INumero {

    INumero Sumarle(INumero valor);
    INumero Simplificar();
    INumero Simplificar(int num, int deno);
    INumero Dividir(INumero valor);
    INumero ElevarA(int n);
}