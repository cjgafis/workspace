package mundo;

import java.util.ArrayList;

public class Cinema 
{
    private ArrayList<Sala> salas;
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Reserva> reservas;

    public Cinema() 
    {
        salas = new ArrayList<Sala>();
        peliculas = new ArrayList<Pelicula>();
        clientes = new ArrayList<Cliente>();
        reservas = new ArrayList<Reserva>();
    }

    // Métodos para Salas
    public ArrayList<Sala> listarSalas() 
    {
        return salas;
    }

    public void agregarSala(Sala sala) 
    {
        salas.add(sala);
    }

    public boolean cambiarSala(int indice, Sala nuevaSala) 
    {
        if (indice >= 0 && indice < salas.size()) 
        {
            salas.set(indice, nuevaSala);
            return true;
        }
        return false;
    }

    public boolean eliminarSala(int indice) 
    {
        if (indice >= 0 && indice < salas.size()) 
        {
            salas.remove(indice);
            return true;
        }
        return false;
    }

    public Sala buscarSala(int id) 
    {
        for (Sala sala : salas) 
        {
            if (sala.getId() == id) 
            {
                return sala;
            }
        }
        return null;
    }

    // Taller extraclase
    // Métodos similares para Peliculas, Clientes y Reservas
    // ...
    
    /*
     * Requerimientos funcionales de la aplicación del sistema de reservas de cine:
     * 
     * Gestión de películas:
     * a. Agregar una nueva película.
     * b. Listar todas las películas.
     * c. Buscar una película por título.
     * d. Modificar la información de una película existente.
     * e. Eliminar una película.
     * 
     * Gestión de salas de cine:
     * a. Agregar una nueva sala.
     * b. Listar todas las salas.
     * c. Buscar una sala por número identificador.
     * d. Modificar la configuración de una sala existente (cantidad de filas y asientos por fila).
     * e. Eliminar una sala.
     * 
     * Gestión de clientes:
     * a. Agregar un nuevo cliente.
     * b. Listar todos los clientes.
     * c. Buscar un cliente por nombre.
     * d. Modificar la información de un cliente.
     * e. Eliminar un cliente.
     * 
     * Gestión de reservas:
     * a. Crear una nueva reserva (selección de cliente, película, sala, fila y asiento).
     * b. Listar todas las reservas.
     * c. Buscar una reserva por ID de reserva o nombre de cliente.
     * d. Modificar una reserva existente (cambiar cliente, película, sala, fila o asiento).
     * e. Cancelar (eliminar) una reserva.
     * 
     * Consulta de disponibilidad:
     * a. Mostrar todos los asientos disponibles en una sala para una película específica.
     * b. Mostrar todas las películas con asientos disponibles en una sala específica.
     * c. Mostrar el total de asientos disponibles y reservados en una sala.
     * 
     * Generación de informes:
     * a. Generar un informe de ventas por película (total de reservas, ingresos, etc.).
     * b. Generar un informe de ventas por sala (ocupación, ingresos, etc.).
     * 
     */ 
}