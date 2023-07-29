package Mundo;
import org.junit.Test;

import Mundo.Cuadratica;

//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

public class TestCuadratica {
	
	// Los objetos son los atributos.
	private Cuadratica c1; 
	
	public void setUp1() {
		c1 = new Cuadratica (1,-3,-4);
	}
	
	@Test
	public void raiz1() {
		setUp1();
		assertEquals(4,c1.raiz1(),0.0001);
		assertNotEquals(5,c1.raiz1(),0.0001);
		assertTrue(c1.raiz2()==-1);
	}
	
}
