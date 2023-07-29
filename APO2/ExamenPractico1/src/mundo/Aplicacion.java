package mundo;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Batallon sextaBrigada = new Batallon();
		sextaBrigada.listarSoldados();
		System.out.println("El promedio de estatura es: " + sextaBrigada.calcularAlturaPromedio());
	}

}
