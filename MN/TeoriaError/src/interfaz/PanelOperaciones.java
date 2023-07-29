package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelOperaciones extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JButton butPr;
	private JButton butML;
	private JButton butEA;
	private JButton butER;
	private JButton butPEE;
	private JButton butPE;
	private JButton butPEP;
	private JButton butPP;
	private JLabel labVacio1;
	private JLabel labVacio2;
	private JLabel labVacio3;
	private JButton butLimpiar;
	private InterfazOperacion interfazCalculadora;

	public PanelOperaciones(InterfazOperacion interfazCalculadora) 
	{
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3, 4));
		
		// CREAR LOS OBJETOS
		butPr = new JButton("Pr");
		butPr.addActionListener(this);
		
		butML = new JButton("Ml");
		butML.addActionListener(this);
		
		butEA = new JButton("Ea");
		butEA.addActionListener(this);
		
		butER = new JButton("Er");
		butER.addActionListener(this);
		
		butPEE = new JButton("%Ee");
		butPEE.addActionListener(this);
		
		butPE = new JButton("%E");
		butPE.addActionListener(this);
		
		butPEP = new JButton("%Ep");
		butPEP.addActionListener(this);
		
		butPP = new JButton("%P");
		butPP.addActionListener(this);
		
		labVacio1 = new JLabel("");
		
		labVacio2 = new JLabel("");
		
		labVacio3 = new JLabel("");
		
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		
		// AGREGAR LOS OBJETOS AL PANEL
		
		add(butPr);
		add(butML);
		add(butEA);
		add(butER);
		add(butPEE);
		add(butPE);
		add(butPEP);
		add(butPP);
		add(labVacio1);
		add(labVacio2);
		add(labVacio3);
		add(butLimpiar);
	}


	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butPr)
		{
			interfazCalculadora.promedioDeLasMedidas();
		}
		else if(e.getSource() == butML)
		{
			interfazCalculadora.medidaMasLejana();
		}
		else if(e.getSource() == butEA)
		{
			interfazCalculadora.errorAbsoluto();
		}
		else if(e.getSource() == butER)
		{
			interfazCalculadora.errorRelativo();
		}
		else if(e.getSource() == butPEE)
		{
			interfazCalculadora.porcentajeErrorExactitud();
		}
		else if(e.getSource() == butPE)
		{
			interfazCalculadora.porcentajeExactitud();
		}
		else if(e.getSource() == butPEP)
		{
			interfazCalculadora.porcentajeErrorPrecision();
		}
		else if(e.getSource() == butPP)
		{
			interfazCalculadora.porcentajePrecision();
		}
		else if(e.getSource() == butLimpiar)
		{
			interfazCalculadora.limpiar();
		}
	}

}
