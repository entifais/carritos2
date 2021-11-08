import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        new Principal().mostrarMenu();
    }
    public void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        String banner="                     _ _              ____\n"+"  ___ __ _ _ __ _ __(_) |_ ___   ____//_]|________\n"+" / __/ _` | '__| '__| | __/ _ \\ (o _ |  -|   _  o|\n"+"| (_| (_| | |  | |  | | || (_) |`(_)-------(_)--'\n"+" \\___\\__,_|_|  |_|  |_|\\__\\___/ \n\nhecho por mi \n(no pongo mi nombre por que esta en una cuenta de github que inspira lastmia\nle recomiendo esta https://github.com/jero98772)\n";
        String mensajeMenu="Crear vehiculo[1]\nMostrar informacion del vehiculos[2]\nMostrar canitidad de vehiculos[3]\nMostrar informacion de vehiculos de color verde[4]\nbuscar vehiculo mediante id[5]\nMostrar informacion del vehiculos modelos 2000 a 2021[50-21]\nMostrar informacion de vehiculos apartir de un rango de modelos[5xy]\nCrear sensor[6]\nmostrar informacion de todos los sensores[7]\nmostrar cantidad de sensores[8]\nmostrar informacion de sensores de temperatura[9]\nCrear sensor AQA[10]\nCrear sensor AQAv80[11]\nCrear sensor CanAirIO[12]\nMostrar informacion de sensores de temperatura de menor valor a mayor[666]\nMostrar valores ordenados sus sensores de temperatura[667]\nSalir[0]";
        String mensajeDespedida="\nbye\n\tbye";
        String elecion="";
        boolean menuAbierto=true; 
        Vehiculo vehiculo=new Vehiculo();
        Sensor sensor=new Sensor();
        while(menuAbierto){
            System.out.println(banner); 
            System.out.println(mensajeMenu);
            elecion="";
            elecion=input.nextLine();
            if(elecion.equals("0")||elecion.toLowerCase().equals("salir")){
                System.out.println(mensajeDespedida);
                menuAbierto=false;
                break;
            }else if(elecion.equals("1")||elecion.toLowerCase().equals("crear vehiculo")){
                    System.out.println("Ingrese el modelo de su veiculo");
                    int modelo=input.nextInt();
                    System.out.println("Ingrese la marca de su veiculo");
                    String marca=input.next();
                    System.out.println("Ingrese el valor de su veiculo");
                    System.out.println("(cof cof, el $)");
                    double valor=input.nextDouble();
                    System.out.println("Ingrese el color de su veiculo");
                    String color=input.next();
                    Vehiculo nuevoVehiculo=new Vehiculo(modelo,marca,valor,color);
                    //ya x2 vehiculo.vehiculos[vehiculo.posAnadir]=nuevoVehiculo;
                    //ya en el constructor vehiculo.posAnadir=vehiculo.posAnadir+1;
                    System.out.println("Su vehiculo fue creado de forma correcta");
                    System.out.println(vehiculo.vehiculos.toString());

            }else if(elecion.equals("2")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")||elecion.toLowerCase().equals("informacion")){
                String infoVehiculos=vehiculo.toStringVeiculos();
                System.out.println("\tInformacion de sus vehiculos\n");
                System.out.println(infoVehiculos);
            }else if(elecion.equals("3")||elecion.toLowerCase().equals("mostrar canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad")){
                int cantidad=vehiculo.getCantidad();
                System.out.println("Cantidad de vehiculos almacenados es:"+cantidad);
            }else if(elecion.equals("4")||elecion.toLowerCase().equals("mostrar informacion del vehiculos verdes")||elecion.toLowerCase().equals("mostrar informacion verde")||elecion.toLowerCase().equals("verdes")){
                String infoVehiculos=vehiculo.toStringVeiculosVerdes();
                System.out.println("Informacion de sus vehiculos color verde:\n"+infoVehiculos);
            }else if(elecion.equals("5")||elecion.toLowerCase().equals("buscar vehiculo mediante id")||elecion.toLowerCase().equals("id")||elecion.toLowerCase().equals("buscar id")){
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarID(idBuscar);
                System.out.println("Informacion de sus vehiculos de modelo de 2000 a 2021 son:\n"+infoVehiculo);
            }else if(elecion.equals("50-21")||elecion.toLowerCase().equals("mostrar informacion del vehiculos de modelo 2000 a 2021")||elecion.toLowerCase().equals("modelo")||elecion.toLowerCase().equals("modelo filtrado")){
                String infoVehiculos=vehiculo.filtrarModelo(2000,2021);
                System.out.println("Informacion de sus vehiculos de modelo de 2000 a 2021 son:\n"+infoVehiculos);
            }else if(elecion.equals("5xy")||elecion.toLowerCase().equals("mostrar informacion del vehiculos de modelo x a y")||elecion.toLowerCase().equals("modeloxy")||elecion.toLowerCase().equals("modelo filtrado personalisado")){
                System.out.println("Ingrese el modelo inicial para filtrar su busqueda");
                int modeloInicial=input.nextInt();
                System.out.println("Ingrese el modelo final para filtrar su busqueda");
                int modeloFinal=input.nextInt();
                String infoVehiculos=vehiculo.filtrarModelo(modeloInicial,modeloFinal);
                System.out.println("Informacion de sus vehiculos de modelo de 2000 a 2021 son:\n"+infoVehiculos);
            }else if(elecion.equals("6")||elecion.toLowerCase().equals("crear sensor")){
                if(sensor.posAnadir<sensor.tamano){
                    System.out.println("Ingrese el tipo de su Sensor");
                    String tipo=input.nextLine();
                    System.out.println("Ingrese el valor de su Sensor");
                    double valor=input.nextDouble();
                    Sensor nuevoSensor=new Sensor(tipo,valor);
                    sensor.sensores[sensor.posAnadir]=nuevoSensor;
                    sensor.posAnadir=sensor.posAnadir+1;
                }else{
                    System.out.println("[Error] base de datos de sensores esta llena");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("7")||elecion.toLowerCase().equals("mostrar informacion de todos los sensores")||elecion.toLowerCase().equals("todos los sensores")){
                String infoSesnores=sensor.toStringSensores();
                System.out.println("\tInformacion de sus sensores\n");
                System.out.println(infoSesnores);

            }else if(elecion.equals("8")||elecion.toLowerCase().equals("mostrar cantidad de sensores")||elecion.toLowerCase().equals("cantidad sensores")){
                int cantidad=sensor.cantidadSensores();
                System.out.println("Cantidad de sensores almacenados es:"+cantidad);
            }else if(elecion.equals("9")||elecion.toLowerCase().equals("mostrar informacion de sensores de temperatura")||elecion.toLowerCase().equals("mostrar informacion senores temperatura")){
                String infoSesnores=sensor.toStringSensoresTemperatura();
                System.out.println("\tInformacion de sus sensores de temperatura\n");
                System.out.println(infoSesnores);
            }else if(elecion.equals("10")||elecion.toLowerCase().equals("crear sensor aqa")||elecion.toLowerCase().equals("aqa")){
                if(sensor.posAnadir<sensor.tamano){
                    System.out.println("Sensor AQA de Un/loquer:https://github.com/unloquer/AQA");
                    Sensor nuevoSensor=new Sensor("pm2.5",300.0);
                    sensor.sensores[sensor.posAnadir]=nuevoSensor;
                    sensor.posAnadir=sensor.posAnadir+1;
                }else{
                    System.out.println("[Error] base de datos de sensores esta llena");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("11")||elecion.toLowerCase().equals("crear sensor aqav80")||elecion.toLowerCase().equals("aqav80")){
                if(sensor.posAnadir<sensor.tamano){
                    System.out.println("Sensor AQAv80 de Un/loquer:https://github.com/unloquer/aqav80");
                    Sensor nuevoSensor=new Sensor("pm2.5",180.0);
                    sensor.sensores[sensor.posAnadir]=nuevoSensor;
                    sensor.posAnadir=sensor.posAnadir+1;
                }else{
                    System.out.println("[Error] base de datos de sensores esta llena");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("12")||elecion.toLowerCase().equals("crear sensor canairio")||elecion.toLowerCase().equals("canairio")){
                if(sensor.posAnadir<sensor.tamano){
                    System.out.println("Sensor CanAirIO:https://canair.io/");
                    Sensor nuevoSensor=new Sensor("pm2.5",220.0);//ni idea a cuento estan, pero depronto se puede ganar uno como en la respiraton o si no puede tener lo hagaselo
                    sensor.sensores[sensor.posAnadir]=nuevoSensor;
                    sensor.posAnadir=sensor.posAnadir+1;
                }else{
                    System.out.println("[Error] base de datos de sensores esta llena");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }
            else if(elecion.equals("666")||elecion.toLowerCase().equals("mostrar informacion de sensores de temperatura de menor valor a mayor valor")||elecion.toLowerCase().equals("que peresa escribir todo eso")){
                Sensor[] sensoresOrdenados=sensor.SensoresTemperaturaOrdetnados666();
                System.out.println("\tInformacion de sus sensores de temperatura\n");
                String infoSesnores=sensor.toStringSensores();
                System.out.println(infoSesnores);
                
            }else if(elecion.equals("667")||elecion.toLowerCase().equals("mostrar valores ordenados sus sensores de temperatura")||elecion.toLowerCase().equals("valores sensores de temperatura")){
                System.out.println("\tno use esta opcion , no sea masoquista\n");
                boolean masoquista=false;
                if(false){
                double[] valores=sensor.SensoresTemperaturaOrdenados667();
                String infoSesnores="";
                for(int i=0;i<valores.length;i++){
                    infoSesnores=infoSesnores+valores[i];
                }
                System.out.println("\tInformacion de sus sensores de temperatura\n");
                System.out.println(infoSesnores);
                }else{masoquista=true;}
            }else{System.out.println(elecion+" no es una opcion valida\n");}
            System.out.println("presione enter para continuar");
            input.nextLine();
        }
    }
}