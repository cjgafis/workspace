package Mundo;

import java.util.Scanner;

public class Operacion 
{
	/**
	 * permite calcular el promedio de las medidas
	 * @param medidas, son las medidas que ingresa el usuario 
	 * @return promedio, el promedio de las medidas.
	 */
	public double promedioDeLasMedidas(double [] medidas)
	{
		double promedio = 0.0;
		double suma = 0.0;
		if(medidas.length == 0 )
		{
	System.out.println("no hay medidas.");
		}
	else if(medidas.length == 1)
	
	{
	promedio = medidas[0];	
	}
	 else
	 {
	// length es longitud del arreglo es decir el tamaño
		for(int i = 0; i < medidas.length; i++)

	{
		suma = suma + medidas[i];
	}
	promedio = suma / medidas.length; 
	}
		return promedio;
	}
	
	 // MENU OPCION 1
	 /**
	  * Permite calcular el error absoluto con una sola medida. 
	  * @param valorVerdadero, valor que asumimos como verdadero.
	  * @param medidaExperimental, medida que mide el usuario con un patron.
	  * @return ea, error absoluto.
	  */
	 public double errorAbsolutoUnaMedida(double valorVerdadero, double medidaExperimental)
	 {
	  double ea = Math.abs(valorVerdadero - medidaExperimental);
	  return ea;
	 }
	// MENU OPCION 2
	  /**
	   * Permite calcular el error absoluto con varias medidas.
	   * @param valorVerdadero, valor que asumimos como verdadero.
	   * @param medidas, arreglo con varias medidas experimentales. 
	   * @return ea, error absoluto.
	   */
	  public double errorAbsolutoVariasMedidas(double valorVerdadero, double[ ] medidas)
	  {
	   // Calculamos el promedio de las medidas ingresadas.
	   double suma = 0.0;
	   double promedio = 0.0;
	   for(int i= 0; i < medidas.length; i++)
	   {
	    suma = suma + medidas[i];
	   }
	   promedio = suma / medidas.length;

	   // Ya con el promedio podemos calcular el error absoluto para varias medidas. 
	   double suma2 = 0.0;
	   for(int i= 0; i < medidas.length; i++)
	   {
	    suma2 = suma2 + Math.abs(medidas[i] - promedio);
	   }
	   double ea = suma2/medidas.length;
	   return ea;
	  }
	   
	   // MENU OPCION 3
	   /**
	    * Permite calcular el error relativo con una sola medida. 
	    * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	    * @param valorVerdadero, valor que asumimos como verdadero.
	    * @return er, error relativo.
	    */
	   double errorRelativoUnaMedida1(double errorAbsoluto, double valorVerdadero)
	   {
	    double er = errorAbsoluto / valorVerdadero;
	    return er; 
	   }

	    // MENU OPCION 4
	    /**
	     * Permite calcular el error relativo con una sola medida. 
	     * @param valorVerdadero, valor que asumimos como verdadero.
	     * @param medidaExperimental, medida que mide el usuario con un patron.
	     * @return er, error relativo.
	     */
	    public double errorRelativoUnaMedida2(double valorVerdadero, double medidaExperimental)
	    {
	     double er = Math.abs(valorVerdadero / medidaExperimental) / valorVerdadero;
	     return er;
	    }
	     
	     // MENU OPCION 5
	     /**
	      * Permite calcular el error relativo con varias medidas. 
	      * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	      * @param promedio, promedio de las medidas. 
	      * @return er, error relativo.
	      */
	     double errorRelativoVariasMedidas(double errorAbsoluto, double promedio)
	     {
	      double er = errorAbsoluto / promedio;
	      return er;
	     }
	     
	  // MENU OPCION 6
	     /**
	      * Permite calcular el error relativo con varias medidas.
	      * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	      * @param medidas, arreglo con varias medidas experimentales.  
	      * @return er, error relativo.
	      */
	     public double errorRelativoVariasMedidas2(double errorAbsoluto, double[] medidas)
	     {
	      double suma = 0.0;
	      double promedio = 0.0;
	      for(int i= 0; i < medidas.length; i++)
	      {
	       suma = suma + medidas[i];
	      }
	      promedio = suma / medidas.length;

	      double er = errorAbsoluto / promedio;
	      return er;  
	     }
	     
