package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import mundo.Metodos;

public class PanelAbiertos extends JPanel implements ActionListener
{
	private JLabel labFuncion;
	private JTextField txtFuncion;	
	private JLabel labValorXi;
	private JTextField txtValorXi;		
	private JLabel labRaiz;
	private JTextField txtRaiz;	
	private JButton butPuntoFijo;
	private JButton butNewton;
	private JButton butLimpiar;
	private JLabel labVacio;
	private InterfazMetodos ventana;
	Metodos mundo;

	public PanelAbiertos(InterfazMetodos ventana)
	{
		this.ventana = ventana;

		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5, 2));

		// CREAMOS LOS OBJETOS
		labFuncion = new JLabel("Funcion");
		txtFuncion = new JTextField();	
		labValorXi = new JLabel("Valor inicial de x");
		txtValorXi = new JTextField();	
			
		labRaiz = new JLabel("Raiz");
		txtRaiz = new JTextField();	
		butPuntoFijo = new JButton("Punto Fijo");
		butPuntoFijo.addActionListener(this);
		butNewton = new JButton("Newton Raphson");
		butNewton.addActionListener(this);
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		labVacio = new JLabel("");

		// ADICIONAMOS LOS OBJETOS AL DISEÃ‘O
		add(labFuncion);
		add(txtFuncion);
		add(labValorXi);
		add(txtValorXi);
		
		add(labRaiz);
		add(txtRaiz);
		add(butPuntoFijo);
		add(butNewton);
		add(labVacio);
		add(butLimpiar);
		
	}
	
	
	public void limpiar()
	{
			txtFuncion.setText("");
			txtValorXi.setText("");
			
			txtRaiz.setText("");
	}
	public void calcularResultadoPuntoFijo()
	{
	String funcionGx = txtFuncion.getText();
	double x0 = Double.parseDouble(txtValorXi.getText());
	try
	{
		Double resultado = mundo.puntoFijo(funcionGx, x0);
		
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(this, "Error en la funcion");
	}
	}
	
	public void calcularResultadoNewton()
	{
	String funcion = txtFuncion.getText();
	double xi = Double.parseDouble(txtValorXi.getText());
	try
	{
		Double resultado = mundo.newton(funcion, xi);
		
	}
	catch(Exception e)
	{
		JOptionPane.showMessageDialog(this, "Error en la funcion");
	}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand().equals("Punto Fijo"))
		{
			calcularResultadoPuntoFijo();
			
		}
		else if(e.getActionCommand().equals("Newton Raphson"))
		{
			calcularResultadoNewton();
			
		}
		else if(e.getSource() == butLimpiar)
		{
			ventana.limpiarAbiertos();
			
		}


	}
}
