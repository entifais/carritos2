public class Sensor{
    public int tamano=8;
    public int posAnadir=0;
    private String tipo;
    private double valor;
    public Sensor[] sensores=new Sensor[tamano];
    public Sensor(){}
    public Sensor(String t,String v){}
    public String toString(){}
    public String toStringSensores(){}
    public int cantidadSensores(){return this.posAnadir;}
}