	  // MENU OPCION 7
	     /**
	      * Permite calcular el porcentaje de error de exactitud.
	      * @param errorRelativo, relación entre el error de medida y un valor verdadero del mensurando.
	      * @return pEE, porcentaje de error de exactitud. 
	      */
	     public double porcentajeErrorExactitud(double errorRelativo)
	     {
	      double pEE = errorRelativo * 100;
	      return pEE;
	     }
	     
	  // MENU OPCION 8
	     /**
	      * Permite calcular el porcentaje de error de exactitud.
	      * @param errorAbsoluto, resultado de una medición menos un valor verdadero del mensurando.
	      * @param valorVerdadero, valor que asumimos como verdadero.
	      * @return pEE, porcentaje de error de exactitud. 
	      */
	     public double porcentajeErrorExactitud2(double errorAbsoluto, double valorVerdadero)
	     {
	      double pEE = (errorAbsoluto / valorVerdadero) * 100;
	      return pEE;
	     }
	     // MENU OPCION 9
	     /** Permite calcular el porcentaje de error de exactitud
	     * @param valorVerdadero, valor que asumimos como verdadero.
	     * @param medidaExperimental, medida que mide el usuario con un patron.
	     * @return
	     */
	     public double porcentajeErrorExactitud3(double valorVerdadero, double medidaExperimental)
	     {
	      double pEE = ( Math.abs(valorVerdadero / medidaExperimental) / valorVerdadero ) * 100;
	      return pEE;
	     }
	     // MENU OPCION 10
	     /**
	      * Permite calcular el porcentaje de exactitud.
	      * @param porcentajeErrorExactitud, porcentaje de error de exactitud.
	      * @return pE, porcentaje de exactitud.
	      */
	     public double porcentajeExactitud(double porcentajeErrorExactitud)
	     {
	      double pE = 100 - porcentajeErrorExactitud;
	      return pE;
	     }
	  // METODOS PARA LA PRECISION

	     // MENU OPCION 11
	     /**
	      * Permite calcular el porcentaje de error de precision.
	      * @param medidaPromedio, promedio de las medidas.
	      * @param medidaMasLejana, se refiere a la medida mas lejana de las demas.
	      * @return pEP, porcentaje error de precision.
	      */
	     public double porcentajeErrorPrecision(double medidaPromedio, double medidaMasLejana)
	     {
	      double pEP = ( Math.abs(medidaPromedio - medidaMasLejana) / medidaPromedio ) * 100;
	      return pEP;
	     }
	     // MENU OPCION 12
	     /**
	      * Permite calcular el porcentaje de precision.
	      * @param porcentajeErrorPrecision, porcentaje de error de precision.
	      * @return pP, porcentaje de precision.
	      */
	     public double porcentajePrecision(double porcentajeErrorPrecision)
	     {
	      double pP = 100 - porcentajeErrorPrecision;
	      return pP;
	     }

