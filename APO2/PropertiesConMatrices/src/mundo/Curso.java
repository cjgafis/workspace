package mundo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Curso 
{
	// ATRIBUTOS
	private Estudiante[][] estudiantes;
	private Properties misPropiedades;

	// La ruta se la podemos dar de varias formas, 
	// como constante, atributo String, objeto File.
	private String ruta;

	// METODO CONSTRUCTOR
	public Curso() 
	{	
		// PARA EL METODO CONSTRUCTOR LOS PASOS SON LOS SIGUIENTES (HAY QUE SEGUIR EL MISMO ORDEN).
		// 1. INSTANCIAR EL OBJETO misPropiedades.
		// 2. ASIGNAR LA RUTA HACIA EL ARCHIVO DE PROPIEDADES AL ATRIBUTO ruta.
		// 3. HACER EL LLAMADO AL METODO QUE IMPORTA EL ARCHIVO DE PROPIEDADES.
		// 4. CREAR LA MATRIZ (TOMANDO LA INFORMACIÓN DE FILAS Y COLUMNAS DEL ARCHIVO DE PROPIEDADES).
		// 5. HACER EL LLAMADO AL METODO QUE LEE LA INFORMACION DEL ARCHIVO DE PROPIEDADES Y LA CARGA EN LA MATRIZ.

		misPropiedades = new Properties();	// 1.

		ruta = "./data/estudiantes.properties"; // 2.

		try 
		{
			importarArchivo(); // 3.
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}

		estudiantes = new Estudiante [Integer.parseInt(misPropiedades.getProperty("filas"))] 
				[Integer.parseInt(misPropiedades.getProperty("columnas"))]; // 4.	

		leerInformacion(); // 5. 
	}

	// PRIMER PASO: IMPORTAR EL ARCHIVO DE PROPIEDADES
	private void importarArchivo( )throws IOException
	{					
		try 
		{
			// Los objetos FileInputStream típicamente representan ficheros de texto.
			FileInputStream fis = new FileInputStream( ruta );
			// Cargamos en nuestro atributo de tipo Properties el archivo de propiedades. 
			misPropiedades.load(fis);
			// Cerramos el flujo de datos. 
			fis.close();
		} 
		catch (IOException e) 
		{
			throw new IOException("Error de lectura del archivo: formato inválido");
		}
	}

	// SEGUNDO PASO: LLER LA INFORMACIÓN DEL ARCHIVO PROPERTIES  Y PASARLA A LA MATRIZ
	public void leerInformacion()
	{	
		for(int i = 0; i < estudiantes.length; i++)
		{
			for(int j = 0; j < estudiantes[0].length; j++)
			{
				// Pedimos a nuestro atributo de propiedades que nos de el nombre del estudiantes segun la clave dada.
				String nombre = misPropiedades.getProperty("nombreDelEstudiante."+i+"."+j);
				// Pedimos a nuestro atributo de propiedades que nos de el codigo del estudiante segun la clave dada.
				String codigo = misPropiedades.getProperty("codigoDelEstudiante."+i+"."+j);
				// Pedimos a nuestro atributo de propiedades que nos de la edad del estudiante segun la clave dada.
				int edad =  Integer.parseInt(misPropiedades.getProperty("edadDelEstudiante."+i+"."+j));
				// Pedimos a nuestro atributo de propiedades que nos de la estatura del estudiante segun la clave dada.
				double estatura =  Double.parseDouble(misPropiedades.getProperty("estaturaDelEstudiante."+i+"."+j));

				// Instanciamos un objeto de tipo Estudiante y le damos los parametros que solicita el constructor. 
				Estudiante nuevoEstudiante = new Estudiante(nombre, codigo, edad, estatura);
				// Agregamos el objeto a nuestra matriz segun la posición que indican los indices i - j.
				estudiantes[i][j] = nuevoEstudiante;
			}
		}
	}

	// TEERCER PASO: LISTAR LOS ESTUDIANTES QUE ESTAN EN LA MATRIZ
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
