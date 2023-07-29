package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel labVv;
	public JTextField txtVv;

	private JLabel labMedidas;
	public JTextField txtMedidas;

	private JLabel labMp;
	public JTextField txtMp;

	private JLabel labMl;
	public JTextField txtMl;

	private JLabel labEa;
	public JTextField txtEa;

	private JLabel labEr;
	public JTextField txtEr;

	private JLabel labEe;
	public JTextField txtEe;

	private JLabel labE;
	public JTextField txtE;

	private JLabel labEp;
	public JTextField txtEp;

	private JLabel labPP;
	public JTextField txtPP;


	public PanelDatos ( ) {

		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout (new GridLayout (5,4));

		labVv = new JLabel("Vv");
		txtVv = new JTextField();

		labMedidas = new JLabel("Medidas");
		txtMedidas = new JTextField();

		labMp = new JLabel("Mp");
		txtMp = new JTextField();

		labMl = new JLabel("Ml");
		txtMl = new JTextField();

		labEa = new JLabel("Ea");
		txtEa = new JTextField();

		labEr = new JLabel("Er");
		txtEr = new JTextField();

		labEe = new JLabel("%Ee");
		txtEe = new JTextField();

		labE = new JLabel("%E");
		txtE = new JTextField();

		labEp = new JLabel("%Ep");
		txtEp = new JTextField();

		labPP = new JLabel("%P");
		txtPP = new JTextField();

		add(labVv);
		add(txtVv);

		add(labMedidas);
		add(txtMedidas);

		add(labMp);
		add(txtMp);

		add(labMl);
		add(txtMl);

		add(labEa);
		add(txtEa);

		add(labEr);
		add(txtEr);

		add(labEe);
		add(txtEe);

		add(labE);
		add(txtE);

		add(labEp);
		add(txtEp);

		add(labPP);
		add(txtPP);


	}
	public String getTxtVv() {

		return txtVv.getText();

	}
	public void setTxtVv(double Vv) {

		txtVv.setText(""+ Vv);

	}
	public String getTxtMedidas() {

		return txtMedidas.getText();
	}

	public void setTxtMedidas(double Medidas) {

		txtMedidas.setText(""+ Medidas);

	}
	public String getTxtMp() {

		return txtMp.getText();
	}
	public void setTxtMp(double Mp) {

		txtMp.setText(""+ Mp);

	}

	public String getTxtMl() {

		return txtMl.getText();
	}
	public void setTxtMl(double Ml) {

		txtMl.setText(""+ Ml);

	}
	public String getTxtEa() {

		return txtEa.getText();
	}
	public void setTxtEa(double Ea) {

		txtEa.setText(""+ Ea);

	}
	public String getTxtEr() {

		return txtEr.getText();
	}
	public void setTxtEr(double Er) {

		txtEr.setText(""+ Er);

	}

	public String getTxtEe() {

		return txtEe.getText();
	}
	public void setTxtEe(double Ee) {

		txtEe.setText(""+ Ee);

	}
	public String getTxtE() {

		return txtE.getText();
	}
	public void setTxtE(double E) {

		txtE.setText(""+ E);

	}
	public String getTxtEp() {

		return txtEp.getText();
	}
	public void setTxtEp(double Ep) {

		txtEp.setText(""+ Ep);

	}
	public String getTxtPP() {

		return txtPP.getText();
	}
	public void setTxtP(double PP) {

		txtPP.setText(""+ PP);

	}
	public void reiniciar(){

		txtVv.setText("");
		txtMedidas.setText("");
		txtMp.setText("");
		txtMl.setText("");
		txtEa.setText("");
		txtEr.setText("");
		txtEe.setText("");
		txtE.setText("");
		txtEp.setText("");
		txtPP.setText("");

	}



}


