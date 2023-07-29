package mundo;

public class Nota 
{
	private double valor;
	private double porcentaje;
	
	/**
	 * @param valor
	 * @param porcentaje
	 */
	public Nota(double valor, double porcentaje) 
	{
		this.valor = valor;
		this.porcentaje = porcentaje;
	}
	
	/**
	 * @return the valor
	 */
	public double getValor() 
	{
		return valor;
	}
	
	/**
	 * @param valor the valor to set
	 */
	public void setValor(double valor) 
	{
		this.valor = valor;
	}
	
	/**
	 * @return the porcentaje
	 */
	public double getPorcentaje() 
	{
		return porcentaje;
	}
	
	/**
	 * @param porcentaje the porcentaje to set
	 */
	public void setPorcentaje(double porcentaje) 
	{
		this.porcentaje = porcentaje;
	}

	@Override
	public String toString() 
	{
		return "Nota [valor=" + valor + ", porcentaje=" + porcentaje + "]";
	}
	
}
