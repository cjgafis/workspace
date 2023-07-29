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

public class PanelMetodoCerrado extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	private Interfaz interfazProyec;

	private JLabel labLIf;
	private JTextField txtLIf;
	
	private JLabel labelLSur;
	private JTextField txtLSur;
	
	private JLabel labelFuncion;
	private JTextField txtFuncion;
	
	private JButton butFalsaPocisicion;
	
	private JButton butBiseccion;
	
	private JButton butLimpiarM;
	
	private JLabel labResultadoxr1;
	private JTextField txtResultadoxr1;
	
	private JLabel labResultadoxr2;
	private JTextField txtResultadoxr2;
	
	public PanelMetodoCerrado(Interfaz interfazP)
	{
		  //DISE�O
	     TitledBorder border = BorderFactory.createTitledBorder("CALCULO RAICES METODOS CERRADOS");
	     setBorder(border);
	     border.setTitleColor(Color.DARK_GRAY);
	     setLayout(new GridLayout(4,5));
		this.interfazProyec =  interfazP;
		
		//INSTATIACION DEL PANEL
		
		labLIf = new JLabel("L,INF");
		txtLIf = new JTextField("");
		
		labelLSur = new JLabel("L,SUP");
		txtLSur = new JTextField("");
		
		  butFalsaPocisicion = new JButton("FALSA POSICIÓN");
		  butFalsaPocisicion.addActionListener(this);
		  
		  butBiseccion = new JButton("BISECCION");
		  butBiseccion.addActionListener(this);
		  
		  labelFuncion = new  JLabel("FUNCION");
		  txtFuncion = new JTextField("");
		  
		  butLimpiarM = new JButton("LIMPIAR");
		  butLimpiarM.addActionListener(this);
		  
		  labResultadoxr1 = new JLabel("RESULTADO BISECCIÓN");
		  txtResultadoxr1 = new JTextField("");
		  
		  labResultadoxr2 = new JLabel("RESULTADO FALSA POSICIÓN ");
		  txtResultadoxr2 = new JTextField("");
		  
		  
		  
		  add(labLIf);
		  add(txtLIf);
		  
		  add(labelLSur);
		  add(txtLSur);
		  
		  add(labelFuncion);
		  add(txtFuncion);
		  
		  add(labResultadoxr1);
		  add(txtResultadoxr1);
		  add(labResultadoxr2);
		  add(txtResultadoxr2);
		  add(butFalsaPocisicion);
		  add(butBiseccion);
		  add(butLimpiarM);
	}

	
	public String getTxtLIf()
	{
		return txtLIf.getText();
	}
	public String getTxtLSur()
	{
		return txtLSur.getText();
	}
	
	public String getTxtFuncion()
	{
		return txtFuncion.getText();
	}
	public void setTxtResultadoxr1(String resultado)
	{
		txtResultadoxr1.setText(resultado);
	}
	public void setTxtResultadoxr2(String resultado)
	{
		txtResultadoxr2.setText(resultado);
	}
	public void limpiarM()
	{
		txtLIf.setText("");
		txtLSur.setText("");
		txtResultadoxr1.setText("");
		txtResultadoxr2.setText("");
		txtFuncion.setText("");
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		 if(arg0.getSource()== butLimpiarM)
			{
				 interfazProyec.limpiarM();
			}
		 else if(arg0.getSource()==butFalsaPocisicion)
		 {
			 interfazProyec.falsaPocisicion();
		 }
		 else if(arg0.getSource()==butBiseccion)
		 {
			 interfazProyec.biseccion();
		 }
		 
				
		
	}

}
