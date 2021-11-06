import java.util.Collections;
import java.util.ArrayList;
public class Sensor{
    public int tamano=8;
    public int posAnadir=0;
    private String tipo;
    private double valor;
    private int id;
    public int idactual;
    public Sensor[] sensores=new Sensor[tamano];
    public Sensor(){
    }
    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
        this.posAnadir=posAnadir+1;
    }
    public String toStringSensores(){
        String infoSensores="";
        String infoSensor="";
        for(int i=0;i<this.posAnadir;i++){
            //String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+String.valueOf(sensores[i].valor);
            infoSensor=this.sensores[i].toString();
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
        for(int i=0;i<this.posAnadir;i++){
            if("temperatura".equals(sensores[i].tipo)){
                String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+sensores[i].valor;
                infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
            }
        }
        return infoSensores;
    }
    public Sensor[] SensoresTemperaturaOrdetnados666(){
        int cantidadSensoresTemperatura=0;
        for(int i=0;i<this.posAnadir;i++){
            if("temperatura".equals(this.sensores[i].tipo)){
                cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }
            if(cantidadSensoresTemperatura>1){
                break;
            }
        }//se hace este for y los if para evitar ordenar un solo objeto , esto produciria un error
        for(int i=0;i<this.posAnadir-1;i++){
            if("temperatura".equals(sensores[i].tipo)){
                for(int ii=0;ii<this.posAnadir-i-1;ii++){
                    if(this.sensores[ii].valor>sensores[ii+1].valor){
                        Sensor tmp = this.sensores[ii];
                        this.sensores[ii] = this.sensores[ii+1];
                        this.sensores[ii+1] = tmp;
                    }
                }
            }
        }
        //esperando respuesta si se retornan los objetos o los valores de temperatura
        return sensores;
    }
    public double[] SensoresTemperaturaOrdenados667(){
        ArrayList<Double> valoresOrdenadosDinamicos = new ArrayList<Double>();
        for(int i=0;i<this.posAnadir;i++){
            if("temperatura".equals(this.sensores[i].tipo)){
                valoresOrdenadosDinamicos.add(sensores[i].valor);
            }        
        }
        Collections.sort(valoresOrdenadosDinamicos);        
        double[] valoresOrdenadosEstaticos=new double[valoresOrdenadosDinamicos.size()];
        return valoresOrdenadosEstaticos;
    }
    public int cantidadSensores(){return this.posAnadir;}
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
