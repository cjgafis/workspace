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

public class PanelCuadratica extends JPanel implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// ATRIBUTOS - DECLARAR
	private JLabel labValorA;
	private JTextField txtValorA;
	private JLabel labValorB;
	private JTextField txtValorB;
	private JLabel labValorC;
	private JTextField txtValorC;
	private JLabel labRaiz1;
	private JTextField txtRaiz1;
	private JLabel labRaiz2;
	private JTextField txtRaiz2;
	private JButton butCalcular;
	private JButton butLimpiar;
	private InterfazCalculoRaiz cuadratica;
	// METODO CONSTRUCTOR
	public PanelCuadratica(InterfazCalculoRaiz cuadratica) {
		
		this.cuadratica = cuadratica;
		// DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Cuadratica");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(6, 2));

		// CREAMOS LOS OBJETOS
		labValorA = new JLabel("Valor (a)");
		txtValorA = new JTextField();

		labValorB = new JLabel("Valor (b)");
		txtValorB = new JTextField();

		labValorC = new JLabel("Valor (c)");
		txtValorC = new JTextField();

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

		// ADICIONAMOS LOS OBJETOS AL DISE�O

		add(labValorA);
		add(txtValorA);
		add(labValorB);
		add(txtValorB);
		add(labValorC);
		add(txtValorC);
		add(labRaiz1);
		add(txtRaiz1);
		add(labRaiz2);
		add(txtRaiz2);
		add(butCalcular);
		add(butLimpiar);
	}

	// METODOS PARA OBTERNER Y ESCRIBIR INFORMACION
	// EN LOS CAMPOS DE TEXTO

	public String getTxtValorA() {
		return txtValorA.getText();
	}

	public String getTxtValorB() {
		return txtValorB.getText();
	}

	public String getTxtValorC() {
		return txtValorC.getText();
	}

	public void setTxtRaiz1(double raiz1) {
		txtRaiz1.setText("" + raiz1);
	}

	public void setTxtRaiz2(double raiz2) {
		txtRaiz2.setText("" + raiz2);
	}

	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == butCalcular) {
			cuadratica.raiz1();
			cuadratica.raiz2();
		} else if (evento.getSource() == butLimpiar) {
			txtValorA.setText("");
			txtValorB.setText("");
			txtValorC.setText("");
			txtRaiz1.setText("");
			txtRaiz2.setText("");
		}
	}


}