	     /**
	      * @param args
	      */
	     public static void main(String[] args) 
	     {
	      Operacion op = new Operacion();

	      System.out.println("\nEscriba el número de la opción que desea ejecutar... "

	        + "\n\n==================== Menú ===================="

	        + "\n\nOpción 1. Calcular el error absoluto para una medida. "
	        + "\nDebe proporcionar el valor verdadero y la medida experimental."

	        + "\n\nOpción 2. Calcular el error absoluto para varias medidas."
	        + "\nDebe proporcionar el valor verdadero y varias medidas experimentales."

	        + "\n\nOpción 3. Calcular el error relativo para una medida."
	        + "\nDebe proporcionar el error absoluto y el valor verdadero."

	        + "\n\nOpción 4. Calcular el error relativo para una medida."
	        + "\nDebe proporcionar el valor verdadero y la medida experimental."

	        + "\n\nOpción 5. Calcular el error relativo para varias medidas."
	        + "\nDebe proporcionar el error absoluto y el promedio de las medidas."

	        + "\n\nOpción 6. Calcular el error relativo con varias medidas."
	        + "\nDebe proporcionar el error absoluto e ingresar las medidas."

	        + "\n\nOpción 7. Calcular el porcentaje de error de exactitud."
	        + "\nDebe proporcionar el error relativo."

	        + "\n\nOpción 8. Calcular el porcentaje de error de exactitud."
	        + "\nDebe proporcionar error absoluto y el valor verdadero."

	        + "\n\nOpción 9. Calcular el porcentaje de error de exactitud."
	        + "\nDebe proporcionar valor verdadero y medida experimental."

	        + "\n\nOpción 10. Calcular el porcentaje de exactitud."
	        + "\nDebe proporcionar el porcentaje de error de exactitud."

	        + "\n\nOpción 11. Calcular el porcentaje de error de precisión."
	        + "\nDebe proporcionar el promedio de las medidas y la medida mas lejana de las demas."

	        + "\n\nOpción 12. Calcular el porcentaje de precisión"
	        + "\nDebe proporcionar el porcentaje de error de precisión.");

	      Scanner sc = new Scanner(System.in);
	      int opcion = Integer.parseInt(sc.nextLine());
	     }
	      
	    
	  // METODOS PARA EL ERROR RELATIVO
	 
