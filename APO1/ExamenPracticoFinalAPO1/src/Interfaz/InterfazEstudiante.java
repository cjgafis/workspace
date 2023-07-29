package Interfaz;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import mundo.Estudiante;
import mundo.Nota;

public class InterfazEstudiante extends JFrame
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private PanelPrimerCorte panelPrimerCorte;
	private PanelSegundoCorte panelSegundoCorte;
	private PanelTercerCorte panelTercerCorte;
	private PanelOperaciones panelOperaciones;
	private Estudiante estudiante;

	public InterfazEstudiante() 
	{
		// DISEÑO
		setTitle("Mis notas de APO1 - Nombre y codigo estudiante");
		setSize(450, 300);
		setVisible(true);
		setResizable(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4, 1));

		// CREAR LOS OBJETOS
		panelPrimerCorte = new PanelPrimerCorte();
		add(panelPrimerCorte);

		panelSegundoCorte = new PanelSegundoCorte();
		add(panelSegundoCorte);

		panelTercerCorte = new PanelTercerCorte();
		add(panelTercerCorte);

		panelOperaciones = new PanelOperaciones(this);
		add(panelOperaciones);
	}

	/**
	 * Método para validar si el texto en un JTextField es numérico (int o double)
	 *
	 * @param field JTextField que se va a validar
	 * @return true si el texto es numérico, false de lo contrario
	 */
	public static boolean isNumeric(JTextField field) 
	{
		String text = field.getText();
		if (text == null || text.isEmpty()) 
		{
			return false;
		}

		try 
		{
			Double.parseDouble(text);
			return true;
		} 
		catch (NumberFormatException e) 
		{
			return false;
		}
	}

	public void calcularNotaPrimerCorte()
	{
		if(isNumeric(panelPrimerCorte.getTxtNotaTeorica()) &&
				isNumeric(panelPrimerCorte.getTxtPorcentaje1()) &&
				isNumeric(panelPrimerCorte.getTxtNotaPractica()) &&
				isNumeric(panelPrimerCorte.getTxtPorcentaje2()) &&
				isNumeric(panelSegundoCorte.getTxtNotaTeorica()) &&
				isNumeric(panelSegundoCorte.getTxtPorcentaje1()) &&
				isNumeric(panelSegundoCorte.getTxtNotaPractica()) &&
				isNumeric(panelSegundoCorte.getTxtPorcentaje2()) &&
				isNumeric(panelTercerCorte.getTxtNotaTeorica()) &&
				isNumeric(panelTercerCorte.getTxtPorcentaje1()) &&
				isNumeric(panelTercerCorte.getTxtNotaPractica()) &&
				isNumeric(panelTercerCorte.getTxtPorcentaje2()))
		{
			// Instanciar al estudiante
			double t1 = Double.parseDouble(panelPrimerCorte.getNotaTeorica());
			double pt1 = Double.parseDouble(panelPrimerCorte.getPorcentaje1());
			double p1 = Double.parseDouble(panelPrimerCorte.getNotaPractica());
			double pp1 = Double.parseDouble(panelPrimerCorte.getPorcentaje2());
			Nota pct = new Nota(t1, pt1);
			Nota pcp = new Nota(p1, pp1);

			double t2 = Double.parseDouble(panelSegundoCorte.getNotaTeorica());
			double pt2 = Double.parseDouble(panelSegundoCorte.getPorcentaje1());
			double p2 = Double.parseDouble(panelSegundoCorte.getNotaPractica());
			double pp2 = Double.parseDouble(panelSegundoCorte.getPorcentaje2());
			Nota sct = new Nota(t2, pt2);
			Nota scp = new Nota(p2, pp2);

			double t3 = Double.parseDouble(panelTercerCorte.getNotaTeorica());
			double pt3 = Double.parseDouble(panelTercerCorte.getPorcentaje1());
			double p3 = Double.parseDouble(panelTercerCorte.getNotaPractica());
			double pp3 = Double.parseDouble(panelTercerCorte.getPorcentaje2());
			Nota tct = new Nota(t3, pt3);
			Nota tcp = new Nota(p3, pp3);

			estudiante = new Estudiante(pct, pcp, sct, scp, tct, tcp); 
			double respuesta = estudiante.calcularNotaPrimerCorte();
			panelOperaciones.setTxtRespuesta(respuesta);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Todas las notas y porcentajes deben estar agregados correctamente. ¡Verifique!2");
		}
	}

	public void calcularNotaSegundoCorte()
	{
		// Instanciar al estudiante
		double t1 = Double.parseDouble(panelPrimerCorte.getNotaTeorica());
		double pt1 = Double.parseDouble(panelPrimerCorte.getPorcentaje1());
		double p1 = Double.parseDouble(panelPrimerCorte.getNotaPractica());
		double pp1 = Double.parseDouble(panelPrimerCorte.getPorcentaje2());
		Nota pct = new Nota(t1, pt1);
		Nota pcp = new Nota(p1, pp1);

		double t2 = Double.parseDouble(panelSegundoCorte.getNotaTeorica());
		double pt2 = Double.parseDouble(panelSegundoCorte.getPorcentaje1());
		double p2 = Double.parseDouble(panelSegundoCorte.getNotaPractica());
		double pp2 = Double.parseDouble(panelSegundoCorte.getPorcentaje2());
		Nota sct = new Nota(t2, pt2);
		Nota scp = new Nota(p2, pp2);

		double t3 = Double.parseDouble(panelTercerCorte.getNotaTeorica());
		double pt3 = Double.parseDouble(panelTercerCorte.getPorcentaje1());
		double p3 = Double.parseDouble(panelTercerCorte.getNotaPractica());
		double pp3 = Double.parseDouble(panelTercerCorte.getPorcentaje2());
		Nota tct = new Nota(t3, pt3);
		Nota tcp = new Nota(p3, pp3);

		estudiante = new Estudiante(pct, pcp, sct, scp, tct, tcp); 
		double respuesta = estudiante.calcularNotaSegundoCorte();
		panelOperaciones.setTxtRespuesta(respuesta);
	}

	public void calcularNotaTercerCorte()
	{
		// Instanciar al estudiante
		double t1 = Double.parseDouble(panelPrimerCorte.getNotaTeorica());
		double pt1 = Double.parseDouble(panelPrimerCorte.getPorcentaje1());
		double p1 = Double.parseDouble(panelPrimerCorte.getNotaPractica());
		double pp1 = Double.parseDouble(panelPrimerCorte.getPorcentaje2());
		Nota pct = new Nota(t1, pt1);
		Nota pcp = new Nota(p1, pp1);

		double t2 = Double.parseDouble(panelSegundoCorte.getNotaTeorica());
		double pt2 = Double.parseDouble(panelSegundoCorte.getPorcentaje1());
		double p2 = Double.parseDouble(panelSegundoCorte.getNotaPractica());
		double pp2 = Double.parseDouble(panelSegundoCorte.getPorcentaje2());
		Nota sct = new Nota(t2, pt2);
		Nota scp = new Nota(p2, pp2);

		double t3 = Double.parseDouble(panelTercerCorte.getNotaTeorica());
		double pt3 = Double.parseDouble(panelTercerCorte.getPorcentaje1());
		double p3 = Double.parseDouble(panelTercerCorte.getNotaPractica());
		double pp3 = Double.parseDouble(panelTercerCorte.getPorcentaje2());
		Nota tct = new Nota(t3, pt3);
		Nota tcp = new Nota(p3, pp3);

		estudiante = new Estudiante(pct, pcp, sct, scp, tct, tcp); 
		double respuesta = estudiante.calcularNotaTercerCorte();
		panelOperaciones.setTxtRespuesta(respuesta);
	}

	public void calcularNotaFinal()
	{
		// Instanciar al estudiante
		double t1 = Double.parseDouble(panelPrimerCorte.getNotaTeorica());
		double pt1 = Double.parseDouble(panelPrimerCorte.getPorcentaje1());
		double p1 = Double.parseDouble(panelPrimerCorte.getNotaPractica());
		double pp1 = Double.parseDouble(panelPrimerCorte.getPorcentaje2());
		Nota pct = new Nota(t1, pt1);
		Nota pcp = new Nota(p1, pp1);

		double t2 = Double.parseDouble(panelSegundoCorte.getNotaTeorica());
		double pt2 = Double.parseDouble(panelSegundoCorte.getPorcentaje1());
		double p2 = Double.parseDouble(panelSegundoCorte.getNotaPractica());
		double pp2 = Double.parseDouble(panelSegundoCorte.getPorcentaje2());
		Nota sct = new Nota(t2, pt2);
		Nota scp = new Nota(p2, pp2);

		double t3 = Double.parseDouble(panelTercerCorte.getNotaTeorica());
		double pt3 = Double.parseDouble(panelTercerCorte.getPorcentaje1());
		double p3 = Double.parseDouble(panelTercerCorte.getNotaPractica());
		double pp3 = Double.parseDouble(panelTercerCorte.getPorcentaje2());
		Nota tct = new Nota(t3, pt3);
		Nota tcp = new Nota(p3, pp3);

		estudiante = new Estudiante(pct, pcp, sct, scp, tct, tcp); 
		double respuesta = estudiante.calcularNotaFinal();
		panelOperaciones.setTxtRespuesta(respuesta);
	}

	public void limpiar()
	{
		panelPrimerCorte.limpiar();
		panelSegundoCorte.limpiar();
		panelTercerCorte.limpiar();
		panelOperaciones.limpiar();
	}

	public static void main(String[] args) 
	{
		InterfazEstudiante interfazEstudiante = new InterfazEstudiante();
		interfazEstudiante.setVisible(true);
	}
}
