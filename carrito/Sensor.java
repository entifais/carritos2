import java.util.Collections;
import java.util.ArrayList;
public class Sensor{
    public int tamano=8;
    public int posAnadir=0;
    private String tipo;
    private double valor;
    public Sensor[] sensores=new Sensor[tamano];
    public Sensor(){
        this.posAnadir=posAnadir+1;
    }
    public Sensor(String t,double v){
        this.tipo=t;
        this.valor=v;
        this.posAnadir=posAnadir+1;
    }
    public String toStringSensores(){
        String infoSensores="";
        for(int i=0;i<this.tamano;i++){
            String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+String.valueOf(sensores[i].valor);
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
        for(int i=0;i<this.tamano;i++){
            if("temperatura".equals(sensores[i].tipo)){
                String infoSensor="tipo:"+sensores[i].tipo+"\nvalor:"+sensores[i].valor;
                infoSensores=infoSensores+"\tSensor"+i+"\n"+infoSensor+"\n";
            }
        }
        return infoSensores;
    }
    public ArrayList<Double> SensoresTemperaturaOrdenados(){
        //int cantidadSensoresTemperatura=0;
        //double[] valoresSucios=new double[this.tamano];
        ArrayList<Double> valoresOrdenados = new ArrayList<Double>();
        for(int i=0;i<this.tamano;i++){
            if("temperatura".equals(sensores[i].tipo)){
                //valoresSucios[i]=sensores[i].valor;
                valoresOrdenados.add(sensores[i].valor);
                //cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }/*else{
                valoresSucios[i]=0.0;
            }*/
            
        }
        Collections.sort(valoresOrdenados);        
        //double[] valoresOrdenados=new double[cantidadSensoresTemperatura]
        return valoresOrdenados;
    }
    public int cantidadSensores(){return this.posAnadir;}
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
