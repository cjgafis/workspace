package interfaz;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel
{
	 private JLabel labVV;
	 private JLabel labMedidas;
	 private JLabel labEa;
	 private JLabel labEr;
	 private JLabel labMp;
	 private JLabel labMl;
	 private JLabel labPEe;
	 private JLabel labPE;
	 private JLabel labPEp;
	 private JLabel labPP;
	 
    private JTextField txtVV;
    private JTextField txtMedidas;
    private JTextField txtEa;
    private JTextField txtEr;
    private JTextField txtMp;
    private JTextField txtMl;
    private JTextField txtPEe;
    private JTextField txtPE;
    private JTextField txtPEp;
    private JTextField txtPP;
    
    public PanelDatos()
    {
    	TitledBorder borde = BorderFactory.createTitledBorder("Data");
		setBorder(borde);
		setLayout(new GridLayout(6, 4));
		
		
		labVV = new JLabel("VV");
		labMedidas = new JLabel("Medidas");
		labEa = new JLabel("Ea");
		labEr = new JLabel("Er");
		labMp = new JLabel("Mp");
		labMl = new JLabel("Ml");
		labPEe = new JLabel("PEe");
		labPE = new JLabel("PE");
		labPEp = new JLabel("PEp");
		labPP = new JLabel("PP");
		
		txtVV = new JTextField();
		txtMedidas = new JTextField();
	    txtEa = new JTextField();
	    txtEr = new JTextField();
	    txtMp = new JTextField();
	    txtMl = new JTextField();
	    txtPEe = new JTextField();
	    txtPE = new JTextField();
	    txtPEp = new JTextField();
	    txtPP = new JTextField();
	    
	    add(labVV);
		add(txtVV);
		add(labMedidas);
		add(txtMedidas);
		
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		add(new JLabel(""));
		
		add(labEa);
		add(txtEa);
		add(labEr);
		add(txtEr);
		
		add(labMp);
		add(txtMp);
		add(labMl);
		add(txtMl);
		
		add(labPEe);
		add(txtPEe);
		add(labPE);
		add(txtPE);
		
		add(labPEp);
		add(txtPEp);
		add(labPP);
		add(txtPP);
		
		
		
		
		
    }

}
