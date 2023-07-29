package interfaz;

//import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import mundo.Cuadratica;
import mundo.Metodos;

public class InterfazPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;

	// ATRIBUTOS

	// CUADRÁTICA
	private PanelImagenCuadratica panelImagenCuadratica; 
	private PanelDatosCuadratica panelDatosCuadratica; 
	private PanelResultadosCuadratica panelResultadosCuadratica; 

	private Cuadratica objetoCuadratica;

	// MÉTODOS CERRADOS
	private PanelDatosMetodosCerrados panelDatosMetodosCerrados; 
	private PanelResultadosMetodosCerrados panelResultadosMetodosCerrados;

	// MÉTODOS ABIERTOS
	private PanelDatosMetodosAbiertos panelDatosMetodosAbiertos; 
	private PanelResultadosMetodosAbiertos panelResultadosMetodosAbiertos; 

	DecimalFormat dfDouble = new DecimalFormat ("#.#####");
	//DecimalFormat dfPorcentaje = new DecimalFormat ("#.##%");

	public InterfazPrincipal () {

		// DISEÑO

		setTitle("CALCULADORA DE RAICES - Alejandra Moreano Vásquez");
		setSize(1300,550);
		setVisible(true);
		setResizable(true);
		setLayout(new GridLayout(2,2));
		//setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// CREACIÓN DE OBJETOS (PANELES)

		panelImagenCuadratica = new PanelImagenCuadratica(); 
		panelDatosCuadratica = new PanelDatosCuadratica();
		panelResultadosCuadratica = new PanelResultadosCuadratica(this); 

		panelDatosMetodosCerrados = new PanelDatosMetodosCerrados();
		panelResultadosMetodosCerrados = new PanelResultadosMetodosCerrados(this);

		panelDatosMetodosAbiertos = new PanelDatosMetodosAbiertos();
		panelResultadosMetodosAbiertos = new PanelResultadosMetodosAbiertos(this);

		// CREACIÓN DE OBJETOS (PANELES) FINALES O PRESENTABLES

		// CUADRÁTICA
		JPanel panelCuadratica = new JPanel ();

		TitledBorder borde1 = BorderFactory.createTitledBorder("MÉTODO CUADRÁTICO:");
		panelCuadratica.setBorder(borde1);
		borde1.setTitleColor(Color.BLUE);

		panelCuadratica.setLayout(new GridLayout(2,1));

		//panelCuadratica.add(panelImagenCuadratica);
		panelCuadratica.add(panelDatosCuadratica);
		panelCuadratica.add(panelResultadosCuadratica);

		// MÉTODOS CERRADOS		
		JPanel panelMetodosCerrados = new JPanel ();

		TitledBorder borde2 = BorderFactory.createTitledBorder("MÉTODOS CERRADOS:");
		panelMetodosCerrados.setBorder(borde2);
		borde2.setTitleColor(Color.BLUE);

		panelMetodosCerrados.setLayout(new GridLayout(2,1));

		panelMetodosCerrados.add(panelDatosMetodosCerrados);
		panelMetodosCerrados.add(panelResultadosMetodosCerrados);

		// MÉTODOS ABIERTOS
		JPanel panelMetodosAbiertos = new JPanel ();

		TitledBorder borde3 = BorderFactory.createTitledBorder("MÉTODOS ABIERTOS:");
		panelMetodosAbiertos.setBorder(borde3);
		borde3.setTitleColor(Color.BLUE);

		panelMetodosAbiertos.setLayout(new GridLayout(2,1));

		panelMetodosAbiertos.add(panelDatosMetodosAbiertos);
		panelMetodosAbiertos.add(panelResultadosMetodosAbiertos);

		// ADICIONAR OBJETOS

		add(panelCuadratica);
		add(panelImagenCuadratica);
		add(panelMetodosCerrados);
		add(panelMetodosAbiertos);

	}

	// MÉTODOS PARA LA CUADRÁTICA

	public Cuadratica crearObjetoCuadratica () {
		try {
			double a = Double.parseDouble(panelDatosCuadratica.getTxtA());
			double b = Double.parseDouble(panelDatosCuadratica.getTxtB());
			double c = Double.parseDouble(panelDatosCuadratica.getTxtC());
			if (4*a*c < b*b) {
				objetoCuadratica = new Cuadratica (a, b, c);
			} else {
				JOptionPane.showMessageDialog(this, "Datos inválidos. Por favor verificar y corregir.", "Error", JOptionPane.ERROR_MESSAGE);
				return null;
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Tipo de dato(s) ingresado(s) incorrecto(s) o dato(s) incompletos. Por favor verificar y corregir.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		return objetoCuadratica;
	}

	public void calcularRaiz1() {
		if (crearObjetoCuadratica()!=null) {
			try {
				double res = crearObjetoCuadratica().raiz1();
				panelResultadosCuadratica.setTxtRaiz1(""+dfDouble.format(res));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		} 
	}

	public void calcularRaiz2() {

		if (crearObjetoCuadratica()!=null) {
			try {
				double res = crearObjetoCuadratica().raiz2();
				panelResultadosCuadratica.setTxtRaiz2(""+dfDouble.format(res));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	public void limpiarResultadosCuadratica() {
		panelResultadosCuadratica.setTxtRaiz1(" ");
		panelResultadosCuadratica.setTxtRaiz2(" ");
	}

	public void limpiarTodoPanelCuadratica() {
		panelDatosCuadratica.setTxtA(" ");
		panelDatosCuadratica.setTxtB(" ");
		panelDatosCuadratica.setTxtC(" ");
		panelResultadosCuadratica.setTxtRaiz1(" ");
		panelResultadosCuadratica.setTxtRaiz2(" ");
	}

	// FUNCIONES PARA LOS MÉTODOS CERRADOS

	public Metodos crearObjetoMetodosCerrados () {

		double errorPermitido;
		double li;
		double ls;

		String funcion = panelDatosMetodosCerrados.getTxtFuncion();
		try {
			li = Double.parseDouble(panelDatosMetodosCerrados.getTxtLimiteInferior());
			ls = Double.parseDouble(panelDatosMetodosCerrados.getTxtLimiteSuperior());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Tipo de dato(s) ingresado(s) incorrecto(s) o dato(s) incompletos. Por favor verificar y corregir.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		try {
			errorPermitido = Double.parseDouble(panelDatosMetodosCerrados.getTxtErrorPermitido());
		} catch (Exception e){
			errorPermitido = 0.00001; 
		}
		Metodos objetoMetodosCerrados = new Metodos (funcion, li, ls, errorPermitido);
		return objetoMetodosCerrados;

	}

	public void calcularRaizMedianteBiseccion() {
		if (crearObjetoMetodosCerrados()!=null) {
			try {
				double res = crearObjetoMetodosCerrados().biseccion();
				panelResultadosMetodosCerrados.setTxtBiseccion(""+dfDouble.format(res));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}	
		}

	}

	public void calcularRaizMedianteFalsaPosicion() {
		if (crearObjetoMetodosCerrados()!=null) {
			try {
				double res = crearObjetoMetodosCerrados().falsaPosicion();
				panelResultadosMetodosCerrados.setTxtFalsaPosicion(""+dfDouble.format(res));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}	
		}

	}

	public void limpiarResultadosCerrados() {
		panelResultadosMetodosCerrados.setTxtBiseccion(" ");
		panelResultadosMetodosCerrados.setTxtFalsaPosicion(" ");
	}

	public void limpiarTodoPanelCerrados() {
		panelDatosMetodosCerrados.setTxtFuncion(" ");
		panelDatosMetodosCerrados.setTxtLimiteInferior(" ");
		panelDatosMetodosCerrados.setTxtLimiteSuperior(" ");
		panelDatosMetodosCerrados.setTxtErrorPermitido("Por defecto, este es de 0.00001");
		panelResultadosMetodosCerrados.setTxtBiseccion(" ");
		panelResultadosMetodosCerrados.setTxtFalsaPosicion(" ");
	}

	// FUNCIONES PARA LOS MÉTODOS ABIERTOS

	public Metodos crearObjetoMetodoPunto () {

		String funcionTransformada;
		double valorInicial;
		double errorPermitido;

		String funcion = panelDatosMetodosAbiertos.getTxtFuncion();
		if (panelDatosMetodosAbiertos.getTxtFuncionTransformada().equals("") || panelDatosMetodosAbiertos.getTxtFuncionTransformada().equals("Por defecto, es la función + x") ) {
			funcionTransformada = funcion + "+x";
		} else {
			funcionTransformada = panelDatosMetodosAbiertos.getTxtFuncionTransformada();
		}
		try {
			valorInicial = Double.parseDouble(panelDatosMetodosAbiertos.getTxtValorInicial());	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Tipo de dato(s) ingresado(s) incorrecto(s) o dato(s) incompletos. Por favor verificar y corregir.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		try {
			errorPermitido = Double.parseDouble(panelDatosMetodosAbiertos.getTxtErrorPermitido());
		} catch (Exception e){
			errorPermitido = 0.00001; 
		}
		Metodos objetoMetodoPuntoFijo = new Metodos (funcion, funcionTransformada, valorInicial, errorPermitido);
		return objetoMetodoPuntoFijo;
	}

	public void calcularRaizMediantePuntoFijo() {
		if (crearObjetoMetodoPunto()!=null) {
			try {
				double res = crearObjetoMetodoPunto().puntoFijo();
				if (res == -1111) {
					JOptionPane.showMessageDialog(this, "Esta función no converge.", "Error", JOptionPane.ERROR_MESSAGE);
					panelResultadosMetodosAbiertos.setTxtPuntoFijo("Esta función no converge.");
				} else {
					panelResultadosMetodosAbiertos.setTxtPuntoFijo(""+dfDouble.format(res));
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	public Metodos crearObjetoNewton () {

		double errorPermitido;
		double valorInicial;

		String funcion = panelDatosMetodosAbiertos.getTxtFuncion();
		try {
			valorInicial = Double.parseDouble(panelDatosMetodosAbiertos.getTxtValorInicial());	
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Tipo de dato(s) ingresado(s) incorrecto(s) o dato(s) incompletos. Por favor verificar y corregir.", "Error", JOptionPane.ERROR_MESSAGE);
			return null;
		}
		try {
			errorPermitido = Double.parseDouble(panelDatosMetodosAbiertos.getTxtErrorPermitido());
		} catch (Exception e){
			errorPermitido = 0.00001; 
		}
		Metodos objetoMetodoNewton = new Metodos (funcion, valorInicial, errorPermitido);
		return objetoMetodoNewton;
	}

	public void calcularRaizMedianteNewton() {
		if (crearObjetoNewton()!=null) {
			try {
				double res = crearObjetoNewton().newton();
				panelResultadosMetodosAbiertos.setTxtNewton(""+dfDouble.format(res));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
			}
		}

	}

	public void limpiarResultadosAbiertos() {
		panelResultadosMetodosAbiertos.setTxtPuntoFijo(" ");
		panelResultadosMetodosAbiertos.setTxtNewton(" ");
	}

	public void limpiarTodoPanelAbiertos() {
		panelDatosMetodosAbiertos.setTxtFuncion(" ");
		panelDatosMetodosAbiertos.setTxtFuncionTransformada("Por defecto, es la función + x");
		panelDatosMetodosAbiertos.setTxtValorInicial(" ");
		panelDatosMetodosAbiertos.setTxtErrorPermitido("Por defecto, este es de 0.00001");
		panelResultadosMetodosAbiertos.setTxtPuntoFijo(" ");
		panelResultadosMetodosAbiertos.setTxtNewton(" ");
	}

	// MAIN

	public static void main (String [] args) {	
		InterfazPrincipal interfazPrincipal = new InterfazPrincipal ();
		interfazPrincipal.setVisible(true);
	}

}
