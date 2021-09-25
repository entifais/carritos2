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
    public int cantidadSensores(){return this.posAnadir;}
    public void setTipo(String t){this.tipo=tipo;}
    public void setValor(double v){this.valor=v;}
    public String getTipo(){return this.tipo;}
    public double getValor(){return this.valor;}
}
