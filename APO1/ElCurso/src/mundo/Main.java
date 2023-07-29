package mundo;

import mundo.Operaciones;

public class Main
{
    public static void main(String[] args)
    {
        Operaciones op = new Operaciones(10, 5);
        System.out.printf("Hello and welcome!" + "\n"
                + "The sum of %d and %d is: %.2f\n", op.getNumero1(), op.getNumero2(), op.sumar());
    }
}