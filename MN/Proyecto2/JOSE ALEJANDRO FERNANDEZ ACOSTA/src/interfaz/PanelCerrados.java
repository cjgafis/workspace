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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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

		// Diseño
		
		TitledBorder borde = BorderFactory.createTitledBorder("Métodos Cerrados");
		setBorder(borde);
		borde.setTitleColor(Color.CYAN);
		setLayout(new GridLayout(6, 2));

		// Crear Objetos
		
		labFuncion = new JLabel("Función");
		txtFuncion = new JTextField();	
		labLimiteInferior = new JLabel("Limite Inferior");
		txtLimiteInferior = new JTextField();	
		labLimiteSuperior = new JLabel("Limite Súperior");
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

		// Adicionar los Objetos
		
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

	// Método para obtener y escribir información en los campos de texto
	
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
