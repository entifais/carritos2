public class Vehiculo{
    public int tamano=10;
    public int posAnadir=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    public Vehiculo[] vehiculos=new Vehiculo[tamano];
    public Vehiculo(){
    }
    public Vehiculo(int mo,String ma,double va){
        Vehiculo vehiculo=new Vehiculo(mo,ma,va,"verde");
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
        String infoVehiculo="";
        for(int i=0;i<this.posAnadir;i++){
            //String infoVehiculo="modelo:"+this.vehiculos[i].modelo+"\nmarca:"+this.vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos[i].valorComercial)+"\ncolor:"+this.vehiculos[i].color;
            infoVehiculo=this.vehiculos[i].toString();
            infoVehiculos=infoVehiculos+"\tVehiculo"+i+"\n"+infoVehiculo+"\n";
        }
        return infoVehiculos;
    }
    public String toStringVeiculosVerdes(){
        String infoVehiculos="";
        for(int i=0;i<this.posAnadir;i++){
            if("verde".equals(vehiculos[i].color)){
                String infoVehiculo="modelo:"+vehiculos[i].modelo+"\nmarca:"+vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(vehiculos[i].valorComercial)+"\ncolor:"+vehiculos[i].color;
                infoVehiculos=infoVehiculos+"\tVeiculo"+i+"\n"+infoVehiculo+"\n";
            }
        }
        return infoVehiculos;
    }
    public String filtrarModelo(int inicialInicial,int añoFinal){
        String infoVehiculos="";
        for(int i=0;i<this.posAnadir;i++){
            if(inicialInicial<=vehiculos[i].modelo&&añoFinal>=vehiculos[i].modelo){
                String infoVehiculo="modelo:"+vehiculos[i].modelo+"\nmarca:"+vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(vehiculos[i].valorComercial)+"\ncolor:"+vehiculos[i].color;
                infoVehiculos=infoVehiculos+"\tVeiculo"+i+"\n"+infoVehiculo+"\n";
            }
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
