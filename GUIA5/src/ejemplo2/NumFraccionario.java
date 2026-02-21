package ejemplo2;

public class NumFraccionario implements INumero, IComparable {

    private int num;
    private int deno;

    public NumFraccionario(int num, int deno) {
        this.num = num;
        setDeno(deno);
    }

    public NumFraccionario(int num) {
        this(num,1);
    }

    public int getNum() { return num; }
    public void setNum(int num) { this.num = num; }

    public int getDeno() { return deno; }

    public void setDeno(int deno) {
        if(deno==0) this.deno=1;
        else this.deno=deno;
    }

    public int calcularMCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public INumero Simplificar(){
        int mcd=calcularMCD(Math.abs(num),Math.abs(deno));
        return new NumFraccionario(num/mcd, deno/mcd);
    }

    public INumero Simplificar(int num,int deno){
        int mcd=calcularMCD(Math.abs(num),Math.abs(deno));
        return new NumFraccionario(num/mcd, deno/mcd);
    }

    public double aDecimal(){
        return (double)num/(double)deno;
    }

    private boolean EsNegativa(){
        return num<0;
    }

    @Override
    public INumero Sumarle(INumero valor){
        NumFraccionario v=(NumFraccionario)valor;
        int nuevoNum=this.num*v.deno + v.num*this.deno;
        int nuevoDeno=this.deno*v.deno;
        return new NumFraccionario(nuevoNum,nuevoDeno).Simplificar();
    }

    @Override
    public boolean EsMayorQue(Object valor){
        if(valor instanceof NumFraccionario){
            NumFraccionario v=(NumFraccionario)valor;
            return this.aDecimal()>v.aDecimal();
        }
        return false;
    }

    @Override
    public INumero Dividir(INumero valor){
        NumFraccionario v=(NumFraccionario)valor;
        int nuevoNum=this.num*v.deno;
        int nuevoDeno=this.deno*v.num;
        return new NumFraccionario(nuevoNum,nuevoDeno).Simplificar();
    }

    @Override
    public INumero ElevarA(int n){
        int nuevoNum=(int)Math.pow(num,n);
        int nuevoDeno=(int)Math.pow(deno,n);
        return new NumFraccionario(nuevoNum,nuevoDeno).Simplificar();
    }

    @Override
    public String toString(){
        if(Math.abs(num)>Math.abs(deno)){
            int entero=num/deno;
            int resto=Math.abs(num%deno);
            return String.format("%d(%d/%d)",entero,resto,Math.abs(deno));
        }
        return num+"/"+deno;
    }
}