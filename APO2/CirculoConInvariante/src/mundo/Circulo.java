package mundo;

import java.util.Scanner;

/**
 * Esta clase represneta el molde para crear objetos de tipo Circulo
 * 
 * Inv:
 * radio >= 0
 * 
 * @author CJ
 *
 */
public class Circulo 
{
	// ATRIBUTOS
	private double radio;
	
	// METODO CONSTRUCTOR
	/**
	 * @param radio
	 */
	public Circulo(double radio) 
	{
		this.radio = radio;
		
		verificarInvariante();
	}

	/**
	 * @return the radio
	 */
	public double getRadio() 
	{
		return radio;
	}

	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) 
	{
		this.radio = radio;
		verificarInvariante();
	}

	@Override
	public String toString() 
	{
		return "Circulo [radio=" + radio + "]";
	}
	
	private void verificarInvariante()
	{
		assert(radio > 0); 
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor ingrese el radio del circulo: ");
		double radio = Double.parseDouble(sc.nextLine());
		
		Circulo miCirculo = new Circulo(radio);
		
		System.out.println(miCirculo);
		sc.close();

	}

}
