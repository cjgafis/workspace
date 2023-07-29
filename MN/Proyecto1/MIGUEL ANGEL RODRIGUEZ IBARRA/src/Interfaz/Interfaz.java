package Interfaz;


import java.awt.BorderLayout; 
import java.nio.file.OpenOption;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import mundo.Operaciones;

public class Interfaz extends JFrame 
{


	private static final long serialVersionUID = 1L;
	private PanelDeDatos paneldatos;
	private PanelDeOperaciones paneloperaciones;
	private Operaciones operacion;
	private Interfaz interfazprincipal;

	public Interfaz () 
	{
		setTitle("TEORIA DE ERRORES MIGUEL");
		setSize (700,500);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout () );

		paneldatos = new PanelDeDatos ();
		add(paneldatos,BorderLayout.SOUTH);

		paneloperaciones = new PanelDeOperaciones (this);
		add(paneloperaciones, BorderLayout.CENTER); 

	}
	public void reiniciar() 
	{

		paneldatos.reiniciar();


	}
	public  void promedio()
	{
		if(!paneldatos.getTxtMedidas().isEmpty()) 
		{
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones(medidas3);
			try {
				double promedio = op.promedioDeLasMedidas(medidas3);
				paneldatos.setTxtMp(promedio);

			}
			catch (Exception e) 
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}

	
	public  void errorRelativo()
	{
		if( !paneldatos.getTxtEa().isEmpty())
		{
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pEr = op.errorRelativo();
				paneldatos.setTxtEr(pEr);

			}
			catch (Exception e) 
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}
	public  void porcentajeEnErrorExactitud()
	{
		if( !paneldatos.getTxtEr().isEmpty())
		{
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pEe = op.porcentajeErrorExactitud();
				paneldatos.setTxtEe(pEe);

			}
			catch (Exception e) {

				JOptionPane.showMessageDialog(this, e.getMessage());


			}

		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}
	public  void exactitudEnMedidas()
	{
		if( !paneldatos.getTxtEe().isEmpty()){
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pE = op.exactitudDeMedida();
				paneldatos.setTxtE(pE);

			}
			catch (Exception e) {

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}

	public  void porcentajeDePrecision()
	{
		if( !paneldatos.getTxtMp().isEmpty()&& !paneldatos.getTxtMl().isEmpty()){
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pEp = op.porcentajePrecision();
				paneldatos.setTxtEp(pEp);

			}
			catch (Exception e) 
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}
	public  void precisionDeLosDatos()
	{
		if( !paneldatos.getTxtMp().isEmpty()&& !paneldatos.getTxtMl().isEmpty()){
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pP = op.precision();
				paneldatos.setTxtP(pP);

			}
			catch (Exception e) 
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}
	public  void medidaMl()
	{
		if(!paneldatos.getTxtVv().isEmpty()&& !paneldatos.getTxtMedidas().isEmpty()) 
		{
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double mMl = op.medidaMasLejana();
				paneldatos.setTxtMl(mMl);

			}
			catch (Exception e)
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "intente separar las medidas con(;)");

		}

	}
	public  void errorAbsoluto()
	{
		if( !paneldatos.getTxtMedidas().isEmpty()){
			double Vv= Double.parseDouble(paneldatos.getTxtVv());
			String medidas = paneldatos.getTxtMedidas();
			String [] medidas2 = medidas.split(";"); 
			double [] medidas3 = new double [medidas2.length];
			for (int i=0; i<medidas2.length;i++) 
			{

				medidas3 [i] = Double.parseDouble(medidas2[i]); 
			}
			Operaciones op = new Operaciones (Vv,medidas3);
			try {
				double pEa = op.errorAbsoluto();
				paneldatos.setTxtEa(pEa);

			}
			catch (Exception e) 
			{

				JOptionPane.showMessageDialog(this, e.getMessage());


			}
		}
		else 
		{

			JOptionPane.showMessageDialog(this, "No EXISTEN argumentos de entrada");

		}
	}
	
	
	
	
	
	public static void main(String[]args) 
	{
		Interfaz miHP= new Interfaz();
		miHP.setVisible(true);
	}
}
