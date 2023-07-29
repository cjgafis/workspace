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

public class PanelAbiertos extends JPanel implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Atributos
	
	private JLabel labFuncion;
	private JTextField txtFuncion;	
	private JLabel labValorxi;
	private JTextField txtvalorxi;	
	private JLabel labRaiz;
	private JTextField txtRaiz;	
	
	private JButton butPuntoFijo;
	private JButton butNewtonRaphson;
	private JButton butClear;
	private JButton butClearAll;
	
	private InterfazCalculoRaiz ventana;
	private PanelCuadratica cuadratica;
	private PanelCerrados cerrados;
	
	public PanelAbiertos(InterfazCalculoRaiz ventana)
	{
		this.ventana = ventana;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Métodos Abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.CYAN);
		setLayout(new GridLayout(5, 2));

		// CREAMOS LOS OBJETOS
		labFuncion = new JLabel("Función");
		txtFuncion = new JTextField();	
		labValorxi = new JLabel("Valor (x0)");
		txtvalorxi = new JTextField();	
		labRaiz = new JLabel("Raiz");
		txtRaiz = new JTextField();	
		butPuntoFijo = new JButton("Punto Fijo");
		butPuntoFijo.addActionListener(this);
		butNewtonRaphson = new JButton("Newton-Raphson");
		butNewtonRaphson.addActionListener(this);
		butClear = new JButton("Clear");
		butClear.addActionListener(this);
		butClearAll = new JButton("Clear All");
		butClearAll.addActionListener(this);

		// ADICIONAMOS LOS OBJETOS AL DISEÑO
		add(labFuncion);
		add(txtFuncion);
		add(labValorxi);
		add(txtvalorxi);
		add(labRaiz);
		add(txtRaiz);
		add(butPuntoFijo);
		add(butNewtonRaphson);
		add(butClear);
		add(butClearAll);
	}

	// Método para obtener y escribir información en los campos de texto
	
		public String getTxtFuncion()
		{
			return txtFuncion.getText(); 
		}
		
		public String getTxtValorxi()
		{
			return txtvalorxi.getText(); 
		}
		
		public void setTxtRaiz(double raiz)
		{
			txtRaiz.setText("" + raiz);
		}
		
		public void clear()
		{
			txtFuncion.setText("");
			txtvalorxi.setText("");
			txtRaiz.setText("");
		}
		
		public void clearAll()
		{
			txtFuncion.setText("");
			txtvalorxi.setText("");
			txtRaiz.setText("");
			cuadratica.limpiar();
			cerrados.limpiar();
		}
		
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if(e.getSource() == butNewtonRaphson)
			{
				ventana.newtonRaphson();
			}
			else if(e.getSource() == butPuntoFijo)
			{
				ventana.puntoFijo();
			}
			else if(e.getSource() == butClear)
			{
				ventana.limpiarAbiertos();
			}
			
			else if(e.getSource() == butClearAll)
			{
				ventana.limpiarCerrados();
				ventana.limpiarAbiertos();
				ventana.limpiarCuadratica();
			}
		}
}
