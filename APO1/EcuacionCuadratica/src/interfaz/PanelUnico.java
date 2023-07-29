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

public class PanelUnico extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel labEcuacion;
	private JLabel labCuadratica;
	private JLabel labVacio1;
	private JTextField txtA;	
	private JTextField txtB;
	private JTextField txtC;
	private JLabel labA;
	private JLabel labB;
	private JLabel labC;
	private JLabel labRaiz1; 
	private JTextField txtRaiz1;
	private JButton butCalcularRaiz1;	
	private JLabel labRaiz2; 
	private JTextField txtRaiz2;
	private JButton butCalcularRaiz2;
	private JLabel labNombre;
	private JLabel labCodigo;
	private JButton butLimpiar;
	private InterfazEcuacionCuadratica interfazEcuacionCuadratica;
	
	// CONSTRUCTOR
	public PanelUnico(InterfazEcuacionCuadratica interfazEcuacionCuadratica)
	{
		this.interfazEcuacionCuadratica = interfazEcuacionCuadratica;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Panel unico");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(6,3));
		
		// CREAR
		labEcuacion = new JLabel("ECUACION");
		labCuadratica = new JLabel("CUADRATICA");
		labVacio1 = new JLabel("");	
		txtA = new JTextField();
		txtB = new JTextField();
		txtC = new JTextField();
		labA = new JLabel("Valor de (a)");
		labB = new JLabel("Valor de (b)");
		labC = new JLabel("Valor de (c)");
		labRaiz1 = new JLabel("Raiz 1");
		txtRaiz1 = new JTextField();
		butCalcularRaiz1 = new JButton("Calcular");
		butCalcularRaiz1.addActionListener(this);
		labRaiz2 = new JLabel("Raiz 2");
		txtRaiz2 = new JTextField();
		butCalcularRaiz2 = new JButton("Calcular");
		butCalcularRaiz2.addActionListener(this);
		labNombre = new JLabel("Su nombre");
		labCodigo = new JLabel("Su codigo");
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		// AGREGAR
		add(labEcuacion);
		add(labCuadratica);
		add(labVacio1);		
		add(txtA);
		add(txtB);
		add(txtC);
		add(labA);
		add(labB);
		add(labC);
		add(labRaiz1);
		add(txtRaiz1);
		add(butCalcularRaiz1);
		add(labRaiz2);
		add(txtRaiz2);
		add(butCalcularRaiz2);
		add(labNombre);
		add(labCodigo);
		add(butLimpiar);
		
	}
	
	// METODOS PARA CAPTURAR LA INFORMACIÓN DE LOS JTextField
	public String getTxtA()
	{
		return txtA.getText();
	}
	
	public String getTxtB()
	{
		return txtB.getText();
	}
	
	public String getTxtC()
	{
		return txtC.getText();
	}
	
	// METODOS PARA CAMBIAR LA INFORMACIÓN DE LOS JTextField
	public void setTxtRaiz1(double resultado)
	{
		txtRaiz1.setText("" + resultado);
	}
	
	public void setTxtRaiz2(double resultado)
	{
		txtRaiz2.setText("" + resultado);
	}
	
	// METODO LIMPIAR
	public void limpiar()
	{
		txtA.setText("");
		txtB.setText("");
		txtC.setText("");
		txtRaiz1.setText("");
		txtRaiz2.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butCalcularRaiz1)
		{
			interfazEcuacionCuadratica.calcularRaiz1();
		}
		else if(e.getSource() == butCalcularRaiz2)
		{
			interfazEcuacionCuadratica.calcularRaiz2();
		}
		else if(e.getSource() == butLimpiar)
		{
			interfazEcuacionCuadratica.limpiar();
		}
		
	}
	
}
