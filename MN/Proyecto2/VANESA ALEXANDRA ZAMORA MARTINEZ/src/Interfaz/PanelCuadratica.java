package Interfaz;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Importar mundo
import mundo.CalculoRaiz;

public class PanelCuadratica extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Atributos 
	CalculoRaiz mundo;

	private JLabel a;
	private JLabel b;
	private JLabel c;
	private JLabel raizP;
	private JLabel raizN;

	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField resultadoRaizP;
	private JTextField resultadoRaizN;

	private JButton butCalcular;
	private JButton butLimpiar;

	public final static String Calcular = "Calcular";
	public final static String Limpiar = "Limpiar";



	//Metodo constructor
	public PanelCuadratica()
	{
		mundo = new CalculoRaiz();

		//Diseño
		TitledBorder Cuadratica = BorderFactory.createTitledBorder("Cuadratica");
		setBorder(Cuadratica);

		setLayout(new GridLayout(6,2));

		//Creamos los objetos
		a = new JLabel("Valor a");
		b = new JLabel("Valor b");	
		c = new JLabel("Valor c");
		raizP = new JLabel("Resultado Raiz Positivo");
		raizN = new JLabel("Resultado Raiz Negativo");

		txta = new JTextField();
		txtb = new JTextField();
		txtc = new JTextField();

		resultadoRaizP = new JTextField();
		resultadoRaizP.setEditable(false);

		resultadoRaizN = new JTextField();
		resultadoRaizN.setEditable(false);

		butCalcular = new JButton(Calcular);
		butCalcular.addActionListener(this);
		butCalcular.setActionCommand(Calcular);

		butLimpiar = new JButton(Limpiar);
		butLimpiar.addActionListener(this);
		butLimpiar.setActionCommand(Limpiar);

		//Adicionamos 

		add(a);
		add(txta);
		add(b);
		add(txtb);
		add(c);
		add(txtc);
		add(raizP);
		add(resultadoRaizP);
		add(raizN);
		add(resultadoRaizN);
		add(butCalcular);
		add(butLimpiar);
		
	}


	//Metodos para obtener y escribir información
	// en los campos de texto
	//public String getTxta()
	//{
	//	return txta.getText();
	//}
	
	//public String getTxtb()
	//{
	//	return txtb.getText();
	//}
	
	//public String getTxtc()
	//{
		//return txtc.getText();
	//}
	
	
	//Union mundo
	public void Calcular()
	{
		double a = Double.parseDouble(txta.getText());
		double b = Double.parseDouble(txtb.getText());
		double c = Double.parseDouble(txtc.getText());
		
		double raizP = mundo.formulaCuadraticaPositiva(a, b, c);
		double raizN = mundo.formulaCuadraticaNegativo(a, b, c);
		
		resultadoRaizP.setText(raizP + "");
		resultadoRaizN.setText(raizN + "");
	}

	

	//Metodos botones

	public void limpiar()
	{
		txta.setText("");
		txtb.setText("");
		txtc.setText("");
		resultadoRaizP.setText("");
		resultadoRaizN.setText("");
	}


	@Override
	public void actionPerformed(ActionEvent pEvento) 
	{
		String comando = pEvento.getActionCommand();

		if(comando.equals(Calcular))
		{
			Calcular();
		}
	
		else if(comando.equals(Limpiar))
		{
			limpiar();
		}

	}



}
