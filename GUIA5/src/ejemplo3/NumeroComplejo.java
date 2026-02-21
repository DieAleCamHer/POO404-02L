package ejemplo3;

import ejemplo2.INumero;

public class NumeroComplejo implements INumero {

    private double real;
    private double imaginario;

    public NumeroComplejo(double real,double imaginario){
        this.real=real;
        this.imaginario=imaginario;
    }

    public INumero Conjugada(){
        return new NumeroComplejo(real,-imaginario);
    }

    @Override
    public INumero Sumarle(INumero valor){
        NumeroComplejo v=(NumeroComplejo)valor;
        return new NumeroComplejo(real+v.real,imaginario+v.imaginario);
    }

    @Override
    public INumero Simplificar(){ return this; }

    @Override
    public INumero Simplificar(int num,int deno){ return this; }

    @Override
    public INumero Dividir(INumero valor){
        NumeroComplejo v=(NumeroComplejo)valor;
        double divisor=v.real*v.real+v.imaginario*v.imaginario;

        double nuevoReal=(real*v.real + imaginario*v.imaginario)/divisor;
        double nuevoImag=(imaginario*v.real - real*v.imaginario)/divisor;

        return new NumeroComplejo(nuevoReal,nuevoImag);
    }

    @Override
    public INumero ElevarA(int n){
        NumeroComplejo resultado=new NumeroComplejo(1,0);
        for(int i=0;i<Math.abs(n);i++){
            resultado=(NumeroComplejo)resultado.Sumarle(this);
        }
        return resultado;
    }

    @Override
    public String toString(){
        if(imaginario==0)
            return String.format("%.2f",real);
        if(real==0)
            return String.format("%.2fi",imaginario);
        if(imaginario>0)
            return String.format("%.2f + %.2fi",real,imaginario);
        return String.format("%.2f - %.2fi",real,Math.abs(imaginario));
    }
}