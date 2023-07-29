package mundo;

import java.util.Scanner;

public class Aplicacion 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        String nombre;
        Animal animal = null;

        do 
        {
            System.out.println("\n\nMenú de Animales del Zoológico:");
            System.out.println("1. Crear un perro");
            System.out.println("2. Crear un gato");
            System.out.println("3. Crear una vaca");
            System.out.println("4. Crear un águila");
            System.out.println("5. Hacer sonido del animal");
            System.out.println("6. Mostrar información del animal");
            System.out.println("7. Alimentar al animal");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción (1-8): ");
            opcion = scanner.nextInt();

            switch (opcion) 
            {
                case 1:
                    System.out.print("Ingrese el nombre del perro: ");
                    nombre = scanner.next();
                    animal = new Perro(nombre);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del gato: ");
                    nombre = scanner.next();
                    animal = new Gato(nombre);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la vaca: ");
                    nombre = scanner.next();
                    animal = new Vaca(nombre);
                    break;
                case 4:
                    System.out.print("Ingrese el nombre del águila: ");
                    nombre = scanner.next();
                    animal = new Aguila(nombre);
                    break;
                case 5:
                    if (animal != null) 
                    {
                        animal.hacerSonido();
                    } 
                    else 
                    {
                        System.out.println("No hay un animal seleccionado.");
                    }
                    break;
                case 6:
                    if (animal != null) 
                    {
                        System.out.println(animal.toString());
                    } 
                    else 
                    {
                        System.out.println("No hay un animal seleccionado.");
                    }
                    break;
                case 7:
                    if (animal != null) 
                    {
                        if (animal instanceof Carnivoro) 
                        {
                            ((Carnivoro) animal).alimentarse();
                        } 
                        else if (animal instanceof Herbivoro) 
                        {
                            ((Herbivoro) animal).alimentarse();
                        } 
                        else if (animal instanceof Ave) 
                        {
                            ((Ave) animal).alimentarse();
                        } 
                        else 
                        {
                            System.out.println("Este animal no tiene un método de alimentación específico.");
                        }
                    } 
                    else 
                    {
                        System.out.println("No hay un animal seleccionado.");
                    }
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida (1-8).");
                    break;
            }
        } 
        while (opcion != 8);
        scanner.close();
    }
}

