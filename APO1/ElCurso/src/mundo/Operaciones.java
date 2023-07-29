package mundo;

public class Operaciones
{
    // Attributes
    /**
     * primer numero a operar
     */
    private int numero1;
    /**
     * segundo numero a operar
     */
    private int numero2;
    /* Constructor de la clase mundo.Operaciones
     * @param numero1 primer numero a operar
     * @param numero2 segundo numero a operar
     */
    public Operaciones(int numero1, int numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int getNumero1()
    {
        return numero1;
    }

    public void setNumero1(int numero1)
    {
        this.numero1 = numero1;
    }

    public int getNumero2()
    {
        return numero2;
    }

    public void setNumero2(int numero2)
    {
        this.numero2 = numero2;
    }

    @Override
    public String toString()
    {
        return "mundo.Operaciones{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }
    /* permite sumar dos numeros
     */
    public double sumar()
    {
        return numero1+numero2;
    }
    /* permite restar dos numeros
     */
    public double restar()
    {
        return numero1-numero2;
    }
    /* permite multiplicar dos numeros
     */
    public double multiplicar()
    {
        return numero1*numero2;
    }
    /* permite dividir dos numeros
     */
    public double dividir()
    {
        return numero1/numero2;
    }
    /* permite elevar un numero a otro
     */
    public double potencia()
    {
        return Math.pow(numero1,numero2);
    }
    /* permite calcular el modulo de dos numeros
     */
    public double modulo()
    {
        return numero1%numero2;
    }
    /* permite calcular el logaritmo de un numero
     */
    public double logaritmo()
    {
        return Math.log(numero1);
    }
    /* permite calcular el seno de un numero
     */
    public double seno()
    {
        return Math.sin(numero1);
    }
    /* permite calcular el coseno de un numero
     */
    public double coseno()
    {
        return Math.cos(numero1);
    }
    /* permite calcular la tangente de un numero
     */
    public double tangente()
    {
        return Math.tan(numero1);
    }
    /* permite calcular la raiz cuadrada de un numero
     */
    public double raizCuadrada()
    {
        return Math.sqrt(numero1);
    }
    /* permite calcular la raiz cubica de un numero
     */
    public double raizCubica()
    {
        return Math.cbrt(numero1);
    }
}
