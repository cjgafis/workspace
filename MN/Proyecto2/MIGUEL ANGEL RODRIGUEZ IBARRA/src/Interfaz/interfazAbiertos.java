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

public class interfazAbiertos extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;


	private JLabel labValorInicial;
	private JTextField txtinicial;

	private JLabel labDerivada;
	private JTextField txtDerivada;

	private JLabel labelFuncion;
	private JTextField txtFuncion;
	private JButton butLimpiarM;

	private JLabel labEF;
	private JTextField txtEF;

	private JLabel labEFD;
	private JTextField txtEFD;
	
	private JButton butNewtonRaphson;
	
	private Interfaz interfazProyec;

	public interfazAbiertos(Interfaz interfazP)
	{

		TitledBorder border = BorderFactory.createTitledBorder("CALCULO RAICES METODOS ABIERTOS NEWTON RAPHSON");
		setBorder(border);
		border.setTitleColor(Color.DARK_GRAY);
		setLayout(new GridLayout(2,4));
		this.interfazProyec =  interfazP;



		labValorInicial = new JLabel("Valor Inicial");
		txtinicial = new JTextField("");

		labDerivada = new JLabel("DERIVADA");
		txtDerivada = new JTextField("");
		
		labelFuncion = new  JLabel("FUNCION");
		txtFuncion = new JTextField("");

		butLimpiarM = new JButton("LIMPIAR");
		butLimpiarM.addActionListener(this);

		labEF = new JLabel("Evaluación en Funcion");
		txtEF = new JTextField("");

		labEFD = new JLabel("Evaluación en derivada ");
		txtEFD = new JTextField("");
		
		butNewtonRaphson = new JButton("Calcular N,R");
		butLimpiarM.addActionListener(this);
		
	

		add(labValorInicial);
		add(txtinicial);

		add(labDerivada);
		add(txtDerivada);

		add(labelFuncion);
		add(txtFuncion);

		add(labEF);
		add(txtEF);
		add(labEFD);
		add(txtEFD);
		add(butLimpiarM);
		
	
		
		add(butNewtonRaphson);
	
	}


	public String getTxtLIf()
	{
		return txtinicial.getText();
	}
	
	public String getTxtFuncion()
	{
		return txtFuncion.getText();
	}

	
	public void limpiarM()
	{
		txtinicial.setText("");
		txtFuncion.setText("");
	}




	public void actionPerformed(ActionEvent arg0 )
	{
		// TODO Auto-generated method stub

		 if(arg0.getSource()== butLimpiarM)
			{
				 interfazProyec.limpiarM();
			}
		 else if(arg0.getSource()==butNewtonRaphson)
		 {
			 interfazProyec.NewtonRaphson();
		 }
	
	}

}
