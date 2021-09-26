import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
    }
    public void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        String banner="                     _ _              ____\n"+"  ___ __ _ _ __ _ __(_) |_ ___   ____//_]|________\n"+" / __/ _` | '__| '__| | __/ _ \\ (o _ |  -|   _  o|\n"+"| (_| (_| | |  | |  | | || (_) |`(_)-------(_)--'\n"+" \\___\\__,_|_|  |_|  |_|\\__\\___/ ";
        String mensajeMenu="Crear vehiculo[1]\nMostrar informacion del vehiculos[2]\nMostrar canitidad de vehiculos[3]\n Salir[0]";
        String mensajeDespedida="bye\n\tbye";
        boolean menuAbierto=true; 
        String elecion="";
        while(menuAbierto){
            System.out.println(banner); 
            System.out.println(mensajeMenu);
            elecion="";
            elecion=input.nextLine();
            if(elecion.equals("0")||elecion.toLowerCase().equals("salir")){
                System.out.println(mensajeDespedida);
                menuAbierto=false;
                break;
            }if(elecion.equals("1")||elecion.toLowerCase().equals("crear vehiculo")){
                System.out.println("Ingrese el modelo de su Veiculo");
                int modelo=input.nextInt();
                System.out.println("Ingrese la marca de su Veiculo");
                String marca=input.nextLine();
                System.out.println("Ingrese el valor de su Veiculo");
                System.out.println("(cof cof, el $)");
                double valor= input.nextDouble();
                System.out.println("Ingrese el color de su Veiculo");
                String color=input.nextLine();
                Vehiculo vehiculo = new Vehiculo(modelo,marca,valor,color);
                if(vehiculo.posAnadir<vehiculo.tamano){
                            vehiculo.vehiculos[vehiculo.posAnadir]=vehiculo;
                }
                //cantidad vehiculos < cantidad en el arreglo if(){}
            }if(elecion.equals("2")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")){}
        }
    }
}