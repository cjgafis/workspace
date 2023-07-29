/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Jorge Jim�nez- Julio 2005
 * Autor inicial: Mario Sanchez
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.club.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import uniandes.cupi2.club.mundo.Club;
import uniandes.cupi2.club.mundo.Factura;
import uniandes.cupi2.club.mundo.Socio;

/**
 * Clase que modela las pruebas para el Club
 */
public class ClubTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es un socio de prueba
     */
    private Socio socio;
    /**
     * 
     * /** Es un club de prueba
     */
    private Club club;
    /**
     * Metodo para configuraci�n de escenario
     */
    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------
    public void setupEscenario0( )
    {

        club = new Club( );
        socio = new Socio( "1", "nombre1" );
    }
    /**
     * M�todo para configuraci�n de escenario
     */
    public void setupEscenario1( )
    {

        club = new Club( );
        socio = new Socio( "2", "nombre2" );
    }

    /**
     * M�todo para probar afiliaci�n socio no existente
     */
    public void testAfiliarSocioNoExiste( )
    {
        setupEscenario0( );
        try
        {
            club.afiliarSocio( "1", "nombre1" );
        }
        catch( Exception e )
        {

            e.printStackTrace( );
        }
        Socio socio2 = club.buscarSocio( "1" );
        assertEquals( socio.darNombre( ), socio2.darNombre( ) );

    }
    /**
     * M�todo para probar afiliaci�n socio no existente
     */
    public void testAfiliarSocioExiste( )
    {
        setupEscenario0( );

        try
        {
            club.afiliarSocio( "3", "nombre3" );
            club.afiliarSocio( "3", "nombre3" );
            fail( "El socio esta repetido" );
        }
        catch( Exception e )
        {

        }

    }
    /**
     * M�todo para probar afiliaci�n socio no existente
     */

    public void testBuscarSocio( )
    {
        setupEscenario1( );
        try
        {
            club.afiliarSocio( "2", "nombre2" );
        }
        catch( Exception e )
        {

            e.printStackTrace( );
        }
        Socio socio2 = club.buscarSocio( "2" );
        assertEquals( socio.darNombre( ), socio2.darNombre( ) );
    }
    
    /**
     * M�todo para probar que devuelve la lista de autorizados de un socio correctamente.
     */
    public void testDarAutorizadosSocio1(){
    	setupEscenario1();
    	
    	try {
    		club.afiliarSocio(socio.darCedula(), socio.darNombre());
    		
			club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado1");
			club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado2");
			club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado3");
			
			ArrayList autorizados = club.darAutorizadosSocio(socio.darCedula());
			
			if(autorizados.size() < 4){
				fail("No agrego a todos los autorizados");
			}
			
			for (int i = 1; i < autorizados.size(); i++) {
				String nombreAutorizado = (String) autorizados.get(i); 
				assertEquals("El autorizado no es el correcto", nombreAutorizado, "nombreAutorizado"+i);
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
    }

    /**
     * M�todo para probar que lanza excepciones cuando intenta devolver la lista de autorizados de un socio correctamente.
     */
    public void testDarAutorizadosSocio2(){
    	setupEscenario1();
    	
    	//Cuando intenta agregar un autorizado a un socio inexistente en el club
    	try {
    		club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado1");
    		fail("Deber�a lanzar la excepci�n de no encontrar el socio");
    	}catch(Exception e){
    		//Deber�a pasar por ac�
    	}
    }

    /**
     * M�todo para probar que agrega un autorizado a un socio
     */
    public void testAgregarAutorizado1(){
    	setupEscenario1();
    	
    	try {
    		club.afiliarSocio(socio.darCedula(), socio.darNombre());
    		
    		int numAutorizadosAntes = club.darAutorizadosSocio(socio.darCedula()).size();
			club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado");
			int numAutorizadosDespues = club.darAutorizadosSocio(socio.darCedula()).size();
			
			assertEquals("La cantidad de autorizados debe ser incrementado", numAutorizadosAntes+1, numAutorizadosDespues);
		} catch (Exception e) {
			fail(e.getMessage());
		}
    }
    
    /**
     * M�todo para probar que lanza las excepciones cuando intenta agrega un autorizado a un socio
     */
    public void testAgregarAutorizado2(){
    	setupEscenario1();
    	
    	//Cuando el socio no existe
    	try {
    		club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado");
    		fail("El socio no existe en el club");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}

    	try {
			club.afiliarSocio(socio.darCedula(), socio.darNombre());
			club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado");
		} catch (Exception e1) {
			fail("Deber�a poder agregar el socio: "+e1.getMessage());
		}

    	//Cuando intenta agregar a un autorizado con el mismo nombre del socio
    	try {
    		club.agregarAutorizadoSocio(socio.darCedula(), socio.darNombre());
    		fail("Deber�a lanzar excepci�n de no poder agregar un autorizado con el mismo nombre de socio");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}
    	
    	//Cuando intenta agregar a un autorizado que ya exist�a
    	try {
    		club.agregarAutorizadoSocio(socio.darCedula(), "nombreAutorizado");
    		fail("Deber�a lanzar excepci�n de no poder agregar un autorizado ya existente en la lista");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}
    }
    
    /**
     * Prueba que registra correctamente el consumo para un socio. 
     */
    public void testRegistrarConsumo1(){
    	setupEscenario1();
    	
    	try {
			club.afiliarSocio(socio.darCedula(), socio.darNombre());
			club.agregarAutorizadoSocio(socio.darCedula(), "A");
		} catch (Exception e1) {
			fail("Deber�a poder agregar el socio: "+e1.getMessage());
		}
		
		try {
			int numFacturasAntes = club.darFacturasSocio(socio.darCedula()).size();
			club.registrarConsumo(socio.darCedula(), "A", "concepto", 1000);			
			int numFacturasDespues = club.darFacturasSocio(socio.darCedula()).size();
			
			assertEquals("El n�mero de facturas debi� incrementar en una",numFacturasAntes + 1, numFacturasDespues);
		} catch (Exception e) {
			fail(e.getMessage());
		}
    }
    
    /**
     * Prueba que al registrar un consumo lanza las excepciones correctas
     */
    public void testRegistrarConsumo2(){
    	setupEscenario1();
    	
    	//Cuando el socio no existe
    	try {
    		club.registrarConsumo(socio.darCedula(), "nombreAutorizado", "concepto", 1000);
    		fail("El socio no existe en el club");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}
    }
    
    /**
     * M�todo que prueba que este retornando correctamente la lista de facturas
     */
    public void testDarFacturas1(){
    	setupEscenario1();
    	
    	try {
    		club.afiliarSocio(socio.darCedula(), socio.darNombre());
    		club.agregarAutorizadoSocio(socio.darCedula(), "A");

			club.registrarConsumo(socio.darCedula(), "A", "concepto1", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto2", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto3", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto4", 1000);
			
			ArrayList facturas = club.darFacturasSocio(socio.darCedula());
			for (int i = 0; i < facturas.size(); i++) {
				Factura factura = (Factura) facturas.get(i); 
				assertEquals("El nombre del cliente de la factura no es correcto", "A", factura.darNombre());
				assertEquals("El concepto de la factura no es correcto", "concepto"+(i+1), factura.darConcepto());
				assertEquals("El valor de la factura no es correcto", 1000, factura.darValor(), 0.01);
			}
		} catch (Exception e) {
			fail(e.getMessage());
		}
    }
    
    /**
     * Prueba que al retornar una lista de facturas lanza las excepciones correctas
     */
    public void testDarFacturas2(){
    	setupEscenario1();
    	
    	//Cuando el socio no existe
    	try {
    		club.darFacturasSocio(socio.darCedula());
    		fail("El socio no existe en el club");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}
    }
    
    /**
     * M�todo que prueba que para la factura de un socio del club
     */
    public void testPagarFacturaSocio1(){
    	setupEscenario1();
    	
    	try {
    		club.afiliarSocio(socio.darCedula(), socio.darNombre());
    		club.agregarAutorizadoSocio(socio.darCedula(), "A");

			club.registrarConsumo(socio.darCedula(), "A", "concepto1", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto2", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto3", 1000);
			club.registrarConsumo(socio.darCedula(), "A", "concepto4", 1000);
			
			int facturasSinPagarAntes = club.darFacturasSocio(socio.darCedula()).size();			
			club.pagarFacturaSocio(socio.darCedula(), 0);
			int facturasSinPagarDespues = club.darFacturasSocio(socio.darCedula()).size();
			
			assertEquals("El n�mero de facturas debi� disminuir",facturasSinPagarAntes-1,facturasSinPagarDespues);
		} catch (Exception e) {
			fail(e.getMessage());
		}
    }
    
    /**
     * M�todo que prueba que lanza excepci�n al intentar pagar la factura de un socio del club
     */
    public void testPagarFacturaSocio2(){
setupEscenario1();
    	
    	//Cuando el socio no existe
    	try {
    		club.pagarFacturaSocio(socio.darCedula(),0);
    		fail("El socio no existe en el club");
    	} catch (Exception e) {
    		//Debe lanzar la excepci�n
    	}
    }
}