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
	
	// 1. DECLARAR - ATRIBUTOS
	private JButton butSumar;
	private JButton butRestar;
	private JButton butMultiplicar;
	private JButton butDividir;
	private InterfazCalculadora interfazCalculadora;

	public PanelOperaciones(InterfazCalculadora interfazCalculadora)
	{
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2,2));
		
		// 2. INSTANCIAR - CREAR LOS OBJETOS
		butSumar = new JButton("Sumar");
		butSumar.addActionListener(this);
		butRestar = new JButton("Restar");
		butRestar.addActionListener(this);
		butMultiplicar = new JButton("Multiplicar");
		butMultiplicar.addActionListener(this);
		butDividir = new JButton("Dividir");
		butDividir.addActionListener(this);
		
		// 3. AGREGAR - AÑADIR LOS OBJETOS AL DISEÑO
		add(butSumar);
		add(butRestar);
		add(butMultiplicar);
		add(butDividir);

	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butSumar)
		{
			interfazCalculadora.sumar();
		}
		else if(e.getSource() == butRestar)
		{
			interfazCalculadora.restar();
		}
		else if(e.getSource() == butMultiplicar)
		{
			interfazCalculadora.multiplicar();
		}
		else if(e.getSource() == butDividir)
		{
			interfazCalculadora.dividir();
		}
	}
}
