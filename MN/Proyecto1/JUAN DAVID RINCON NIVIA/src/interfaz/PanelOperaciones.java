package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JButton butPro;
	private JButton butMl;
	private JButton butEA;
	private JButton butER;
	private JButton butPEE;
	private JButton butPE; 
	private JButton butPEP;
	private JButton butPP;
	private InterfazCalculadora interfazCalculadora;

	public PanelOperaciones(InterfazCalculadora interfazCalculadora) 
	{
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		
		TitledBorder borde = BorderFactory.createTitledBorder("OPERACIONES");
		setBorder(borde);
		borde.setTitleColor(Color.GREEN);
		setLayout(new GridLayout(3, 3));
		
		// CREAR LOS OBJETOS
		
		butPro = new JButton("Pr");
		butPro.addActionListener(this);  
		
		butMl = new JButton("Ml");       
		butMl.addActionListener(this);
		
		butEA = new JButton("EA");       
		butEA.addActionListener(this);
		
		butER = new JButton("ER");       
		butER.addActionListener(this);

		butPEE = new JButton("%EE");
		butPEE.addActionListener(this);

		butPE = new JButton("%E");
		butPE.addActionListener(this);

		butPEP = new JButton("%EP");
		butPEP.addActionListener(this);

		butPP = new JButton("%P");
		butPP.addActionListener(this);
		
		// AGREGAR LOS OBJETOS AL PANEL
		add(butPro);
		add(butMl);  
		add(butEA); 
		add(butER);  
		add(butPEE);
		add(butPE);
		add(butPEP);
		add(butPP);
	}


	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butPro)
		{
			interfazCalculadora.metodoPromedio();
		}
		else if(e.getSource() == butMl )
		{
			interfazCalculadora.metodoMedidaMasLejana();
		}
		else if(e.getSource() == butEA)
		{
			interfazCalculadora.metodoEa();
		}
		else if(e.getSource() == butER)
		{
			interfazCalculadora.metodoEr();
		}
		else if(e.getSource() == butPEE)
		{
			interfazCalculadora.metodoEe();
		}
		else if(e.getSource() == butPE)
		{
			interfazCalculadora.metodoE();
		}
		else if(e.getSource() == butPEP)
		{
			interfazCalculadora.metodoEp();
		}
		else if(e.getSource() == butPP)
		{
			interfazCalculadora.metodoP();
		}
		else if(e.getSource() == butPP)
		{
			interfazCalculadora.metodoP();
		}
		
	}

}

