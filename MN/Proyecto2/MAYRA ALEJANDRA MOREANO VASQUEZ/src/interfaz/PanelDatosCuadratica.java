package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatosCuadratica extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel lblA;
	private JTextField txtA;
	private JLabel lblB;
	private JTextField txtB;
	private JLabel lblC;
	private JTextField txtC;
	
	public PanelDatosCuadratica () {
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Ingrese los siguientes datos:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(3,2));
		setSize(350, 50);
		
		// CREACIÓN DE OBJETOS
		lblA = new JLabel("a: ");
		txtA = new JTextField();
		lblB = new JLabel("b: ");
		txtB = new JTextField();
		lblC = new JLabel("c: ");
		txtC = new JTextField();
		
		// ADICIONAR OBJETOS
		add(lblA);
		add(txtA);
		add(lblB);
		add(txtB);
		add(lblC);
		add(txtC);
	}

	// GETTERS

	public String getTxtA() {
		return txtA.getText();
	}

	public String getTxtB() {
		return txtB.getText();
	}
	
	public String getTxtC() {
		return txtC.getText();
	}
	
	// SETTERS

	public void setTxtA(String txtA) {
		this.txtA.setText(txtA);
	}	
	
	public void setTxtB(String txtB) {
		this.txtB.setText(txtB);
	}
	
	public void setTxtC(String txtC) {
		this.txtC.setText(txtC);
	}	
	
}
