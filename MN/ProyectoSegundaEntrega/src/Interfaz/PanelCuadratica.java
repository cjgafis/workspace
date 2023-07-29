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

public class PanelCuadratica extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
		private JLabel labA;
		private JTextField txtA;
		private JLabel labB;
		private JTextField txtB;
		private JLabel labC;
		private JTextField txtC;
		private JLabel labRaiz1;
		private JTextField txtRaiz1;
		private JLabel labRaiz2;
		private JTextField txtRaiz2;
		private JButton butCalcular;
		private JButton butLimpiar;
		private InterfazProyecto interfazProyecto;
		
		
		
		public PanelCuadratica(InterfazProyecto interfazProyecto)
		{
			//DISENIO
			TitledBorder borde = BorderFactory.createTitledBorder("Ecuacion cuadratica");
			setBorder(borde);
			borde.setTitleColor(Color.BLUE);
			setLayout(new GridLayout(3,4));
			
			//INSTANCIAR
			this.interfazProyecto = interfazProyecto;
			labA = new JLabel("Valor de (a)");
			txtA = new JTextField();
			labB = new JLabel("Valor de (b)");
			txtB = new JTextField();
			labC = new JLabel("Valor de (c)");
			txtC = new JTextField();
			labRaiz1 = new JLabel("Raiz 1");
			txtRaiz1 = new JTextField();
			txtRaiz1.setEditable(false);
			labRaiz2 = new JLabel("Raiz 2");
			txtRaiz2 = new JTextField();
			txtRaiz2.setEditable(false);
			butCalcular = new JButton("Calcular");
			butCalcular.addActionListener(this);
			butLimpiar = new JButton("Limpiar");
			butLimpiar.addActionListener(this);
			
			//ADICIONAR
			add(labA);
			add(txtA);
			add(labRaiz1);
			add(txtRaiz1);
			add(labB);
			add(txtB);
			add(labRaiz2);
			add(txtRaiz2);
			add(labC);
			add(txtC);
			add(butCalcular);
			add(butLimpiar);
			
		}
		public double getA()
		{
			return Double.parseDouble(txtA.getText());
		}
		public double getB()
		{
			return Double.parseDouble(txtB.getText());
		}
		public double getC()
		{
			return Double.parseDouble(txtC.getText());
		}
		public void setRaiz1(String respuesta)
		{
			txtRaiz1.setText(respuesta);
		}
		public void setRaiz2(String respuesta)
		{
			txtRaiz2.setText(respuesta);
		}
		public void limpiar()
		{
			txtA.setText("");
			txtB.setText("");
			txtC.setText("");
			txtRaiz1.setText("");
			txtRaiz2.setText("");
		}
		@Override
		public void actionPerformed(ActionEvent arg0) 
		{
			if (arg0.getSource() == butCalcular)
			{
				interfazProyecto.ecuacion();
			}
			if (arg0.getSource() == butLimpiar)
			{
				interfazProyecto.limpiar();
			}
		}
}
