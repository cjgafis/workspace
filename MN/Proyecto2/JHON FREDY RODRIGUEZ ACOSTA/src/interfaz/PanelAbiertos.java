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
	private JLabel lblFuncion;
	private JLabel lblDerivada;
	private JLabel lblXi;
	
	
	private JTextField txtFuncion;
	private JTextField txtDerivada;
	private JTextField txtXi;
	
	private JLabel lblResultPuntoFijo;
	private JTextField txtResultPuntoFijo;
	
	
	private JLabel lblResultNewtonRaphson;
	private JTextField txtResultNewtonRaphson;
	
	private JButton butCalcularPuntoFijo;
	private JButton butCalcularNewtonRaphson;
	
	private JButton butLimpiar;
	
	
	private InterfazCalculoRaiz interfazCalculoRaiz;
	
	public PanelAbiertos(InterfazCalculoRaiz interfazCalculoRaiz)
	{
		this.interfazCalculoRaiz = interfazCalculoRaiz;
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(8, 2));

		lblXi = new JLabel("Xi");
		txtXi = new JTextField();
		
		lblFuncion = new JLabel("Funcion");
		txtFuncion = new JTextField();
		
		lblDerivada = new JLabel("Derivada");
		txtDerivada = new JTextField();
		
		
		lblResultPuntoFijo = new JLabel("Resultado Punto Fijo");
		txtResultPuntoFijo = new JTextField();
		txtResultPuntoFijo.setEditable(false);
		
		
		lblResultNewtonRaphson = new JLabel("Resultado Newton Raphson");
		txtResultNewtonRaphson = new JTextField();
		txtResultNewtonRaphson.setEditable(false);
		
		butCalcularPuntoFijo = new JButton("Punto Fijo");
		butCalcularPuntoFijo.addActionListener(this);
		
		
		butCalcularNewtonRaphson = new JButton("Newton Raphson");
		butCalcularNewtonRaphson.addActionListener(this);
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		add(lblXi);
		add(txtXi);
		
		add(lblFuncion);
		add(txtFuncion);
		
		add(lblDerivada);
		add(txtDerivada);

		
		add(lblResultPuntoFijo);
		add(txtResultPuntoFijo);
			
		add(lblResultNewtonRaphson);
		add(txtResultNewtonRaphson);
		
		add(butCalcularPuntoFijo);
		add(butCalcularNewtonRaphson);
		add(butLimpiar);

		// CREAMOS LOS OBJETOS

		// ADICIONAMOS LOS OBJETOS AL DISEÃ‘O
	}
	
	public void setResultPF(String valor) 
	{
		txtResultPuntoFijo.setText(valor);
	}
	public void setResultNw(String valor) 
	{
		txtResultNewtonRaphson.setText(valor);
	}
	
	public double getValue() 
	{
		return Double.parseDouble(txtXi.getText());
	}

	
	public String getfuncion() 
	{
		return txtFuncion.getText();
	}

	public String getpdervada() 
	{
		return txtDerivada.getText();
	}

	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		if(evento.getSource() == butCalcularPuntoFijo)
		{
			try {
				setResultPF(interfazCalculoRaiz.metodoPuntoFijo());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} 
		else if(evento.getSource() == butCalcularNewtonRaphson)
		{
			try {
				setResultNw(interfazCalculoRaiz.metodoNewtonRaphson());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(evento.getSource() == butLimpiar) 
		{
			txtXi.setText("");
			txtFuncion.setText("");
			txtDerivada.setText("");
			txtResultPuntoFijo.setText("");
			txtResultNewtonRaphson.setText("");
		}
	}

}
