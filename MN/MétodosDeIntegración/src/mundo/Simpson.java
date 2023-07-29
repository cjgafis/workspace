package mundo;



public class Simpson 
{
	// ATRIBUTOS
		private String funcion;
		private double a;
		private double b;
		private int n;
		
		// CONSTRUCTOR
		public Simpson(String funcion, double a, double b, int n) // n >= 2 y par
		{
			this.funcion = funcion;
			this.a = a;
			this.b = b;
			this.n = n;
		}
		
		// METODO DE SIMPSON
		public double metodoSimpson()
		{
			Evaluador e1 = new Evaluador(funcion, a);
			e1.evaluar();
			double fEvalA = e1.getResultado();
			
			Evaluador e2 = new Evaluador(funcion, b);
			e2.evaluar();
			double fEvalB = e2.getResultado();
			
			double c = (a+b)/2;
			Evaluador e3 = new Evaluador(funcion, c);
			e3.evaluar();
			double fEvalC = e3.getResultado();
			
			double integral = 0.0;
			double delta = (b - a)/n;
			
			if(n == 2)
			{
				integral = ((b-a)/6) * ((fEvalA + fEvalC + fEvalB));
			}
			else if(n > 2 && (n % 2 == 0))
			{
				double [] trapecios = new double [n+1];
				double suma1 = 0.0;
				double suma2 = 0.0;
				double suma3 = 0.0;
				double inicio = a;
				
				for(int i = 0; i < trapecios.length; i++)
				{			
					Evaluador e = new Evaluador(funcion, inicio);
					e.evaluar();
					trapecios[i] = e.getResultado();
					inicio += delta;
				}
				
				for(int i = 0; i < trapecios.length; i++)
				{
					if(i == 0 || i == (trapecios.length - 1))
					{
						suma1 = suma1 + trapecios[i];
					}
					else if((i % 2 == 0))
					{
						suma2 = suma2 + trapecios[i];
					}
					else
					{
						suma3 = suma3 + trapecios[i];
					}
				}
				integral = (delta/3) * ((suma1 + 4*(suma3) + 2*(suma2)));
			}
			else
			{
				System.out.println(" el valor de n no es correcto. Debe ser 2 o multiplo de 2. ");
			}
			return integral;
		}
		    
}
