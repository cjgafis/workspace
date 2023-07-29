/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot_ - Colombia)
 * Departamento de Ingenier_a de Sistemas y Computaci_n
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Jorge Jim_nez- Julio 2005
 * Autor inicial: Mario S_nchez
 * Autor: Pablo Barvo - 26-Ago-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.club.mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Clase que modela un club
 */
public class Club
{
	// -----------------------------------------------------------------
	// Atributos
	// -----------------------------------------------------------------
	/**
	 * Es la colecci_n de socios del Club
	 */
	private ArrayList<Socio> socios;

	// -----------------------------------------------------------------
	// Constructor
	// -----------------------------------------------------------------

	/**
	 * Constructor de un nuevo club vac_o <br>
	 * <b>post: </b> Se crea un club vac_o y se inicializa la colecci_n de socios.
	 */
	public Club( )
	{
		socios = new ArrayList<Socio>( );
	}

	// -----------------------------------------------------------------
	// M_todos
	// -----------------------------------------------------------------

	/**
	 * Este m_todo afilia un nuevo socio al club. <br>
	 * <b>pre: </b> La lista de socios est_ inicializada (no es null). <br>
	 * <b>post: </b> Se ha afiliado un nuevo socio en el club con los datos dados. <br>
	 * @param cedula Es la c_dula del nuevo socio. cedula != null, cedula != __
	 * @param nombre Es el nombre del nuevo socio. nombre != null, nombre != __
	 * @throws Exception si un socio con la misma c_dula ya estaba afiliado al club, dispara una excepci_n indicando que la nueva afiliaci_n no se pudo llevar a cabo .
	 */
	public void afiliarSocio( String cedula, String nombre ) throws Exception
	{

		// Revisar que no haya ya un socio con la misma c_dula
		Socio s = buscarSocio( cedula );
		if( s == null )
		{
			// Se crea el objeto del nuevo socio (todav_a no se ha agregado al
			// club)
			Socio nuevoSocio = new Socio( cedula, nombre );
			// se agrega el nuevo socio al club
			socios.add( nuevoSocio );
		}
		else
		{
			throw new Exception( "El socio ya existe" );
		}
	}

	/**
	 * Este m_todo sirve para buscar un socio. <br>
	 * <b>post: </b> Retorno un socio dada la c_dula, si este no existe se retorno null <br>
	 * @param cedula Es la c_dula del socio que se est_ buscando - cedula!=null
	 * @return elSocio - Retorna el socio buscado. Si la c_dula no pertenece a ning_n socio entonces retorna null
	 */
	public Socio buscarSocio( String cedula )
	{
		Socio elSocio = null;

		boolean encontre = false;
		int numSocios = socios.size( );
		for( int i = 0; i < numSocios && !encontre; i++ )
		{
			Socio s = ( Socio )socios.get( i );
			if( s.darCedula( ).equals( cedula ) )
			{
				elSocio = s;
				encontre = true;
			}
		}

		return elSocio;
	}

	/**
	 * Este m_todo devuelve la lista de autorizados de un socio dada su c_dula.
	 * @param cedula La c_dula del socio - cedula != null
	 * @return La lista de autorizados del socio
	 * @throws Exception - dispara una excepci_n en caso de que el socio no exista.
	 */
	public ArrayList darAutorizadosSocio(String cedula) throws Exception{
		Socio s = buscarSocio(cedula);
		ArrayList autorizados = new ArrayList();
		if(s == null){
			throw new Exception("El socio con esa c_dula no existe."); 
		}else{
			autorizados.add(s.darNombre());
			autorizados.addAll(s.darAutorizados());
		}
		return autorizados;
	}

	/**
	 * Este m_todo sirve para agregar una nueva persona autorizada a un socio de una c_dula dada. <br>
	 * <b>post: </b> Se agreg_ un nuevo autorizado, con nombre distinto a todos los ya vinculados, y al del mismo socio <br>
	 * @param cedula La c_dula del socio. cedula != null.
	 * @param nombreAutorizado El nombre de la persona a autorizar. nombreAutorizado != null.
	 * @throws Exception - dispara una excepci_n en caso de que el socio no exista.
	 * @throws Exception - dispara una excepci_n si el nombre del socio es igual al de nombre.
	 * @throws Exception - dispara una excepci_n si el autorizado ya exist_a en la lista de autorizados de este socio.
	 */
	public void agregarAutorizadoSocio(String cedula, String nombreAutorizado) throws Exception{
		Socio s = buscarSocio(cedula);
		if(s == null){
			throw new Exception("El socio con esa c_dula no existe."); 
		}else{
			s.agregarAutorizado( nombreAutorizado );
		}
	}

