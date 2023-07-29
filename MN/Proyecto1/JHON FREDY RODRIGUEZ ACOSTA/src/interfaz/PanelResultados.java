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

	private JLabel labResultado;
	private JTextField txtResultado;
	private InterfazPrincipal interfazPrincipal;
	
	public PanelResultados(InterfazPrincipal interfazPrincipal) 
	{
		this.interfazPrincipal = interfazPrincipal;
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Resultados");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(2, 2));
		
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField();
		txtResultado.setBackground(Color.white);
		txtResultado.setEditable(false);
		
		add(labResultado);
		add(txtResultado);
		
	}
	
	public void setResultado(String resultado)
	{
		txtResultado.setText(resultado);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == "")
		{
			interfazPrincipal.limpiar();
		}
		
	}

}
