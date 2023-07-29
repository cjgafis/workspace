package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import mundo.Lista;
import mundo.Militar;

/**
 * Clase de prueba para la clase Lista.
 */
public class ListaTest 
{

	private Lista listaMilitares;

	/**
	 * Método de configuración que se ejecuta antes de cada prueba.
	 */
	@Before
	public void setup() 
	{
		listaMilitares = new Lista();
	}

	/**
	 * Prueba unitaria para verificar el método agregarAlPrincipio.
	 */
	@Test
	public void testAgregarAlPrincipio() 
	{
		Militar militar1 = new Militar(123, "John", "Doe", 25, 1.75, 3);
		Militar militar2 = new Militar(456, "Jane", "Smith", 30, 1.65, 5);

		listaMilitares.agregarAlPrincipio(militar1);
		listaMilitares.agregarAlPrincipio(militar2);

		Assert.assertEquals(2, listaMilitares.obtenerTamanio());
		Assert.assertEquals(militar2, listaMilitares.obtenerMilitarEnPosicion(0));
		Assert.assertEquals(militar1, listaMilitares.obtenerMilitarEnPosicion(1));
	}

	/**
	 * Prueba unitaria para verificar el método agregarAlFinal.
	 */
	@Test
	public void testAgregarAlFinal() 
	{
		Militar militar1 = new Militar(123, "John", "Doe", 25, 1.75, 3);
		Militar militar2 = new Militar(456, "Jane", "Smith", 30, 1.65, 5);

		listaMilitares.agregarAlFinal(militar1);
		listaMilitares.agregarAlFinal(militar2);

		Assert.assertEquals(2, listaMilitares.obtenerTamanio());
		Assert.assertEquals(militar1, listaMilitares.obtenerMilitarEnPosicion(0));
		Assert.assertEquals(militar2, listaMilitares.obtenerMilitarEnPosicion(1));
	}

	/**
	 * Prueba unitaria para verificar el método eliminarEnPosicion.
	 */
	@Test
	public void testEliminarEnPosicion() 
	{
		Militar militar1 = new Militar(123, "John", "Doe", 25, 1.75, 3);
		Militar militar2 = new Militar(456, "Jane", "Smith", 30, 1.65, 5);
		Militar militar3 = new Militar(789, "Bob", "Johnson", 40, 1.80, 8);

		listaMilitares.agregarAlFinal(militar1);
		listaMilitares.agregarAlFinal(militar2);
		listaMilitares.agregarAlFinal(militar3);

		listaMilitares.eliminarEnPosicion(1);

		Assert.assertEquals(2, listaMilitares.obtenerTamanio());
		Assert.assertEquals(militar1, listaMilitares.obtenerMilitarEnPosicion(0));
		Assert.assertEquals(militar3, listaMilitares.obtenerMilitarEnPosicion(1));
	}

	/**
	 * Prueba unitaria para verificar el método buscarmilitarPorCedula.
	 */
	@Test
	public void testBuscarmilitarPorCedula() 
	{
		Militar militar1 = new Militar(123, "John", "Doe", 25, 1.75, 3);
		Militar militar2 = new Militar(456, "Jane", "Smith", 30, 1.65, 5);

		listaMilitares.agregarAlFinal(militar1);
		listaMilitares.agregarAlFinal(militar2);

		Militar militarEncontrado1 = listaMilitares.buscarMilitarPorCedula(123);
		Militar militarEncontrado2 = listaMilitares.buscarMilitarPorCedula(456);
		Militar militarEncontrado3 = listaMilitares.buscarMilitarPorCedula(789);
		Assert.assertEquals(militar1, militarEncontrado1);
		Assert.assertEquals(militar2, militarEncontrado2);
		Assert.assertNull(militarEncontrado3); // No se encontró un militar con cédula 789
	}

}

