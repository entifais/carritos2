public class Bichos{
    private int salud;
    public int tamano=2;
    public int pos=0;
    
    public Bichos[][] bichitos=new Bichos[tamano][tamano];
    public Bichos(int s){
        this.salud=s;
    }
    public void restarSalud(int a){
        this.salud=this.salud-a;
    }
    public void duplicarSalud(){
        this.salud=salud*2;
    }
    public verificarBichosVivos(){
    }
}
