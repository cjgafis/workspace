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

public class PanelCalcularError1 extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel labValorVer1;
	private JTextField txtValorVer1;
	
	private JLabel labMedida1;
	private JTextField txtMedida1;
	
	
	private JButton butErrorAbsolutoM11;
	
	private JButton butErrorRelativoM11;
	
	private JButton butErrorExactitudM11;
	
	private JButton butExactitudM11;
	
	private JLabel labResultado;
	
	private JTextField txtResultado;
	
	private JLabel labVacio1;
	private JButton butLimpiarEror1;
	
	private InterfazProyec interfazProyec;

	//METODO CONSTRUCTOR
	public PanelCalcularError1(InterfazProyec interfazProyec)
	
	{ 
		this.interfazProyec = interfazProyec;
		
		  //DISEÑO
	     TitledBorder border = BorderFactory.createTitledBorder("CALCULAR ERROR UNA MEDIDA");
	     setBorder(border);
	     border.setTitleColor(Color.ORANGE);
	     setLayout(new GridLayout(6,2));
	     
	   //INSTATIACION DEL PANEL
	    
	     labValorVer1 = new JLabel("valor verdadero");
	     txtValorVer1 = new JTextField("");
	     
	     labMedida1 = new JLabel("Medida");
	     txtMedida1 = new JTextField("");
	     
	     butErrorAbsolutoM11 = new JButton("EA");
	     butErrorAbsolutoM11.addActionListener(this);
	     
	     butErrorRelativoM11 = new JButton("ER");
	     butErrorRelativoM11.addActionListener(this);
	     
	     butErrorExactitudM11 = new JButton("Ee");
	     butErrorExactitudM11.addActionListener(this);
	     
	     butExactitudM11= new JButton("E");
	     butExactitudM11.addActionListener(this);
	     
	     labResultado = new JLabel("Resultado");
	     txtResultado = new JTextField("");
	     
	     labVacio1 = new JLabel("");
	     butLimpiarEror1 = new JButton("Limpiar");
		 butLimpiarEror1.addActionListener(this);
		 
	     
	     //ADICCIONAR
	    
	     add(labValorVer1);
	     add(txtValorVer1);
	     add(labMedida1);
	     add(txtMedida1);
	     
	     add(labResultado);
	     add(txtResultado);
	     
	     add(butErrorAbsolutoM11);
	     add(butErrorRelativoM11);
	     add(butErrorExactitudM11);
	     add(butExactitudM11);
	     add(labVacio1);
	     add(butLimpiarEror1);
		 
	}
	
	public String getTxtValorVer()
	{
		return txtValorVer1.getText();
	}

	public String getTxtMedida1()
	{
		return txtMedida1.getText();
	}
	
	public void setTxtResultado(String resultado)
	{
		txtResultado.setText(resultado);
	}
	
	public void limpiarError1()
	
	{
		txtValorVer1.setText("");
		txtMedida1.setText("");
		txtResultado.setText("");
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		 if(arg0.getSource()== butErrorAbsolutoM11 )
		{
			interfazProyec.errorAbsolutoM11();
		}
		 else if (arg0.getSource()== butErrorRelativoM11)
		 {
			 interfazProyec.errorRelativoM11();
		 }
		 else if (arg0.getSource() == butErrorExactitudM11)
	    {
			 interfazProyec.errorExactitudM11();
	    }
		 else if (arg0.getSource()==butExactitudM11)
		{
			 interfazProyec.exactitudM11();
		}	
		 else if (arg0.getSource()==butLimpiarEror1)
		 {
			 interfazProyec.limpiarError1();
		 }
	}
	
	
    
   
	
	}

