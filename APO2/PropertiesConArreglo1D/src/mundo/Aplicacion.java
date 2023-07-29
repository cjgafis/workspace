package mundo;

public class Aplicacion 
{

	public static void main(String[] args) 
	{
		Curso objetoDeCurso = new Curso();
		objetoDeCurso.listarEstudiantes2();
		//objetoDeCurso.agregarEstudianteAlProperties("Fulanito", "2220201035", "18", "1.75");

		System.out.println("El promedio de estatura es: " + objetoDeCurso.calcularEstaturaPromedio2());

	}

}
