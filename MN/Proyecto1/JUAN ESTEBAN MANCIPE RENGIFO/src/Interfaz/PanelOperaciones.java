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

public class PanelOperaciones extends JPanel implements ActionListener
{
	
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
	private InterfazPrincipalCalculadora interfazprincipal;
	

	public PanelOperaciones(InterfazPrincipalCalculadora interfazCalculadora) {

		this.interfazprincipal= interfazCalculadora;

		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout (3,4));

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

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		if(e.getSource()==butPr) 
		{
			interfazprincipal.promedioDeLasMedidas();

		}
		else if(e.getSource()==butMl) 
		{
			interfazprincipal.medidaMasLejana();

		}

		else if (e.getSource()== Reiniciar) {

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
			interfazprincipal.porcentajeErrorExactitud();

		}




		else if(e.getSource()==butPE) 
		{
			interfazprincipal.exactitudDeMedida();

		}


		else if(e.getSource()==butPEP) 
		{
			interfazprincipal.porcentajePrecision();

		}


		else if(e.getSource()==butPP)  
		{
			interfazprincipal.precision();

		}
	}
}







 

