package mundo;

import org.lsmp.djep.djep.DJep;
import org.nfunk.jep.JEP;
import org.nfunk.jep.Node;

public class Metodos {

	// ATRIBUTOS

	private String funcion;
	private double errorPermitido;

	//Métdos cerrados
	private double li;
	private double ls;

	//Métdos abiertos
	private String gx;
	private double punto;

	// Constructor para métodos cerrados.
	public Metodos(String funcion, double li, double ls, double cT) {
		this.funcion = funcion;
		this.li = li;
		this.ls = ls;
		this.errorPermitido = cT;
	}

	// CONSTRUCTORES

	// Constructor para método de punto fijo.
	public Metodos(String funcion, String gx, double punto, double cT) {
		this.funcion = funcion;
		this.gx = gx;
		this.punto = punto;
		this.errorPermitido = cT;
	}

	// Constructor para método Newton-Raphson.
	public Metodos(String funcion, double punto, double cT) {
		this.funcion = funcion;
		this.punto = punto;
		this.errorPermitido = cT;
	}

	// FUNCIONES JEP

	public double evaluar(double valor) throws Exception {   
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valor);
		jep.parseExpression(funcion);
		resultado = jep.getValue(); 
		if(!jep.hasError()) {
			return resultado;
		}
		else {
			throw new Exception("¡Hay error!.");
		}      
	}

	public double evaluarConFuncion(String funcion, double valor) throws Exception {   
		double resultado = 0.0;
		JEP jep = new JEP();
		jep.addStandardFunctions();
		jep.addStandardConstants();
		jep.addVariable("x", valor);
		jep.parseExpression(funcion);
		resultado = jep.getValue(); 
		if(!jep.hasError()) {
			return resultado;
		}
		else {
			throw new Exception("¡Hay error!.");
		}      
	}

	public String derivar(String funcion) throws Exception {
		DJep djep = new DJep();

		djep.addStandardFunctions();
		djep.addStandardConstants();
		djep.addComplex();
		djep.setAllowUndeclared(true);
		djep.setAllowAssignment(true);
		djep.setImplicitMul(true);
		djep.addStandardDiffRules();

		Node nodoFuncion = djep.parse(funcion);

		Node diff = djep.differentiate(nodoFuncion, "x");

		Node nodoDerivada = djep.simplify(diff);

		funcion = djep.toString(nodoDerivada);

		return funcion;
	}

	// FUNCIONES PARA CALCULAR LA RAIZ MEDIANTE LOS DIFERENTES MÉTODOS

	public double biseccion() throws Exception {

		double fli = evaluar(li);
		double fls = evaluar(ls);
		double xr;
		double fxr;
		double Ea;

		if ((fli*fls)<0) {
			do {
				fli = evaluar(li);
				//fls = evaluar(ls);
				xr = (li+ls)/2;
				fxr = evaluar(xr);
				Ea = Math.abs((ls-li)/(ls+li));
				if ((fli*fxr)<0) {
					ls = xr;
				} else if ((fli*fxr)>0) {
					li = xr;
				} else {
					return xr;
				}
			} while (Ea>errorPermitido) ;
			return xr;
		} else {
			throw new Exception("El rango ingresado no es válido. ");
		}

	}

	public double falsaPosicion() throws Exception {

		double fli = evaluar(li);
		double fls = evaluar(ls);
		double xr;
		double fxr;
		double Ea;

		if ((fli*fls)<0) {
			do {
				fli = evaluar(li);
				fls = evaluar(ls);
				xr = ls - ((fls*(li-ls))/(fli-fls));
				fxr = evaluar(xr);
				Ea = Math.abs((ls-li)/(ls+li));
				if ((fli*fxr)<0) {
					ls = xr;
				} else if ((fli*fxr)>0) {
					li = xr;
				} else {
					return xr;
				}
			} while (Ea>errorPermitido) ;
			return xr;
		} else {
			throw new Exception("El rango ingresado no es válido. ");
		}

	}

	public double puntoFijo () throws Exception {
		double fgx;
		double Ea;
		double puntoaux = punto;
		double valor = evaluarConFuncion(derivar(funcion),punto);
		if ( (valor>=-1) && (valor<=1) ) {
			do {
				fgx = evaluarConFuncion(gx, puntoaux);
				Ea = Math.abs((fgx-puntoaux)/fgx);
				puntoaux = fgx;
			} while (Ea>errorPermitido);
			return fgx;
		} else {
			return -1111;
		}

	}

	public double newton () throws Exception {
		String derivada = derivar(funcion);
		double fpunto;
		double division;
		double puntoN;
		double Ea;
		double it = 1;
		do {
			//System.out.println("Iteración: "+it);
			fpunto = evaluar(punto);
			//System.out.println(fpunto);
			division = fpunto / evaluarConFuncion(derivada, punto);
			//System.out.println(division);
			puntoN = punto - division;
			//System.out.println(puntoN);
			Ea = Math.abs((puntoN-punto)/puntoN);
			//System.out.println(Ea);
			punto = puntoN;
			it++;
		} while (Ea>errorPermitido);
		return puntoN;
	}

	public double biseccion2() throws Exception {
		double fli = evaluar(li); 
		double fls = evaluar(ls);
		double xr = 0;
		double fxr;
		double Ea;
		double n;

		if ((fli*fls)<0) {
			n = Math. round(Math.log((ls-li)/(errorPermitido)) / Math.log(2));
			for (int i = 0; i <= n; i++) {
				xr = (li+ls)/2;
				fxr = evaluar(xr);
				Ea = Math.abs((ls-li)/(ls+li));
				if ((fli*fxr)<0) {
					ls = xr;
				} else if ((fli*fxr)>0) {
					li = xr;
				} else {
					return xr;
				}
				fli = evaluar(li); 
			}
			return xr;
		} else {
			throw new Exception("El rango ingresado no es válido. ");
		}

	}

	public static void main(String[] args) throws Exception {
		//Metodos objeto1 = new Metodos ("x^2+4*x", -5, -3, 0.0001);
		//System.out.println("Raíz: "+objeto1.biseccion2());
		//System.out.println("Raíz: "+objeto1.falsaPosicion());
		//Metodos objeto2 = new Metodos ("2*sin(x)-x", -3, 0.0001);
		//System.out.println("Raíz: "+objeto2.newton());
		//Metodos objeto3 = new Metodos ("2*sin(x)-x", "ln(pi*x)", 1, 0.0001);
		//System.out.println("Raíz: "+objeto3.puntoFijo());
		Metodos objeto4 = new Metodos ("x^3+2x-6", "3x^2+2", 1.5, 0.0001);
		System.out.println("Raíz: "+objeto4.puntoFijo());
	}

}
