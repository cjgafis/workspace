package Interfaz;

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

public class PanelMetodosC extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	private JLabel labXi;
	private JTextField txtXi;
	private JLabel labXs;
	private JTextField txtXs;
	private JLabel labVacio1; 
	private JButton butBiseccion;
	private JLabel labResultado1;
	private JTextField txtBiseccion;
	private JLabel labVacio2;
	private JButton butFPosicion;
	private JLabel labResultado2;
	private JTextField txtFPosicion;
	private PanelMetodos panelMetodos;
	
	//CONSTRUCTOR
	public PanelMetodosC(PanelMetodos panelMetodos)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos cerrados");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3,4));
		
		//INSTANCIAR
		this.panelMetodos = panelMetodos; 
		labXi = new JLabel("Limite inferior");
		txtXi = new JTextField("");
		labXs = new JLabel("Limite superior");
		txtXs = new JTextField("");
		labVacio1 = new JLabel("");
		butBiseccion = new JButton("Biseccion");
		butBiseccion.addActionListener(this);
		labResultado1 = new JLabel("Resultado Xr");
		txtBiseccion = new JTextField("");
		txtBiseccion.setEditable(false);
		labVacio2 = new JLabel("");
		butFPosicion = new JButton("F.Posicion");
		butFPosicion.addActionListener(this);
		labResultado2 = new JLabel("Resultado Xr");
		txtFPosicion = new JTextField("");
		txtFPosicion.setEditable(false);
		
		//ADICIONAR
		add(labXi);
		add(txtXi);
		add(labXs);
		add(txtXs);
		add(labVacio1);
		add(butBiseccion);
		add(labVacio2);
		add(butFPosicion);
		add(labResultado1);
		add(txtBiseccion);
		add(labResultado2);
		add(txtFPosicion);
	}

	public double getXi() 
	{
		return Double.parseDouble(txtXi.getText());
	}

	public void setXi() 
	{
		txtXi.setText("");
	}

	public double getXs() 
	{
		return Double.parseDouble(txtXs.getText());
	}

	public void setXs() 
	{
		txtXs.setText("");
	}

	public double getBiseccion() 
	{
		return Double.parseDouble(txtBiseccion.getText());
	}

	public void setBiseccion(String respuesta) 
	{
		txtBiseccion.setText(respuesta);
	}

	public double getFPosicion() 
	{
		return Double.parseDouble(txtFPosicion.getText());
	}

	public void setFPosicion(String respuesta) 
	{
		txtFPosicion.setText(respuesta);
	}
	public void limpiar()
	{
		setXi();
		setXs();
		txtBiseccion.setText("");
		txtFPosicion.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == butBiseccion)
		{
			panelMetodos.biseccion();
		}
		if (e.getSource() == butFPosicion)
		{
			panelMetodos.falsaPosicion();
		}
	}
	
	
}
