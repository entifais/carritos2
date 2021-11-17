public class Bichos{
    private int salud;
    private static int tamano=2;
    private String representacion;
    public static int tamanoCuadrado=tamano*tamano;
    public static Bichos[][] bichitos=new Bichos[Bichos.tamano][Bichos.tamano];
    public Bichos(){
    }
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
        String[] rpBichos=new String[Bichos.tamanoCuadrado];
        for(int i=0;i<2;i++){
            for(int ii=0;ii<2;ii++){
                            System.out.println("i="+i+"|ii="+ii+"|counter="+counter);
                rpBichos[counter]=bichos[i][ii].getRepresentacion();//Intente generando una insatcia y trasnportandola
                counter++;
            }
        }
        return rpBichos;
    }
}
