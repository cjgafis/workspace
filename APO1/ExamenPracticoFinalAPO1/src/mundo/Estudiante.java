package mundo;

/**
 * Clase que representa un Estudiante.
 */
public class Estudiante 
{
	private Nota[] notas;

	/**
	 * Constructor de Estudiante que toma 6 notas como argumentos
	 * 
	 * @param t1 Nota de la teoría 1
	 * @param p1 Nota de la práctica 1
	 * @param t2 Nota de la teoría 2
	 * @param p2 Nota de la práctica 2
	 * @param t3 Nota de la teoría 3
	 * @param p3 Nota de la práctica 3
	 */
	public Estudiante(Nota t1, Nota p1, Nota t2, Nota p2, Nota t3, Nota p3) 
	{
		notas = new Nota[6];
		notas[0] = t1;
		notas[1] = p1;
		notas[2] = t2;
		notas[3] = p2;
		notas[4] = t3;
		notas[5] = p3;
	}

	/**
	 * Método para obtener las notas del estudiante
	 * 
	 * @return un array de Nota que contiene las notas del estudiante
	 */
	public Nota[] getNotas() 
	{
		return notas;
	}

	/**
	 * Método para establecer las notas del estudiante
	 * 
	 * @param notas un array de Nota que contiene las notas del estudiante
	 */
	public void setNotas(Nota[] notas) 
	{
		this.notas = notas;
	}

	/**
	 * Método para calcular la nota del primer corte
	 * 
	 * @return la nota final del primer corte
	 */
	public double calcularNotaPrimerCorte()
	{
		return ((notas[0].getValor() * notas[0].getPorcentaje()/100) + 
				(notas[1].getValor() * notas[1].getPorcentaje()/100));
	}

	/**
	 * Método para calcular la nota del segundo corte
	 * 
	 * @return la nota final del segundo corte
	 */
	public double calcularNotaSegundoCorte()
	{
		return ((notas[2].getValor() * notas[2].getPorcentaje()/100) + 
				(notas[3].getValor() * notas[3].getPorcentaje()/100));
	}

	/**
	 * Método para calcular la nota del tercer corte
	 * 
	 * @return la nota final del tercer corte
	 */
	public double calcularNotaTercerCorte()
	{
		return ((notas[4].getValor() * notas[4].getPorcentaje()/100) + 
				(notas[5].getValor() * notas[5].getPorcentaje()/100));
	}

	/**
	 * Método para calcular la nota final del estudiante
	 * @return la nota final del estudiante
	 */
	public double calcularNotaFinal()
	{
		// Verificar que las notas para los tres cortes están disponibles
		if (notas.length < 6) 
		{
			throw new IllegalStateException("Las notas para todos los cortes no están disponibles");
		}

		double notaPrimerCorte = calcularNotaPrimerCorte();
		double notaSegundoCorte = calcularNotaSegundoCorte();
		double notaTercerCorte = calcularNotaTercerCorte();

		// Calcular la nota final
		double notaFinal = (notaPrimerCorte + notaSegundoCorte + notaTercerCorte);

		return notaFinal;
	}
}

