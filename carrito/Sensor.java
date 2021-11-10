import java.util.Collections;
import java.util.ArrayList;
public class Sensor{
    private String tipo;
    private double valor;
    private int id;
    public int idactual;
    public ArrayList<Sensor> sensores=new ArrayList<Sensor>();
    public int tamano=8;

    public Sensor(){
    }
    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
    }
    public String toStringSensores(){
        String infoSensores="";
        String infoSensor="";
        for(int i=0;i<this.sensores.size();i++){
            //String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+String.valueOf(sensores[i].valor);
            infoSensor=this.sensores.get(i).toString();
            infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
        }
        return infoSensores;
    }
    public static String toStringSensoresStatic(ArrayList<Sensor> sensors){
        String infoSensores="";
        String infoSensor="";
        for(int i=0;i<sensors.size();i++){
            //String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+String.valueOf(sensores[i].valor);
            infoSensor=sensors.get(i).toString();
            infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
        }
        return infoSensores;
    }
    public String toString(){
        String infoSensor="tipo:"+this.tipo+"\nvalor"+String.valueOf(this.valor);
        return infoSensor;
    }
    public String toStringSensoresTemperatura(){
        String infoSensores="";
        for(int i=0;i<this.sensores.size();i++){
            if("temperatura".equals(sensores.get(i).tipo)){
                String infoSensor="tipo:"+sensores.get(i).tipo+"\nvalor:"+sensores.get(i).valor;
                infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
            }
        }
        return infoSensores;
    }
    public ArrayList<Sensor> SensoresTemperaturaOrdetnados666(){
        int cantidadSensoresTemperatura=0;
        for(int i=0;i<this.sensores.size();i++){
            if("temperatura".equals(this.sensores.get(i).tipo)){
                cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }
            if(cantidadSensoresTemperatura>1){
                break;
            }
        }//se hace este for y los if para evitar ordenar un solo objeto , esto produciria un error
        for(int i=0;i<this.sensores.size()-1;i++){
            if("temperatura".equals(sensores.get(i).tipo)){
                for(int ii=0;ii<this.sensores.size()-i-1;ii++){
                    if(this.sensores.get(ii).valor>sensores.get(ii+1).valor){
                        Sensor tmp = this.sensores.get(ii);
                        this.sensores.set(ii,this.sensores.get(ii+1));
                        this.sensores.set(ii+1,tmp);
                    }
                }
            }
        }
        //esperando respuesta si se retornan los objetos o los valores de temperatura
        return sensores;
    }

    public int cantidadSensores(){return this.sensores.size();}
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
