public class Bichos{
    private int salud;
    private static int tamano=2;
    private String representacion;
    public static int tamanoCuadrado=tamano*tamano;
    public static Bichos[][] bichitos=new Bichos[tamano][tamano];
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
    //public static verificarBichosVivos()}
    public int getSalud(){return this.salud;}
    public String getRepresentacion(){return this.representacion;}
    public static String[] getRepresentaciones(Bichos[][] bichos){
        String[] rpBichos=new String[tamano*tamano];
        for(int i=0;i<tamano;i++){
            //podria usar 2 ciclos y una ecuacion lineal pero es mas bacano con bits i*(tamano*tamano)+ii
            for(int ii=0;ii<tamano;ii++){
            rpBichos[i*(tamano*tamano)+ii]=bichos[ii][i].getRepresentacion();
            }
        }
        return rpBichos;
    }
}
