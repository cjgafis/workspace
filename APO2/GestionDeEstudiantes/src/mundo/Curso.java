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
	// ATRIBUTOS
	private ArrayList<Estudiante> estudiantes;

	// METODO CONSTRUCTOR
	public Curso() 
	{
		estudiantes = new ArrayList<Estudiante>();		
		importar();
	}

	// GET & SET
	public ArrayList<Estudiante> getEstudiantes() 
	{
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) 
	{
		this.estudiantes = estudiantes;
	}

	// MANIPULACION DE LA LISTA
	public void listar()
	{
		for(Estudiante x : estudiantes)
		{
			System.out.println(x);
		}		
	}

	public Estudiante buscarPorId(int id)
	{
		Estudiante buscado = null;
		boolean centinela = false;

		for(int i = 0; i < estudiantes.size() && centinela == false; i++)
		{
			if(estudiantes.get(i).getId() == id)
			{
				buscado = estudiantes.get(i);
				centinela = true;
			}
		}
		return buscado;
	}

	public void agregarEstudiante(Estudiante estudiante)
	{
		Estudiante buscado = buscarPorId(estudiante.getId());
		if(buscado == null)
		{
			estudiantes.add(estudiante);
			System.out.println("Se agrego con exito el estudiante.");
		}
		else
		{
			System.out.println("El estudiante ya esta en la lista.");
		}
		guardar();
	}

	public void eliminarEstudiante(int id)
	{
		Estudiante buscado = buscarPorId(id);
		if(buscado != null)
		{
			estudiantes.remove(buscado);
			System.out.println("Estudiante eliminado exitosamente: " + buscado);
		}
		else
		{
			System.out.println("El id no se encuentra en la lista.");
		}	
		guardar();
	}

	public void guardar()
	{
		try
		{
			File file = new File("./data/estudiantes.txt");
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(estudiantes);
			fos.close();
			oos.close();
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}

	@SuppressWarnings("unchecked")
	public void importar()
	{
		try
		{
		File file = new File("./data/estudiantes.txt");
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		estudiantes = (ArrayList<Estudiante>) ois.readObject();
		ois.close();
		fis.close();
		}
		catch(IOException e)
		{
			e.getMessage();
		}
		catch(ClassNotFoundException e)
		{
			e.getMessage();
		}
	}
}
