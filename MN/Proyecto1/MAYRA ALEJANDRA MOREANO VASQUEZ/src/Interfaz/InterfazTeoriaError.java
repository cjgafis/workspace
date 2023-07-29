package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import Mundo.TeoriaError;

public class InterfazTeoriaError extends JFrame {

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private PanelDatos panelDatos; 
	private PanelOperaciones panelOperaciones; 
	//private PanelResultados panelResultados;
	private TeoriaError objeto; 
	DecimalFormat dfDouble = new DecimalFormat ("#.####");
	DecimalFormat dfPorcentaje = new DecimalFormat ("#.##%");

	public InterfazTeoriaError () {
		
		// DISEÑO
		setTitle("TEORÍA DEL ERROR");
		setVisible(true);
		setResizable(true);
		setSize(500,300);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// CREACIÓN DE OBJETOS
		panelDatos = new PanelDatos(); 
		panelOperaciones = new PanelOperaciones(this);
		//panelResultados = new PanelResultados(this); 
		
		//ADICIONAR OBJETOS
		add(panelDatos, BorderLayout.CENTER);
		add(panelOperaciones, BorderLayout.SOUTH);
		//add(panelResultados, BorderLayout.SOUTH);

	}
	
	public TeoriaError crearObjeto () {
		objeto = new TeoriaError (panelDatos.getTxtValorVerdaderoEnDouble(), panelDatos.getTxtMedidasEnArray());
		return objeto;
	}
	
	public void calcularPr() {
		//double pr = crearObjeto().calcularPr();
		//panelDatos.setTxtMedidaPromedio(""+dfDouble.format(pr));
		try {
			double pr = crearObjeto().calcularPr();
			panelDatos.setTxtMedidaPromedio(""+dfDouble.format(pr));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}		
	}

	public void calcularEa() {
		try {
			double ea = crearObjeto().calcularEa();
			panelDatos.setTxtErrorAbsoluto(""+dfDouble.format(ea));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}		
	}

	public void calcularEr() {
		try {
			double er = crearObjeto().calcularEr();
			panelDatos.setTxtErrorRelativo(""+dfDouble.format(er));		

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void calcularEe() {
		try {
			double ee = crearObjeto().calcularEe();
			panelDatos.setTxtErrorExactitud(""+dfPorcentaje.format(ee));		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void calcularE() {
		try {
			double e = crearObjeto().calcularE();
			panelDatos.setTxtExactitud(""+dfPorcentaje.format(e));		
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void calcularMl() {
		double ml;
		try {
			ml = crearObjeto().calcularMl();
			panelDatos.setTxtMedidaLejana(""+dfDouble.format(ml));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void calcularEp() {
		double ep;
		try {
			ep = crearObjeto().calcularEp();
			panelDatos.setTxtErrorPrecision(""+dfPorcentaje.format(ep));
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	public void calcularP() {
		double p;
		try {
			p = crearObjeto().calcularP();
			panelDatos.setTxtPrecision(""+dfPorcentaje.format(p));

		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void limpiar() {
		panelDatos.setTxtValorVerdadero("");
		panelDatos.setTxtMedidas("");
		panelDatos.setTxtMedidaPromedio("");
		panelDatos.setTxtMedidaLejana("");
		panelDatos.setTxtErrorAbsoluto("");
		panelDatos.setTxtErrorRelativo("");
		panelDatos.setTxtErrorExactitud("");
		panelDatos.setTxtExactitud("");
		panelDatos.setTxtErrorPrecision("");
		panelDatos.setTxtPrecision("");
	}
	
	public static void main (String [] args) {	
		InterfazTeoriaError interfazTeoriaError = new InterfazTeoriaError ();
		interfazTeoriaError.setVisible(true);
	}
	
}
