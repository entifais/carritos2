import java.util.Scanner;
public class juego{
    public static void main(String[] args){
        String banner="   _ _            _                            \n  (_|_)_ __   ___| |__   ___  ___    ___ _ __  \n  | | | '_ \ / __| '_ \ / _ \/ __|  / _ \ '_ \ \n  | | | | | | (__| | | | (_) \__ \ |  __/ | | |\n _/ |_|_| |_|\___|_| |_|\___/|___/  \___|_| |_|\n|__/                                           \n _                     _ _            \n| |__   __ _ _ __ _ __(_) |_ ___  ___ \n| '_ \ / _` | '__| '__| | __/ _ \/ __|\n| |_) | (_| | |  | |  | | || (_) \__ \\n|_.__/ \__,_|_|  |_|  |_|\__\___/|___/\n                                      \n"
        Stirng linea="---------------------------------------"
        generarTablero();
        mostsrarTablero();
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println(banner);
            System.out.println(linea);
            System.out.println("Elija una opcion:");
            System.out.println("[1]: Disparar una bala");
            System.out.println("[2]: Activar bomba atómica");
            System.out.println("[3]:");
            System.out.println("[4]: recarga de energia celestial");
            int opcion=input.nextInt();
            if(opcion==1){
            }else if(opcion==1){
            } 
        }
    }
    public void mostsrarTablero(){
        System.out.println();
        System.out.println("---------------");
        System.out.println("|"+bicho.getRepresentacion()+"|"+bicho.getRepresentacion()+"|");
        System.out.println("---------------");
        System.out.println("|"+bicho.getRepresentacion()+"|"+bicho.getRepresentacion()+"|");
        System.out.println("---------------");
    }
    public void generarTablero(){
        //generacion del tablero
        int numero1 = (int)(Math.random()%Bichos.tamanoCuadrado);
        System.out.print("---------------\n|");
        for(int iterador=0;i<tamanoCuadrado;i++){
            String bin=Integer.toBinaryString(iterador);
            int i=Integer.parseInt(bin.charAt(0));
            int ii=Integer.parseInt(bin.charAt(1));
            //es mas bonito asi con permutaciones de bits
            /*tambien se puede oprar haciendo una mascara de bitss asi 
               int i=01and(&) bin;
               int ii=10and(&) bin;
            */
            if(numero1<=tamanoCuadrado){
                int decion = (int)(Math.random()%2)+1;
                if(decion==1){
                    Bichos bicho=new bichoNormal(10);
                }else if(decion==2){
                    Bichos bicho=new bichoAlien(20);
                }
                
            }else{
                bicho=Bichos(0,"  ");//un bicho no muerto y tampoco invisible , solo es una forma de llenar espacio
            }
            bichitos[ii][i]=bicho;
        }
    }
}