	/**
	 * M_todo que registra un consumo a un autorizado de un socio.<br />
	 * <b>post: </b> Se agreg_ una nueva factura al vector del socio, Se verifico que es el socio o un autorizado por _l. <br>
	 * @param cedula La c_dula del socio. cedula != null
	 * @param nombreCliente El nombre del autorizado que realiz_ en consumo. nombreCliente != null
	 * @param concepto El concepto del consumo. concepto != null.
	 * @param valor El valor del consumo. valor >= 0.
	 * @throws Exception - dispara una excepci_n en caso de que el socio no exista.
	 */
	public void registrarConsumo(String cedula, String nombreCliente, String concepto, double valor) throws Exception{
		Socio s = buscarSocio(cedula);
		if(s == null){
			throw new Exception("El socio con esa c_dula no existe."); 
		}else{
			s.registrarConsumo(nombreCliente, concepto, valor);
		}
	}

	/**
	 * M_todo que devuelve la lista de facturas de un socio
	 * @param cedula La c_dula del socio. cedula != null.
	 * @return La lista de facturas del socio.
	 * @throws Exception - dispara una excepci_n en caso de que el socio no exista.
	 */
	public ArrayList darFacturasSocio(String cedula) throws Exception{
		ArrayList facturas = new ArrayList();
		Socio s = buscarSocio(cedula);
		if(s == null){
			throw new Exception("El socio con esa c_dula no existe."); 
		}else{
			facturas.addAll(s.darFacturas());
		}
		return facturas;
	}


	/**
	 * M_todo encargado del pago de la factura de un socio.
	 * <b>post: </b> Se borr_ la factura del vector del socio <br>
	 * @param cedula La c_dula del socio - cedula != null
	 * @param facturaIndice El _ndice de la factura a pagar. facturaIndice >= 0
	 * @throws Exception - dispara una excepci_n en caso de que el socio no exista.
	 */
	public void pagarFacturaSocio(String cedula, int facturaIndice) throws Exception{
		Socio s = buscarSocio(cedula);
		if(s == null){
			throw new Exception("El socio con esa c_dula no existe."); 
		}else{
			s.pagarFactura(facturaIndice);
		}
	}

	/*
	 * La serialización es el proceso de convertir un objeto en una secuencia 
	 * de bytes para almacenarlo, transmitirlo o guardarlo en algún medio, 
	 * mientras que la deserialización es el proceso de convertir esa secuencia 
	 * de bytes de vuelta al objeto original.
	 */

	/**
	 * Método para serializar la lista de socios y guardarla en un archivo 
	 * llamado socios.ser dentro de la carpeta data.
	 * <b>post: </b> Los objetos Socios han sido serializados y guardados en 
	 * el archivo socios.ser.
	 */
	public void serializarSocios() 
	{
		try 
		{
			File file = new File("./data/socios.ser");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(socios);
			oos.close();
			fos.close();
			System.out.println("Socios serializados en data/socios.ser");
		} 
		catch (IOException i) 
		{
			System.out.println("No se pudo serializar.");
			i.printStackTrace();
		}
	}

	/**
	 * Método para deserializar la lista de socios desde un archivo llamado 
	 * socios.ser ubicado en la carpeta data.
	 * <b>post: </b> Los objetos Socios han sido deserializados y cargados 
	 * en la lista socios.
	 */
	public void deserializarSocios() 
	{
		try 
		{
			File file = new File("data/socios.ser");
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			socios = (ArrayList) ois.readObject();
			ois.close();
			fis.close();
			System.out.println("Socios deserializados desde data/socios.ser");
		} 
		catch (IOException i) 
		{
			System.out.println("No se pudo deserializar.");
			i.printStackTrace();
			return;
		} 
		catch (ClassNotFoundException c) 
		{
			System.out.println("La clase Socio no fue encontrada.");
			c.printStackTrace();
			return;
		}
	}

	// -----------------------------------------------------------------
	// M_todos de Extensi_n
	// -----------------------------------------------------------------

	/**
	 * Extensi_n 1
	 * @return Resultado extensi_n 1
	 */
	public String metodo1( )
	{
		serializarSocios();
		return "Guardado.";
	}

	/**
	 * Extensi_n 2
	 * @return Resultado extensi_n 2
	 */
	public String metodo2( )
	{
		deserializarSocios() ;
		return "Importado";
	}
}