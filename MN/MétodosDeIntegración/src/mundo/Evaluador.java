package mundo;

import org.nfunk.jep.JEP;

public class Evaluador 
{
	// ATRIBUTOS
	private String funcion;
	private double valorX;
	private double resultado;        
	private String error;   
	private JEP jep;

	public Evaluador(String funcion,  double valorX) 
	{
		this.funcion = funcion;
		this.valorX = valorX;
		this.resultado = 0.0;	
		this.error = "";	
		this.jep = new JEP();
	}

	/**
	 * @return the funcion
	 */
	public String getFuncion() 
	{
		return funcion;
	}

	/**
	 * @param funcion the funcion to set
	 */
	public void setFuncion(String funcion) 
	{
		this.funcion = funcion;
	}

	/**
	 * @return the valorX
	 */
	public double getValorX() 
	{
		return valorX;
	}

	/**
	 * @param valorX the valorX to set
	 */
	public void setValorX(double valorX) 
	{
		this.valorX = valorX;
	}

	/**
	 * @return the resultado
	 */
	public double getResultado() 
	{
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(double resultado) 
	{
		this.resultado = resultado;
	}

	/**
	 * @return the error
	 */
	public String getError() 
	{
		return error;
	}

	/**
	 * @param error the error to set
	 */
	public void setError(String error) 
	{
		this.error = error;
	}

	/**
	 * @return the jep
	 */
	public JEP getJep() 
	{
		return jep;
	}

	/**
	 * @param jep the jep to set
	 */
	public void setJep(JEP jep) 
	{
		this.jep = jep;
	}

	public void evaluar() // evaluar la función con un valor dado a (x)
	{   	
		jep.addStandardFunctions(); // añade funciones estandares como seno, coseno, etc.
		jep.addStandardConstants(); // añade constantes estandares como pi, e, etc. 
		jep.addVariable("x", valorX); // de define con que variable va a trabajar la función.
		jep.parseExpression(funcion); // convertir la función
		resultado = jep.getValue();  // obtener el valor.
		error = (jep.hasError())? " Existe un error.":" No hay error.";  // condicionar para saber si hay error o no.  
	}

}
