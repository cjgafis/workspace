/**~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: Club
 * Autor: Pablo Barvo - 21-Oct-2005
 * Autor: Jorge Jiménez- Julio 2005
 * Autor inicial: Mario Sanchez
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package uniandes.cupi2.club.test;

import java.util.ArrayList;

import junit.framework.TestCase;
import uniandes.cupi2.club.mundo.Factura;
import uniandes.cupi2.club.mundo.Socio;

/**
 * Clase que modela las pruebas para el socio
 */
public class SocioTest extends TestCase
{
    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Es un socio de prueba
     */
    private Socio socio;
    /**
     * Es una factura de prueba
     */
    private Factura factura;

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------
    /**
     * Método para configuración de escenario
     */
    public void setupEscenario0( )
    {
        socio = new Socio( "1", "nombre1" );
    }
    /**
     * Método para configuración de escenario
     */
    public void setupEscenario1( )
    {

        socio = new Socio( "2", "nombre2" );
    }
    /**
     * Método para probar los autorizados
     */
    public void testAgregarAutorizado( )
    {
        setupEscenario0( );
        String nombre = "nombre2";
        boolean esta = false;
        try
        {

            socio.agregarAutorizado( nombre );
            ArrayList lista = socio.darAutorizados( );
            int indice = lista.size( );
            for( int i = 0; i < indice; i++ )
            {
                String autorizado = ( String )lista.get( i );
                if( autorizado.equals( nombre ) )
                {
                    esta = true;
                }
            }
            assertEquals( esta, true );
        }
        catch( Exception e )
        {

            fail( "falla! " + e.getLocalizedMessage( ) );
        }

    }

    /**
     * Método para probar los autorizados
     */
    public void testAgregarAutorizadoigualSocio( )
    {
        setupEscenario1( );
        String nombre = "nombre2";
        try
        {
            socio.agregarAutorizado( nombre );
            fail( "El socio es el mismo autorizado" );
        }
        catch( Exception e )
        {
            assertTrue( "control de duplicados correcta ", true );
        }
    }
    /**
     * Método para probar la eliminacion de autorizados
     */
    public void testEliminarAutorizado( )
    {
        setupEscenario0( );
        String nombre = "nombre2";
        try
        {
            socio.agregarAutorizado( nombre );
            ArrayList lista1 = socio.darAutorizados( );

            assertEquals( lista1.size( ), 1 );
            socio.eliminarAutorizado( nombre );
            ArrayList lista = socio.darAutorizados( );

            assertEquals( lista.size( ), 0 );
        }
        catch( Exception e )
        {
            fail( "falla! " + e.getLocalizedMessage( ) );
        }

    }
    /**
     * Método para probar el registro de Facturas
     */
    public void testRegistroFacturas( )
    {
        setupEscenario1( );
        String nombre = "nombre";
        String concepto = "concepto";
        double valor = 1.0;
        socio.registrarConsumo( nombre, concepto, valor );
        ArrayList listaFacturas = socio.darFacturas( );
        assertEquals( listaFacturas.size( ), 1 );

    }
    /**
     * Método para probar la eliminacion de Facturas
     */
    public void testEliminacionFacturas( )
    {
        setupEscenario0( );
        String nombre = "nombre";
        String concepto = "concepto";
        double valor = 1.0;
        socio.registrarConsumo( nombre, concepto, valor );
        ArrayList listaFacturas1 = socio.darFacturas( );
        assertEquals( listaFacturas1.size( ), 1 );
        socio.pagarFactura( 0 );
        ArrayList listaFacturas2 = socio.darFacturas( );
        assertEquals( listaFacturas2.size( ), 0 );

    }
    /**
     * Método para probar la adición de Facturas
     */
    public void testAgregacionFacturas( )
    {
        setupEscenario1( );
        String nombre = "nombre";
        String concepto = "concepto";
        double valor = 1.0;
        boolean esta = false;
        socio.registrarConsumo( nombre, concepto, valor );
        ArrayList listaFacturas = socio.darFacturas( );
        int indice = listaFacturas.size( );
        for( int i = 0; i < indice; i++ )
        {
            factura = ( Factura )listaFacturas.get( i );
            if( factura.darConcepto( ).equals( concepto ) )
            {
                esta = true;
            }
        }
        assertEquals( esta, true );

    }

}
