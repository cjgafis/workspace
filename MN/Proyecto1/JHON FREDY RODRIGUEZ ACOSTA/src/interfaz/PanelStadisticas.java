package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelStadisticas extends JPanel implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private InterfazPrincipal interfazPrincipal;
	
	private JLabel lblTotal;
	private JTextField txtTotal;
	private JButton butTotal;
	
	private JLabel lblPromedio;
	private JTextField txtPromedio;
	private JButton butPromedio;
	
	private JLabel lblCantDatos;
	private JTextField txtCantDatos;
	private JButton butCantDatos;
	
	private JLabel lblValMax;
	private JTextField txtValMax;
	private JButton butValMax;
	
	private JLabel lblValMin;
	private JTextField txtValMin;
	private JButton butValMin;
	
	public PanelStadisticas(InterfazPrincipal interfazPrincipal) 
	{
		this.interfazPrincipal = interfazPrincipal;
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("otros Resultados");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5, 3));
		
		
		lblTotal = new JLabel("Total");
		txtTotal = new JTextField();
		txtTotal.setBackground(Color.white);
		txtTotal.setEditable(false);
		butTotal = new JButton("Suma de los datos");
		butTotal.addActionListener(this);
		
		lblPromedio = new JLabel("Promedio");
		txtPromedio = new JTextField();
		txtPromedio.setBackground(Color.white);
		txtPromedio.setEditable(false);
		butPromedio = new JButton("Calcular Promedio");
		butPromedio.addActionListener(this);
		
		lblCantDatos = new JLabel("Cantidad Datos");
		txtCantDatos = new JTextField();
		txtCantDatos.setBackground(Color.white);
		txtCantDatos.setEditable(false);
		butCantDatos = new JButton("Cantidad Datos");
		butCantDatos.addActionListener(this);
		
		lblValMax = new JLabel("Valor Maximo");
		txtValMax = new JTextField();
		txtValMax.setBackground(Color.white);
		txtValMax.setEditable(false);
		butValMax = new JButton("Valor Maximo");
		butValMax.addActionListener(this);
		
		lblValMin = new JLabel("Valor Minimo");
		txtValMin = new JTextField();
		txtValMin.setBackground(Color.white);
		txtValMin.setEditable(false);
		butValMin = new JButton("Valor Minimo");
		butValMin.addActionListener(this);
		
		add(lblTotal);
		add(txtTotal);
		add(butTotal);
		
		add(lblPromedio);
		add(txtPromedio);
		add(butPromedio);
		
		add(lblCantDatos);
		add(txtCantDatos);
		add(butCantDatos);
		
		add(lblValMax);
		add(txtValMax);
		add(butValMax);
		
		add(lblValMin);
		add(txtValMin);
		add(butValMin);
	}
	
	public void setResultadoTotal(double resultado)
	{
		txtTotal.setText(Double.toString(resultado));
	}
	
	public void setResultadoPromedio(double resultado)
	{
		txtPromedio.setText(Double.toString(resultado));
	}
	
	public void setResultadoCantidad(int resultado)
	{
		txtCantDatos.setText(Integer.toString(resultado));
	}
	
	public void setResultadoValMax(double resultado)
	{
		txtValMax.setText(Double.toString(resultado));
	}
	
	public void setResultadoValMin(double resultado)
	{
		txtValMin.setText(Double.toString(resultado));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == butTotal) {
			interfazPrincipal.total();
		}else if (e.getSource() == butPromedio ) {
			interfazPrincipal.promedio();
		}else if (e.getSource() == butCantDatos ) {
			interfazPrincipal.cantDatos();
		}else if (e.getSource() == butValMax ) {
			interfazPrincipal.valMax();
		}else if (e.getSource() == butValMin ) {
			interfazPrincipal.valMin();
		}
		
	}


}
