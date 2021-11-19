import java.util.ArrayList;
public class Vehiculo{
    public static ArrayList<Vehiculo> vehiculos=new ArrayList<Vehiculo>();
    public static int idActual=0;
    private int id=0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;
    private ArrayList<Sensor> sensores=new ArrayList<Sensor>();
    public Vehiculo(){
        /*this.setId(Vehiculo.idActual);
        Vehiculo.vehiculos.add(this);
        Vehiculo.idActual=idActual+1;*/
    }
    public Vehiculo(int mo,String ma,double va){
        Vehiculo vehiculo=new Vehiculo(mo,ma,va,"verde");
    }
    public Vehiculo(int mo,String ma,double va,String co){
        this.modelo=mo;
        this.marca=ma;
        this.valorComercial=va;
        this.color=co;
        Vehiculo.vehiculos.add(this);
        this.setId(Vehiculo.idActual);
        Vehiculo.idActual=idActual+1;
    }
    public String toString(){
        String infoVehiculo="id:"+this.id+"\nmodelo:"+this.modelo+"\nmarca:"+this.marca+"\nvalor Comercial:"+String.valueOf(this.valorComercial)+"\ncolor:"+this.color+"\n cantidad sensores"+this.sensores.size();
        return infoVehiculo;
    }
    public static String toStringVeiculos(){
        String infoVehiculos="";
        String infoVehiculo="";
        for(int i=0;i<Vehiculo.vehiculos.size();i++){
            //String infoVehiculo="modelo:"+this.vehiculos[i].modelo+"\nmarca:"+this.vehiculos[i].marca+"\nvalor Comercial:"+String.valueOf(this.vehiculos[i].valorComercial)+"\ncolor:"+this.vehiculos[i].color;
            infoVehiculo=Vehiculo.vehiculos.get(i).toString();
            infoVehiculos=infoVehiculos+"\tVehiculo"+i+"\n"+infoVehiculo+"\n";
        }
        return infoVehiculos;
    }
    public static String toStringVeiculosVerdes(){
        String infoVehiculos="";
        String infoVehiculo="";
        for(int i=0;i<Vehiculo.vehiculos.size();i++){
            if("verde".equals(Vehiculo.vehiculos.get(i).color)){
                infoVehiculo=Vehiculo.vehiculos.get(i).toString();
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
    public String informacionSensoresVehiculo(){
        String infoSesores="";
        for(int i=0;i<this.sensores.size();i++){
                infoSesores+=this.sensores.get(i).toString();
        }
        return infoSesores;
    }
    public String informacionTodosSensores(){
        String infoSesores="";
        for(int i=0;i<Vehiculo.vehiculos.size();i++){
                for(int ii=0;ii<Vehiculo.vehiculos.get(i).sensores.size();ii++){
                    infoSesores+=this.vehiculos.get(i).sensores.get(ii).toString();
                }
        }
        return infoSesores;
    }
    public String informacionSensoresTemperatura(){
        String infoSesores="";
        for(int i=0;i<Vehiculo.vehiculos.size();i++){
                for(int ii=0;ii<Vehiculo.vehiculos.get(i).sensores.size();ii++){
                    if("temperatura".equals(Vehiculo.vehiculos.get(i).sensores.get(ii).getTipo().toLowerCase()))
                        infoSesores+=Vehiculo.vehiculos.get(i).sensores.get(ii).toString();
                }
        }
        return infoSesores;
    }
     public String vehicloMasSensores(){
        String infoSesores="";
        int cantidad=0;
        for(int i=0;i<this.vehiculos.size();i++){
            //this.vehiculos.get(i).sensores.size()
            if(cantidad<this.vehiculos.get(i).sensores.size()){
                cantidad=this.vehiculos.get(i).sensores.size();
                infoSesores=this.vehiculos.get(i).toString();
            }
        }
        return infoSesores;
    }
    public static ArrayList<Sensor> SensoresTemperaturaOrdetnados666(ArrayList<Sensor> sensores){
        int cantidadSensoresTemperatura=0;
        for(int i=0;i<sensores.size();i++){
            if("temperatura".equals(sensores.get(i).getTipo())){
                cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }
            if(cantidadSensoresTemperatura>1){
                break;
            }
        }//se hace este for y los if para evitar ordenar un solo objeto , esto produciria un error
        for(int i=0;i<sensores.size()-1;i++){
            if("temperatura".equals(sensores.get(i).getTipo())){
                for(int ii=0;ii<sensores.size()-i-1;ii++){
                    if(sensores.get(ii).getValor()>sensores.get(ii+1).getValor()){
                        Sensor tmp=sensores.get(ii);
                        sensores.set(ii,sensores.get(ii+1));
                        sensores.set(ii+1,tmp);
                    }
                }
            }
        }
        //esperando respuesta si se retornan los objetos o los valores de temperatura
        return sensores;
    }
    public static ArrayList<Sensor> getTodosSensores(){
        ArrayList<Sensor> todosSensores=new ArrayList<Sensor>();
        for(int i=0;i<Vehiculo.vehiculos.size();i++){
           for(int ii=0;ii<Vehiculo.vehiculos.get(i).sensores.size();ii++){
                    todosSensores.add(Vehiculo.vehiculos.get(i).sensores.get(ii));
                }
            }
        return todosSensores;
    }
    public void anadirSensor(Sensor s){this.sensores.add(s);}
    public void setModelo(int mo){this.modelo=mo;}
    public void setId(int id){this.id=id;}
    public void setMarca(String ma){this.marca=ma;}
    public void setValor(double va){this.valorComercial=va;}
    public void setColor(String co){this.color=co;}
    public void setSensores(ArrayList  ss){this.sensores=ss;}
    public int getModelo(){return this.modelo;}
    public String getMarca(){return this.marca;}
    public double getValor(){return this.valorComercial;}
    public String getColor(){return this.color;}
    public int getCantidad(){return this.vehiculos.size();}
    public int getId(){return this.id;}
    public int getCantidadSensores(){return this.sensores.size();}
    public ArrayList getSensores(){return this.sensores;}
    public int cantidadVehiculos(){return this.vehiculos.size();}
}
