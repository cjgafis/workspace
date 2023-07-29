package interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	// DECLARAR LOS ATRIBUTOS 
	private JLabel labVV;
	private JTextField txtVV;
	private JLabel labMedidas;
	private JTextField txtMedidas;
	
	private JLabel labMP;
	private JTextField txtMP;
	private JLabel labML;
	private JTextField txtML;
	
	private JLabel labEA;
	private JTextField txtEA;
	private JLabel labER;
	private JTextField txtER;
	
	private JLabel labPEE;
	private JTextField txtPEE;
	private JLabel labPE;
	private JTextField txtPE;
	
	private JLabel labPEP;
	private JTextField txtPEP;
	private JLabel labPP;
	private JTextField txtPP;

	public PanelDatos() 
	{
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Datos");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5, 4));
		
		// CREAR LOS OBJETOS - INSTANCIAR
		labVV = new JLabel("Vv");
		txtVV = new JTextField();
		labMedidas = new JLabel("Medidas");
		txtMedidas = new JTextField();
		
		labMP = new JLabel("Mp");
		txtMP = new JTextField();
		labML = new JLabel("Ml");
		txtML = new JTextField();
		
		labEA = new JLabel("Ea");
		txtEA = new JTextField();
		labER = new JLabel("Er");
		txtER = new JTextField();
		
		labPEE = new JLabel("%Ee");
		txtPEE = new JTextField();
		labPE = new JLabel("%E");
		txtPE = new JTextField();
		
		labPEP = new JLabel("%Ep");
		txtPEP = new JTextField();
		labPP = new JLabel("%P");
		txtPP = new JTextField();
		
		// AGREGAR LOS OBJETOS AL DISEÑO DEL PANEL
		add(labVV);
		add(txtVV);
		add(labMedidas);
		add(txtMedidas);
		add(labMP);
		add(txtMP);
		add(labML);
		add(txtML);
		add(labEA);
		add(txtEA);
		add(labER);
		add(txtER);
		add(labPEE);
		add(txtPEE);
		add(labPE);
		add(txtPE);
		add(labPEP);
		add(txtPEP);
		add(labPP);
		add(txtPP);
	}

	public String getTxtVV()
	{
		return txtVV.getText();
	}
	
	public String getTxtMedidas()
	{
		return txtMedidas.getText();
	}
	
	public String getTxtMP()
	{
		return txtMP.getText();
	}
	
	public void setTxtMP(double MP)
	{
		txtMP.setText("" + MP);
	}
	
	public String getTxtML()
	{
		return txtML.getText();
	}
	
	public void setTxtML(double ML)
	{
		txtML.setText("" + ML);
	}
	
	public String getTxtEA()
	{
		return txtEA.getText();
	}
	
	public void setTxtEA(double EA)
	{
		txtEA.setText("" + EA);
	}
	
	public String getTxtER()
	{
		return txtER.getText();
	}
	
	public void setTxtER(double ER)
	{
		txtER.setText("" + ER);
	}
	
	public String getTxtPEE()
	{
		return txtPEE.getText();
	}
	
	public void setTxtPEE(double PEE)
	{
		txtPEE.setText("" + PEE);
	}
	
	public String getTxtPE()
	{
		return txtPE.getText();
	}
	
	public void setTxtPE(double PE)
	{
		txtPE.setText("" + PE);
	}
	
	public String getTxtPEP()
	{
		return txtPEP.getText();
	}
	
	public void setTxtPEP(double PEP)
	{
		txtPEP.setText("" + PEP);
	}
	
	public String getTxtPP()
	{
		return txtPP.getText();
	}
	
	public void setTxtPP(double PP)
	{
		txtPP.setText("" + PP);
	}
	
	public void limpiar()
	{
		txtVV.setText("");
		txtMedidas.setText("");
		txtMP.setText("");
		txtML.setText("");
		txtEA.setText("");
		txtER.setText("");
		txtPEE.setText("");
		txtPE.setText("");
		txtPEP.setText("");
		txtPP.setText("");
	}

}
