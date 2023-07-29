package mundo;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import javax.swing.JOptionPane;

public class EcuacionCuadratica 
{
	// ATRIBUTOS
	private double a;
	private double b;
	private double c;

	// CONSTRUCTOR
	public EcuacionCuadratica(double a, double b, double c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// METODO PARA CALCULAR LA RAIZ 1
	public double calcularRaiz1()
	{
		double x1 = 0.0;

		if (a == 0) 
		{
			JOptionPane.showMessageDialog(null, "El coeficiente (a) no puede ser igual a cero");
		} 
		else 
		{
			double discriminante = pow(b, 2) - 4 * a * c;
			if (discriminante >= 0) 
			{
				if (discriminante == 0) 
				{
					x1 = -b / (2 * a);
					JOptionPane.showMessageDialog(null, "La raíz única es: " + x1);
				} 
				else 
				{
					x1 = (-b + sqrt(discriminante)) / (2 * a);
					JOptionPane.showMessageDialog(null, "La raíz real x1 es :" + x1);
				}
			} 
			else 
			{
				double parteReal, parteImaginaria;
				discriminante = abs(discriminante);
				parteReal = -b / (2 * a);
				x1 = parteReal;
				parteImaginaria = sqrt(discriminante) / (2 * a);
				JOptionPane.showMessageDialog(null, "La raíz compleja x1 es :" + " parte real: " + 
						parteReal + " parte imaginaria " + parteImaginaria);
			}
		}
		return x1;
	}

	// METODO PARA CALCULAR LA RAIZ 2
	public double calcularRaiz2()
	{
		double x2 = 0.0;

		if (a == 0) 
		{
			JOptionPane.showMessageDialog(null, "El coeficiente (a) no puede ser igual a cero");
		} 
		else 
		{
			double discriminante = pow(b, 2) - 4 * a * c;
			if (discriminante >= 0) 
			{
				if (discriminante == 0) 
				{
					x2 = -b / (2 * a);
					JOptionPane.showMessageDialog(null, "La raíz única es: " + x2);
				} 
				else 
				{
					x2 = (-b - sqrt(discriminante)) / (2 * a);
					JOptionPane.showMessageDialog(null, "La raíz real x2 es :" + x2);
				}
			} 
			else 
			{
				double parteReal, parteImaginaria;
				discriminante = abs(discriminante);
				parteReal = -b / (2 * a);
				x2 = parteReal;
				parteImaginaria = sqrt(discriminante) / (2 * a);
				JOptionPane.showMessageDialog(null, "La raíz compleja x2 es :" + " parte real: " + 
						parteReal + " parte imaginaria " + parteImaginaria);
			}
		}
		return x2;
	}

}