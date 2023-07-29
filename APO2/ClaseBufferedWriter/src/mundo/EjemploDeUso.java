package mundo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploDeUso 
{

	public static void main(String[] args) 
	{
		try 
		{
			File archivo = new File("./data/archivo.txt");
			FileWriter fileWriter = new FileWriter(archivo, true); // opcional true
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
			bufferedWriter.write("Ejemplo de la clase BufferedWriter en Java.");
			bufferedWriter.newLine();
			bufferedWriter.write("Esta es otra línea de texto.");
			bufferedWriter.close();
			System.out.println("Texto escrito exitosamente en el archivo.");
		} 
		catch (IOException e) 
		{
			System.out.println("Ocurrió un error al escribir en el archivo.");
			e.printStackTrace();
		}
	}

}
