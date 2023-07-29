package mundo;

public class Operacion
{
	// ATRIBUTOS
	private double numero1 = 0;
	private double numero2 = 0;
	private String medidas;
	private double valorVerdadero = 0;

	
	public Operacion(double num1, double num2) 
	{
		numero1 = num1;
		numero2 = num2;
	}

	
	public Operacion( String med, double val ) 
	{
		medidas = med;
		valorVerdadero = val;
	}

	
	public double getNumero1()
	{
		return numero1;
	}

	
	public double getNumero2()
	{
		return numero2;
	}

	
	public void setNumero1(double num1)
	{
		numero1 = num1;
	}

	
	public void setNumero2(double num2)
	{
		numero2 = num2;
	}

	public double promedio( ) throws Exception 
	{
		double resultado = 0;
		// JOptionPane.showMessageDialog(null, "" + medidas );
		String[] separatedStrings = medidas.split(";");

		if( separatedStrings.length != 0){
			double[] numeros = new double[ separatedStrings.length ];

			for (int i = 0; i < separatedStrings.length; i++) {
				try {
					numeros[i] = Double.parseDouble( separatedStrings[i] );
					resultado += numeros[i];
				} catch (Exception e) {
					System.out.println("Unable to parse string to double: " + e.getMessage());
				}
			}
			resultado = resultado / separatedStrings.length;
		}
		else{
			throw new Exception ("No se encuentran medidas");
		}

		return resultado;
	}

	
	
	public double medidaMasLejana() throws Exception
	{
		
		double mML = 0.0;
		
		double diferencia = 0.0;
		String[] separatedStrings = medidas.split(";");
		
		if( separatedStrings.length != 0){
			double[] numeros = new double[ separatedStrings.length ];

			for (int i = 0; i < separatedStrings.length; i++){
				
				try 
				{
					numeros[i] = Double.parseDouble( separatedStrings[i] );
					
					if( Math.abs( valorVerdadero - numeros[i] ) > diferencia ){
						diferencia = Math.abs(valorVerdadero - numeros[i]);
						mML = numeros[i];
					}

				} catch (Exception e) {
					
					System.out.println("Unable to parse string to double: " + e.getMessage());
				}
			}
		}
		else{
			throw new Exception ("No se encuentran medidas");
		}
		
		return mML;
	}

	public double opeEa( )
	{
		//JOptionPane.showMessageDialog(null, "" + num1 + " "+ num2 );
		
		double resultado = numero1 - numero2 ;
		resultado = Math.abs( resultado );
		return resultado;
	}

	public double opeEr()throws Exception
	{
		if(numero2 != 0)
		{
			double resultado = Math.abs( numero1 - numero2 ) / numero1;
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}

	public double opeEe()throws Exception
	{
		if(numero2 != 0)
		{
			double resultado = Math.abs( numero1 - numero2 ) / numero1 * 100;
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}

	public double opeE()throws Exception
	{
		if(numero2 != 0)
		{
			double resultado = 100 - ( Math.abs( numero1 - numero2 ) / numero1 * 100 );
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}

	public double opeEp()throws Exception
	{
		if(numero2 != 0)
		{
			double resultado = ( Math.abs( numero1 - numero2 ) / numero1 * 100 );
			
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}

	public double opeP()throws Exception
	{
		if(numero2 != 0)
		{
			
			double resultado = 100 - ( Math.abs( numero1 - numero2 ) / numero1 * 100 );
			return resultado;
		}
		else
		{
			throw new Exception("La división por cero no existe");
		}
	}


}
