package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDeOperaciones extends JPanel implements ActionListener
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton butPr;
	private JButton butMl;
	private JButton butEa;
	private JButton butEr;
	private JButton butPEE;
	private JButton butPE;
	private JButton butPEP;
	private JButton butPP;
	private JLabel Vacio1;
	private JLabel Vacio2;
	private JLabel Vacio3;
	private JButton Reiniciar;
	private Interfaz interfazprincipal;
	private PanelDeDatos paneldatos;

	public PanelDeOperaciones(Interfaz interfazCalculadora) 
	{

		this.interfazprincipal= interfazCalculadora;

		TitledBorder borde = BorderFactory.createTitledBorder("OPERACIONES");
		setBorder(borde);
		borde.setTitleColor(Color.GRAY);
		setLayout(new GridLayout (4,4));

		butPr = new JButton("Pr");
		butPr.addActionListener(this);

		butMl = new JButton("Ml");
		butMl.addActionListener(this);

		butEa = new JButton("Ea");
		butEa.addActionListener(this);

		butEr = new JButton("Er");
		butEr.addActionListener(this);

		butPEE = new JButton("%Ee");
		butPEE.addActionListener(this);

		butPE = new JButton("%E");
		butPE.addActionListener(this);

		butPEP = new JButton("%Ep");
		butPEP.addActionListener(this);

		butPP = new JButton("%P");
		butPP.addActionListener(this);

		Vacio1 = new JLabel("");
		Vacio2 = new JLabel ("");
		Vacio3 = new JLabel ("");
		Reiniciar= new JButton("Reiniciar");
		Reiniciar.addActionListener(this);

		add(butPr);
		add(butMl);
		add(butEa);
		add(butEr);
		add(butPEE);
		add(butPE);
		add(butPEP);
		add(butPP);
		add(Vacio1);
		add(Vacio2);
		add(Vacio3);
		add(Reiniciar);
	}


	public void actionPerformed(ActionEvent e) 
	{
	
		if(e.getSource()==butPr) 
		{
			interfazprincipal.promedio();

		}
		else if(e.getSource()==butMl) 
		{
			interfazprincipal.medidaMl();

		}
	
	else if (e.getSource()== Reiniciar) 
	{
		
		interfazprincipal.reiniciar();
		
	}
	

	else if(e.getSource()==butEa) 
		{
			interfazprincipal.errorAbsoluto();

		}
	

		else if(e.getSource()==butEr) 
		{
			interfazprincipal.errorRelativo();

		}

		else if(e.getSource()==butPEE) 
		{
			interfazprincipal.porcentajeEnErrorExactitud();

		}
		else if(e.getSource()==butPE) 
		{
			interfazprincipal.exactitudEnMedidas();

		}
		else if(e.getSource()==butPEP) 
		{
			interfazprincipal.porcentajeDePrecision();

		}
		

		else if(e.getSource()==butPP)  
		{
			interfazprincipal.precisionDeLosDatos();

		}
	}
}

