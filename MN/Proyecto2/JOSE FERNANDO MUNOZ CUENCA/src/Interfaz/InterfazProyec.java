package Interfaz;
import java.awt.GridLayout;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.TodoUnido;
public class InterfazProyec extends JFrame
{
	private static final long serialVersionUID = 1L;

	//ATRIBUTOS

	private PanelCuadratica panelCuadratica;
	private PanelCalcularError1 panelCalcularError1;
	private PanelCalcularError2 panelCalcularError2;
	private PanelMetodoCerrado panelMetodoCerrado;
	private TodoUnido todoUnido;


	//METODO CONSTRUCTOR
	public InterfazProyec()
	{

		//DISEÑO
		setTitle("Proyecto 2");
		setSize(1000,550);
		setResizable(true);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,4));
	    

		//INSTANCIAR LA CREACION DE UN OBJETO 
		panelCuadratica = new PanelCuadratica(this);
		panelCalcularError1 = new PanelCalcularError1(this);
		panelCalcularError2 = new PanelCalcularError2(this);
		panelMetodoCerrado = new PanelMetodoCerrado(this);
		todoUnido = new TodoUnido();


		//ADICIONAR LOS OBJETOS 
		add(panelCuadratica);
		add(panelCalcularError1);
		add(panelCalcularError2);
		add(panelMetodoCerrado);

	}


	//METODO CUADRATICO
	public void raizUno() 
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		todoUnido = new TodoUnido();
		double raizUno = todoUnido.raizUno(valorA, valorB, valorC);
		DecimalFormat df = new DecimalFormat("#.###");
		panelCuadratica.setTxtRaizUno(df.format(raizUno));

	}

	public void raizDos() 
	{
		double valorA = Double.parseDouble(panelCuadratica.getTxtValorA());
		double valorB = Double.parseDouble(panelCuadratica.getTxtValorB());
		double valorC = Double.parseDouble(panelCuadratica.getTxtValorC());
		double raizDos = todoUnido.raizDos(valorA, valorB, valorC);
		DecimalFormat df = new DecimalFormat("#.###");
		panelCuadratica.setTxtRaizDos(df.format(raizDos));
	}
	
	
	//METODO PARA CALCULAR EL ERROR
	
	public void errorAbsolutoM11()
	{
		String valorV = panelCalcularError1.getTxtValorVer();
		double valorVer = Double.parseDouble(valorV);
		String Med = panelCalcularError1.getTxtMedida1();
		double medida = Double.parseDouble(Med);
		double resultado = todoUnido.errorAbsolutoM11( valorVer,  medida);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError1.setTxtResultado(df.format(resultado));
	}


	public void errorRelativoM11()
	{
		String valorV = panelCalcularError1.getTxtValorVer();
		double valorVer = Double.parseDouble(valorV);
		String Med = panelCalcularError1.getTxtMedida1();
		double medida = Double.parseDouble(Med);
		double errorAbsolutoM11 = todoUnido.errorAbsolutoM11(valorVer, medida);
		double resultado = todoUnido.errorRelativoM11(errorAbsolutoM11, valorVer);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError1.setTxtResultado(df.format(resultado));
		
	}


	public void errorExactitudM11()
	{
		String valorV = panelCalcularError1.getTxtValorVer();
		double valorVer = Double.parseDouble(valorV);
		String Med = panelCalcularError1.getTxtMedida1();
		double medida = Double.parseDouble(Med);
		double errorAbsolutoM11 = todoUnido.errorAbsolutoM11(valorVer, medida);
		double errorRelativoM11 = todoUnido.errorRelativoM11(errorAbsolutoM11, valorVer);
		double resultado = todoUnido.errorExactitudM11(errorRelativoM11);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError1.setTxtResultado(df.format(resultado));
		
	}


	public void exactitudM11()
	{
		String valorV = panelCalcularError1.getTxtValorVer();
		double valorVer = Double.parseDouble(valorV);
		String Med = panelCalcularError1.getTxtMedida1();
		double medida = Double.parseDouble(Med);
		double errorAbsolutoM11 = todoUnido.errorAbsolutoM11(valorVer, medida);
		double errorRelativoM11 = todoUnido.errorRelativoM11(errorAbsolutoM11, valorVer);
		double errorExactitudM11 = todoUnido.errorExactitudM11(errorRelativoM11);
		double resultado = todoUnido.exactitudM11(errorExactitudM11);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError1.setTxtResultado(df.format(resultado));
		
	}

	//METODO CALCULAR ERROR VARIAS MEDIDAS
	
	public double [] deStringADouble()
	{
		String captura = panelCalcularError2.getTxaMedida();
		String [] medida = captura.split(",");
		double [] medidaInf = new double [medida.length];
		for(int i = 0; i<medida.length;i++)
		{
			medidaInf[i] = Double.parseDouble( medida[i]);
		}
		return medidaInf;
	}
	
	public double  promedioInf( )
	{
		double [] medida = deStringADouble();
		double promedioInf = todoUnido.promedioInf(medida);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(promedioInf));
		return promedioInf;
	}
	
	public void errorAbsolutoInf( )
	{
		double [] medida =  deStringADouble();
		double errorAbsolutoInf =todoUnido.errorAbsolutoInf(medida);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(errorAbsolutoInf));
	}



	public void errorRelativoInf()
	{
		double promedio = promedioInf( );
		double [] medida =  deStringADouble();
		double errorAbsolutoInf =todoUnido.errorAbsolutoInf(medida);
		double errorRelativoInf = todoUnido.errorRelativoInf(errorAbsolutoInf, promedio);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(errorRelativoInf));
	}

	public void errorExactitudInf()
	{
		double promedio = promedioInf( );
		double [] medida =  deStringADouble();
		double errorAbsolutoInf =todoUnido.errorAbsolutoInf(medida);
		double errorRelativoInf = todoUnido.errorRelativoInf(errorAbsolutoInf, promedio);
		double errorExactitudInf = todoUnido.errorExactitudInf(errorRelativoInf);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(errorExactitudInf));
	
	}
	
	public void exactitudInf()
	{
		double promedio = promedioInf( );
		double [] medida =  deStringADouble();
		double errorAbsolutoInf =todoUnido.errorAbsolutoInf(medida);
		double errorRelativoInf = todoUnido.errorRelativoInf(errorAbsolutoInf, promedio);
		double errorExactitudInf = todoUnido.errorExactitudInf(errorRelativoInf);
		double exactitudInf = todoUnido.exactitudInf(errorExactitudInf);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(exactitudInf));
	}

	public void errorPrecisionInf()
	{
		double [] medida =  deStringADouble();
		double errorPrecisionInf = todoUnido.errorPrecisionInf(medida);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(errorPrecisionInf));
	}



	public void precisionInf()
	{
		double [] medida =  deStringADouble();
		double errorPrecisionInf = todoUnido.errorPrecisionInf(medida);
		double precision = todoUnido.precisionInf(errorPrecisionInf);
		DecimalFormat df = new DecimalFormat("#.####");
		panelCalcularError2.setTxtResuldado(df.format(precision));
	}


	//METODO DE LA BISECCION
	public void biseccion()
	{
		double lIf = Double.parseDouble(panelMetodoCerrado.getTxtLIf());
		double lSur = Double.parseDouble(panelMetodoCerrado.getTxtLSur());
		String funcion = panelMetodoCerrado.getTxtFuncion();
		try 
		{
			double resultado = todoUnido.biseccion(lIf, lSur, funcion);
			DecimalFormat df = new DecimalFormat("#.####");
			panelMetodoCerrado.setTxtResultadoxr1(df.format(resultado));
    	} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}
	

	//METODO DE LA FALSA POCISION 
	
	public void falsaPocisicion()
	{
		double lIf = Double.parseDouble(panelMetodoCerrado.getTxtLIf());
		double lSur = Double.parseDouble(panelMetodoCerrado.getTxtLSur());
		String funcion = panelMetodoCerrado.getTxtFuncion();
		try 
		{
			double resultado = todoUnido.falsaPocisicion(lIf, lSur, funcion);
			DecimalFormat df = new DecimalFormat("#.####");
			panelMetodoCerrado.setTxtResultadoxr2(df.format(resultado));

		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}




	//METODO QUE LIMPIA LOS PANELES 
	
	public void limpiar()
	{
		panelCuadratica.limpiar();	
	}
	
	public void limpiarError1()
	{
		panelCalcularError1.limpiarError1();
	}
	
	public void limpiar2()
	{
		panelCalcularError2.limpiar2();
	}
	
	public void limpiarM()
	{
		panelMetodoCerrado.limpiarM();
	}
		
	
	// METODO DE LA INTERFAZ GRAFICA 
	
	public static void main(String[] args) 
	{
		InterfazProyec interfazPz = new InterfazProyec();
		interfazPz.setVisible(true);
	
	}

}
