package mundo;

import java.util.Arrays;

public class Sala 
{
    private int id;
    private boolean[] asientos; // Representación unidimensional de asientos
    private int filas;
    private int asientosPorFila;

    public Sala(int id, int filas, int asientosPorFila) 
    {
        this.id = id;
        this.filas = filas;
        this.asientosPorFila = asientosPorFila;
        this.asientos = new boolean[filas * asientosPorFila];
    }

    public boolean reservarAsiento(int fila, int asiento) 
    {
        int indice = fila * asientosPorFila + asiento;
        if (!asientos[indice]) 
        {
            asientos[indice] = true;
            return true;
        }
        return false;
    }

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public boolean[] getAsientos() 
	{
		return asientos;
	}

	public void setAsientos(boolean[] asientos) 
	{
		this.asientos = asientos;
	}

	public int getFilas() 
	{
		return filas;
	}

	public void setFilas(int filas) 
	{
		this.filas = filas;
	}

	public int getAsientosPorFila() 
	{
		return asientosPorFila;
	}

	public void setAsientosPorFila(int asientosPorFila) 
	{
		this.asientosPorFila = asientosPorFila;
	}

	@Override
	public String toString() 
	{
		return "Sala [id=" + id + ", asientos=" + Arrays.toString(asientos) + ", filas=" + filas + ", asientosPorFila="
				+ asientosPorFila + "]";
	}

}
