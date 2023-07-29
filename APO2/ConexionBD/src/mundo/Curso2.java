package mundo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase Curso2 es un ejemplo que ilustra el uso de try-catch en operaciones 
 * de base de datos.
 * La clase se conecta a una base de datos MySQL y realiza operaciones 
 * CRUD (Crear, Leer, Actualizar, Eliminar) sobre la tabla "Estudiantes".
 */
public class Curso2 
{
	// Constantes para la conexión a la base de datos
	private static final String DATABASE_URL = "jdbc:mysql://localhost:8889/Escuela";
	private static final String DATABASE_USER = "root";
	private static final String DATABASE_PASSWORD = "root";

	/**
	 * Método que devuelve una lista de objetos Estudiante obtenidos de la base 
	 * de datos.
	 * @return Lista de objetos Estudiante.
	 */
	public List<Estudiante> listarEstudiantes() 
	{
		// Inicializa una lista vacía de estudiantes
		List<Estudiante> estudiantes = new ArrayList<>();

		// Inicializa las variables para la conexión, declaración y resultado
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;

		try 
		{
			// Establece la conexión con la base de datos
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);// Consulta SQL para seleccionar todos los estudiantes
			String sql = "SELECT * FROM Estudiantes";

			// Crea un objeto Statement para enviar consultas SQL a la base de datos
			statement = connection.createStatement();

			// Ejecuta la consulta y almacena el resultado en un objeto ResultSet
			resultSet = statement.executeQuery(sql);

			// Itera sobre el objeto ResultSet y crea objetos Estudiante para agregarlos a la lista de estudiantes
			while (resultSet.next()) 
			{
				int codigo = resultSet.getInt("Codigo");
				String nombre = resultSet.getString("Nombre");
				String apellido = resultSet.getString("Apellido");
				Estudiante estudiante = new Estudiante(codigo, nombre, apellido);
				estudiantes.add(estudiante);
			}

			// Cierra el objeto ResultSet, Statement y la conexión a la base de datos
			resultSet.close();
			statement.close();
			connection.close();
		} 
		catch (SQLException e)
		{
			// Imprime el mensaje de error si ocurre una excepción
			e.getMessage();
		}

		// Devuelve la lista de estudiantes
		return estudiantes;
	}

	/**
	 * Método que agrega un nuevo objeto Estudiante a la base de datos.
	 * @param estudiante Objeto Estudiante que se agregará a la base de datos.
	 * @return Verdadero si se agregó el estudiante, falso si no se agregó.
	 */
	public boolean agregarEstudiante(Estudiante estudiante) 
	{
		// Inicializa las variables para la conexión y declaración preparada
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		// Inicializa una variable para contar las filas afectadas en la base de datos
		int filasAfectadas = 0;

		try 
		{
			// Establece la conexión con la base de datos
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);// Consulta SQL para insertar un nuevo estudiante
			String sql = "INSERT INTO Estudiantes (Codigo, Nombre, Apellido) VALUES (?, ?, ?)";

			// Crea un objeto PreparedStatement para enviar consultas SQL parametrizadas a la base de datos
			preparedStatement = connection.prepareStatement(sql);

			// Asigna los valores a los parámetros de la consulta
			preparedStatement.setInt(1, estudiante.getCodigo());
			preparedStatement.setString(2, estudiante.getNombre());
			preparedStatement.setString(3, estudiante.getApellido());
			
			// Ejecuta la consulta y almacena el número de filas afectadas
			filasAfectadas = preparedStatement.executeUpdate();

			// Cierra el objeto PreparedStatement y la conexión a la base de datos
			preparedStatement.close();
			connection.close();
		} 
		catch (SQLException e) 
		{
			// Imprime el mensaje de error si ocurre una excepción
			e.getMessage();
		}

		// Devuelve verdadero si se agregó el estudiante (filasAfectadas > 0), falso si no se agregó
		return filasAfectadas > 0;
	}

	/**
	 * Método que actualiza un objeto Estudiante existente en la base de datos.
	 * @param estudiante Objeto Estudiante que se actualizará en la base de datos.
	 * @return Verdadero si se actualizó el estudiante, falso si no se actualizó.
	 */
	public boolean actualizarEstudiante(Estudiante estudiante) 
	{
		// Inicializa las variables para la conexión y declaración preparada
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		// Inicializa una variable para contar las filas afectadas en la base de datos
		int filasAfectadas = 0;

		try 
		{
			// Establece la conexión con la base de datos
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

			// Consulta SQL para actualizar un estudiante existente
			String sql = "UPDATE Estudiantes SET Nombre = ?, Apellido = ? WHERE Codigo = ?";

			// Crea un objeto PreparedStatement para enviar consultas SQL parametrizadas a la base de datos
			preparedStatement = connection.prepareStatement(sql);

			// Asigna los valores a los parámetros de la consulta
			preparedStatement.setString(1, estudiante.getNombre());
			preparedStatement.setString(2, estudiante.getApellido());
			preparedStatement.setInt(3, estudiante.getCodigo());

			// Ejecuta la consulta y almacena el número de filas afectadas
			filasAfectadas = preparedStatement.executeUpdate();

			// Cierra el objeto PreparedStatement y la conexión a la base de datos
			preparedStatement.close();
			connection.close();
		} 
		catch (SQLException e) 
		{
			// Imprime el mensaje de error si ocurre una excepción
			e.getMessage();
		}

		// Devuelve verdadero si se actualizó el estudiante (filasAfectadas > 0), falso si no se actualizó
		return filasAfectadas > 0;
	}

	/**
	 * Método que elimina un objeto Estudiante de la base de datos utilizando su código.
	 * @param codigo Entero que representa el código del estudiante que se eliminará de la base de datos.
	 * @return Verdadero si se eliminó el estudiante, falso si no se eliminó.
	 */
	public boolean eliminarEstudiante(int codigo) 
	{
		// Inicializa las variables para la conexión y declaración preparada
		Connection connection = null;
		PreparedStatement preparedStatement = null;

		// Inicializa una variable para contar las filas afectadas en la base de datos
		int filasAfectadas = 0;

		try 
		{
			// Establece la conexión con la base de datos
			connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);

			// Consulta SQL para eliminar un estudiante existente por su código
			String sql = "DELETE FROM Estudiantes WHERE Codigo = ?";

			// Crea un objeto PreparedStatement para enviar consultas SQL parametrizadas a la base de datos
			preparedStatement= connection.prepareStatement(sql);
			
			// Asigna el valor al parámetro de la consulta
			preparedStatement.setInt(1, codigo);

			// Ejecuta la consulta y almacena el número de filas afectadas
			filasAfectadas = preparedStatement.executeUpdate();

			// Cierra el objeto PreparedStatement y la conexión a la base de datos
			preparedStatement.close();
			connection.close();
		} 
		catch (SQLException e) 
		{
			// Imprime el mensaje de error si ocurre una excepción
			e.getMessage();
		}

		// Devuelve verdadero si se eliminó el estudiante (filasAfectadas > 0), falso si no se eliminó
		return filasAfectadas > 0;
	}
}

