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

public class PanelOperaciones extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	private JButton butPrimerCorte;
	private JButton butSegundoCorte;
	private JButton butTercerCorte;
	private JButton butNotaFinal;
	private JLabel labRespuesta;
	private JTextField txtRespuesta;
	private JLabel labVacio3;
	private JButton butLimpiar;
	private InterfazEstudiante interfazEstudiante;

	public PanelOperaciones(InterfazEstudiante interfazEstudiante)
	{
		this.interfazEstudiante = interfazEstudiante;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2, 4));

		// CREAMOS
		butPrimerCorte = new JButton("Primer corte");
		butPrimerCorte.addActionListener(this);
		butSegundoCorte = new JButton("Segundo corte");
		butSegundoCorte.addActionListener(this);
		butTercerCorte = new JButton("Tercer corte");
		butTercerCorte.addActionListener(this);
		butNotaFinal = new JButton("Nota final");
		butNotaFinal.addActionListener(this);
		labRespuesta = new JLabel("Respuesta");
		txtRespuesta = new JTextField();
		txtRespuesta.setEditable(false);
		labVacio3 = new JLabel("");
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);

		// AGREGAR
		add(butPrimerCorte);
		add(butSegundoCorte);
		add(butTercerCorte);
		add(butNotaFinal);
		add(labRespuesta);
		add(txtRespuesta);
		add(labVacio3);
		add(butLimpiar);
	}
	
	public void setTxtRespuesta(double resultado)
	{
		txtRespuesta.setText("" + resultado);
	}
	
	public void limpiar()
	{
		txtRespuesta.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butPrimerCorte)
		{
			interfazEstudiante.calcularNotaPrimerCorte();
		}
		else if(e.getSource() == butSegundoCorte)
		{
			interfazEstudiante.calcularNotaSegundoCorte();
		}
		else if(e.getSource() == butTercerCorte)
		{
			interfazEstudiante.calcularNotaTercerCorte();
		}
		else if(e.getSource() == butNotaFinal)
		{
			interfazEstudiante.calcularNotaFinal();
		}
		else if(e.getSource() == butLimpiar)
		{
			interfazEstudiante.limpiar();
		}
		
	}
}
