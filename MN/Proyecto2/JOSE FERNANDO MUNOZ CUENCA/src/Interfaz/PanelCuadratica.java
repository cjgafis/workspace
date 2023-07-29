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

public class PanelCuadratica extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS

	private JLabel LabValorA;
	private JTextField txtValorA;
	private JLabel LabValorB;
	private JTextField txtValorB;
	private JLabel LabValorC;
	private JTextField txtValorC;
	private JLabel LabRaizUno;
	private JTextField txtRaizUno;
	private JLabel LabRaizDos;
	private JTextField txtRaizDos;
	private JButton butLimpiar;
	private JButton butCalcular;
	private InterfazProyec interfazProyec;

	//DISEÑO PANEL
	public PanelCuadratica(InterfazProyec interfazPoryec)
	{
		this.interfazProyec = interfazPoryec;

		TitledBorder border = BorderFactory.createTitledBorder("CUADRATICA");
		setBorder(border);
		border.setTitleColor(Color.MAGENTA);
		setLayout(new GridLayout(6,2));

		//INSTATIACION DEL PANEL
		LabValorA = new JLabel("Valor A");
		txtValorA = new JTextField("");
		LabValorB = new JLabel("Valor B");
		txtValorB = new JTextField("");
		LabValorC = new JLabel("Valor C");
		txtValorC = new JTextField("");
		LabRaizUno = new JLabel("Raiz Uno");
		txtRaizUno = new JTextField("");		
		LabRaizDos = new JLabel("Raiz Dos");
		txtRaizDos = new JTextField("");
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		butCalcular = new JButton("Calcular");
		butCalcular.addActionListener(this);

		//ADICIONAR EN EL PANEL 

		add(LabValorA);
		add(txtValorA);
		add(LabValorB);
		add(txtValorB);
		add(LabValorC);
		add(txtValorC);
		add(LabRaizUno);
		add(txtRaizUno);		
		add(LabRaizDos);
		add(txtRaizDos);
		add(butLimpiar);
		add(butCalcular);

	}

	public String getTxtValorA()
	{
		return txtValorA.getText();
	}
	public String getTxtValorB()
	{
		return txtValorB.getText();
	}
	public String getTxtValorC()
	{
		return txtValorC.getText();
	}
	public void setTxtRaizUno(String raizUno)
	{
		txtRaizUno.setText(raizUno);
	}
	public void setTxtRaizDos(String raizDos)
	{
		txtRaizDos.setText(raizDos);
	}
	public void limpiar()
	{
		txtValorA.setText("");
		txtValorB.setText("");
		txtValorC.setText("");
		txtRaizUno.setText("");
		txtRaizDos.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		 if(arg0.getSource()==butLimpiar)
		{
			 interfazProyec.limpiar();
		}
		 else if(arg0.getSource()==butCalcular)
			{
			 interfazProyec.raizUno();
			 interfazProyec.raizDos();
			}
		

	}

}
