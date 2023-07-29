package interfaz;

import mundo.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazCalculadora extends JFrame {

	private PanelDatos panelDatos;
	private PanelOperaciones panelOperaciones;
	private PanelResultados panelResultados;

	public InterfazCalculadora() {
		setTitle("Calculadora");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());

		panelDatos = new PanelDatos();
		panelOperaciones = new PanelOperaciones();
		panelResultados = new PanelResultados();

		add(panelDatos, BorderLayout.NORTH);
		add(panelOperaciones, BorderLayout.CENTER);
		add(panelResultados, BorderLayout.SOUTH);

		panelOperaciones.getBtnSumar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = panelDatos.getNumero1();
				double numero2 = panelDatos.getNumero2();
				Calculadora calculadora = new Calculadora(numero1, numero2);
				double resultado = calculadora.sumar();
				panelResultados.mostrarResultado(Double.toString(resultado));
			}
		});

		panelOperaciones.getBtnRestar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = panelDatos.getNumero1();
				double numero2 = panelDatos.getNumero2();
				Calculadora calculadora = new Calculadora(numero1, numero2);
				double resultado = calculadora.restar();
				panelResultados.mostrarResultado(Double.toString(resultado));
			}
		});

		panelOperaciones.getBtnMultiplicar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = panelDatos.getNumero1();
				double numero2 = panelDatos.getNumero2();
				Calculadora calculadora = new Calculadora(numero1, numero2);
				double resultado = calculadora.multiplicar();
				panelResultados.mostrarResultado(Double.toString(resultado));
			}
		});

		panelOperaciones.getBtnDividir().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				double numero1 = panelDatos.getNumero1();
				double numero2 = panelDatos.getNumero2();
				Calculadora calculadora = new Calculadora(numero1, numero2);
				try {
					double resultado = calculadora.dividir();
					panelResultados.mostrarResultado(Double.toString(resultado));
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
				}
			}
		});

		panelResultados.getBtnLimpiar().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				panelDatos.limpiarCampos();
				panelResultados.limpiarResultado();
			}
		});
	}

	public static void main(String[] args) {
		InterfazCalculadora interfazCalculadora = new InterfazCalculadora();
		interfazCalculadora.setVisible(true);
	}
}

