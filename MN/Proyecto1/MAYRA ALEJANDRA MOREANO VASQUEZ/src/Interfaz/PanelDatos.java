package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JLabel lblValorVerdadero;
	private JTextField txtValorVerdadero;
	
	private JLabel lblMedidas;
	private JTextField txtMedidas;
	
	private JLabel lblMedidaPromedio;
	private JTextField txtMedidaPromedio;
	
	private JLabel lblMedidaLejana;
	private JTextField txtMedidaLejana;	
	
	private JLabel lblErrorAbsoluto;
	private JTextField txtErrorAbsoluto;	
	
	private JLabel lblErrorRelativo;
	private JTextField txtErrorRelativo;
	
	private JLabel lblErrorExactitud;
	private JTextField txtErrorExactitud;
	
	private JLabel lblExactitud;
	private JTextField txtExactitud;	
	
	private JLabel lblErrorPrecision;
	private JTextField txtErrorPrecision;	
	
	private JLabel lblPrecision;
	private JTextField txtPrecision;	
	
	public PanelDatos () {
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLACK);
		borde.setTitleFont(getFont());
		setLayout(new GridLayout(5,4));
		
		// CREACIÓN DE OBJETOS
		lblValorVerdadero = new JLabel("Vv: ");
		txtValorVerdadero = new JTextField("");
		lblMedidas = new JLabel("Medidas: ");
		txtMedidas = new JTextField("");
		lblMedidaPromedio = new JLabel("Mp: ");
		txtMedidaPromedio = new JTextField("");
		lblMedidaLejana = new JLabel("Ml: ");
		txtMedidaLejana = new JTextField("");	
		lblErrorAbsoluto = new JLabel("Ea: ");
		txtErrorAbsoluto = new JTextField("");
		lblErrorRelativo = new JLabel("Er: ");
		txtErrorRelativo = new JTextField("");
		lblErrorExactitud = new JLabel("%Ee: ");
		txtErrorExactitud = new JTextField("");
		lblExactitud = new JLabel("%E: ");
		txtExactitud = new JTextField("");
		lblErrorPrecision = new JLabel("%Ep: ");
		txtErrorPrecision = new JTextField("");	
		lblPrecision = new JLabel("%P: ");
		txtPrecision = new JTextField("");	
		
		// SETEDITABLE
		txtMedidaPromedio.setEditable(false);
		txtMedidaLejana.setEditable(false);
		txtErrorAbsoluto.setEditable(false);
		txtErrorRelativo.setEditable(false);
		txtErrorExactitud.setEditable(false);
		txtExactitud.setEditable(false);
		txtErrorPrecision.setEditable(false);
		txtPrecision.setEditable(false);
		
		// ADICIONAR OBJETOS
		add(lblValorVerdadero);
		add(txtValorVerdadero);
		add(lblMedidas);
		add(txtMedidas);
		add(lblMedidaPromedio);
		add(txtMedidaPromedio);
		add(lblMedidaLejana);
		add(txtMedidaLejana);	
		add(lblErrorAbsoluto);
		add(txtErrorAbsoluto);
		add(lblErrorRelativo);
		add(txtErrorRelativo);
		add(lblErrorExactitud);
		add(txtErrorExactitud);
		add(lblExactitud);
		add(txtExactitud);
		add(lblErrorPrecision);
		add(txtErrorPrecision);	
		add(lblPrecision);
		add(txtPrecision);
		
		// ADICIONAR ACTIONLISTENER 
		txtMedidas.addActionListener(this);
	}

	// ENTREGAR LOS DATOS EN EL TIPO DE DATOS QUE SE REQUIERE
	public double getTxtValorVerdaderoEnDouble() {
		return Double.parseDouble(txtValorVerdadero.getText());
	}

	public ArrayList <Double> getTxtMedidasEnArray() {
		String [] medidasString = (txtMedidas.getText().split(","));
		ArrayList <Double> medidas = new ArrayList<>();
		for (int i = 0; i < medidasString.length; i++) {
			medidas.add(Double.parseDouble(medidasString[i]));
		}
		return medidas;
	}
	
	// PARA LIMPIAR LOS RESULTADOS
	public void setTxtValorVerdadero(String txtValorVerdadero) {
		this.txtValorVerdadero.setText(txtValorVerdadero);
	}	
	
	public void setTxtMedidaPromedio(String txtMedidaPromedio) {
		this.txtMedidaPromedio.setText(txtMedidaPromedio);
	}
	
	public void setTxtMedidaLejana(String txtMedidaLejana) {
		this.txtMedidaLejana.setText(txtMedidaLejana);
	}

	public void setTxtErrorAbsoluto(String txtErrorAbsoluto) {
		this.txtErrorAbsoluto.setText(txtErrorAbsoluto);
	}

	public void setTxtErrorRelativo(String txtErrorRelativo) {
		this.txtErrorRelativo.setText(txtErrorRelativo);
	}
	
	public void setTxtErrorExactitud(String txtErrorExactitud) {
		this.txtErrorExactitud.setText(txtErrorExactitud);
	}
	
	public void setTxtExactitud(String txtExactitud) {
		this.txtExactitud.setText(txtExactitud);
	}

	public void setTxtErrorPrecision(String txtErrorPrecision) {
		this.txtErrorPrecision.setText(txtErrorPrecision);
	}

	public void setTxtPrecision(String txtPrecision) {
		this.txtPrecision.setText(txtPrecision);
	}

	public void setTxtMedidas(String txtMedidas) {
		this.txtMedidas.setText(txtMedidas);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == txtMedidas) {
			JOptionPane.showMessageDialog(this, "Ingrese las medidas separadas por una coma (,)", "Mensaje importante", JOptionPane.WARNING_MESSAGE);
		}
	}
	
}
