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
        public double[] SensoresTemperaturaOrdenados666(){
        //int cantidadSensoresTemperatura=0;
        //tiene que retornar los sesnores(obejto) o los valores
        //double[] valoresSucios=new double[this.tamano];
        ArrayList<Double> valoresOrdenadosDinamicos = new ArrayList<Double>();
        for(int i=0;i<this.tamano;i++){
            if("temperatura".equals(sensores[i].tipo)){
                //valoresSucios[i]=sensores[i].valor;
                valoresOrdenadosDinamicos.add(sensores[i].valor);
                //cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }/*else{
                valoresSucios[i]=0.0;
            }*/
            
        }
        Collections.sort(valoresOrdenadosDinamicos);        
        //double[] valoresOrdenados=new double[cantidadSensoresTemperatura]
        double[] valoresOrdenadosEstaticos=new double[valoresOrdenadosDinamicos.size()];
        return valoresOrdenadosEstaticos;
    }
    public double[] SensoresTemperaturaOrdenados667(){
        //int cantidadSensoresTemperatura=0;
        //double[] valoresSucios=new double[this.tamano];
        ArrayList<Double> valoresOrdenadosDinamicos = new ArrayList<Double>();
        for(int i=0;i<this.tamano;i++){
            if("temperatura".equals(sensores[i].tipo)){
                //valoresSucios[i]=sensores[i].valor;
                valoresOrdenadosDinamicos.add(sensores[i].valor);
                //cantidadSensoresTemperatura=cantidadSensoresTemperatura+1;
            }/*else{
                valoresSucios[i]=0.0;
            }*/
            
        }
        Collections.sort(valoresOrdenadosDinamicos);        
        //double[] valoresOrdenados=new double[cantidadSensoresTemperatura]
        double[] valoresOrdenadosEstaticos=new double[valoresOrdenadosDinamicos.size()];
        return valoresOrdenadosEstaticos;
    }
    public int cantidadSensores(){return this.posAnadir;}
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
