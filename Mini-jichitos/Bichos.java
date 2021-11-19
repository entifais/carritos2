public class Bichos{
    private int salud;
    private static int tamano=2;
    private String representacion;
    public static int tamanoCuadrado=tamano*tamano;
    public static Bichos[][] bichitos=new Bichos[Bichos.tamano][Bichos.tamano];
    public Bichos(int s,String rp){
        this.salud=s;
        this.representacion=rp;
    }
    public boolean estaVivo(){
        boolean vivo;
        if (0<this.salud){
            return true;
        }else{
            return false;
        }
    }    
    public static Bichos menosSalud(Bichos[] bichos){
        int menosVidaValor=bichos[0].getSalud();
        Bichos menosVidaBicho=bichos[0];
        for(int i=0;i<Bichos.tamanoCuadrado;i++){
             if(menosVidaValor>bichos[i].getSalud() && bichos[i].estaVivo()){
                menosVidaValor=bichos[i].getSalud();
                menosVidaBicho=bichos[i];   
            }
        }
        return menosVidaBicho;
    }
    public static boolean verificarBichosVivos(Bichos[] bichos){
        boolean vivos=true;
        int count=0;
        for(int i=0;i<Bichos.tamanoCuadrado;i++){
            if(!bichos[i].estaVivo()){
                count++;
            }
        }
        if(count==Bichos.tamanoCuadrado){
            vivos=false;
        }
        return vivos;
    }
    public String toString(){return this.getRepresentacion()+"<-"+this.getSalud();}
    public String toStringTablero(){
        if (this.getSalud()>0){
            return this.toString();
        }else{
            return "      ";
        }
    }
    public Bichos[] como1d(){
        int counter=0;
        Bichos[] rpBichos=new Bichos[Bichos.tamanoCuadrado];
        for(int i=0;i<2;i++){
            for(int ii=0;ii<2;ii++){
                rpBichos[counter]=this.bichitos[i][ii];//Intente generando una insatcia y trasnportandola
                counter++;
            }
        }
        return rpBichos;
    }
    public Bichos(){}
    public void restarSalud(int a){this.salud=this.salud-a;}
    public void duplicarSalud(){this.salud=this.salud*2;}
    public void muerteTotal(){this.salud=0;}
    public int getSalud(){return this.salud;}
    public String getRepresentacion(){return this.representacion;}
}