package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Properties;

public class Batallon 
{
	// ATRIBUTOS
	private Soldado[][] soldados; // filas - columnas
	private Properties propiedades;
	
	// La ruta al archivo se la podemos dar de varias formas. 
	// constante, atributo String, objeto File
	private File archivo;

	// TODO: PUNTO 1
	// METODO CONSTRUCTOR
	public Batallon() 
	{	
		// realice aqui las instrucciones necesarias
	}
	
	// TODO: PUNTO 2
	// PRIMERO: IMPORTO EL ARCHIVO
	private void importarArchivo( )throws IOException
	{					
		// realice aqui las instrucciones necesarias
	}

	// TODO: PUNTO 3
	// SEGUNDO: LEO EL ARCHIVO	
	public void leerInformacion()
	{	
		// realice aqui las instrucciones necesarias
	}
	
	// TERCERO: VERIFICO
	public void listarSoldados()
	{
		for(int i = 0; i < soldados.length; i++)
		{
			for (int j = 0; j < soldados[0].length; j++)
			{
				System.out.print(soldados[i][j].getApellido() + " ");
			}
			System.out.println();
		}
	}
	
	// CAMBIAR OBJETO DIRECTAMENTE AL PROPERTIES
	public void cambiarSoldadoAlProperties(int i, int j, String nombre, String apellido, 
			String identificacion, LocalDate fechaNacimiento, LocalDate fechaIngreso, 
			double altura, double peso)
	{
		propiedades.setProperty("nombre." + i + "." + j, nombre);
		propiedades.setProperty("apellido." + i + "." + j, apellido);
		propiedades.setProperty("identificacion." + i + "." + j, identificacion);
		propiedades.setProperty("fechaNacimiento." + i + "." + j, String.valueOf(fechaNacimiento));
		propiedades.setProperty("fechaIngreso." + i + "." + j, String.valueOf(fechaIngreso));
		propiedades.setProperty("altura." + i + "." + j, String.valueOf(altura));
		propiedades.setProperty("peso." + i + "." + j, String.valueOf(peso));

		FileOutputStream fos;
		try 
		{
			fos = new FileOutputStream(archivo);
			try 
			{
				propiedades.store(fos, null);
				fos.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Error de entrada o salida");
				e.getMessage();
				e.printStackTrace();
			}
			
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println("Error. Archivo no encontrado.");
			e.getMessage();
			e.printStackTrace();
		}
	}
	
	// METODOS
	public double calcularAlturaPromedio()
	{
		double suma = 0.0;
		double promedio = 0.0;
		
		for (int i = 0; i < soldados.length; i++)
		{
			for (int j = 0; j < soldados[0].length; j++)
			{
				suma = suma + soldados[i][j].getAltura();
			}			
		}
		promedio = suma / (soldados.length * soldados[0].length);
		return promedio;
	}

}
