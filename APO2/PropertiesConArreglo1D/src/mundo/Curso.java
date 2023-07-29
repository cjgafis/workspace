package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Curso 
{
	// ATRIBUTOS
    private Estudiante[] estudiantes; // matriz en una dimension
	private Estudiante[][] estudiantes2; // filas - columnas
	private Properties misPropiedades;
	
	// La ruta al archivo se la podemos dar de varias formas. 
	// constante, atributo String, objeto File
	private File archivo;


	// METODO CONSTRUCTOR
	public Curso() 
	{	
		misPropiedades = new Properties();	
		archivo = new File("./data/estudiantes2.properties");

		try 
		{
			//importarArchivo();
			importarArchivo2();
		} 
		catch (IOException e) 
		{
			System.out.println("Error de entrada o salida");
			e.getMessage();
			e.printStackTrace();
		}

		//estudiantes = new Estudiante [Integer.parseInt(misPropiedades.getProperty("tamanioArreglo"))];	

		estudiantes2 = new Estudiante [Integer.parseInt(misPropiedades.getProperty("filas"))] [Integer.parseInt(misPropiedades.getProperty("columnas"))];
		
		//leerInformacion();
		leerInformacion2();
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
	
	private void importarArchivo2( )throws IOException
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
		for(int i = 0; i < estudiantes.length; i++)
		{
			String nombre = misPropiedades.getProperty("nombreDelEstudiante."+i);
			String codigo = misPropiedades.getProperty("codigoDelEstudiante."+i);
			int edad =  Integer.parseInt(misPropiedades.getProperty("edadDelEstudiante."+i));
			double estatura =  Double.parseDouble(misPropiedades.getProperty("estaturaDelEstudiante."+i));

			Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, edad, estatura);
			estudiantes[i] = nuevoEstudiante;		
		}
	}
	
	public void leerInformacion2()
	{	
		for(int i = 0; i < estudiantes2.length; i++)
		{
			for (int j = 0; j < estudiantes2[0].length; j++)
			{
				String nombre = misPropiedades.getProperty("nombreDelEstudiante."+i+"."+j);
				String codigo = misPropiedades.getProperty("codigoDelEstudiante."+i+"."+j);
				int edad =  Integer.parseInt(misPropiedades.getProperty("edadDelEstudiante."+i+"."+j));
				double estatura =  Double.parseDouble(misPropiedades.getProperty("estaturaDelEstudiante."+i+"."+j));

				Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, edad, estatura);
				estudiantes2[i][j] = nuevoEstudiante;
			}		
		}
	}
	
	
	
	// TERCERO: VERIFICO
	public void listarEstudiantes()
	{
		for(int i = 0; i < estudiantes.length; i++)
		{
			System.out.println(estudiantes[i]);
		}
	}
	
	public void listarEstudiantes2()
	{
		for(int i = 0; i < estudiantes2.length; i++)
		{
			for (int j = 0; j < estudiantes2[0].length; j++)
			{
				System.out.print(estudiantes2[i][j].getNombre() + "  ");
			}
			System.out.println();
		}
	}
	
	// AGREGAR NUEVOS DATOS AL ARCHIVO DE PROPIEDADES
	public void agregarEstudianteAlProperties(String nombre, String codigo, String edad, String estatura)
	{
		misPropiedades.setProperty("tamanioArreglo", String.valueOf(estudiantes.length));
		
		int i = estudiantes.length - 1;
		misPropiedades.setProperty("nombreDelEstudiante." + i, nombre);
		misPropiedades.setProperty("codigoDelEstudiante." + i, codigo);
		misPropiedades.setProperty("edadDelEstudiante." + i, edad);
		misPropiedades.setProperty("estaturaDelEstudiante." + i, estatura);

		FileOutputStream output;
		try 
		{
			output = new FileOutputStream(archivo);
			try 
			{
				misPropiedades.store(output, null);
				output.close();
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
	public double calcularEstaturaPromedio()
	{
		double suma = 0.0;
		double promedio = 0.0;
		
		for (int i = 0; i < estudiantes.length; i++)
		{
			suma = suma + estudiantes[i].getEstatura();
		}
		promedio = suma / estudiantes.length;
		return promedio;
	}
	
	public double calcularEstaturaPromedio2()
	{
		double suma = 0.0;
		double promedio = 0.0;
		
		for (int i = 0; i < estudiantes2.length; i++)
		{
			for (int j = 0; j < estudiantes2[0].length; j++)
			{
				suma = suma + estudiantes2[i][j].getEstatura();
			}			
		}
		promedio = suma / (estudiantes2.length * estudiantes2[0].length);
		return promedio;
	}
}
