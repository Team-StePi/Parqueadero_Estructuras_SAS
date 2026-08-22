package src.Menu;

import java.util.Scanner;

import src.Clases.Vehiculo;
import src.Metodos.MetodoVehiculo;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MetodoVehiculo m = new MetodoVehiculo();
        System.out.println("Ingrese la dimensión del almacen");
        int n = sc.nextInt();
        Vehiculo[][] vehiculo = new Vehiculo[n][n];
        Boolean continuar = true;
        while(continuar){
            System.out.println("Bienvenido al parqueadero");
            System.out.println("1. Registrar vehículos.");
            System.out.println("2. Ver vehículos registrados.");
            System.out.println("3. Salir.");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    vehiculo = m.RegistrarVehiculoyPersona(vehiculo, sc);
                    break;
                case 2:
                    m.MostrarDatos(vehiculo,sc);
                    break;
                case 3:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
