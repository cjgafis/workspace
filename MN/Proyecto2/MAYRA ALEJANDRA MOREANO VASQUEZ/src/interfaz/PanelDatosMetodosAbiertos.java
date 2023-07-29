package interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatosMetodosAbiertos extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel lblFuncion;
	private JTextField txtFuncion;
	private JLabel lblFuncionTransformada;
	private JTextField txtFuncionTransformada;
	private JLabel lblValorInicial;
	private JTextField txtValorInicial;
	private JLabel lblErrorPermitido;
	private JTextField txtErrorPermitido;
	
	public PanelDatosMetodosAbiertos () {
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Ingrese los siguientes datos:");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(4,1));
		
		// CREACIÓN DE OBJETOS
		lblFuncion = new JLabel("Función: ");
		txtFuncion = new JTextField();
		lblFuncionTransformada = new JLabel("Función transformada: ");
		txtFuncionTransformada = new JTextField("Por defecto, es la función + x");
		lblValorInicial = new JLabel("Valor inicial: ");
		txtValorInicial = new JTextField();
		lblErrorPermitido = new JLabel("Error permitido: ");
		txtErrorPermitido = new JTextField("Por defecto, este es de 0.00001");
		
		// ADICIONAR OBJETOS
		add(lblFuncion);
		add(txtFuncion);
		add(lblFuncionTransformada);
		add(txtFuncionTransformada);
		add(lblValorInicial);
		add(txtValorInicial);
		add(lblErrorPermitido);
		add(txtErrorPermitido);
	}

	// GETTERS

	public String getTxtFuncion() {
		return txtFuncion.getText();
	}
	
	public String getTxtFuncionTransformada() {
		return txtFuncionTransformada.getText();
	}

	public String getTxtValorInicial() {
		return txtValorInicial.getText();
	}

	public String getTxtErrorPermitido() {
		return txtErrorPermitido.getText();
	}
	
	// SETTERS

	public void setTxtFuncion(String txtFuncion) {
		this.txtFuncion.setText(txtFuncion);
	}
	
	public void setTxtFuncionTransformada(String txtFuncionTransformada) {
		this.txtFuncionTransformada.setText(txtFuncionTransformada);
	}	
	
	public void setTxtValorInicial(String txtValorInicial) {
		this.txtValorInicial.setText(txtValorInicial);
	}	
	
	public void setTxtErrorPermitido(String txtErrorPermitido) {
		this.txtErrorPermitido.setText(txtErrorPermitido);
	}	
	
}
