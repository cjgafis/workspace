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
	private JLabel lblFuncion;
	private JLabel lblLimS;
	private JLabel lblLimI;
	private JLabel lblResultFp;
	private JLabel lblResultBi;
	
	
	private JTextField txtFuncion;
	private JTextField txtLimS;	
	private JTextField txtLimI;
	private JTextField txtResultFp;
	
	private JTextField txtResultBi;
	
	private JButton butCalcularFp;
	private JButton butCalcularBi;

	private JButton butLimpiar;
	
	
	private InterfazCalculoRaiz interfazCalculoRaiz;
	public PanelCerrados(InterfazCalculoRaiz interfazCalculoRaiz)
	{
		this.interfazCalculoRaiz = interfazCalculoRaiz;
		// DISEÃ‘O
		TitledBorder borde = BorderFactory.createTitledBorder("Metodos cerrados");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(8, 2));
		
		// CREAMOS LOS OBJETOS

		// ADICIONAMOS LOS OBJETOS AL DISEÑO
		
		lblLimS = new JLabel("Limite Superior");
		txtLimS = new JTextField();
		lblLimI = new JLabel("Limite Inferior");
		txtLimI = new JTextField();
		
		lblFuncion = new JLabel("Funcion");
		txtFuncion = new JTextField();
		

		
		lblResultFp = new JLabel("Resultado FP");
		txtResultFp = new JTextField();
		txtResultFp.setEditable(false);
		
		lblResultBi = new JLabel("Resultado Bi");
		txtResultBi = new JTextField();
		txtResultBi.setEditable(false);
		
		butCalcularFp = new JButton("Falsa Posicion");
		butCalcularFp.addActionListener(this);
		
		butCalcularBi = new JButton("Biseccion");
		butCalcularBi.addActionListener(this);
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		add(lblLimS);
		add(txtLimS);
		add(lblLimI);
		add(txtLimI);
		add(lblFuncion);
		add(txtFuncion);
		add(lblResultFp);
		add(txtResultFp);
		add(lblResultBi);
		add(txtResultBi);
		add(butCalcularFp);
		add(butCalcularBi);
		add(butLimpiar);
	}
	
	public double getLimS() 
	{
		return Double.parseDouble(txtLimS.getText());
	}
	
	public double getLimI() 
	{
		return Double.parseDouble(txtLimI.getText());
	}
	
	public String getfuncion() 
	{
		return txtFuncion.getText();
	}
	

	public void setResultBi(String valor) {
		txtResultBi.setText(valor);
	}
	public void setResultFp(String valor) {
		txtResultFp.setText(valor);
	}


	@Override
	public void actionPerformed(ActionEvent evento) 
	{
		if(evento.getSource() == butCalcularFp)
		{
			try {
				setResultFp(interfazCalculoRaiz.metodoFalsaPosicion());
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else if(evento.getSource() == butCalcularBi)
		{
			try {
				setResultBi(interfazCalculoRaiz.metodoBiseccion());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else if(evento.getSource() == butLimpiar) {
			txtLimI.setText("");
			txtLimS.setText("");
			txtFuncion.setText("");
			txtResultBi.setText("");
			txtResultFp.setText("");
		}
		
	}

}
