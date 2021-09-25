public class Vehiculo{
    public int tamano=10;
    public int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    Vehiculo[] vehiculos=new Vehiculo[tamano];
    Vehiculo(){
    }
    Vehiculo(int mo,String ma,double va){
        Vehiculo vehiculo=new Vehiculo(mo,ma,va,"color");
    }
    Vehiculo(int mo,String ma,double va,String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co;
    }
    void setModelo(int mo){this.modelo=mo;}
    void setMarca(String ma){this.marca=ma;}
    void setValor(double va){this.valorComercial=va;}
    void setColor(String co){this.color=co;}
    int getModelo(){return this.modelo;}
    String getMarca(){return this.marca;}
    double getValor(){return this.valorComercial;}
    String getColor(){return this.color;}
}
