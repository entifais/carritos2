import java.util.ArrayList;
public class Vehiculo{
    public int idActual=1;
    public int id=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    private ArrayList<Sensor> sensores=new ArrayList<Sensor>();
    public static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
    public Vehiculo(){
        this.id=idActual;
        this.idActual=idActual+1;
        Vehiculo.vehiculos.add(this);
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
        String infoVehiculo="id"+this.id+"\nmodelo:"+this.modelo+"\nmarca:"+this.marca+"\nvalor Comercial:"+String.valueOf(this.valorComercial)+"\ncolor:"+this.color;
        return infoVehiculo;
    }
    public String toStringVeiculos(){
        String infoVehiculos="";
        String infoVehiculo="";
        for(int i=0;i<this.vehiculos.size();i++){
            //String infoVehiculo="modelo:"+this.vehiculos[i].modelo+"\nmarca:"+this.vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos[i].valorComercial)+"\ncolor:"+this.vehiculos[i].color;
            infoVehiculo=this.vehiculos.get(i).toString();
            infoVehiculos=infoVehiculos+"\tVehiculo"+i+"\n"+infoVehiculo+"\n";
        }
        return infoVehiculos;
    }
    public String toStringVeiculosVerdes(){
        String infoVehiculos="";
        String infoVehiculo="";
        for(int i=0;i<this.vehiculos.size();i++){
            if("verde".equals(this.vehiculos.get(i).color)){
                infoVehiculo=this.vehiculos.get(i).toString();
                //String infoVehiculo="modelo:"+this.vehiculos.get(i).modelo+"\nmarca:"+this.vehiculos.get(i).marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos.get(i).valorComercial)+"\ncolor:"+this.vehiculos.get(i).color;
                infoVehiculos=infoVehiculos+"\tVeiculo"+i+"\n"+infoVehiculo+"\n";
            }
        }
        return infoVehiculos;
    }
    public String buscarIDString(int idBuscar){
        String infoVehiculo="";
        for(int i=0;i<this.vehiculos.size();i++){
            if(idBuscar==this.vehiculos.get(i).id){
                infoVehiculo=this.vehiculos.get(i).toString();
                //String infoVehiculo="modelo:"+this.vehiculos.get(i).modelo+"\nmarca:"+this.vehiculos.get(i).marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos.get(i).valorComercial)+"\ncolor:"+this.vehiculos.get(i).color;
            }
        }
        return infoVehiculo;
    }
    public Vehiculo buscarIDObj(int idBuscar){
        //manejo de esepciones
        String infoVehiculo="";
        for(int i=0;i<this.vehiculos.size();i++){
            if(idBuscar==this.vehiculos.get(i).id){
                return this.vehiculos.get(i);
            }
        }
        return this.vehiculos.get(this.vehiculos.size());//la logica n deberia rertortnar nada aqui pero es para que el compilador me deje en paz
    }
    public String filtrarModelo(int inicialInicial,int añoFinal){
        String infoVehiculos="";
        String infoVehiculo="";
        for(int i=0;i<this.vehiculos.size();i++){
            if(inicialInicial<=this.vehiculos.get(i).modelo&&añoFinal>=this.vehiculos.get(i).modelo){
                //String infoVehiculo="modelo:"+this.vehiculos.get(i).modelo+"\nmarca:"+this.vehiculos.get(i).marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos.get(i).valorComercial)+"\ncolor:"+this.vehiculos.get(i).color;
                infoVehiculo=this.vehiculos.get(i).toString();
                infoVehiculos=infoVehiculos+"\tVeiculo"+i+"\n"+infoVehiculo+"\n";
            }
        }
        return infoVehiculos;
    }
    public void anadirSensor(Sensor s){this.sensores.add(s);}
    public void setModelo(int mo){this.modelo=mo;}
    public void setMarca(String ma){this.marca=ma;}
    public void setValor(double va){this.valorComercial=va;}
    public void setColor(String co){this.color=co;}
    public void setSensores(ArrayList  ss){this.sensores=ss;}
    public int getModelo(){return this.modelo;}
    public String getMarca(){return this.marca;}
    public double getValor(){return this.valorComercial;}
    public String getColor(){return this.color;}
    public int getCantidad(){return this.vehiculos.size();}
    public int getCantidadSensores(){return this.sensores.size();}
    public ArrayList getSensores(){return this.sensores;}
    public int cantidadVehiculos(){return this.vehiculos.size();}
}
