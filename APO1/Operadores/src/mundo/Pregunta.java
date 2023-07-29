package mundo;

public class Pregunta 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 12;
		int c = 13;
		int d = 10; 
		boolean respuesta = ((a > b) || (a > d)) && ((a < d) || (c > d));
		System.out.println(respuesta);
		
	}

}
