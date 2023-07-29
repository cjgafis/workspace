package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelMetodosA extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	private JLabel labV1;
	private JLabel labFuncion;
	private JTextArea txtAfuncion;
	private JLabel labV2;
	private JLabel labXi;
	private JTextField txtXi;
	private JLabel labXs;
	private JTextField txtXs;
	private JButton butDerivada;
	private JTextField txtDerivada;
	private JButton butPuntoFijo;
	private JTextField txtPuntoFijo;
	private JButton butNR;
	private JTextField txtNR;
	private JButton butSecante;
	private JTextField txtSecante;
	private PanelMetodos panelMetodos;
	
	public PanelMetodosA(PanelMetodos panelMetodos)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(4,4));
		
		//INSTANCIAR
		this.panelMetodos = panelMetodos; 
		labV1 = new JLabel("");
		labFuncion = new JLabel("Funcion");
		txtAfuncion = new JTextArea("");
		JScrollPane sp = new JScrollPane(txtAfuncion);
		labV2 = new JLabel("");
		labXi = new JLabel("Xi");
		txtXi = new JTextField("");
		labXs = new JLabel("Xs");
		txtXs = new JTextField("");
		butDerivada = new JButton("Derivada");
		butDerivada.addActionListener(this);
		txtDerivada = new JTextField("");
		txtDerivada.setEditable(false);
		butPuntoFijo = new JButton("Punto fijo");
		butPuntoFijo.addActionListener(this);
		txtPuntoFijo = new JTextField("");
		txtPuntoFijo.setEditable(false);
		butNR = new JButton("N.Raphson");
		butNR.addActionListener(this);
		txtNR = new JTextField("");
		txtNR.setEditable(false);
		butSecante = new JButton("Secante");
		butSecante.addActionListener(this);
		txtSecante = new JTextField("");
		txtSecante.setEditable(false);
		
		//ADICIONAR
		add(labV1);
		add(labFuncion);
		add(sp);
		add(labV2);
		add(labXi);
		add(txtXi);
		add(labXs);
		add(txtXs);
		add(butDerivada);
		add(txtDerivada);
		add(butPuntoFijo);
		add(txtPuntoFijo);
		add(butNR);
		add(txtNR);
		add(butSecante);
		add(txtSecante);
	}
	
	public String getFuncion()
	{
		return	txtAfuncion.getText();
	}
	public void setFuncion()
	{
		txtAfuncion.setText("");
	}
	public double getXi()
	{
		return	Double.parseDouble(txtXi.getText());
	}
	public void setXi()
	{
		txtXi.setText("");
	}
	public double getXs()
	{
		return	Double.parseDouble(txtXs.getText());
	}
	public void setXs()
	{
		txtXs.setText("");
	}
	public void setDerivada(String respuesta)
	{
		txtDerivada.setText(respuesta);
	}
	public void setPuntoFijo(String respuesta)
	{
		txtPuntoFijo.setText(respuesta);
	}
	public void setNR(String respuesta)
	{
		txtNR.setText(respuesta);
	}
	public void setSecante(String respuesta)
	{
		txtSecante.setText(respuesta);
	}
	
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource() == butDerivada)
		{
			panelMetodos.derivada();
		}
		if(arg0.getSource() == butPuntoFijo)
		{
			panelMetodos.puntoFijo();
		}
		if(arg0.getSource() == butNR)
		{
			panelMetodos.NR();
		}
		if(arg0.getSource() == butSecante)
		{
			panelMetodos.secante();
		}
	}
	
}
