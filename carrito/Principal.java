import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
    }
    public void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        String banner="                     _ _              ____\n"+"  ___ __ _ _ __ _ __(_) |_ ___   ____//_]|________\n"+" / __/ _` | '__| '__| | __/ _ \\ (o _ |  -|   _  o|\n"+"| (_| (_| | |  | |  | | || (_) |`(_)-------(_)--'\n"+" \\___\\__,_|_|  |_|  |_|\\__\\___/ ";
        String mensajeMenu="Crear vehiculo[1]\nMostrar informacion del vehiculos[2]\nMostrar canitidad de vehiculos[3]\nMostrar informacion de vehiculos de color verde[4]\nMostrar informacion del vehiculos modelos 2000 a 2021[5]\nMostrar informacion de vehiculos apartir de un rango de modelos[5xy]\n Salir[0]";
        String mensajeDespedida="bye\n\tbye";
        String elecion="";
        boolean menuAbierto=true; 
        Vehiculo vehiculo = new Vehiculo();
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
                System.out.println("Ingrese el modelo de su veiculo");
                int modelo=input.nextInt();
                System.out.println("Ingrese la marca de su veiculo");
                String marca=input.nextLine();
                System.out.println("Ingrese el valor de su veiculo");
                System.out.println("(cof cof, el $)");
                double valor= input.nextDouble();
                System.out.println("Ingrese el color de su veiculo");
                String color=input.nextLine();
                Vehiculo nuevoVehiculo = new Vehiculo(modelo,marca,valor,color);
                if(vehiculo.posAnadir<vehiculo.tamano){
                            vehiculo.vehiculos[vehiculo.posAnadir-1]=nuevoVehiculo;
                }else{
                    System.out.println("[Error] base de datos llena");
                }
            }if(elecion.equals("2")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")||elecion.toLowerCase().equals("informacion")){
                String infoVehiculos=vehiculo.toStringVeiculos();
                System.out.println("Informacion de sus vehiculos\n");
                System.out.println(infoVehiculos);
            }
            if(elecion.equals("3")||elecion.toLowerCase().equals("Mostrar canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad")){
                int cantidad=vehiculo.cantidadVehiculos();
                System.out.println("Cantidad de vehiculos almacenados es:"+cantidad);
            }
            if(elecion.equals("4")||elecion.toLowerCase().equals("mostrar informacion del vehiculos verdes")||elecion.toLowerCase().equals("mostrar informacion verde")||elecion.toLowerCase().equals("verdes")){
                String infoVehiculos=vehiculo.toStringVeiculosVerdes();
                System.out.println("Informacion de sus vehiculos color verde:\n"+infoVehiculos);
            }
            if(elecion.equals("5")||elecion.toLowerCase().equals("mostrar informacion del vehiculos de modelo 2000 a 2021")||elecion.toLowerCase().equals("modelo")||elecion.toLowerCase().equals("modelo filtrado")){
                String infoVehiculos=vehiculo.filtrarModelo(2000,2021);
                System.out.println("Informacion de sus vehiculos de modelo de 2000 a 2021 son:\n"+infoVehiculos);
            }
            if(elecion.equals("5xy")||elecion.toLowerCase().equals("mostrar informacion del vehiculos de modelo x a y")||elecion.toLowerCase().equals("modeloxy")||elecion.toLowerCase().equals("modelo filtrado personalisado")){
                System.out.println("Ingrese el modelo inicial para filtrar su busqueda");
                int modeloInicial=input.nextInt();
                System.out.println("Ingrese el modelo final para filtrar su busqueda");
                int modeloFinal=input.nextInt();
                String infoVehiculos=vehiculo.filtrarModelo(modeloInicial,modeloFinal);
                System.out.println("Informacion de sus vehiculos de modelo de 2000 a 2021 son:\n"+infoVehiculos);
            }
            if(elecion.equals("6")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")){}
            if(elecion.equals("5")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")){}
            if(elecion.equals("5")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")){}
            if(elecion.equals("5")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")){}
        }
    }
}