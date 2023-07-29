package mundo;

public class Recorrido 
{
	// DOBLE RECORRIDO
	public String numeroMasRepetido(int [] numeros)
	{
		int numeroMasRepetido = 0;
        int repeticionesDelNumeroMasRepetido = 0;
        
		for (int i = 0; i < numeros.length; i++) 
		{
            int contador = 0;
            for (int j = 0; j < numeros.length; j++) 
            {
                if (numeros[j] == numeros[i]) 
                {
                    contador++;
                }
            }
            if (contador > repeticionesDelNumeroMasRepetido) 
            {
                numeroMasRepetido = numeros[i];
                repeticionesDelNumeroMasRepetido = contador;
            }
        }
        
        return "El número que aparece más veces es " + numeroMasRepetido + 
        		" con " + repeticionesDelNumeroMasRepetido + " repeticiones.";
	}
	
	
	// RECORRIDO PARCIAL
	public boolean existeAlgunCinco(int [] numeros)
	{
		boolean centinela = false;
		
		for(int i = 0; i < numeros.length && centinela == false; i++)
		{
			if(numeros[i] == 5.0)
			{
				centinela = true;
			}
		}
		return centinela;
	}
	
}
