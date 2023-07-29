package mundo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Curso 
{
	private static final String DATABASE_URL = "jdbc:mysql://localhost:8889/Escuela";
	private static final String DATABASE_USER = "root";
	private static final String DATABASE_PASSWORD = "root";

	public List<Estudiante> listarEstudiantes() 
	{
	    List<Estudiante> estudiantes = new ArrayList<>();
	    Connection connection = null;
	    Statement statement = null;
	    ResultSet resultSet = null;

	    try 
	    {
	    	/*
	    	 * Establece una conexión con la base de datos utilizando 
	    	 * el DriverManager de Java. Los parámetros DATABASE_URL, DATABASE_USER y 
	    	 * DATABASE_PASSWORD contienen la dirección de la base de datos, el nombre 
	    	 * de usuario y la contraseña, respectivamente. La conexión se almacena en la 
	    	 * variable "connection" para ser utilizada en consultas posteriores.
	    	 */
	        connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
	        /*
	         * Define una cadena que contiene una consulta SQL. 
	         * Esta consulta selecciona todos los campos (*) de la tabla 
	         * "Estudiantes". Posteriormente, esta cadena será utilizada para 
	         * ejecutar la consulta y recuperar los registros almacenados en la 
	         * tabla "Estudiantes".
	         */
	        String sql = "SELECT * FROM Estudiantes";
	        /*
	         * La instrucción statement = connection.createStatement(); 
	         * crea un objeto Statement utilizando el objeto Connection 
	         * previamente establecido. Un objeto Statement se utiliza para 
	         * ejecutar consultas SQL estáticas sin parámetros en una base de datos. 
	         * Es una parte esencial para interactuar con la base de datos en Java.
	         */
	        statement = connection.createStatement();
	        /*
	         * La instrucción resultSet = statement.executeQuery(sql); 
	         * ejecuta la consulta SQL almacenada en la variable sql utilizando 
	         * el objeto Statement llamado statement. El resultado de la consulta 
	         * se almacena en un objeto ResultSet llamado resultSet, que contiene 
	         * las filas devueltas por la consulta.
	         */
	        resultSet = statement.executeQuery(sql);

	        // resultSet.next() Mueve cursor al siguiente registro, retorna falso si termina.
	        while (resultSet.next()) 
	        {
	            int codigo = resultSet.getInt("Codigo");
	            String nombre = resultSet.getString("Nombre");
	            String apellido = resultSet.getString("Apellido");
	            Estudiante estudiante = new Estudiante(codigo, nombre, apellido);
	            estudiantes.add(estudiante);
	        }
	    } 
	    catch (SQLException e) 
	    {
	        System.out.println("Error al listar estudiantes:");
	        e.printStackTrace();
	    } 
	    finally 
	    {
	        if (resultSet != null) 
	        {
	            try 
	            {
	                resultSet.close();
	            } 
	            catch (SQLException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	        if (statement != null) 
	        {
	            try 
	            {
	                statement.close();
	            } 
	            catch (SQLException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	        if (connection != null) 
	        {
	            try 
	            {
	                connection.close();
	            } 
	            catch (SQLException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	    return estudiantes;
	}
	
	public boolean agregarEstudiante(Estudiante estudiante) 
	{
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    try 
	    {
	        connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
	        String sql = "INSERT INTO Estudiantes (Codigo, Nombre, Apellido) VALUES (?, ?, ?)";
	        /*
	         * La instrucción preparedStatement = connection.prepareStatement(sql); 
	         * crea un objeto PreparedStatement utilizando el objeto Connection y 
	         * la consulta SQL especificada. PreparedStatement es una interfaz 
	         * de Java que permite ejecutar consultas SQL precompiladas con parámetros, 
	         * ofreciendo mayor eficiencia y seguridad contra inyección SQL 
	         * en comparación con objetos Statement simples.
	         */       
	        preparedStatement = connection.prepareStatement(sql);
	        /*
	         * La instrucción preparedStatement.setInt(1, estudiante.getCodigo()) 
	         * establece el valor del primer parámetro en la consulta SQL representada 
	         * por el objeto PreparedStatement. El primer parámetro es un entero, 
	         * correspondiente al código del estudiante. El método setInt asigna este 
	         * valor al primer marcador de posición en la consulta.
	         */
	        preparedStatement.setInt(1, estudiante.getCodigo());
	        /*
	         * preparedStatement.setString(2, estudiante.getNombre()) 
	         * establece el valor del segundo parámetro en la consulta SQL preparada 
	         * como una cadena (String). El valor proviene del método getNombre() del 
	         * objeto estudiante. Esta instrucción se utiliza antes de ejecutar 
	         * la consulta para agregar o actualizar un registro en la base de datos.
	         */
	        preparedStatement.setString(2, estudiante.getNombre());
	        /*
	         * preparedStatement.setString(3, estudiante.getApellido()); 
	         * asigna el valor del atributo 'apellido' del objeto 'estudiante' al tercer 
	         * parámetro del PreparedStatement 'preparedStatement'. 
	         * El método setString se utiliza para establecer valores de tipo String 
	         * en una consulta SQL parametrizada.
	         */
	        preparedStatement.setString(3, estudiante.getApellido());
	        /*
	         * La instrucción int filasAfectadas = preparedStatement.executeUpdate(); 
	         * ejecuta una consulta SQL de actualización (INSERT, UPDATE o DELETE) 
	         * utilizando un objeto PreparedStatement. Retorna el número de filas afectadas 
	         * por la consulta en la base de datos, almacenándolo en la variable filasAfectadas.
	         */
	        int filasAfectadas = preparedStatement.executeUpdate();
	        return filasAfectadas > 0;
	    } 
	    catch (SQLException e) 
	    {
	        System.out.println("Error al agregar estudiante:");
	        e.printStackTrace();
	        return false;
	    } 
	    finally 
	    {
	        if (preparedStatement != null) 
	        {
	            try 
	            {
	                preparedStatement.close();
	            } 
	            catch (SQLException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	        if (connection != null) 
	        {
	            try 
	            {
	                connection.close();
	            } 
	            catch (SQLException e) 
	            {
	                e.printStackTrace();
	            }
	        }
	    }
	}


	public boolean actualizarEstudiante(Estudiante estudiante) 
	{
		try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) 
		{
			String sql = "UPDATE Estudiantes SET Nombre = ?, Apellido = ? WHERE Codigo = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) 
			{
				preparedStatement.setString(1, estudiante.getNombre());
				preparedStatement.setString(2, estudiante.getApellido());
				preparedStatement.setInt(3, estudiante.getCodigo());

				int filasAfectadas = preparedStatement.executeUpdate();
				return filasAfectadas > 0;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Error al actualizar estudiante:");
			e.printStackTrace();
			return false;
		}
	}

	public boolean eliminarEstudiante(int codigo) 
	{
		try (Connection connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD)) {
			String sql = "DELETE FROM Estudiantes WHERE Codigo = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) 
			{
				preparedStatement.setInt(1, codigo);

				int filasAfectadas = preparedStatement.executeUpdate();
				return filasAfectadas > 0;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println("Error al eliminar estudiante:");
			e.printStackTrace();
			return false;
		}
	}
}
