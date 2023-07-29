package mundo;

import java.util.ArrayList;

public class Parqueadero 
{
	private int maxCoches;
    private int maxMotos;
    private int cochesActuales;
    private int motosActuales;
    private int costoHoraCoche;
    private int costoHoraMoto;
    private double totalIngresos;
    private ArrayList<Vehiculo> vehiculos;

    public Parqueadero(int maxCoches, int maxMotos, int costoHoraCoche, int costoHoraMoto) {
        this.maxCoches = maxCoches;
        this.maxMotos = maxMotos;
        this.costoHoraCoche = costoHoraCoche;
        this.costoHoraMoto = costoHoraMoto;
        this.cochesActuales = 0;
        this.motosActuales = 0;
        this.totalIngresos = 0;
        this.vehiculos = new ArrayList<>();
    }

    // Getters y setters
    public int getMaxCoches() 
    {
        return maxCoches;
    }

    public void setMaxCoches(int maxCoches) 
    {
        this.maxCoches = maxCoches;
    }

    public int getMaxMotos() 
    {
        return maxMotos;
    }

    public void setMaxMotos(int maxMotos) 
    {
        this.maxMotos = maxMotos;
    }

    public int getCochesActuales() 
    {
        return cochesActuales;
    }

    public void setCochesActuales(int cochesActuales) 
    {
        this.cochesActuales = cochesActuales;
    }

    public int getMotosActuales() 
    {
        return motosActuales;
    }

    public void setMotosActuales(int motosActuales) 
    {
        this.motosActuales = motosActuales;
    }

    public int getCostoHoraCoche() 
    {
        return costoHoraCoche;
    }

    public void setCostoHoraCoche(int costoHoraCoche) 
    {
        this.costoHoraCoche = costoHoraCoche;
    }

    public int getCostoHoraMoto() 
    {
        return costoHoraMoto;
    }

    public void setCostoHoraMoto(int costoHoraMoto) 
    {
        this.costoHoraMoto = costoHoraMoto;
    }
    
    public double getTotalIngresos() 
    {
        return totalIngresos;
    }

    public void setTotalIngresos(double totalIngresos) 
    {
        this.totalIngresos = totalIngresos;
    }
    
    public ArrayList<Vehiculo> getVehiculos() 
    {
        return vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) 
    {
        this.vehiculos = vehiculos;
    }

    public boolean registrarIngreso(Vehiculo vehiculo) 
    {
        if (vehiculo.getTipoVehiculo().equals("coche") && cochesActuales < maxCoches) 
        {
            vehiculos.add(vehiculo);
            cochesActuales++;
            return true;
        } 
        else if (vehiculo.getTipoVehiculo().equals("moto") && motosActuales < maxMotos) 
        {
            vehiculos.add(vehiculo);
            motosActuales++;
            return true;
        }
        return false;
    }

    public double calcularCosto(String placa, double horaSalida) 
    {
        for (Vehiculo vehiculo : vehiculos) 
        {
            if (vehiculo.getPlaca().equals(placa)) 
            {
                double horas = Math.ceil(horaSalida - vehiculo.getHoraEntrada());
                return vehiculo.getTipoVehiculo().equals("coche") ? horas * costoHoraCoche : horas * costoHoraMoto;
            }
        }
        return -1;
    }
    
    public boolean registrarSalida(String placa, double horaSalida) 
    {
        for (Vehiculo vehiculo : vehiculos) 
        {
            if (vehiculo.getPlaca().equals(placa)) 
            {
                double costo = calcularCosto(placa, horaSalida);
                if (costo != -1) 
                {
                    System.out.println("Costo total del parqueo: " + costo + " pesos colombianos");
                    totalIngresos += costo;
                    vehiculos.remove(vehiculo);
                    if (vehiculo.getTipoVehiculo().equals("coche")) 
                    {
                        cochesActuales--;
                    } 
                    else 
                    {
                        motosActuales--;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public void mostrarVehiculos() 
    {
        for (Vehiculo vehiculo : vehiculos) 
        {
            System.out.println("Placa: " + vehiculo.getPlaca() + ", Tipo: " + vehiculo.getTipoVehiculo() + ", Hora de entrada: " + vehiculo.getHoraEntrada());
        }
    }
}


