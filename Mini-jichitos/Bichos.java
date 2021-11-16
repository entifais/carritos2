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
        int counter=0;
        String[] rpBichos=new String[Bichos.tamano*Bichos.tamano];
        for(int i=0;i<Bichos.tamano;i++){
            for(int ii=0;ii<Bichos.tamano;ii++){
                rpBichos[counter]=bichos[i][ii].getRepresentacion();
                counter++;
            }
        }
        return rpBichos;
    }
}
