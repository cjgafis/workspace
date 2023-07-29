package mundo;

import java.util.Random;

public class CursoEnLinea extends Curso 
{
    public void calificar() 
    {
        Random random = new Random();
        System.out.println("Calificación en línea generada: " + (random.nextInt(5) + 1));
    }
}
