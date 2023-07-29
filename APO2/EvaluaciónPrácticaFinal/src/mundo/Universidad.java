package mundo;

import java.util.Random;

public class Universidad 
{
    private Persona[] personas = new Persona[10];
    private Curso[] cursos = new Curso[5];


    public void asignarCurso() 
    {
        Random random = new Random();

        for (Persona persona : personas) 
        {
            Curso cursoAleatorio = cursos[random.nextInt(cursos.length)];
            System.out.println(persona.getNombre() + " asignado al curso " + cursoAleatorio.getNombre());
            cursoAleatorio.calificar();
        }
    }

    public void agregarPersona(Persona persona) 
    {
        for (int i = 0; i < personas.length; i++) 
        {
            if (personas[i] == null) 
            {
                personas[i] = persona;
                System.out.println("Persona agregada correctamente");
                return;
            }
        }
        System.out.println("No se pudo agregar la persona. El arreglo está lleno.");
    }

    public void agregarCurso(CursoPresencial cursoPresencial) 
    {
        for (int i = 0; i < cursos.length; i++) 
        {
            if (cursos[i] == null) 
            {
                cursos[i] = cursoPresencial;
                System.out.println("Curso agregado correctamente");
                return;
            }
        }
        System.out.println("No se pudo agregar el curso. El arreglo está lleno.");
    }

    public void agregarCurso(CursoEnLinea cursoEnLinea) 
    {
        for (int i = 0; i < cursos.length; i++) 
        {
            if (cursos[i] == null) 
            {
                cursos[i] = cursoEnLinea;
                System.out.println("Curso en línea agregado correctamente");
                return;
            }
        }
        System.out.println("No se pudo agregar el curso en línea. El arreglo está lleno.");
    }


}
