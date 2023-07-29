package mundo;

import java.util.Random;

public class CursoPresencial extends Curso 
{
    public void calificar() 
    {
        Random random = new Random();
        System.out.println("Calificación presencial generada: " + (random.nextInt(5) + 1));
    }
}
