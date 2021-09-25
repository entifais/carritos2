public class Vehiculo{
    public int tamano=10;
    public int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo[] vehiculos=new Vehiculo[tamano];
    public Vehiculo(){
        this.posAnadir=posAnadir+1;
    }
    public Vehiculo(int mo,String ma,double va){
        Vehiculo vehiculo=new Vehiculo(mo,ma,va,"color");
        this.posAnadir=posAnadir+1;
    }
    public Vehiculo(int mo,String ma,double va,String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co;
        this.posAnadir=posAnadir+1;
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
    public int cantidadVehiculos(){return this.posAnadir;}
    public void setModelo(int mo){this.modelo=mo;}
    public void setMarca(String ma){this.marca=ma;}
    public void setValor(double va){this.valorComercial=va;}
    public void setColor(String co){this.color=co;}
    public int getModelo(){return this.modelo;}
    public String getMarca(){return this.marca;}
    public double getValor(){return this.valorComercial;}
    public String getColor(){return this.color;}
}
