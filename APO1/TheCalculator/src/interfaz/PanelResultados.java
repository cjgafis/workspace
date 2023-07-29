package interfaz;

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

public class PanelResultados extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// 1. DECLARAR LOS ATRIBUTOS
	private JLabel labResultado;
	private JTextField txtResultado;
	private JLabel labVacio1;
	private JButton butLimpiar;
	private InterfazCalculadora interfazCalculadora;
	
	public PanelResultados(InterfazCalculadora interfazCalculadora)
	{
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2,2));
		
		// 2. INSTANCIAR - CREAR LOS OBJETOS
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField();
		txtResultado.setEditable(false);
		labVacio1 = new JLabel("");
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		// 3. AGREGAR - AÑADIR LOS OBJETOS AL DISEÑO
		add(labResultado);
		add(txtResultado);
		add(labVacio1);
		add(butLimpiar);
	}
	
	public void setTxtResultado(String resultado)
	{
		txtResultado.setText(resultado);
	}
	
	public void limpiar()
	{
		txtResultado.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butLimpiar)
		{
			interfazCalculadora.limpiar();
		}		
	}
}
