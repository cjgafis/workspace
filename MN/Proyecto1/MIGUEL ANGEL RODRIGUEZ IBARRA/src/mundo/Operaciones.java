package mundo;

import javax.swing.JOptionPane;

public class Operaciones 
{
	private double valorVerdadero;
	private double [ ] medidas;
	
	
	public Operaciones (double [] medidasP) 
	{

		valorVerdadero=0.0;
		medidas=medidasP;


	}

	public Operaciones (double valorVerdaderoP, double [] medidasP) 
	{

		valorVerdadero = valorVerdaderoP;
		medidas=medidasP;

	}
	

	public double errorAbsoluto() throws Exception 
	{

		double ea = 0.0;
		if (medidas.length ==1) 
		{
			ea = Math.abs(valorVerdadero - medidas [0]);
		}
		else if (medidas.length>1) 
		{
			double promedio = promedioDeLasMedidas  (medidas);
			double suma =0.0;
			for (int i=0 ; i<medidas.length; i++) 
			{
				suma=suma + Math.abs(medidas [ i] - promedio);
			}
			ea= suma/medidas.length;
		}
		else {	
			throw new Exception ("No EXISTEN medidas");
		}
		return ea;
	
	}

	public double errorRelativo()
	{

		double er= 0.0;
		try 
		{
			if(medidas.length ==1) 
			{

				er= errorAbsoluto()/valorVerdadero;	

			}
			else if(medidas.length >1);

			er = errorAbsoluto () /promedioDeLasMedidas(medidas);

		}
		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null, "No existen medidas");

		}
		return er;

	}
	public double medidaMasLejana()
	{
		double mMl=0.0;
		double diferencia= 0.0;
		for(int i=0; i<medidas.length;i++) 
		{

			if(Math.abs(valorVerdadero-medidas[i])>diferencia)
			{

				diferencia = Math.abs(valorVerdadero-medidas[i]);
				mMl=medidas[i];
			}

		}
		return mMl;

	}

	public double porcentajeErrorExactitud () throws Exception
	{

		double pEe=0.0;		
		pEe = errorRelativo()*100;
		return pEe;
	}




	public double exactitudDeMedida() throws Exception 
	{
		double ex=0.0;
		ex = 100-(porcentajeErrorExactitud());
		return ex;
	}

	public double porcentajePrecision() 
	{
		double pEP=0.0;

		try
		{
			pEP= (Math.abs((promedioDeLasMedidas(medidas)-medidaMasLejana())/promedioDeLasMedidas(medidas))*100);

		}

		catch (Exception e)
		{
			JOptionPane.showMessageDialog(null,"Existen fallas de promedio ó de medidas");

		}
		return pEP;
	}
	public double promedioDeLasMedidas( double [] medidas) throws Exception 
	{

		if (medidas.length != 0) 
		{
			double promedio = 0.0;
			double suma  = 0.0;
			for (int i=0; i<medidas.length;i++) 
			{
				suma=suma+ medidas [i];


			}
			promedio = suma / medidas.length;

			return promedio;
		}
		else
			throw new Exception ("No existen medidas");
	}

	public double precision () 
	{


		double pP=0.0;
		pP=100-porcentajePrecision();
		return pP;



	}

	public static void main(String[] args) 
	{

	}

}
