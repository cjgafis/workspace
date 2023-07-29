package interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones extends JPanel
{
	private JButton butErrorAbsoluto;
	private JButton butMedidaPromedio;
	private JButton butMedidaLejana;
	private JButton butErrorRelativo;
	private JButton butPErrorExactitud;
	private JButton butPExactitud;
	private JButton butPErrorPrecision;
	private JButton butPorcentajePrecision;
	
	public PanelBotones()
	{
		TitledBorder borde = BorderFactory.createTitledBorder("Botones");
		setBorder(borde);
		setLayout(new GridLayout (2,4));
		
		butErrorAbsoluto = new JButton("Ea");
		butErrorRelativo = new JButton("Er");
		butMedidaPromedio = new JButton("Mp");
		butMedidaLejana = new JButton("Ml");
		butPErrorExactitud = new JButton("%Ee");
		butPExactitud= new JButton("%E");
		butPErrorPrecision = new JButton("%Ep");
		butPorcentajePrecision = new JButton("%P");
		
		add(butErrorAbsoluto);
		add(butErrorRelativo);
		add(butMedidaPromedio);
		add(butMedidaLejana);
		add(butPErrorExactitud);
		add(butPExactitud);
		add(butPErrorPrecision);
		add(butPorcentajePrecision);
	}

}
