import java.util.ArrayList;
public class Sensor{
    private String tipo;
    private double valor;

    public Sensor(){
    }
    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
    }
    public String toStringSensores(ArrayList<Sensor> sensores){
        String infoSensores="";
        String infoSensor="";
        for(int i=0;i<sensores.size();i++){
            //String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+String.valueOf(sensores[i].valor);
            infoSensor=sensores.get(i).toString();
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
    public static String toStringSensoresTemperatura(ArrayList<Sensor> sensors){
        String infoSensores="";
        for(int i=0;i<sensors.size();i++){
            if("temperatura".equals(sensors.get(i).tipo)){
                String infoSensor="tipo:"+sensors.get(i).tipo+"\nvalor:"+sensors.get(i).valor;
                infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
            }
        }
        return infoSensores;
    }
    public ArrayList<Sensor> SensoresTemperaturaOrdetnados666(ArrayList<Sensor> sensores){
        int cantidadSensoresTemperatura=0;
        for(int i=0;i<sensores.size();i++){
            if("temperatura".equals(sensores.get(i).tipo)){
                cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }
            if(cantidadSensoresTemperatura>1){
                break;
            }
        }//se hace este for y los if para evitar ordenar un solo objeto , esto produciria un error
        for(int i=0;i<sensores.size()-1;i++){
            if("temperatura".equals(sensores.get(i).tipo)){
                for(int ii=0;ii<sensores.size()-i-1;ii++){
                    if(sensores.get(ii).valor>sensores.get(ii+1).valor){
                        Sensor tmp = sensores.get(ii);
                        sensores.set(ii,sensores.get(ii+1));
                        sensores.set(ii+1,tmp);
                    }
                }
            }
        }
        //esperando respuesta si se retornan los objetos o los valores de temperatura
        return sensores;
    }
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
