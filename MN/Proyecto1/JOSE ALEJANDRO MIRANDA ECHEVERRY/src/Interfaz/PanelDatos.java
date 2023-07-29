package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	 private JLabel labNumero1;
	 private JLabel labNumero2;
	 private JLabel labNumero3;
	 private JLabel labNumero4;
	 private JLabel labNumero5;
	 private JLabel labNumero6;
	 private JLabel labNumero7;
	 private JLabel labNumero8;
	 private JLabel labNumero9;
	 private JLabel labNumero10;
	 
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtNumero3;
    private JTextField txtNumero4;
    private JTextField txtNumero5;
    private JTextField txtNumero6;
    private JTextField txtNumero7;
    private JTextField txtNumero8;
    private JTextField txtNumero9;
    private JTextField txtNumero10;

	public PanelDatos() {
		
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5, 5));
		
		// CREAR LOS OBJETOS
		labNumero1 = new JLabel("M");
		labNumero2 = new JLabel("Vv");
		labNumero3 = new JLabel("Ea");
		labNumero4 = new JLabel("Mp");
		labNumero5 = new JLabel("Ml");
		labNumero6 = new JLabel("Er");
		labNumero7 = new JLabel("%Ee");
		labNumero8 = new JLabel("%E");
		labNumero9 = new JLabel("%Ep");
		labNumero10 = new JLabel("%P");
		
		txtNumero1 = new JTextField();
		txtNumero2 = new JTextField();
		txtNumero3 = new JTextField();
		txtNumero4 = new JTextField();
		txtNumero5 = new JTextField();
		txtNumero6 = new JTextField();
		txtNumero7 = new JTextField();
		txtNumero8 = new JTextField();
		txtNumero9 = new JTextField();
		txtNumero10 = new JTextField();
		
		add(labNumero1);
		add(txtNumero1);
		add(labNumero2);
		add(txtNumero2);
		add(labNumero3);
		add(txtNumero3);
		add(labNumero4);
		add(txtNumero4);
		add(labNumero5);
		add(txtNumero5);
		add(labNumero6);
		add(txtNumero6);
		add(labNumero7);
		add(txtNumero7);
		add(labNumero8);
		add(txtNumero8);
		add(labNumero9);
		add(txtNumero9);
		add(labNumero10);
		add(txtNumero10);
	}
		
		public String gettxtNumero1()
		{
			return txtNumero1.getText();
		}
		public String gettxtNumero2()
		{
			return txtNumero2.getText();
	
		}}

