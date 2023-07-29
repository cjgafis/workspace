package mundo;

import org.nfunk.jep.JEP;

public class CalculoRaiz {
	public double raiz1(double a, double b, double c) {
		return (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	public double raiz2(double a, double b, double c) {
		return (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / (2 * a);
	}

	public double evaluar(String funcion, double valorX) throws Exception {
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valorX);
		jep.parseExpression(funcion);
		resultado = jep.getValue();

		if (!jep.hasError()) {
			return resultado;
		} else {
			throw new Exception("Hay error.");
		}
	}

	/**
	 * 
	 * Metodos Cerrados
	 * 
	 * */
	
	public double biseccion(double pxi, double pxf, String pfuncion) throws Exception 
	{
		//int segmentos = psegmentos;
		double xi = pxi;
		double xf = pxf;
		String funcion = pfuncion;
		double xr=0, xranterior,fxi,fxr,fxifxr=0,ea=1,et;
		xr = (xi+xf)/2;
		fxi = evaluar(funcion,xi);
		fxr = evaluar(funcion,xr);
		fxifxr = fxi*fxr;
		while (fxr != 0 && ea > 0.0001) {
			xranterior = xr;
			if (fxifxr<0) {
				xi = xi;
				xf = xr;
			}else {
				xi = xr;
				xf = xf;
			}
			xr = (xi+xf)/2;
			fxi = evaluar(funcion,xi);
			fxr = evaluar(funcion,xr);
			fxifxr = fxi*fxr;				
			ea = Math.abs((xr-xranterior)/xr)*100;
			
		}
		
		return xr;
	}

	public double falsaPosicion(double pxi, double pxf, String pfuncion) throws Exception 
	{
		double xi = pxi;
		double xf = pxf;
		String funcion = pfuncion;
		double xr = 0, xranterior, fxi, fxf, fxr, fxifxr = 0, ea = 1, et;
		fxi = evaluar(funcion, xi);
		fxf = evaluar(funcion, xf);
		xr = (((xf * fxi) - (xi * fxf)) / (fxi - fxf));
		fxr = evaluar(funcion, xr);
		fxifxr = fxi * fxr;
		while (fxr != 0 && ea > 0.0001) {
			xranterior = xr;
			if (fxifxr < 0) {
				xi = xi;
				xf = xr;
			} else {
				xi = xr;
				xf = xf;
			}

			fxi = evaluar(funcion, xi);
			fxf = evaluar(funcion, xf);
			xr = (((xf * fxi) - (xi * fxf)) / (fxi - fxf));
			fxr = evaluar(funcion, xr);
			fxifxr = fxi * fxr;

			ea = Math.abs((xr-xranterior)/xr)*100;
		}

		return xr;
	}

	/**
	 * 
	 * Metodos Cerrados
	 * 
	 */

	public double PuntoFijo(double pxi, String pfuncion) throws Exception {
		double xi = pxi;
		String funcion = pfuncion;
		double antxi, ea=1;

		while (ea > 0.0001) {
				antxi = xi;
				xi = evaluar(funcion, antxi);
				ea = Math.abs((xi - antxi) / (xi)) * 100;
		}

		return xi;
	}

	public double NewtonRaphson(double pxi, String pfuncion, String pderivada) throws Exception {
		double xi = pxi;
		double antxi, ea=1;
		String funcion = pfuncion;
		String derivada = pderivada;
		double fxi, dfxi, fxi_dfxi;
		fxi = evaluar(funcion, xi);
		dfxi = evaluar(derivada, xi);
		fxi_dfxi = fxi / dfxi;
		while (ea > 0.0001) {
			antxi = xi;
			fxi = evaluar(funcion, xi);
			dfxi = evaluar(derivada, xi);
			fxi_dfxi = fxi / dfxi;
			xi = xi - fxi_dfxi;
			ea = Math.abs((xi - antxi) / (xi)) * 100;

		}

		return xi;
	}
}
