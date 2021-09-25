public class Vehiculo{
    public int tamano=10;
    public int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    Vehiculo[] vehiculos=new Vehiculo[tamano];
    public Vehiculo(){
    }
    public Vehiculo(int mo,String ma,double va){
        Vehiculo vehiculo=new Vehiculo(mo,ma,va,"color");
    }
    public Vehiculo(int mo,String ma,double va,String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co;
    }
    public String toString(){
        String infoVehiculo="modelo:"+this.modelo+"\nmarca:"+this.marca+"\nvalor Comercial:"+String.valueOf(this.valorComercial)+"\ncolor:"+this.color;
        return infoVehiculo;
    }
    public String toStringVeiculos(){
        String infoVehiculos="";
        for(int i=0;i<this.tamano;i++){
            String infoVehiculo="modelo:"+vehiculos[i].modelo+"\nmarca:"+vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(vehiculos[i].valorComercial)+"\ncolor:"+vehiculos[i].color;
            infoVehiculos=infoVehiculos+"\tVeiculo"+i+"\n"+infoVehiculo+"\n";
        }
        return infoVehiculos;
    }
    public int cantidadVehiculos(){
        return this.posAnadir;
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
