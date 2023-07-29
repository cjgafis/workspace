package mundo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;

public class SistemaGestionEstudiantes 
{
	private ArrayList<Curso> cursos;
	private static final String DATA_PATH = "data/cursos.ser";

	// Contructor
	public SistemaGestionEstudiantes() 
	{
		this.cursos = new ArrayList<Curso>();
	}

	// Buscar estudiantes por nombre o apellido
	public ArrayList<Estudiante> buscarEstudiantes(String terminoBusqueda) 
	{
		ArrayList<Estudiante> estudiantesEncontrados = new ArrayList<Estudiante>();
		for (Curso curso : cursos) 
		{
			for (Estudiante estudiante : curso.getEstudiantes()) 
			{
				if (estudiante.getNombre().toLowerCase().contains(terminoBusqueda.toLowerCase())) {
					estudiantesEncontrados.add(estudiante);
				}
			}
		}
		return estudiantesEncontrados;
	}

	// Buscar cursos por nombre
	public Curso buscarCurso(String nombreCurso) 
	{
		for (Curso curso : cursos) 
		{
			if (curso.getNombre().equalsIgnoreCase(nombreCurso)) 
			{
				return curso;
			}
		}
		return null;
	}

	// Mostrar todos los estudiantes de un curso específico
	public ArrayList<Estudiante> estudiantesDeCurso(String nombreCurso) 
	{
		Curso curso = buscarCurso(nombreCurso);
		if (curso != null) 
		{
			return (ArrayList<Estudiante>) curso.getEstudiantes();
		}
		return null;
	}

	// Calcular y mostrar el promedio de edad de los estudiantes de un curso
	public double promedioEdadEstudiantes(String nombreCurso) 
	{
		Curso curso = buscarCurso(nombreCurso);
		if (curso != null) 
		{
			int sumaEdades = 0;
			for (Estudiante estudiante : curso.getEstudiantes()) 
			{
				sumaEdades += estudiante.getEdad();
			}
			return (double) sumaEdades / curso.getEstudiantes().size();
		}
		return 0;
	}

	// Ordenar estudiantes por edad
	public ArrayList<Estudiante> ordenarEstudiantesPorEdad() 
	{
		ArrayList<Estudiante> todosEstudiantes = new ArrayList<Estudiante>();
		for (Curso curso : cursos) 
		{
			todosEstudiantes.addAll(curso.getEstudiantes());
		}
		todosEstudiantes.sort(Comparator.comparingInt(Estudiante::getEdad));
		return todosEstudiantes;
	}

	// Agregar un nuevo curso
	public void agregarCurso(Curso curso) 
	{
		cursos.add(curso);
	}

	// Guardar cursos
	public void guardarCursos() 
	{
		try (FileOutputStream fos = new FileOutputStream(DATA_PATH);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) 
		{
			oos.writeObject(cursos);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

	// Cargar cursos
	@SuppressWarnings("unchecked")
	public void cargarCursos() 
	{
		try
		{
			FileInputStream fis = new FileInputStream(DATA_PATH);
			ObjectInputStream ois = new ObjectInputStream(fis);
			cursos = (ArrayList<Curso>) ois.readObject();
			fis.close();
			ois.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public String toString() 
	{
		return "SistemaGestionEstudiantes{" + "cursos=" + cursos + '}';
	}
}
