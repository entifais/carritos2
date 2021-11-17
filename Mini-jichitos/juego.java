import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class juego{
    public static void main(String[] args){
        String banner="   _ _            _                            \n  (_|_)_ __   ___| |__   ___  ___    ___ _ __  \n  | | | '_ \\ / __| '_ \\ / _ \\/ __|  / _ \\ '_ \\ \n  | | | | | | (__| | | | (_) \\__ \\ |  __/ | | |\n _/ |_|_| |_|\\___|_| |_|\\___/|___/  \\___|_| |_|\n|__/                                           \n _                     _ _            \n| |__   __ _ _ __ _ __(_) |_ ___  ___ \n| '_ \\ / _` | '__| '__| | __/ _ \\/ __|\n| |_) | (_| | |  | |  | | || (_) \\__ \n|_.__/ \\__,_|_|  |_|  |_|\\__\\___/|___/\n                                      \n";
        String linea="---------------------------------------";
        juego.generarTablero();
        Scanner input=new Scanner(System.in);
        Bichos bichoP=new Bichos();
        while(true){
            System.out.println(banner);
            System.out.println("Elija una opcion:");
            System.out.println("[1]: iniciar juego");
            System.out.println("[2]: salir juego");
            int opcion=input.nextInt();
            if(opcion==1){
                System.out.println(linea);
                mostsrarTablero(Bichos.getRepresentaciones(Bichos.bichitos));
                System.out.println(linea);
                System.out.println("Elija una opcion:");
                System.out.println("[1]: Disparar una bala");
                System.out.println("[2]: Activar bomba atómica");
                System.out.println("[3]:");
                System.out.println("[4]: recarga de energia celestial");
                opcion=input.nextInt();
                if(opcion==1){
                    System.out.println("seleciona la cordenada a disparar(como xy):");
                    opcion=input.nextInt();
                }else if(opcion==4){
                try{
                    File file=new File("inspiracion.txt");
                    input=new Scanner(file);
                    for(int i=1;i<file.length();i++){
                        if(input.hasNextLine()){
                            System.out.println(input.nextLine());
                        }
                    }
                    input.close();
                    input=new Scanner(System.in);
                } catch (FileNotFoundException e) {
                  System.out.println("error");
                }
                }else{
                System.out.println("opcion invalida");
                }
            }else{
                System.out.println("bye bye");
                break;
            }
        }
    }
    public static void mostsrarTablero(String[] representaciones){
        System.out.println();
        System.out.println("---------------");
        System.out.println("|"+representaciones[0]+"|"+representaciones[1]+"|");
        System.out.println("---------------");
        System.out.println("|"+representaciones[2]+"|"+representaciones[3]+"|");
        System.out.println("---------------");
    }
    public static void generarTablero(){
        //generacion del tablero
        int numero1 = (int)(Math.random()%Bichos.tamanoCuadrado);
        //int i=0;
        //int ii=0;
        for(int iterador=0;iterador<Bichos.tamanoCuadrado;iterador++){
            String bin="0"+Integer.toBinaryString(iterador);
            int ii=Integer.parseInt( String.valueOf(bin.charAt(0)));
            int i=Integer.parseInt( String.valueOf(bin.charAt(1)));
            /*
            //no se que hise pero esta bonito , pero
               tambien se puede oprar haciendo una mascara de bits asi 
               int i=01and(&) bin;
               int ii=10and(&) bin;
            ... efectos secundarios de ir y salir gomoso de competiva...
            */

            Bichos bicho;
            if(iterador>numero1){
                int decion = (int)(Math.random()%2)+1;
                if(decion==1){
                    bicho=new bichoAlien(20);  
                }else{
                    bicho=new bichoNormal(10);
                }
            }else{
                bicho=new Bichos(0,"  ");//un bicho no muerto y tampoco invisible , solo es una forma de llenar espacio
            }
            Bichos.bichitos[i][ii]=bicho;
        
            System.out.println("bichos generados");
            /*i++;
            if((iterador%Math.sqrt(Bichos.tamanoCuadrado))==0) {
                ii++;
                i=0;
            }*/
        }
        mostsrarTablero(Bichos.getRepresentaciones(Bichos.bichitos));
        System.out.println("fin");
    }
}
