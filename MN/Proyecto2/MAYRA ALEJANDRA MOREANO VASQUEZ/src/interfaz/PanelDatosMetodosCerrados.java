package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatosMetodosCerrados extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel lblFuncion;
	private JTextField txtFuncion;
	private JLabel lblLimiteInferior;
	private JTextField txtLimiteInferior;
	private JLabel lblLimiteSuperior;
	private JTextField txtLimiteSuperior;
	private JLabel lblErrorPermitido;
	private JTextField txtErrorPermitido;
	
	public PanelDatosMetodosCerrados () {
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Ingrese los siguientes datos:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(4,1));
		
		// CREACIÓN DE OBJETOS
		lblFuncion = new JLabel("Función: ");
		txtFuncion = new JTextField();
		lblLimiteInferior = new JLabel("Limite inferior: ");
		txtLimiteInferior = new JTextField();
		lblLimiteSuperior = new JLabel("Limite superior: ");
		txtLimiteSuperior = new JTextField();
		lblErrorPermitido = new JLabel("Error permitido: ");
		txtErrorPermitido = new JTextField("Por defecto, este es de 0.00001");
		
		// ADICIONAR OBJETOS
		add(lblFuncion);
		add(txtFuncion);
		add(lblLimiteInferior);
		add(txtLimiteInferior);
		add(lblLimiteSuperior);
		add(txtLimiteSuperior);
		add(lblErrorPermitido);
		add(txtErrorPermitido);
	}

	// GETTERS

	public String getTxtFuncion() {
		return txtFuncion.getText();
	}
	
	public String getTxtLimiteInferior() {
		return txtLimiteInferior.getText();
	}

	public String getTxtLimiteSuperior() {
		return txtLimiteSuperior.getText();
	}

	public String getTxtErrorPermitido() {
		return txtErrorPermitido.getText();
	}
	
	// SETTERS

	public void setTxtFuncion(String txtFuncion) {
		this.txtFuncion.setText(txtFuncion);
	}
	
	public void setTxtLimiteInferior(String txtLimiteInferior) {
		this.txtLimiteInferior.setText(txtLimiteInferior);
	}	
	
	public void setTxtLimiteSuperior(String txtLimiteSuperior) {
		this.txtLimiteSuperior.setText(txtLimiteSuperior);
	}	
	
	public void setTxtErrorPermitido(String txtErrorPermitido) {
		this.txtErrorPermitido.setText(txtErrorPermitido);
	}	
	
}
