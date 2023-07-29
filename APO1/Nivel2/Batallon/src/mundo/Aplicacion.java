package mundo;

import java.util.Scanner;

public class Aplicacion 
{
    public static void main(String[] args) 
    {
        Lista militares = new Lista();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do 
        {
            System.out.println("\nMenu de opciones:");
            System.out.println("1. Listar militares");
            System.out.println("2. Buscar militar por cedula");
            System.out.println("3. Agregar militar");
            System.out.println("4. Eliminar militar por cedula");
            System.out.println("5. Salir");
            System.out.print("\nIngrese su opcion: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Para consumir el salto de línea

            switch (opcion) 
            {
                case 1:
                    militares.listarMilitares();
                    break;

                case 2:
                    System.out.println("Ingrese la cedula del militar a buscar: ");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();
                    Militar militarEncontrado = militares.buscarMilitarPorCedula(cedula);
                    if (militarEncontrado != null) 
                    {
                        System.out.println("Militar encontrado: " + militarEncontrado);
                    } 
                    else 
                    {
                        System.out.println("No se encontró un militar con la cedula " + cedula);
                    }
                    break;

                case 3:
                    System.out.println("Ingrese los datos del militar a agregar:");
                    System.out.print("Cedula: ");
                    int cedulaNueva = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Estatura: ");
                    double estatura = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Antigüedad en años: ");
                    int antiguedad = scanner.nextInt();
                    scanner.nextLine();
                    Militar nuevoMilitar = new Militar(cedulaNueva, nombre, apellido, edad, estatura, antiguedad);
                    militares.agregarAlFinal(nuevoMilitar);
                    System.out.println("Militar agregado con éxito.");
                    break;

                case 4:
                    System.out.println("Ingrese la cedula del militar a eliminar: ");
                    int cedulaEliminar = scanner.nextInt();
                    scanner.nextLine();
                    militares.eliminarMilitarPorCedula(cedulaEliminar);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        scanner.close();
    }
}


