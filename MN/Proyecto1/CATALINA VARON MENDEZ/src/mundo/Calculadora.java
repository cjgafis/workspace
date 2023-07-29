package mundo;

import javax.swing.JOptionPane;



public class Calculadora 
{
	// ATRIBUTOS
	private double numero1 = 0;
	private double numero2 = 0;
	private String medidas;
	private double valorVerdadero = 0;

	/**
	 * Metodo que construye los objetos de la clase Calculadora
	 * @param num1, es el numero1 ingresado por el usuario
	 * @param num2, es el numero2 ingresado por el usuario
	 */
	public Calculadora(double num1, double num2) 
	{
		numero1 = num1;
		numero2 = num2;
	}

	/**
	 * Metodo que construye los objetos de la clase Calculadora
	 * @param med son los datos ingresados por el usuario
	 */
	public Calculadora( String med, double val ) 
	{
		medidas = med;
		valorVerdadero = val;
	}

	/**
	 * Retorna el valor que tiene el atributo numero1
	 * @return numero1
	 */
	public double getNumero1()
	{
		return numero1;
	}

	/**
	 * Retorna el valor que tiene el atributo numero2
	 * @return numero2
	 */
	public double getNumero2()
	{
		return numero2;
	}

	/**
	 * Cambia el valor del atributo numero1 por el valor 
	 * ingresado por parametro
	 * @param num1, es el nuevo valor ingresado por el usuario
	 */
	public void setNumero1(double num1)
	{
		numero1 = num1;
	}

	/**
	 * Cambia el valor del atributo numero2 por el valor 
	 * ingresado por parametro
	 * @param num2, es el nuevo valor ingresado por el usuario
	 */
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
		// JOptionPane.showMessageDialog(null, "ML " + medidas + " " + valorVerdadero );
		double mML = 0.0;
		double diferencia = 0.0;
		String[] separatedStrings = medidas.split(";");
		if( separatedStrings.length != 0){
			double[] numeros = new double[ separatedStrings.length ];

			for (int i = 0; i < separatedStrings.length; i++){
				try {
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

	//	public static void main(String[] args) 
	//	{
	//		String continuar = "s";
	//		
	//		while(continuar.equalsIgnoreCase("s"))
	//		{
	//			Scanner sc = new Scanner(System.in);
	//
	//			System.out.println("Ingrese el numero1: ");
	//			double n1 = sc.nextDouble();
	//
	//			System.out.println("Ingrese el numero2: ");
	//			double n2 = sc.nextDouble();
	//
	//			Calculadora prueba = new Calculadora(n1, n2);
	//			System.out.println("El resultado de sumar los dos numeros es: " + prueba.sumar());
	//			System.out.println("El resultado de restar los dos numeros es: " + prueba.restar());
	//			System.out.println("El resultado de multiplicar los dos numeros es: " + prueba.multiplicar());
	//			try 
	//			{
	//				System.out.println("El resultado de dividir los dos numeros es: " + prueba.dividir());
	//			} 
	//			catch (Exception e) 
	//			{
	//				System.out.println(e.getMessage());
	//			}
	//				
	//			System.out.println("Escriba \"s \" si desea continuar, de lo contrario escriba otra letra. ");
	//			sc.nextLine();
	//			continuar = sc.nextLine();
	//		}
	//	
	//	}

}
