import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
public class Principal{
    public static void main(String[] args){
        new Principal().mostrarMenu();
    }
    public void mostrarMenu(){
        Scanner input = new Scanner(System.in);
        String banner="                     _ _              ____\n"+"  ___ __ _ _ __ _ __(_) |_ ___   ____//_]|________\n"+" / __/ _` | '__| '__| | __/ _ \\ (o _ |  -|   _  o|\n"+"| (_| (_| | |  | |  | | || (_) |`(_)-------(_)--'\n"+" \\___\\__,_|_|  |_|  |_|\\__\\___/ numero 2\n\nhecho por mi \n(no pongo mi nombre por que esta en una cuenta de github que inspira lastmia\nle recomiendo esta https://github.com/jero98772)\n";
        String mensajeMenu="[1]Crear vehiculo\n[2]Mostrar informacion del vehiculos\n[3]Mostrar canitidad de vehiculos\n[4]Mostrar informacion de vehiculos de color verde\n[5]buscar vehiculo mediante id\n[50-21]Mostrar informacion del vehiculos modelos 2000 a 2021\n[5xy]Mostrar informacion de vehiculos apartir de un rango de modelos\n[6]Crear sensor\n[7]mostrar sensores de un vehiculo mediante su id\n[8]mostrar sensores de temperatura de todos los vehiculos\n[9]mostrar informacion del vehiculo con mas senores\n[10]Cargar vehiculos prediseñados\n[11]Crear sensor AQAv80\n[12]Crear sensor CanAirIO\n[13]Crear sensor ets\n[14]Crear sensor AQA\n[666]Mostrar informacion de sensores de temperatura de menor valor a mayor\n[0]Salir";
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
                System.out.println(vehiculo.vehiculos.get(Vehiculo.idActual-1).toString());
            }else if(elecion.equals("2")||elecion.toLowerCase().equals("mostrar informacion del vehiculos")||elecion.toLowerCase().equals("mostrar informacion")||elecion.toLowerCase().equals("informacion")){
                String infoVehiculos=vehiculo.toStringVeiculos();
                System.out.println("\tInformacion de sus vehiculos\n");
                System.out.println(infoVehiculos);
            }else if(elecion.equals("3")||elecion.toLowerCase().equals("mostrar canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad de vehiculos")||elecion.toLowerCase().equals("canitidad")){
                int cantidad=vehiculo.getCantidad();
                System.out.println("Cantidad de vehiculos almacenados es:"+cantidad);
            }else if(elecion.equals("4")||elecion.toLowerCase().equals("mostrar informacion del vehiculos verdes")||elecion.toLowerCase().equals("mostrar informacion verde")||elecion.toLowerCase().equals("verdes")){
                String infoVehiculos=vehiculo.toStringVeiculosVerdes();
                if(infoVehiculos.equals("")){
                    System.out.println("no hay vehiculos color verde");
                }else{
                    System.out.println("Informacion de sus vehiculos color verde:\n"+infoVehiculos);
                }
            }else if(elecion.equals("5")||elecion.toLowerCase().equals("buscar vehiculo mediante id")||elecion.toLowerCase().equals("id")||elecion.toLowerCase().equals("buscar id")){
                System.out.println("ingrese el id del vehiculo a buscar:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                System.out.println("la informacion de su vehiculo es :\n"+infoVehiculo);
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
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                if(!"".equals(infoVehiculo)){//si no encuentra el vehiculo no retorna error , retorna el string vacio
                    System.out.println("Ingrese el tipo de su Sensor");
                    String tipo=input.next();
                    System.out.println("Ingrese el valor de su Sensor");
                    double valor=input.nextDouble();
                    Sensor nuevoSensor=new Sensor(tipo,valor);
                    Vehiculo vehiculoSensor=vehiculo.buscarIDObj(idBuscar);
                    vehiculoSensor.anadirSensor(nuevoSensor);
                }else{
                    System.out.println("[Error] "+idBuscar+" id no fue encontrado");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("7")||elecion.toLowerCase().equals("mostrar sensores de un vehiculos")||elecion.toLowerCase().equals("sensores vehiculo")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                Vehiculo vehiculo2=vehiculo.buscarIDObj(idBuscar);
                System.out.println(vehiculo2.toString());
                System.out.println("\ninformacion de los sensores:");
                System.out.println(vehiculo2.informacionSensoresVehiculo());
                Sensor.toStringSensoresStatic(vehiculo.getSensores());
            }else if(elecion.equals("8")||elecion.toLowerCase().equals("mostrar cantidad de sensores")||elecion.toLowerCase().equals("cantidad sensores")){
                String cantidad=vehiculo.informacionSensoresTemperatura();
                System.out.println("Cantidad de sensores almacenados es:"+cantidad);
            }else if(elecion.equals("9")||elecion.toLowerCase().equals("mostrar informacion de  todos sensores ")||elecion.toLowerCase().equals("mostrar informacion todossenores")){
                String infoSesnores=vehiculo.vehicloMasSensores();
                System.out.println("\tInformacion de sus sensores de temperatura\n");
                System.out.println(infoSesnores);
            }else if(elecion.equals("10")||elecion.toLowerCase().equals("cargar vehiculos por defecto")||elecion.toLowerCase().equals("vehiculos defecto")){
                try{
                    //no tiene sentido que no funcione por no encontrar el archivo si esta en la misma carpeta,Ademas estoy haciendo lo mismo que hise en el de bichos
                    File archivo=new File("vehiculos.txt");
                    input=new Scanner(archivo);
                    while(input.hasNextLine()){
                        String lineaTexto = input.nextLine();
                        //esto
                        int pos1=lineaTexto.indexOf(",");
                        int pos2=lineaTexto.indexOf(",",pos1+1);
                        int pos3=lineaTexto.indexOf(",",pos2+1);
                        int modelo=Integer.parseInt(lineaTexto.substring(0,pos1));
                        String marca=lineaTexto.substring(pos1,pos2);
                        double valor= Double.parseDouble(lineaTexto.substring(pos1,pos2));
                        String color=lineaTexto.substring(pos3,lineaTexto.length());
                        //hay dios...por que java no puede retornar multiples tipos como python, no poder meter esto en una funcion es doloroso
                        Vehiculo nuevoVehiculo=new Vehiculo(modelo,marca,valor,color);
                    }
                    input.close();
                } catch (Exception e) {
                    System.out.println("[Error] java no sirve");
                }
                input = new Scanner(System.in);
            }else if(elecion.equals("11")||elecion.toLowerCase().equals("crear sensor aqav80")||elecion.toLowerCase().equals("aqav80")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                if(!"".equals(infoVehiculo)){//si no encuentra el vehiculo no retorna error , retorna el string vacio
                    System.out.println("Sensor AQAv80 de Un/loquer:https://github.com/unloquer/aqav80");
                    Sensor nuevoSensor=new Sensor("pm2.5",180.0);
                    Vehiculo vehiculoSensor=vehiculo.buscarIDObj(idBuscar);
                    vehiculoSensor.anadirSensor(nuevoSensor);
                    System.out.println(vehiculoSensor.toString());
                    System.out.println("\nsensor creado");
                    System.out.println(vehiculoSensor.informacionSensoresVehiculo());
                }else{
                    System.out.println("[Error] "+idBuscar+" id no fue encontrado");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("12")||elecion.toLowerCase().equals("crear sensor canairio")||elecion.toLowerCase().equals("canairio")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                if(!"".equals(infoVehiculo)){//si no encuentra el vehiculo no retorna error , retorna el string vacio
                    System.out.println("Sensor CanAirIO:https://canair.io/");
                    Sensor nuevoSensor=new Sensor("pm2.5",220.0);//ni idea a cuento estan, pero depronto se puede ganar uno como en la respiraton o si no puede tener lo hagaselo
                    Vehiculo vehiculoSensor=vehiculo.buscarIDObj(idBuscar);
                    vehiculoSensor.anadirSensor(nuevoSensor);
                    System.out.println(vehiculoSensor.toString());
                    System.out.println("\nsensor creado");
                    System.out.println(vehiculoSensor.informacionSensoresVehiculo());
                }else{
                    System.out.println("[Error] "+idBuscar+" id no fue encontrado");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("13")||elecion.toLowerCase().equals("crear sensor ets")||elecion.toLowerCase().equals("ets")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                if(!"".equals(infoVehiculo)){//si no encuentra el vehiculo no retorna error , retorna el string vacio
                    System.out.println("sensor ets , del taller en el exploratorio https://github.com/unloquer/ETSesnor");
                    Sensor nuevoSensor=new Sensor("ruido subjetivo",0.0);//no es comercial 
                    Vehiculo vehiculoSensor=vehiculo.buscarIDObj(idBuscar);
                    vehiculoSensor.anadirSensor(nuevoSensor);
                    System.out.println(vehiculoSensor.toString());
                    System.out.println("\nsensor creado");
                    System.out.println(vehiculoSensor.informacionSensoresVehiculo());
                }else{
                    System.out.println("[Error] "+idBuscar+" id no fue encontrado");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }
            }else if(elecion.equals("14")||elecion.toLowerCase().equals("crear sensor aqa")||elecion.toLowerCase().equals("aqa")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoVehiculo=vehiculo.buscarIDString(idBuscar);
                if(!"".equals(infoVehiculo)){//si no encuentra el vehiculo no retorna error , retorna el string vacio
                    System.out.println("Sensor AQA de Un/loquer:https://github.com/unloquer/AQA");
                    Sensor nuevoSensor=new Sensor("pm2.5",300.0);
                    Vehiculo vehiculoSensor=vehiculo.buscarIDObj(idBuscar);
                    vehiculoSensor.anadirSensor(nuevoSensor);
                    System.out.println(vehiculoSensor.toString());
                    System.out.println("\nsensor creado");
                    System.out.println(vehiculoSensor.informacionSensoresVehiculo());
                }else{
                    System.out.println("[Error] "+idBuscar+" id no fue encontrado");
                    System.out.println("para añadir nuevos sensores intente cambiar el tamaño del arreglo y volver a ejecutar el codigo");
                }

            }else if(elecion.equals("666")||elecion.toLowerCase().equals("mostrar informacion de sensores de temperatura de menor valor a mayor valor")||elecion.toLowerCase().equals("que peresa escribir todo eso")){
                System.out.println("ingrese el id del vehiculo ya existente:");
                int idBuscar=input.nextInt();
                String infoSesnores="";
                ArrayList<Sensor> sensoresOrdenados=Vehiculo.SensoresTemperaturaOrdetnados666();
                System.out.println("\tInformacion de sus sensores de temperatura\n");
                for(int i=0;i<sensoresOrdenados.size();i++){
                    infoSesnores=infoSesnores+sensoresOrdenados.get(i).toString();
                }
                System.out.println(infoSesnores);

            }else{System.out.println(elecion+" no es una opcion valida\n");}
            System.out.println("presione enter para continuar");
            input.nextLine();
        }
    }
}