package mundo;

import java.util.ArrayList;

import mundo.Vehiculo.Motor;

public class Concesionario 
{
	// ATRIBUTOS
	private ArrayList<Vehiculo> vehiculos;

	/**
	 * Permite crear los objetos de la clase Concesionario. 
	 */
	public Concesionario() 
	{
		vehiculos = new ArrayList<Vehiculo>();

		Vehiculo v1 = new Vehiculo("001", "Toyota", 2020, Motor.COMBUSTION, 50, 5, 25000);
		vehiculos.add(v1);
		Vehiculo v2 = new Vehiculo("002", "Honda", 2021, Motor.ELECTRICO, 0, 4, 30000);
		vehiculos.add(v2);
		Vehiculo v3 = new Vehiculo("003", "Ford", 2019, Motor.COMBUSTION, 45, 7, 20000);
		vehiculos.add(v3);
		Vehiculo v4 = new Vehiculo("004", "Tesla", 2022, Motor.ELECTRICO, 0, 4, 50000);
		vehiculos.add(v4);
		Vehiculo v5 = new Vehiculo("005", "Chevrolet", 2022, Motor.HIBRIDO, 55, 6, 35000);
		vehiculos.add(v5);
		Vehiculo v6 = new Vehiculo("006", "BMW", 2022, Motor.COMBUSTION, 60, 4, 45000);
		vehiculos.add(v6);
		Vehiculo v7 = new Vehiculo("007", "Mercedes-Benz", 2023, Motor.HIBRIDO, 40, 5, 55000);
		vehiculos.add(v7);
		Vehiculo v8 = new Vehiculo("008", "Audi", 2021, Motor.COMBUSTION, 50, 4, 40000);
		vehiculos.add(v8);
		Vehiculo v9 = new Vehiculo("009", "Lexus", 2022, Motor.HIBRIDO, 35, 5, 60000);
		vehiculos.add(v9);
		Vehiculo v10 = new Vehiculo("010", "Mazda", 2020, Motor.ELECTRICO, 0, 4, 35000);
		vehiculos.add(v10);
		Vehiculo v11 = new Vehiculo("011", "Kia", 2023, Motor.COMBUSTION, 45, 6, 30000);
		vehiculos.add(v11);
		Vehiculo v12 = new Vehiculo("012", "Hyundai", 2022, Motor.HIBRIDO, 40, 5, 45000);
		vehiculos.add(v12);
		Vehiculo v13 = new Vehiculo("013", "Volvo", 2023, Motor.ELECTRICO, 0, 7, 65000);
		vehiculos.add(v13);
		Vehiculo v14 = new Vehiculo("014", "Nissan", 2021, Motor.COMBUSTION, 40, 5, 25000);
		vehiculos.add(v14);
		Vehiculo v15 = new Vehiculo("015", "Subaru", 2022, Motor.HIBRIDO, 35, 5, 35000);
		vehiculos.add(v15);
	}

	/**
	 * Permite mostrar por consola todos los vehiculos del concesionario.
	 */
	public void listarVehiculos()
	{
		for(int i = 0; i < vehiculos.size(); i++)
		{
			System.out.println(vehiculos.get(i));
		}
	}

	// TODO 1: 
	/**
	 * Permite buscar y retornar el vehículo con el numero de serie dado como parámetro.
	 * @param numeroSerie
	 * @return
	 */
	public Vehiculo buscarVehiculoPorNumeroSerie(String numeroSerie)
	{
		Vehiculo vehiculoBuscado = null;
		boolean centinela = false;

		for(int i = 0; i < vehiculos.size() && centinela == false; i++)
		{
			if(vehiculos.get(i).getNumeroSerie().equalsIgnoreCase(numeroSerie))
			{
				vehiculoBuscado = vehiculos.get(i);
				centinela = true;
			}
		}
		return vehiculoBuscado;		
	}

	// TODO 2:
	/**
	 * Permite buscar y retornar la marca de los vehículos 
	 * con el modelo especificado como parámetro. 
	 * @param modelo
	 */
	public String buscarVehiculoPorModelo(int modelo)
	{
		return null;
	}

	// TODO 3:
	/**
	 * Permite buscar y retornar la marca de los vehículos con el tipo de motor 
	 * especificado como parámetro. 
	 * @param tipo
	 * @return
	 */
	public String buscarVehiculoPorTipo(Motor tipo)
	{
		return null;
	}

	// TODO 4:
	/**
	 * Permite calcular y retornar el promedio del precio de venta 
	 * de los vehículos en el concesionario. 
	 * @return
	 */
	public double calcularPromedioPrecioVenta()
	{
		return 0.0;
	}

	// TODO 5:
	/**
	 * Permite buscar y retornar la marca de los vehículos que tienen 
	 * un precio de venta menor o igual al precio especificado como parámetro. 
	 * @param precio
	 * @return
	 */
	public String buscarVehiculosPorPrecio(double precio)
	{
		return null;
	}

	// TODO 6:
	/**
	 * Permite buscar y retornar la marca de los vehículos que tienen una 
	 * capacidad de tanque mayor que la capacidad especificada como parámetro. 
	 * @param capacidad
	 * @return
	 */
	public String buscarVehiculosConCapacidadTanqueMayor(double capacidad)
	{
		return null;
	}

	// TODO 7:
	/**
	 * Permite buscar y retornar la marca de los vehículos que tienen 
	 * un número de pasajeros igual al número especificado como parámetro. 
	 * @param numeroPasajeros
	 * @return
	 */
	public String buscarVehiculosPorNumeroPasajeros(int numeroPasajeros)
	{
		return null;
	}

	// TODO 8:
	/**
	 * Este método debe buscar y retornar el vehículo con el precio de venta 
	 * más alto en el concesionario. 
	 * @return
	 */
	public Vehiculo obtenerVehiculoMasCaro()
	{
		return null;
	}

	// TODO 9:
	/**
	 * Este método debe buscar y retornar el vehículo con el precio de venta 
	 * más bajo en el concesionario. 
	 * @return
	 */
	public Vehiculo obtenerVehiculoMasBarato()
	{
		return null;
	}

	// TODO 10:
	/**
	 * Permite buscar y retornar la marca de los vehículos que tienen 
	 * un modelo dentro del rango especificado como parámetros. 
	 * @param modeloInicial
	 * @param modeloFinal
	 * @return
	 */
	public String buscarVehiculosPorRangoDeModelo(int modeloInicial, int modeloFinal)
	{
		return null;
	}

	public void intercambiar(int index1, int index2)
	{
		if( (index1 >= 0 && index1 < vehiculos.size()) && 
				(index2 >= 0 && index2 < vehiculos.size()) )
		{
			Vehiculo v1 = vehiculos.get(index1);
			Vehiculo v2 = vehiculos.get(index2);
			vehiculos.set(index1, v2);
			vehiculos.set(index2, v1);
		}
		else
		{
			System.out.println("Los indices estan fuera de los limites del vector.");
		}

	}

	public void eliminarVehiculo(int index1)
	{
		if( index1 >= 0 && index1 < vehiculos.size() )
		{
			vehiculos.remove(index1);
			System.out.println("Eliminado.");
		}
		else
		{
			System.out.println("Los indices estan fuera de los limites del vector.");
		}
	}

}
