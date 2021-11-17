import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class juego{
    public static void main(String[] args){
        String banner="   _ _            _                            \n  (_|_)_ __   ___| |__   ___  ___    ___ _ __  \n  | | | '_ \\ / __| '_ \\ / _ \\/ __|  / _ \\ '_ \\ \n  | | | | | | (__| | | | (_) \\__ \\ |  __/ | | |\n _/ |_|_| |_|\\___|_| |_|\\___/|___/  \\___|_| |_|\n|__/                                           \n _                     _ _            \n| |__   __ _ _ __ _ __(_) |_ ___  ___ \n| '_ \\ / _` | '__| '__| | __/ _ \\/ __|\n| |_) | (_| | |  | |  | | || (_) \\__ \n|_.__/ \\__,_|_|  |_|  |_|\\__\\___/|___/\n                                      \n";
        String linea="---------------------------------------";
        Bichos bichos=generarTablero();
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println(banner);
            System.out.println("Elija una opcion:");
            System.out.println("[1]: iniciar juego");
            System.out.println("[2]: salir juego");
            int opcion=input.nextInt();
            if(opcion==1){
                System.out.println(linea);
                mostsrarTablero(bichos.getRepresentaciones());
                System.out.println(linea);
                System.out.println("Elija una opcion:");
                System.out.println("[1]: Disparar una bala");
                System.out.println("[2]: Activar bomba atómica");
                System.out.println("[3]:");
                System.out.println("[4]: Recarga de energia celestial");
                opcion=input.nextInt();
                if(opcion==1){
                    System.out.println("Seleciona la cordenada a disparar en xy(default:00):");
                    String opcionDisparo=input.next();
                    if(opcionDisparo.length()==2 && (opcionDisparo.contains("0")) || (opcionDisparo.contains("1"))){
                    }else{
                        System.out.println("disparo invalido , se seleciono la cordenada 00 como punto de destino:");
                    }   
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
    public static Bichos generarTablero(){
        //generacion del tablero
        Bichos bichoP=new Bichos();
        int numero1 = (int)((Math.random()*10)%Bichos.tamanoCuadrado);
        if(numero1==0){
            numero1=1;
        }
        //int i=0;
        //int ii=0;
        for(int iterador=0;iterador<Bichos.tamanoCuadrado;iterador++){
            String bin;
            if (iterador<2){
                bin="0"+Integer.toBinaryString(iterador);
            }else{
                bin=Integer.toBinaryString(iterador);
            }
            int i=Integer.parseInt( String.valueOf(bin.charAt(0)));
            int ii=Integer.parseInt( String.valueOf(bin.charAt(1)));
            /*
            //no se que hise pero esta bonito , pero
               tambien se puede oprar haciendo una mascara de bits asi 
               int i=01and(&) bin;
               int ii=10and(&) bin;
            ... efectos secundarios de ir y salir gomoso de competiva...
            */

            Bichos bicho;
            int desicion = (int)(((Math.random())*10)%2);
            System.out.println("numero1 ="+numero1 );
            if(iterador<numero1){
                System.out.println("desicion ="+desicion );
                if(desicion ==1){
                    bicho=new bichoAlien(20);  
                }else{
                    bicho=new bichoNormal(10);
                }
            }else{
                bicho=new Bichos(0,"  ");//un bicho no muerto y tampoco invisible , solo es una forma de llenar espacio
            }
            bichoP.bichitos[i][ii]=bicho;
            System.out.println("i="+i+"|ii="+ii);
            System.out.println(bicho.bichitos[i][ii].getRepresentacion());
            System.out.println(bicho.getRepresentacion());
            /*i++;
            if((iterador%Math.sqrt(Bichos.tamanoCuadrado))==0) {
                ii++;
                i=0;
            }*/
        }
        mostsrarTablero(bichoP.getRepresentaciones());
        return bichoP;
    }
}
