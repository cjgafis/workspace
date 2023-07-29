package mundo;

import java.util.Scanner;

public class Aplicacion 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Parqueadero parqueadero = new Parqueadero(60, 30, 2000, 1000);

        while (true) 
        {
        	System.out.println("\nMenú del parqueadero:");
            System.out.println("1. Registrar ingreso de vehículo");
            System.out.println("2. Registrar salida de vehículo");
            System.out.println("3. Mostrar vehículos en el parqueadero");
            System.out.println("4. Consultar ingresos totales");
            System.out.println("5. Salir");
            System.out.print("\nIngrese la opción deseada: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Ingrese la placa del vehículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Ingrese el tipo de vehículo (coche/moto): ");
                    String tipoVehiculo = scanner.nextLine();
                    System.out.print("Ingrese la hora de entrada (formato decimal, ej: 14.5): ");
                    double horaEntrada = scanner.nextDouble();
                    scanner.nextLine();
                    Vehiculo vehiculo = new Vehiculo(placa, horaEntrada, tipoVehiculo);

                    if (parqueadero.registrarIngreso(vehiculo)) 
                    {
                        System.out.println("Vehículo registrado con éxito.");
                    } 
                    else 
                    {
                        System.out.println("No se pudo registrar el vehículo. El parqueadero está lleno.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese la placa del vehículo que sale: ");
                    String placaSalida = scanner.nextLine();
                    System.out.print("Ingrese la hora de salida (formato decimal, ej: 16.5): ");
                    double horaSalida = scanner.nextDouble();
                    scanner.nextLine();

                    if (parqueadero.registrarSalida(placaSalida, horaSalida)) 
                    {
                        System.out.println("Salida registrada con éxito.");
                    } 
                    else 
                    {
                        System.out.println("No se encontró el vehículo con la placa ingresada.");
                    }
                    break;
                case 3:
                    System.out.println("Vehículos en el parqueadero:");
                    parqueadero.mostrarVehiculos();
                    break;
                case 4:
                	System.out.println("Total de ingresos: " + parqueadero.getTotalIngresos() + " pesos colombianos");
                    break;
                case 5:
                	System.out.println("Saliendo del programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
            }
        }
    }
}

