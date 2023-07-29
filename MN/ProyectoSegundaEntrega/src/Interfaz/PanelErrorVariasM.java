package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelErrorVariasM extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	private JLabel labMedida;
	private JTextArea txtMedidas;
	private JButton butEa;
	private JButton butEr;
	private JButton butEe;
	private JButton butE;
	private JButton butEp;
	private JButton butP;
	private JLabel labResultado;
	private JTextField txtResultado;
	private PanelError panelError;

	public PanelErrorVariasM(PanelError panelError)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Para varias medidas");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5,2));

		//INSTANCIAR
		this.panelError = panelError;
		labMedida = new JLabel("medidas");
		txtMedidas = new JTextArea("");
		JScrollPane sp = new JScrollPane(txtMedidas);
		butEa = new JButton("Ea");
		butEa.addActionListener(this);
		butEr = new JButton("Er");
		butEr.addActionListener(this);
		butEe = new JButton("%Ee");
		butEe.addActionListener(this);
		butE = new JButton("E");
		butE.addActionListener(this);
		butEp = new JButton("%Ep");
		butEp.addActionListener(this);
		butP = new JButton("P");
		butP.addActionListener(this);
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField("");
		txtResultado.setEditable(false);

		//ADICIONAR
		add(labMedida);
		add(sp);
		add(butEa);
		add(butEr);
		add(butEe);
		add(butE);
		add(butEp);
		add(butP);
		add(labResultado);
		add(txtResultado);

	}
	public String getMedidas()
	{
		return txtMedidas.getText();
	}
	public void setResultadoVarias(String resultado)
	{
		txtResultado.setText(resultado);
	}
	public void limpiar()
	{
		txtMedidas.setText("");
		txtResultado.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == butEa)
		{
			panelError.errorAbsoluto();
		}
		if (e.getSource() == butEr)
		{
			panelError.errorRelativo();
		}
		if (e.getSource() == butEe)
		{
			panelError.errorPExactitud();
		}
		if (e.getSource() == butE)
		{
			panelError.errorExactitud();
		}
		if (e.getSource() == butEp)
		{
			panelError.errorPPresicion();
		}
		if (e.getSource() == butP)
		{
			panelError.errorPresicion();
		}
	}
}
