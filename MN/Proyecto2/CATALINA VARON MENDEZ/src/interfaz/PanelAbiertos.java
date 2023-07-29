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

public class PanelAbiertos extends JPanel implements ActionListener
{
	private JLabel labFuncionFx;
	private JTextField txtFuncionFx;	
	private JLabel labXi;
	private JTextField txtXi;
	private JLabel labResultado;
	private JTextField txtResultado;
	private JButton butPuntoFijo;
	private JButton butNewtonRaphsoon;
	private JLabel labVacio;
	private JButton butLimpiar;
	private InterfazCalculoRaiz ventana;
	
	public PanelAbiertos(InterfazCalculoRaiz ventana)
	{
		this.ventana = ventana;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Métodos abiertos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(6, 2));


		// CREAMOS LOS OBJETOS
		labFuncionFx = new JLabel ("Funcion Gx");
		txtFuncionFx = new JTextField();
		
		labXi = new JLabel (" Xi ");
		txtXi = new JTextField();
		
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField();
		
		butPuntoFijo = new JButton (" Punto Fijo ");
		butPuntoFijo.addActionListener(this);
		
		butNewtonRaphsoon = new JButton (" NewtonRaphsoon ");
		butNewtonRaphsoon.addActionListener(this);
		
		labVacio = new JLabel();
		
		butLimpiar = new JButton ("Limpiar");
		butLimpiar.addActionListener(this);
		
		// ADICIONAMOS LOS OBJETOS AL DISEÑO
		add(labFuncionFx);
		add(txtFuncionFx);
		add(labXi);
		add(txtXi);
		add(labResultado);
		add(txtResultado);
		add(butPuntoFijo);
		add(butNewtonRaphsoon);
		add(labVacio);
		add(butLimpiar);
	}
	// METODOS PARA OBTERNER Y ESCRIBIR INFORMACIÓN 
			// EN LOS CAMPOS DE TEXTO
			
			public String getTxtFuncionFx()
			{
				return txtFuncionFx.getText(); 
			}
			
			public String getTxtXi()
			{
				return txtXi.getText(); 
			}
			
			public void setTxtResultado(double resultado)
			{
				txtResultado.setText("" + resultado);
			}
			
			public void limpiar()
			{
				txtFuncionFx.setText("");
				txtXi.setText("");
				txtResultado.setText("");
				
			}
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				
				if(e.getSource() == butPuntoFijo)
				{
					ventana.PuntoFijo();
				}
				else if(e.getSource() == butNewtonRaphsoon)
				{
					ventana.NewtonRaphsoon();
					
				}
				else if(e.getSource() == butLimpiar)
				{
					ventana.limpiarAbiertos();
				}
			}
		
		
		
			
		}
		
