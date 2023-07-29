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

import mundo.CalculoRaiz;

public class PanelAbiertos extends JPanel implements ActionListener
{
	//Atributos
	
	private JLabel labFuncion;
	private JTextField txtFuncion;	
	private JLabel labValorxi;
	private JTextField txtvalorxi;	
	private JLabel labRaiz2;
	private JTextField txtRaiz2;	
	
	private JButton butPuntoFijo;
	private JButton butNewtonRaphson;
	private JButton butlimpiar;
	private JButton butlimpiarAll;
	
	private InterfazCalculoRaiz ventana;
	private PanelCuadratica cuadratica;
	private PanelCerrados cerrados;
	
	public PanelAbiertos(InterfazCalculoRaiz ventana)
	{
		this.ventana = ventana;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos Abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.RED);
		setLayout(new GridLayout(5, 2));

		// CREAMOS LOS OBJETOS
		labFuncion = new JLabel("Funcion");
		txtFuncion = new JTextField();	
		labValorxi = new JLabel("Valor (xi)");
		txtvalorxi = new JTextField();	
		labRaiz2 = new JLabel("Raiz");
		txtRaiz2 = new JTextField();	
		butPuntoFijo = new JButton("Punto Fijo");
		butPuntoFijo.addActionListener(this);
		butNewtonRaphson = new JButton("Newton-Raphson");
		butNewtonRaphson.addActionListener(this);
		butlimpiar = new JButton("limpiar");
		butlimpiar.addActionListener(this);
		butlimpiarAll = new JButton("limpiar All");
		butlimpiarAll.addActionListener(this);

		// ADICIONAMOS LOS OBJETOS AL DISEÑO
		add(labFuncion);
		add(txtFuncion);
		add(labValorxi);
		add(txtvalorxi);
		add(labRaiz2);
		add(txtRaiz2);
		add(butPuntoFijo);
		add(butNewtonRaphson);
		add(butlimpiar);
		add(butlimpiarAll);
	}

	// Metodo para obtener y escribir informacion en los campos de texto
	
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
			txtRaiz2.setText("" + raiz);
		}
		
		public void clear()
		{
			txtFuncion.setText("");
			txtvalorxi.setText("");
			txtRaiz2.setText("");
		}
		
		public void clearAll()
		{
			txtFuncion.setText("");
			txtvalorxi.setText("");
			txtRaiz2.setText("");
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
			else 
				if(e.getSource() == butPuntoFijo)
				{
					//javax.swing.JOptionPane.showMessageDialog(null, " pulso boton fijo");
					ventana.puntoFijo();
				}
				else 
					if(e.getSource() == butlimpiar)
					{
						ventana.limpiarAbiertos();
					}		
					else 
						if(e.getSource() == butlimpiarAll)
						{
							ventana.limpiarCerrados();
							ventana.limpiarAbiertos();
							ventana.limpiarCuadratica();
						}
			}
}
