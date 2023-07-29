package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelBotones<InterfazOperaciones> extends JPanel implements ActionListener
{
	private JButton butEa;
	private JButton butVv;
	private JButton butM;
	private JButton butMp;
	private JButton butMl;
	private JButton butEr;
	private JButton butPEe;
	private JButton butPE;
	private JButton butPEp;
	private JButton butPp;
	private InterfazOperacion interfazOperacion;
	

	public PanelBotones(InterfazOperaciones interfazOperaciones)
	{  
		this.interfazOperacion = interfazOperacion;
	}
		// DISEÑO
	{
				TitledBorder borde = BorderFactory.createTitledBorder("Botones");
				setBorder(borde);
				borde.setTitleColor(Color.BLUE);
				setLayout(new GridLayout(2, 5));
				
				// CREAR LOS OBJETOS
				butEa = new JButton("Ea");
				butVv = new JButton("Vv");
				butM = new JButton("M");
				butMp = new JButton("Mp");
				butMl = new JButton("Ml");
				butEr = new JButton("Er");
				butPEe = new JButton("%Ee");
				butPE= new JButton("%E");
				butPEp = new JButton("%Ep");
				butPp = new JButton("%P");
				
				// AGREGAR LOS OBJETOS AL PANEL 
				add(butEa);
				add(butVv);
				add(butM);
				add(butMp);
				add(butMl);
				add(butEr);
				add(butPEe);
				add(butPE);
				add(butPEp);
				add(butPp);
		   }

			@Override
			    public void actionPerformed(ActionEvent e)
			{
			    if(e.getSource() == butMp)
			{
				interfazOperacion.promedioDeLasMedidas();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorAbsolutoUnaMedida();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorAbsolutoVariasMedidas();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorRelativoUnaMedida1();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorRelativoUnaMedida2();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorRelativoVariasMedidas();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.errorRelativoVariasMedidas2();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.porcentajeErrorExactitud();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.porcentajeErrorExactitud2();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.porcentajeErrorExactitud3();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.porcentajeErrorPrecision();
			}
				else if (e.getSource() == butEa)
			{
				interfazOperacion.porcentajePrecision();
			}
			
				
		}
}
		
