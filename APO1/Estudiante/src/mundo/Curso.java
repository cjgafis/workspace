package mundo;

public class Curso 
{
	// ATRIBUTOS
	private Estudiante estudiante1;
	private Estudiante estudiante22;
	private Estudiante estudiante9;

	public Curso() 
	{
		 estudiante1 = new Estudiante("111120211002", "Paula", 
				"Velasquez", 1.70, 21, false);
		
		 estudiante22 = new Estudiante("2320212044", "Maria", 
				"Caicedo", 1.56, 20, false);
		
		 estudiante9 = new Estudiante("2320212038", "Lina", 
				"Ibañez", 1.53, 18, false);
	}
	
	
	
	/**
	 * @return the estudiante1
	 */
	public Estudiante getEstudiante1() {
		return estudiante1;
	}



	/**
	 * @param estudiante1 the estudiante1 to set
	 */
	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}



	/**
	 * @return the estudiante22
	 */
	public Estudiante getEstudiante22() {
		return estudiante22;
	}



	/**
	 * @param estudiante22 the estudiante22 to set
	 */
	public void setEstudiante22(Estudiante estudiante22) {
		this.estudiante22 = estudiante22;
	}



	/**
	 * @return the estudiante9
	 */
	public Estudiante getEstudiante9() {
		return estudiante9;
	}



	/**
	 * @param estudiante9 the estudiante9 to set
	 */
	public void setEstudiante9(Estudiante estudiante9) {
		this.estudiante9 = estudiante9;
	}



	public static void main(String[] args)
	{
		Curso apo1 = new Curso();
		
		double promedio = (apo1.getEstudiante1().getEstatura() + apo1.getEstudiante22().getEstatura() + apo1.getEstudiante9().getEstatura()) / 3; 
		System.out.println("El promedio de estatura es: " + promedio);
		
	}

}
