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
	private JButton butMl, butEa, butEr;
	private JButton butEe, butE, butEp, butP;
	private InterfazCalculadora interfazCalculadora;

	public PanelOperaciones(InterfazCalculadora interfazCalculadora) 
	{
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3, 3));
		
		// CREAR LOS OBJETOS
		butPro = new JButton("Pr");
		butPro.addActionListener(this);  
		
		butMl = new JButton("Ml");       // butRestar
		butMl.addActionListener(this);
		
		butEa = new JButton("Ea");       // butMultiplicar
		butEa.addActionListener(this);
		
		butEr = new JButton("Er");       // butDividir
		butEr.addActionListener(this);

		butEe = new JButton("%Ee");
		butEe.addActionListener(this);

		butE = new JButton("%E");
		butE.addActionListener(this);

		butEp = new JButton("%Ep");
		butEp.addActionListener(this);

		butP = new JButton("%P");
		butP.addActionListener(this);
		
		// AGREGAR LOS OBJETOS AL PANEL
		add(butPro);
		add(butMl);  // butRestar
		add(butEa); //butMultiplicar
		add(butEr);  //butDividir
		add(butEe);
		add(butE);
		add(butEp);
		add(butP);
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
		else if(e.getSource() == butEa)
		{
			interfazCalculadora.metodoEa();
		}
		else if(e.getSource() == butEr)
		{
			interfazCalculadora.metodoEr();
		}
		else if(e.getSource() == butEe)
		{
			interfazCalculadora.metodoEe();
		}
		else if(e.getSource() == butE)
		{
			interfazCalculadora.metodoE();
		}
		else if(e.getSource() == butEp)
		{
			interfazCalculadora.metodoEp();
		}
		else if(e.getSource() == butP)
		{
			interfazCalculadora.metodoP();
		}
		else if(e.getSource() == butP)
		{
			interfazCalculadora.metodoP();
		}
		
	}

}

