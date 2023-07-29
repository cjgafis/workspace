package test;

import static org.junit.Assert.*;

import org.junit.Test;

import mundo.Calculadora;

public class CalculadoraTest 
{
	// ATRIBUTOS
	private Calculadora calculadora;
	
	private void setupEscenario1( )
    {
		calculadora = new Calculadora(0, 4);
    }
	
	private void setupEscenario2()
    {
		calculadora = new Calculadora(-2, -5);
    }
	
	private void setupEscenario3( )
    {
		calculadora = new Calculadora(3, 0);
    }
	
	private void setupEscenario4( )
    {
		calculadora = new Calculadora(0, -1);
    }
	
	private void setupEscenario5( )
    {
		calculadora = new Calculadora(0, 0);
    }
	
	@Test
	public void testSumar() 
	{
		setupEscenario1( );
		double resultado1 = calculadora.sumar();
	    assertEquals(4, resultado1, 0);
	    
	    setupEscenario2( );
		double resultado2 = calculadora.sumar();
	    assertEquals(-7, resultado2, 0);
	    
	    setupEscenario3( );
		double resultado3 = calculadora.sumar();
	    assertEquals(3, resultado3, 0);
	    
	    setupEscenario4( );
		double resultado4 = calculadora.sumar();
	    assertEquals(-1, resultado4, 0);
	    
	    setupEscenario5( );
		double resultado5 = calculadora.sumar();
	    assertEquals(0, resultado5, 0);
		
	}
	
	@Test
	public void testRestar() 
	{
		setupEscenario1( );
		double resultado1 = calculadora.restar();
	    assertEquals(-4, resultado1, 0);
	    
	    setupEscenario2( );
		double resultado2 = calculadora.restar();
	    assertEquals(3, resultado2, 0);
	    
	    setupEscenario3( );
		double resultado3 = calculadora.restar();
	    assertEquals(3, resultado3, 0);
	    
	    setupEscenario4( );
		double resultado4 = calculadora.restar();
	    assertEquals(1, resultado4, 0);
	    
	    setupEscenario5( );
		double resultado5 = calculadora.restar();
	    assertEquals(0, resultado5, 0);
		
	}
	
	@Test
	public void testMultiplicar() 
	{
		setupEscenario1( );
		double resultado1 = calculadora.multiplicar();
	    assertEquals(0, resultado1, 0);
	    
	    setupEscenario2( );
		double resultado2 = calculadora.multiplicar();
	    assertEquals(10, resultado2, 0);
	    
	    setupEscenario3( );
		double resultado3 = calculadora.multiplicar();
	    assertEquals(0, resultado3, 0);
	    
	    setupEscenario4( );
		double resultado4 = calculadora.multiplicar();
	    assertEquals(0, resultado4, 0);
	    
	    setupEscenario5( );
		double resultado5 = calculadora.multiplicar();
	    assertEquals(0, resultado5, 0);
		
	}
	
	@Test
	public void testDividir() 
	{
		setupEscenario1( );
		double resultado1 = calculadora.dividir();
	    assertEquals(0, resultado1, 0);
	    
	    setupEscenario2( );
		double resultado2 = calculadora.dividir();
	    assertEquals(0.4, resultado2, 0);
	     
	    setupEscenario4( );
		double resultado4 = calculadora.dividir();
	    assertEquals(0, resultado4, 0); 
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDividir2() 
	{
		setupEscenario3( );
		calculadora.dividir();
	    
	    setupEscenario5( );
		calculadora.dividir();
	    
	}
}
