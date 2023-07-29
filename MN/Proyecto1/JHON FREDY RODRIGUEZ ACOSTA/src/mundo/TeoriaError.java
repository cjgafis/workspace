package mundo;



public class TeoriaError 
{
	// ATRIBUTOS
	private double valorVerdadero;
	private double medidaExperimental;
	
	private double summedidas;
	private int contador;
	private double sumAbsMPr;

	public TeoriaError() {
		super();
	}
	
	public TeoriaError(double pvalorVerdadero, double pmedidaExperimental) 
	{
		valorVerdadero = pvalorVerdadero;
		medidaExperimental = pmedidaExperimental;
	}
	public TeoriaError(double psumabsMpr) {
		sumAbsMPr = psumabsMpr;
	}

	// METODOS
	public double getValorVerdadero() 
	{
		return valorVerdadero;
	}

	public void setValorVerdadero(double valorVerdadero) 
	{
		this.valorVerdadero = valorVerdadero;
	}

	public double getMedidaExperimental() 
	{
		return medidaExperimental;
	}
	public double getSumMedidas() 
	{
		return summedidas;
	}
	
	public void setSumMedidas(double psum) {
		summedidas=psum;
	}
	
	public void setContador(int pContador) {
		contador=pContador;
	}
	
	public int getContador() 
	{
		return contador;
	}
	
	public void setMedidaExperimental(double medidaExperimental) 
	{
		this.medidaExperimental = medidaExperimental;
	}
	public void setSumMedidasContador(double pSummedidas, int pContador) {
		summedidas = pSummedidas;
		contador = pContador;
	}
	public double getSumAbsMPr() {
		return sumAbsMPr;
	}

	public void setSumAbsMPr(double psumAbsMPr) {
		sumAbsMPr = psumAbsMPr;
	}
	
	public double promedio()
	{
		double respuesta = summedidas/contador;
		return respuesta;
	}
	
	
	
	
}