	public static void main1(String[] args)
	{
		// se crea un objeto de tipo operacion.
		// con el objeto se pueden llamar a los metodos
		Operacion op = new Operacion();
		
		// se crea un objeto de tipo scanner.
		Scanner sc = new Scanner(System.in);
		
		// se debe escribir un mensaje al usuario para que vea y digite los valores.
		System.out.println("por favor ingrese la medida. Si son varias medidas,"
			+ "utilice la coma (,) como separador."	);
		
		// captura las medidas que digitó el usuario
	String medidasEnCadena	= sc.nextLine(); 
	String [] medidas = medidasEnCadena.split(",");
	double[] medidasConvertidas = new double [medidas.length];
	
	for (int i = 0; i < medidas.length; i++)
	{
		medidasConvertidas[i] = Double.parseDouble(medidas[i]);
	}
		
		System.out.println("El promedio de las medidas es." + op.promedioDeLasMedidas(medidasConvertidas));
		
		System.out.println();
	  {
	   System.out.println("\n\nOpción 1. Calcular el error absoluto para una medida. "
	     + "\nDebe proporcionar el valor verdadero y la medida experimental.");
	   System.out.println("Ingrese el valor verdadero: ");
	   double valorVerdadero = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese la medida experimental: ");
	   double medidaExperimental = Double.parseDouble(sc.nextLine());
	   System.out.println("El error absoluto es: " + op.errorAbsolutoUnaMedida(valorVerdadero, medidaExperimental));
	   
	  //case 3
	  {
	   System.out.println("\n\nOpción 3. Calcular el error relativo para una medida."
	    + "\nDebe proporcionar el error absoluto y el valor verdadero.");
	   System.out.println("Ingrese el error absoluto: ");
	   double errorAbsoluto = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese el valor verdadero: ");
	   double valorVerdadero1 = Double.parseDouble(sc.nextLine());
	   System.out.println("El error realativo es: " + op.errorRelativoUnaMedida1(errorAbsoluto, valorVerdadero1));
		}
	  //case 4
	  {
	   System.out.println("\n\nOpción 4. Calcular el error relativo para una medida."
	    + "\nDebe proporcionar el valor verdadero y la medida experimental.");
	   System.out.println("Ingrese el valor verdadero: ");
	   double valorVerdadero1 = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese la medida experimental: ");
	   double medidaExperimental1 = Double.parseDouble(sc.nextLine());
	   System.out.println("El error relativo es: " + op.errorRelativoUnaMedida2(valorVerdadero1, medidaExperimental1));
	}
	  //case 5
	  {
	   System.out.println("\n\nOpción 5. Calcular el error relativo para varias medidas."
	    + "\nDebe proporcionar el error absoluto y el promedio de las medidas.");
	   System.out.println("Ingrese el error absoluto: ");
	   double errorAbsoluto = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese el promedio de las medidas: ");
	   double promedio = Double.parseDouble(sc.nextLine());
	   System.out.println("El error relativo es: " + op.errorRelativoVariasMedidas(errorAbsoluto, promedio));
	}
	  //case 6:
	  {
	   System.out.println("\n\nOpción 6. Calcular el error relativo con varias medidas."
	    + "\nDebe proporcionar el error absoluto e ingresar las medidas.");
	   System.out.println("Ingrese el error absoluto: ");
	   double errorAbsoluto = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese las medidas experimentales, separadas por una coma (,): ");
	   String cadena = sc.nextLine();
	   String [] medidasCapturadas = cadena.split(",");
	   double [] medidasConvertidas1 = new double[medidasCapturadas.length];
	   for(int i = 0; i < medidasCapturadas.length; i++)
	   {
	    medidasConvertidas1[i] = Double.parseDouble(medidasCapturadas[i]); 
	   }
	   System.out.println("El error relativo es: " + op.errorRelativoVariasMedidas2(errorAbsoluto, medidasConvertidas1));
	   
	  }
	 // case 7:
	  {
	   System.out.println("\n\nOpción 7. Calcular el porcentaje de error de exactitud."
	    + "\nDebe proporcionar el error relativo.");
	   System.out.println("Ingrese el error relativo: ");
	   double errorRelativo = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de error de exactitud es: " + op.porcentajeErrorExactitud(errorRelativo));
	 
	  }
	  //case 8:
	  {
	   System.out.println("\n\nOpción 8. Calcular el porcentaje de error de exactitud."
	    + "\nDebe proporcionar error absoluto y el valor verdadero.");
	   System.out.println("Ingrese el error absoluto: ");
	   double errorAbsoluto = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese el valor verdadero: ");
	   double valorVerdadero1 = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de error de exactitud es: " + op.porcentajeErrorExactitud2(errorAbsoluto, valorVerdadero1));
	 
	  }
	 // case 9:
	  {System.out.println("\n\nOpción 9. Calcular el porcentaje de error de exactitud."
			    + "\nDebe proporcionar valor verdadero y medida experimental.");
	   System.out.println("Ingrese el valor verdadero: ");
	   double valorVerdadero1 = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese la medida experimental: ");
	   double medidaExperimental1 = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de error de exactitud es: " + op.porcentajeErrorExactitud3(valorVerdadero1, medidaExperimental1));

	  }
	  //case 10:
	  {
	   System.out.println("\n\nOpción 10. Calcular el porcentaje de exactitud."
	    + "\nDebe proporcionar el porcentaje de error de exactitud.");
	   System.out.println("Ingrese el porcentaje de error de exactitud: ");
	   double pEE = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de error de exactitud es: " + op.porcentajeExactitud(pEE));
	  }
	  //case 11
	  {
	   System.out.println("\n\nOpción 11. Calcular el porcentaje de error de precisión."
	    + "\nDebe proporcionar el promedio de las medidas y la medida mas lejana de las demas.");
	   System.out.println("Ingrese el promedio de las medidas: ");
	   double promedioMedidas = Double.parseDouble(sc.nextLine());
	   System.out.println("Ingrese la medida mas lejana de las demas: ");
	   double medidaMasLejana = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de error de precisión es: " + op.porcentajeErrorPrecision(promedioMedidas, medidaMasLejana));
	  }
	  //case 12:
	  {
	   System.out.println("\n\nOpción 12. Calcular el porcentaje de precisión"
	    + "\nDebe proporcionar el porcentaje de error de precisión.");
	   System.out.println("Ingrese el porcentaje de error de precisión: ");
	   double pEP = Double.parseDouble(sc.nextLine());
	   System.out.println("El porcentaje de precisión es: " + op.porcentajePrecision(pEP));
	  }
	}
	}  
	private String errorRelativoUnaMedida(double errorAbsoluto, double valorVerdadero1) {
		// TODO Auto-generated method stub
		return null;
	}
}
	


