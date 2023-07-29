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

public class PanelIntegrales extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel labFuncion;
	private JTextField txtFuncion;	
	private JLabel labA;
	private JTextField txtA;	
	private JLabel labB;
	private JTextField txtB;	
	private JLabel labN;
	private JTextField txtN;	
	private JLabel labNivel;
	private JTextField txtNivel;
	private JLabel labIntegral;
	private JTextField txtIntegral;	
	private JButton butTrapecio;
	private JButton butSimpson;
	private JButton butRomberg;
	private JButton butLimpiar;
	private InterfazTrapecio interfazTrapecio;

	public PanelIntegrales(InterfazTrapecio interfazTrapecio) 
	{
		this.interfazTrapecio = interfazTrapecio;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(8, 2));
		
		// INSTANCIAR
		labFuncion = new JLabel("Función");
		txtFuncion = new JTextField();	
		labA = new JLabel("Límite inferior (a)");
		txtA = new JTextField();	
		labB = new JLabel("Límite superior (b)");
		txtB = new JTextField();	
		labN = new JLabel("Intervalos (n)") ;
		txtN = new JTextField();
		labNivel = new JLabel("Nivel (1,2,3)") ;
		txtNivel = new JTextField();
		labIntegral = new JLabel("Integral");
		txtIntegral = new JTextField();	
		butTrapecio = new JButton("M.Trapecio");
		butTrapecio.addActionListener(this);
		butSimpson = new JButton("M.Simpson");
		butSimpson.addActionListener(this);
		butRomberg = new JButton("M.Romberg");
		butRomberg.addActionListener(this);
		butLimpiar = new JButton("Limpiar");
		butLimpiar.addActionListener(this);
		
		// AGREGAR
		add(labFuncion);
		add(txtFuncion);
		add(labA);
		add(txtA);
		add(labB);
		add(txtB);
		add(labN);
		add(txtN);
		add(labNivel);
		add(txtNivel);
		add(labIntegral);
		add(txtIntegral);
		add(butTrapecio);
		add(butSimpson);
		add(butRomberg);
		add(butLimpiar);
		
	}
	
	public String getTxtFuncion()
	{
		return txtFuncion.getText();
	}
	
	public String getTxtA()
	{
		return txtA.getText();
	}
	
	public String getTxtB()
	{
		return txtB.getText();
	}
	
	public String getTxtN()
	{
		return txtN.getText();
	}
	
	public String getTxtNivel()
	{
		return txtNivel.getText();
	}
	
	public void setTxtIntegral(double resultado)
	{
		txtIntegral.setText("" + resultado);
	}
	
	public void limpiar()
	{
		txtFuncion.setText("");
		txtA.setText("");
		txtB.setText("");
		txtN.setText("");
		txtNivel.setText("");
		txtIntegral.setText("");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == butTrapecio)
		{
			interfazTrapecio.metodoTrapecio();
		}
		else if(e.getSource() == butSimpson)
		{
			interfazTrapecio.metodoSimpson();
		}
		else if(e.getSource() == butRomberg)
		{
			interfazTrapecio.metodoRomberg();
		}
		else if(e.getSource() == butLimpiar)
		{
			interfazTrapecio.limpiar();
		}
		
	}

}
