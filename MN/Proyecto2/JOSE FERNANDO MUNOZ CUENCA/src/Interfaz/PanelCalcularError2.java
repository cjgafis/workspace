package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelCalcularError2 extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	// ATRIBUTOS
	
	private JLabel labMedida;
	private JTextArea txaMedida;

	
	
	private JButton butErrorAbsolutoInf;           
	private JButton butErrorRelativoInf;
	private JButton butErrorPrecisionInf;
	private JButton butErrorExatitudInf;
	private JButton butPrecisionInf;
	private JButton butExactitudInf;
	private JButton butPromedioInf;
	
	private JLabel labVacio1;
	private JLabel labResultado;
	private JTextField txtResultado;
	
	private JButton butLimpiar2;
	
	private InterfazProyec interfazProyec;
	
	

	//METODO CONSTRUCTOR
	public PanelCalcularError2(InterfazProyec interfazPoryec)
	{ 
		this.interfazProyec = interfazPoryec;
		
		//DISEÑO
		TitledBorder border = BorderFactory.createTitledBorder("CALCULAR VARIAS MEDIDAS");
		setBorder(border);
		border.setTitleColor(Color.DARK_GRAY);
		setLayout(new GridLayout(6,4));

		//INSTATIACION DEL PANEL
		labMedida = new JLabel("Medida");
		txaMedida = new JTextArea("");
		JScrollPane sp = new JScrollPane(txaMedida);
		
		
		butErrorAbsolutoInf = new JButton("EA");
		butErrorAbsolutoInf.addActionListener(this);
		
		butErrorRelativoInf = new JButton("ER");
		butErrorRelativoInf.addActionListener(this);
		
		butErrorPrecisionInf = new JButton("EP");
		butErrorPrecisionInf.addActionListener(this);
		
		butPrecisionInf = new JButton("P");
		butPrecisionInf.addActionListener(this);
		
		butErrorExatitudInf = new JButton("Ee");
		butErrorExatitudInf.addActionListener(this);
		
	    butExactitudInf = new JButton("E");
	    butExactitudInf. addActionListener(this);
	    
	    butPromedioInf = new JButton("MProme%");
	    butPromedioInf.addActionListener(this);
		
	    labVacio1 = new JLabel("");
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField("");
		
		butLimpiar2 = new JButton("Limpiar");
		butLimpiar2.addActionListener(this);
				

		//ADICCIONAR

		add(labMedida);
		add(txaMedida);
		add(sp);
		
		add(labResultado);
		add(txtResultado);
		add(labVacio1);
		
		add(butPromedioInf);
		add(butErrorAbsolutoInf);
		add(butErrorRelativoInf);
		add(butErrorExatitudInf);
		add(butErrorPrecisionInf);
		add(butExactitudInf);
		add(butPrecisionInf);
		add(butLimpiar2);		
	}

	public String getTxaMedida()
	{
		return txaMedida.getText();
	}
	public void setTxtResuldado(String resultado)
	{
		txtResultado.setText(resultado);
	}

	public void limpiar2()
	{
		txaMedida.setText("");
		txtResultado.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		if(arg0.getSource()==butLimpiar2)
		{
			interfazProyec.limpiar2();
		}
		else if(arg0.getSource()== butErrorAbsolutoInf)
		{
			interfazProyec.errorAbsolutoInf();
		}
		else if(arg0.getSource()== butErrorRelativoInf)
		{
			interfazProyec.errorRelativoInf();
		}
		else if(arg0.getSource()== butErrorPrecisionInf)
		{
			interfazProyec.errorPrecisionInf();
		}
		else if(arg0.getSource()== butPrecisionInf)
		{
			interfazProyec.precisionInf();
		}
		else if(arg0.getSource()== butErrorExatitudInf)
		{
			interfazProyec.errorExactitudInf();
		}
		else if(arg0.getSource()== butExactitudInf)
		{
			interfazProyec.exactitudInf();
		}
		else if(arg0.getSource()== butPromedioInf)
		{
			interfazProyec.promedioInf();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}

	
