package mundo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

public class Curso 
{
	// ATRIBUTOS
	private ArrayList<Estudiante> estudiantes;
	private Properties misPropiedades;

	// La ruta al archivo se la podemos dar de varias formas. 
	// constante, atributo String, objeto File
	private String archivo;


	// METODO CONSTRUCTOR
	public Curso() 
	{	
		estudiantes = new ArrayList<Estudiante>();
		misPropiedades = new Properties();	
		archivo = new String("./data/estudiantes.properties");

		try 
		{
			importarArchivo();
		} 
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}

		leerInformacion();
	}

	// PRIMERO: IMPORTO EL ARCHIVO
	private void importarArchivo( )throws IOException
	{					
		try 
		{
			FileInputStream fis = new FileInputStream( archivo );
			misPropiedades.load(fis);
			fis.close();
		} 
		catch (Exception e) 
		{
			throw new IOException("Error de lectura del archivo.");
		}
	}

	// SEGUNDO: LEO EL ARCHIVO
	public void leerInformacion()
	{
		int numeroEstudiantes = Integer.parseInt(misPropiedades.getProperty("numeroEstudiantes"));
		for(int i = 0; i < numeroEstudiantes; i++)
		{
			String nombre = misPropiedades.getProperty("nombreDelEstudiante."+i);
			String codigo = misPropiedades.getProperty("codigoDelEstudiante."+i);
			int edad =  Integer.parseInt(misPropiedades.getProperty("edadDelEstudiante."+i));
			double estatura =  Double.parseDouble(misPropiedades.getProperty("estaturaDelEstudiante."+i));

			Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, edad, estatura);
			estudiantes.add(nuevoEstudiante);
		}
	}

	// TERCERO: VERIFICO
	public void listarEstudiantes()
	{
		int numeroEstudiantes = Integer.parseInt(misPropiedades.getProperty("numeroEstudiantes"));
		for(int i = 0; i < numeroEstudiantes; i++)
		{
			System.out.println(estudiantes.get(i));
		}
		System.out.println(estudiantes.size());
	}
}
