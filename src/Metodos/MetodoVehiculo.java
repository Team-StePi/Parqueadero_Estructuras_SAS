package src.Metodos;

import java.util.Scanner;

import src.Clases.Persona;
import src.Clases.Vehiculo; 

public class MetodoVehiculo {

    public Vehiculo[][] RegistrarVehiculoyPersona(Vehiculo[][] o, Scanner sc){

        for(int i = 0; i < o.length; i++){
            for(int j = 0; j < o[0].length; j++){
                System.out.print("Ingrese el nombre del propietario: ");
                String nombrePropietario = sc.next();
                System.out.print("Ingrese el número de identificación del propietario: ");
                String cedulaPropietario = sc.next();

                 Persona propietario = new Persona(nombrePropietario, cedulaPropietario); 

                System.out.println("Ingrese la marca del vehiculo: ");
                String marca = sc.next();
                System.out.println("Ingrese el modelo del vehiculo: ");
                String modelo = sc.next();
                System.out.println("Seleccione el tipo de vehiculo: ");

                Vehiculo.TipoVehiculo[] opciones = Vehiculo.TipoVehiculo.values();
                int seleccion = -1;
                    while (seleccion < 1 || seleccion > opciones.length) {
                        System.out.println("Seleccione el tipo de vehiculo:");
                        for (int k = 0; k < opciones.length; k++) {
                            System.out.println((k + 1) + ". " + opciones[k]);
                        }
                        System.out.print("Ingrese el número de la opción: ");
                
                        if (sc.hasNextInt()) {
                            seleccion = sc.nextInt();
                            if (seleccion < 1 || seleccion > opciones.length) {
                                System.out.println("Opción inválida. Intente de nuevo.");
                            }
                            } else {
                                System.out.println("Error: Debe ingresar un número.");
                                sc.next();
                            }
                        }  

                        Vehiculo.TipoVehiculo tipoElegido = opciones[seleccion - 1];

                        Vehiculo p = new Vehiculo(marca, modelo, propietario, tipoElegido);
                        o[i][j] = p;
        }
    }
        return o;
    }

    public Vehiculo[][] MostrarDatos(Vehiculo[][] o,  Scanner sc){
        System.out.println("¿Qué tipo de vehículos quiere consultar?");

        //Recorrer lista TipoVehiculo de la clase Vehiculo
        Vehiculo.TipoVehiculo[] tipos = Vehiculo.TipoVehiculo.values();
        for (int k = 0; k < tipos.length; k++) {
            System.out.println((k + 1) + ". " + tipos[k]);
        }
        System.out.println("Ingrese el número de la selección:");
        int seleccion = sc.nextInt();

        String vehiculoBuscado = tipos[seleccion - 1].name();

        for(int i = 0; i < o.length; i++){
            for(int j = 0; j < o[0].length; j++){

                if(o[i][j] != null){
                    
                    //Obtener los nombres de la lista TipoVehiculo y convertirlo a string para poder hacer la validación en el siguiente if
                    String tipoConvertido = o[i][j].getTipo().name();

                    if(tipoConvertido.equalsIgnoreCase(vehiculoBuscado)){
                        System.out.println("Tipo de vehículo: " + tipoConvertido);
                        System.out.println("Marca: " + o[i][j].getMarca());
                        System.out.println("Modelo: " + o[i][j].getModelo());
                        System.out.println("Nombre propietario: " + o[i][j].getNombrePropietario());
                        System.out.println("Documento de identidad propietario: " + o[i][j].getCedulaPropietario());
                        System.out.println("----------------------------------------");

                    }
                }

            }
        }

        return o;
    }

   

}
