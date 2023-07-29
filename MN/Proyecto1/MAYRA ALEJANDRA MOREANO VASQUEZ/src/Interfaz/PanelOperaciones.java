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

public class PanelOperaciones extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	// ATRIBUTOS
	private JButton btnPr;
	private JButton btnMl;
	private JButton btnEa;
	private JButton btnEr;
	private JButton btnEe;
	private JButton btnE;
	private JButton btnEp;
	private JButton btnP;
	private JLabel lblVacio1;
	private JLabel lblVacio2;
	private JLabel lblVacio3;
	private JButton btnLimpiar;
	private InterfazTeoriaError interfazCalculadora;

	public PanelOperaciones (InterfazTeoriaError interfazCalculadora) {
		
		this.interfazCalculadora = interfazCalculadora;
		
		// DISEÑO
		TitledBorder borde = BorderFactory.createTitledBorder("Operaciones");
		setBorder(borde);
		borde.setTitleColor(Color.BLACK);
		setLayout(new GridLayout(3,4));
		
		// CREACIÓN DE OBJETOS
		btnPr = new JButton("Pr");
		btnMl = new JButton("Ml");
		btnEa = new JButton("Ea");
		btnEr = new JButton("Er");
		btnEe = new JButton("%Ee");
		btnE = new JButton("%E");
		btnEp = new JButton("%Ep");
		btnP = new JButton("%P");
		lblVacio1 = new JLabel("");
		lblVacio2 = new JLabel("");
		lblVacio3 = new JLabel("");
		btnLimpiar  = new JButton("Limpiar");
		
		// ADICIONAR OBJETOS
		add(btnPr);
		add(btnMl);
		add(btnEa);
		add(btnEr);
		add(btnEe);
		add(btnE);
		add(btnEp);
		add(btnP);
		add(lblVacio1);
		add(lblVacio2);
		add(lblVacio3);
		add(btnLimpiar);
		
		// ADICIONAR ACTIONLISTENER
		btnPr.addActionListener(this);
		btnMl.addActionListener(this);
		btnEa.addActionListener(this);
		btnEr.addActionListener(this);
		btnEe.addActionListener(this);
		btnE.addActionListener(this);
		btnEp.addActionListener(this);
		btnP.addActionListener(this);
		btnLimpiar.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnPr ) {
			interfazCalculadora.calcularPr();
		} else if (e.getSource() == btnMl) {
			interfazCalculadora.calcularMl();
		} else if (e.getSource() == btnEa) {
			interfazCalculadora.calcularEa();	
		} else if (e.getSource() == btnEr) {
			interfazCalculadora.calcularEr();	
		} else if (e.getSource() == btnEe) {
			interfazCalculadora.calcularEe();
		} else if (e.getSource() == btnE) {
			interfazCalculadora.calcularE();	
		} else if (e.getSource() == btnEp) {
			interfazCalculadora.calcularEp();	
		} else if (e.getSource() == btnP) {
			interfazCalculadora.calcularP();	
		} else if (e.getSource() == btnLimpiar) {
			interfazCalculadora.limpiar();	
		} 
	}
	
}
