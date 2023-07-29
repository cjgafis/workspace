package mundo;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Matrix miMatrix = new Matrix();
		miMatrix.pintarMatrix();
		System.out.println("El promedio de la matriz es : " + miMatrix.calcularPromedio());
		miMatrix.pintarUnaX();

	}

}
