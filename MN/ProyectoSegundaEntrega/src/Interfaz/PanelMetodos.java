package Interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelMetodos extends JPanel
{
	private static final long serialVersionUID = 1L;
	
	//ATRIBUTOS
	private InterfazProyecto interfazProyecto;
	private PanelMetodosC panelMetodosC;
	private PanelMetodosA panelMetodosA;
	
	//CONSTRUCTOR
	public PanelMetodos(InterfazProyecto interfazProyecto)
	{
		//DISE�O
		TitledBorder borde = BorderFactory.createTitledBorder("Localizacion de raices");
		setBorder(borde);
		borde.setTitleColor(Color.BLUE);
		setLayout(new BorderLayout());

		//INSTANCIAR
		this.interfazProyecto = interfazProyecto;
		panelMetodosC = new PanelMetodosC(this);
		panelMetodosA = new PanelMetodosA(this);

		//ADICIONAR
		add(panelMetodosC, BorderLayout.CENTER);
		add(panelMetodosA, BorderLayout.SOUTH);
	}
	//GET Y SET DE METODOS CERRADOS
	public double getXi() 
	{
		return panelMetodosC.getXi();
	}

	public void setXi() 
	{
		panelMetodosC.setXi();
	}

	public double getXs() 
	{
		return panelMetodosC.getXs();
	}

	public void setXs() 
	{
		panelMetodosC.setXs();
	}

	public double getBiseccion() 
	{
		return panelMetodosC.getBiseccion();
	}

	public void setBiseccion(String respuesta) 
	{
		panelMetodosC.setBiseccion(respuesta);
	}

	public double getFPosicion() 
	{
		return panelMetodosC.getFPosicion();
	}

	public void setFPosicion(String respuesta) 
	{
		panelMetodosC.setFPosicion(respuesta);
	}
	//GET Y SET METODOS ABIERTOS
	public String getFuncion()
	{
		return	panelMetodosA.getFuncion();
	}
	public void setFuncion()
	{
		panelMetodosA.setFuncion();
	}
	public double getXiMA()
	{
		return	panelMetodosA.getXi();
	}
	public void setXiMA()
	{
		panelMetodosA.setXi();
	}
	public double getXsMA()
	{
		return	panelMetodosA.getXs();
	}
	public void setXsMA()
	{
		panelMetodosA.setXs();
	}
	public void setDerivada(String respuesta)
	{
		panelMetodosA.setDerivada(respuesta);
	}
	public void setPuntoFijo(String respuesta)
	{
		panelMetodosA.setPuntoFijo(respuesta);
	}
	public void setNR(String respuesta)
	{
		panelMetodosA.setNR(respuesta);
	}
	public void setSecante(String respuesta)
	{
		panelMetodosA.setSecante(respuesta);
	}
	
	//METODOS
	public void biseccion()
	{
		interfazProyecto.biseccion();
	}
	public void falsaPosicion()
	{
		interfazProyecto.falsaPosicion();
	}
	public void derivada()
	{
		interfazProyecto.derivar();
	}
	public void puntoFijo()
	{
		interfazProyecto.puntoFijo();
	}
	public void NR()
	{
		interfazProyecto.NR();
	}
	public void secante()
	{
		interfazProyecto.secante();
	}
	public void limpiar()
	{
		setXiMA();
		setXsMA();
		setFuncion();
		setDerivada("");
		setPuntoFijo("");
		setNR("");
		setSecante("");
		setXi();
		setXs();
		setBiseccion("");
		setFPosicion("");
	}
}
