package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCerrados extends JPanel implements ActionListener
{
	// ATRIBUTOS
		private JLabel labFuncion;
		private JTextField txtFuncion;	
		private JLabel labLimiteInferior;
		private JTextField txtLimiteInferior;	
		private JLabel labLimiteSuperior;
		private JTextField txtLimiteSuperior;	
		private JLabel labRaiz;
		private JTextField txtRaiz;	
		private JButton butBiseccion;
		private JButton butFalsaPosicion;
		private JLabel labVacio;
		private JButton butLimpiar;
		private InterfazCalculoRaiz ventana;

		public PanelCerrados(InterfazCalculoRaiz ventana)
		{
			this.ventana = ventana;

			// DISEÑO
			TitledBorder borde = BorderFactory.createTitledBorder("Métodos cerrados");
			setBorder(borde);
			borde.setTitleColor(Color.BLUE);
			setLayout(new GridLayout(6, 2));

			// CREAMOS LOS OBJETOS
			labFuncion = new JLabel("Función");
			txtFuncion = new JTextField();	
			labLimiteInferior = new JLabel("Limite inferior");
			txtLimiteInferior = new JTextField();	
			labLimiteSuperior = new JLabel("Limite superior");
			txtLimiteSuperior = new JTextField();	
			labRaiz = new JLabel("Raiz");
			txtRaiz = new JTextField();	
			butBiseccion = new JButton("Bisección");
			butBiseccion.addActionListener(this);
			butFalsaPosicion = new JButton("Falsa Posición");
			butFalsaPosicion.addActionListener(this);
			labVacio = new JLabel("");
			butLimpiar = new JButton("Limpiar");
			butLimpiar.addActionListener(this);

			// ADICIONAMOS LOS OBJETOS AL DISEÑO
			add(labFuncion);
			add(txtFuncion);
			add(labLimiteInferior);
			add(txtLimiteInferior);
			add(labLimiteSuperior);
			add(txtLimiteSuperior);
			add(labRaiz);
			add(txtRaiz);
			add(butBiseccion);
			add(butFalsaPosicion);
			add(labVacio);
			add(butLimpiar);
		}

		// METODOS PARA OBTERNER Y ESCRIBIR INFORMACIÓN 
		// EN LOS CAMPOS DE TEXTO
		
		public String getTxtFuncion()
		{
			return txtFuncion.getText(); 
		}
		
		public String getTxtLimiteInferior()
		{
			return txtLimiteInferior.getText(); 
		}
		
		public String getTxtLimiteSuperior()
		{
			return txtLimiteSuperior.getText(); 
		}
		
		public void setTxtRaiz(double raiz)
		{
			txtRaiz.setText("" + raiz);
		}
		
		public void limpiar()
		{
			txtFuncion.setText("");
			txtLimiteInferior.setText("");
			txtLimiteSuperior.setText("");
			txtRaiz.setText("");
		}
	
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == butBiseccion)
		{
			ventana.biseccion();
		}
		else if(e.getSource() == butFalsaPosicion)
		{
			ventana.falsaPosicion();
		}
		else if(e.getSource() == butLimpiar)
		{
			ventana.limpiarCerrados();
		}
		
	}
	
}
