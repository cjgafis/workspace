package Mundo;

import java.util.ArrayList;

/**
 * Clase que requiere como parámetro un valor "verdadero" y un conjunto de medidas para calcular y regresar diferentes cotas de errores.
 * @author Mayra Alejandra Moreano Vásquez.
 */

public class TeoriaError {

	/**
	 * Medida que el usuario ingresa y asume como valor "verdadero".
	 */
	private double valorVerdadero;

	/**
	 * Conjunto de medidas que el usuario ingresa.
	 */
	private ArrayList <Double> medidas;

	/**
	 * Método constructor.
	 * @param valorVerdadero, valor que el usuario ingresa y asume como aquel que es el "verdadero.
	 * @param medidas, ArrayList correspondiente al conjunto de medidas que ingresa el usuario.
	 */

	public TeoriaError (double valorVerdadero, ArrayList <Double> medidas) {
		this.valorVerdadero = valorVerdadero;
		this.medidas = medidas;
	}

	/**
	 * Método que calcula la medida promedio del conjunto de medidas que ingresa el usuario.
	 * @return, medida promedio del conjunto de medidas ingresadas por el usuario.
	 */

	public double calcularPr() throws Exception {
		if (medidas.size()!=0) {
			double suma = 0;
			for (int i = 0; i < medidas.size(); i++) {
				suma += medidas.get(i);	
			}
			double promedio = suma/medidas.size();
			return promedio;
		} else {
			throw new Exception ("¡Imposible saberlo! No ha ingresado ni una sola medida.");
		}
	}

	/**
	 * Método que calcula el error absoluto.
	 * @return, el error absoluto del conjunto de medidas ingresadas por el usuario.
	 * @throws Exception 
	 */

	public double calcularEa() throws Exception {
		double numerador = 0;
		if (medidas.size()!=0) {
			if (medidas.size()>1) {
				for (int i = 0; i < medidas.size(); i++) {
					numerador += Math.abs(medidas.get(i)-calcularPr());
				}
			} else if (medidas.size()==1) {
				numerador = medidas.get(0)-valorVerdadero;	
			}
			return numerador/medidas.size();
		} else {
			throw new Exception ("¡Imposible saberlo! Ingrese la(s) medida(s) y el valor que está asumiendo como verdadero.");
		}
	}

	/**
	 * Método que calcula el error relativo.
	 * @return, el error relativo del conjunto de medidas ingresadas por el usuario.
	 * @throws Exception 
	 */

	public double calcularEr() throws Exception {
		double er = -1;
		if (medidas.size()>1) {
			er =  calcularEa() / calcularPr(); 
		} else if (medidas.size()==1) {
			er =  calcularEa() / valorVerdadero;
		} else {
			throw new Exception ("¡Ingrese la(s) medida(s) y el valor que está asumiendo como verdadero.");
		}
		return er;
	}

	/**
	 * Método que calcula el porcentaje del error de exactitud.
	 * @return, el porcentaje del error de exactitud del conjunto de medidas ingresadas por el usuario.
	 */

	public double calcularEe() throws Exception {	
		double ee = calcularEr(); 
		if (ee>=0) {
		} else {
			throw new Exception ("¡Ingrese y/o revise la(s) medida(s) y el valor que está asumiendo como verdadero.");
		}
		return ee;
	}

	/**
	 * Método que calcula la exactitud.
	 * @return, la exactitud del conjunto de medidas ingresadas por el usuario.
	 * @throws Exception 
	 */

	public double calcularE() throws Exception {
		double e = 1-calcularEe();
		if (e>=0) {
		} else {
			throw new Exception ("¡Ingrese y/o revise la(s) medida(s) y el valor que está asumiendo como verdadero.");
		}
		return e;
	}

	/**
	 * Método que calcula la medida lejana.
	 * @return, la medida del conjunto de medidas ingresadas por el usuario, más lejana al valor "verdadero".
	 * @throws Exception 
	 */

	public double calcularMl() throws Exception {
		double ml;
		double mlr;
		if (medidas.size()>1) {
			ml = Math.abs(medidas.get(0) - valorVerdadero);
			mlr = medidas.get(0);
			for (int i = 1; i < medidas.size(); i++) {
				if (Math.abs(medidas.get(i) - valorVerdadero) > ml) {
					ml = Math.abs(medidas.get(i) - valorVerdadero);
					mlr = medidas.get(i);
				}
			}
		} else {
			throw new Exception ("¡Ingrese la(s) medida(s) y el valor que está asumiendo como verdadero.");
		}
		return mlr;
	}

	/**
	 * Método que calcula el error de precisión.
	 * @return, el error de precisión del conjunto de medidas ingresadas por el usuario.
	 * @throws Exception 
	 */

	public double calcularEp() throws Exception {
		double ep;
		if (medidas.size()>1) {
			ep = Math.abs(calcularMl() - calcularPr()) / calcularPr() ;
		} else {
			throw new Exception ("Para obtener la precisión debe haber más de 1 medida.");
		}
		return ep;
	}

	/**
	 * Método que calcula la precisión.
	 * @return, la precisión del conjunto de medidas ingresadas por el usuario.
	 * @throws Exception 
	 */

	public double calcularP() throws Exception {
		double p;
		if (medidas.size()>1) {
			p = 1-calcularEp();
		} else {
			throw new Exception ("Para obtener la precisión debe haber más de 1 medida.");
		}
		return p;
		//double p = 1-calcularEp();
		//return p;
	}

}
