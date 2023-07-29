package Interfaz;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelError extends JPanel
{
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS
	private PanelErrorMedida panelErrorMedida;
	private PanelErrorVariasM panelErrorVariasM;
	private InterfazProyecto interfazProyecto;


	public PanelError(InterfazProyecto interfazProyecto)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Calculo del error");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new GridLayout(1,2));

		//INSTANCIAR
		this.interfazProyecto = interfazProyecto;
		panelErrorMedida = new PanelErrorMedida(this);
		panelErrorVariasM = new PanelErrorVariasM(this);

		//ADICIONAR
		add(panelErrorMedida);
		add(panelErrorVariasM);
		
	}
	
	//Otros 
	public double getMedida()
	{
		return panelErrorMedida.getMedida();
	}
	public double getVv()
	{
		return panelErrorMedida.getVv();
	}
	public String getMedidas()
	{
		return panelErrorVariasM.getMedidas();
	}
	public void setResultado(String resultado)
	{
		panelErrorMedida.setResultado(resultado);
	}
	public void setResultadoVarias(String resultado)
	{
		panelErrorVariasM.setResultadoVarias(resultado);
	}
	public void errorAbsoluto()
	{
		interfazProyecto.errorAbsoluto();
	}
	public void errorAbsoluto1Medida()
	{
		interfazProyecto.errorAbsoluto1Medida();
	}
	public void errorRelativo()
	{
		interfazProyecto.errorRelativo();
	}
	public void errorRelativo1Medida()
	{
		interfazProyecto.errorRelativo1Medida();
	}
	public void errorPExactitud()
	{
		interfazProyecto.porcentajeErrorExactitud();
	}
	public void errorPExactitud1Medida()
	{
		interfazProyecto.porcentajeErrorExactitud1Medida();
	}
	public void errorExactitud()
	{
		interfazProyecto.Exactitud();
	}
	public void errorExactitud1Medida()
	{
		interfazProyecto.Exactitud1Medida();
	}
	public void errorPPresicion()
	{
		interfazProyecto.porcentajeErrorPresicion();
	}
	public void errorPresicion()
	{
		interfazProyecto.Presicion();
	}
	public void Limpiar()
	{
		panelErrorMedida.limpiar();
		panelErrorVariasM.limpiar();
	}
	
}
