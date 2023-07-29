package mundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Curso 
{
	private static final String DATA_FILE = "data/estudiantes.dat";
	private ArrayList<Estudiante> estudiantes;
	
	public Curso() 
	{
		estudiantes = new ArrayList<>();
		cargarDatos();
	}

	public void listarEstudiantes() 
	{
		for (Estudiante estudiante : estudiantes) 
		{
			System.out.println(estudiante);
		}
	}

	public Estudiante buscarEstudiante(int id) 
	{
		for (Estudiante estudiante : estudiantes) 
		{
			if (estudiante.getId() == id) 
			{
				return estudiante;
			}
		}
		return null;
	}

	public void agregarEstudiante(Estudiante estudiante) 
	{
		estudiantes.add(estudiante);
		guardarDatos();
	}

	public void cambiarEstudiante(int id, Estudiante nuevoEstudiante) 
	{
		for (int i = 0; i < estudiantes.size(); i++) 
		{
			if (estudiantes.get(i).getId() == id) 
			{
				estudiantes.set(i, nuevoEstudiante);
				break;
			}
		}
		guardarDatos();
	}

	public void eliminarEstudiante(int id) 
	{
		estudiantes.removeIf(estudiante -> estudiante.getId() == id);
		guardarDatos();
	}

	private void guardarDatos() 
	{
		try
		{
			FileOutputStream fos = new FileOutputStream(DATA_FILE);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(estudiantes);
			oos.close();
			fos.close();
		} 
		catch (IOException e) 
		{
			System.out.println("Error guardando datos: " + e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	private void cargarDatos() 
	{
		File dataFile = new File(DATA_FILE);
		if (dataFile.exists()) 
		{
			try
			{
				FileInputStream fis = new FileInputStream(DATA_FILE);
				ObjectInputStream ois = new ObjectInputStream(fis);
				estudiantes = (ArrayList<Estudiante>) ois.readObject();
				ois.close();
				fis.close();
			} 
			catch (IOException e) 
			{
				System.out.println("Error cargando datos: " + e.getMessage());
			}
			catch (ClassNotFoundException e) 
			{
				System.out.println("Error. Clase no encontrada: " + e.getMessage());
			}
		}
	}
}
