package mundo;

import java.util.Scanner;

public class Aplicacion 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Universidad universidad = new Universidad();
        int opcion;

        // Agregamos personas (estudiantes y profesores) y cursos a la Universidad
        inicializarUniversidad(universidad);

        do 
        {
            System.out.println("==== Menú ====");
            System.out.println("1. Asignar curso a todas las personas");
            System.out.println("2. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) 
            {
                case 1:
                    universidad.asignarCurso();
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida, intente de nuevo");
                    break;
            }
        } 
        while (opcion != 2);

        scanner.close();
    }

    private static void inicializarUniversidad(Universidad universidad) 
    {
        // Agregamos personas
        for (int i = 0; i < 10; i++) 
        {
            if (i < 5) 
            {
                Estudiante estudiante = new Estudiante();
                estudiante.setNombre("Estudiante " + (i + 1));
                estudiante.setEdad(20 + i);
                estudiante.setId("E" + (i + 1));
                estudiante.setCarrera("Carrera " + (i + 1));
                estudiante.setSemestre((i % 8) + 1);
                universidad.agregarPersona(estudiante);
            } 
            else 
            {
                Profesor profesor = new Profesor();
                profesor.setNombre("Profesor " + (i - 4));
                profesor.setEdad(30 + i);
                profesor.setId("P" + (i - 4));
                profesor.setPrograma("Programa " + (i - 4));
                profesor.setTitulo("Titulo " + (i - 4));
                universidad.agregarPersona(profesor);
            }
        }

        // Agregamos cursos
        for (int i = 0; i < 5; i++) 
        {
            if (i < 3) 
            {
                CursoPresencial cursoPresencial = new CursoPresencial();
                cursoPresencial.setNombre("Curso presencial " + (i + 1));
                cursoPresencial.setCodigo("CP" + (i + 1));
                cursoPresencial.setHorario("08:00-10:00");
                universidad.agregarCurso(cursoPresencial);
            } 
            else 
            {
                CursoEnLinea cursoEnLinea = new CursoEnLinea();
                cursoEnLinea.setNombre("Curso en línea " + (i - 2));
                cursoEnLinea.setCodigo("CE" + (i - 2));
                cursoEnLinea.setHorario("A tu ritmo");
                universidad.agregarCurso(cursoEnLinea);
            }
        }
    }
}

