package mundo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Curso 
{
	// CONSTANTES 
	
	// La ruta se la podemos dar de varias formas, 
	// como constante, atributo String, objeto File.
	public final static String ARCHIVO = "./data/estudiantes.properties";

	// ATRIBUTOS
	private Estudiante[][] estudiantes;
	private Properties misPropiedades;

	// METODO CONSTRUCTOR
	public Curso() 
	{	
		misPropiedades = new Properties();	
		
		try 
		{
			importarArchivo();
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
		estudiantes = new Estudiante [Integer.parseInt(misPropiedades.getProperty("filas"))] 
				[Integer.parseInt(misPropiedades.getProperty("columnas"))];	
		
		leerInformacion();
	}

	// PRIMERO: IMPORTO EL ARCHIVO
	private void importarArchivo( )throws IOException
	{					
		try 
		{
			FileInputStream fis = new FileInputStream( ARCHIVO );
			misPropiedades.load(fis);
			fis.close();
		} 
		catch (Exception e) 
		{
			throw new IOException("Error de lectura del archivo: formato inválido");
		}
	}

	// SEGUNDO: LEO EL ARCHIVO
	public void leerInformacion()
	{	
		for(int i = 0; i < estudiantes.length; i++)
		{
			for(int j = 0; j < estudiantes[0].length; j++)
			{
				String nombre = misPropiedades.getProperty("nombreDelEstudiante."+i+"."+j);
				String codigo = misPropiedades.getProperty("codigoDelEstudiante."+i+"."+j);
				int edad =  Integer.parseInt(misPropiedades.getProperty("edadDelEstudiante."+i+"."+j));
				double estatura =  Double.parseDouble(misPropiedades.getProperty("estaturaDelEstudiante."+i+"."+j));

				Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, edad, estatura);
				estudiantes[i][j] = nuevoEstudiante;				
			}
		}
	}

	// TERCERO: VERIFICO
	public void listarEstudiantes()
	{
		for(int i = 0; i < estudiantes.length; i++)
		{
			for(int j = 0; j < estudiantes[0].length; j++)
			{
				System.out.println(estudiantes[i][j]);
			}
		}
	}
}
