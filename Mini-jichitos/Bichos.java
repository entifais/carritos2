public class Bichos{
    private int salud;
    private int tamano=2;
    private String representacion;
    public static int tamanoCuadrado=tamano*tamano;
    public static  Bichos[][] bichitos=new Bichos[tamano][tamano];
    public Bichos(int s,String rp){
        this.salud=s;
        this.representacion=rp;
    }
    public void restarSalud(int a){
        this.salud=this.salud-a;
    }
    public void duplicarSalud(){
        this.salud=salud*2;
    }
    public static verificarBichosVivos(){
        
    }
    public int getSalud(){return this.salud;}
    public int getRepresentacion(){return this.representacion;}
}
