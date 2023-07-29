package mundo;

public class Vehiculo 
{
    private String placa;
    private double horaEntrada;
    private String tipoVehiculo;

    public Vehiculo(String placa, double horaEntrada, String tipoVehiculo) 
    {
        this.placa = placa;
        this.horaEntrada = horaEntrada;
        this.tipoVehiculo = tipoVehiculo;
    }

    // Getters y setters
    public String getPlaca() 
    {
        return placa;
    }

    public void setPlaca(String placa) 
    {
        this.placa = placa;
    }

    public double getHoraEntrada() 
    {
        return horaEntrada;
    }

    public void setHoraEntrada(double horaEntrada) 
    {
        this.horaEntrada = horaEntrada;
    }

    public String getTipoVehiculo() 
    {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) 
    {
        this.tipoVehiculo = tipoVehiculo;
    }
}

