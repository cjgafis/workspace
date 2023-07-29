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

public class PanelErrorMedida extends JPanel implements ActionListener
{
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS
	private JLabel labVv;
	private JTextField txtVv;
	private JLabel labMedida;
	private JTextField txtMedida;
	private JButton butEa;
	private JButton butEr;
	private JButton butEe;
	private JButton butE;
	private JLabel labResultado;
	private JTextField txtResultado;
	private PanelError panelError;

	public PanelErrorMedida(PanelError panelError)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Para una medida");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(5,2));

		//INSTANCIAR
		this.panelError = panelError;
		labVv = new JLabel("Valor verdadero");
		txtVv = new JTextField("");
		labMedida = new JLabel("medida");
		txtMedida = new JTextField("");
		butEa = new JButton("Ea");
		butEa.addActionListener(this);
		butEr = new JButton("Er");
		butEr.addActionListener(this);
		butEe = new JButton("%Ee");
		butEe.addActionListener(this);
		butE = new JButton("E");
		butE.addActionListener(this);
		labResultado = new JLabel("Resultado");
		txtResultado = new JTextField("");
		txtResultado.setEditable(false);
		
		//ADICIONAR
		add(labVv);
		add(txtVv);
		add(labMedida);
		add(txtMedida);
		add(butEa);
		add(butEr);
		add(butEe);
		add(butE);
		add(labResultado);
		add(txtResultado);

	}
	public double getMedida()
	{
		return Double.parseDouble(txtMedida.getText());
	}
	public double getVv()
	{
		return Double.parseDouble(txtVv.getText());
	}
	public void setResultado(String resultado)
	{
		txtResultado.setText(resultado);
	}
	public void limpiar()
	{
		txtMedida.setText(" ");
		txtVv.setText("");
		txtResultado.setText("");
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource() == butEa)
		{
			panelError.errorAbsoluto1Medida();
		}
		if (e.getSource() == butEr)
		{
			panelError.errorRelativo1Medida();
		}
		if (e.getSource() == butEe)
		{
			panelError.errorPExactitud1Medida();
		}
		if (e.getSource() == butE)
		{
			panelError.errorExactitud1Medida();
		}
	}
}
