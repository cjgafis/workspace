package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JButton butPromedio;
	private JButton butErrorAbsoluto;
	private JButton butErrorRelativo;
	private JButton butErrorExactitud;
	private JButton butErrorPrecision;
	private JButton butExactitud;
	private JButton butPrecision;
	
	private InterfazPrincipal interfazPrincipal;

	public PanelBotones(InterfazPrincipal interfazPrincipal)
	{
		this.interfazPrincipal = interfazPrincipal;
		
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3, 2));
		
		
		
		
		butErrorAbsoluto = new JButton("Error Absoluto");
		butErrorAbsoluto.addActionListener(this);
		
		butErrorRelativo = new JButton("Error Relativo");
		butErrorRelativo.addActionListener(this);
		
		butErrorExactitud = new JButton("% Error Exactitud");
		butErrorExactitud.addActionListener(this);
		
		butErrorPrecision = new JButton("% Error Precision");
		butErrorPrecision.addActionListener(this);
		
		butExactitud = new JButton("% Exactitud");
		butExactitud.addActionListener(this);
		
		butPrecision = new JButton("% Precision");
		butPrecision.addActionListener(this);
		

		
		add(butErrorAbsoluto);
		add(butErrorRelativo);
		add(butErrorExactitud);
		add(butErrorPrecision);
		add(butExactitud);
		add(butPrecision);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butPromedio)
		{
			interfazPrincipal.promedio();
		}
		else if(e.getSource() == butErrorAbsoluto)
		{
			interfazPrincipal.errorAbsoluto();
		}
		else if(e.getSource() == butErrorRelativo)
		{
			interfazPrincipal.errorRelativo();
		}
		else if(e.getSource() == butErrorExactitud)
		{
			interfazPrincipal.errrorExactitud();
		}
		else if(e.getSource() == butExactitud)
		{
			interfazPrincipal.exactitud();
		}	
		else if(e.getSource() == butErrorPrecision)
		{
			interfazPrincipal.errorPrecision();
		}	
		else if(e.getSource() == butPrecision)
		{
			interfazPrincipal.precision();
		}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
