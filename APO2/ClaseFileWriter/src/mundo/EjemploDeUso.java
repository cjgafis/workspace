package mundo;

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
			FileWriter fileWriter = new FileWriter(archivo);// opcional true
			fileWriter.write("Este es un ejemplo de la clase FileWriter en Java.");
			fileWriter.close();
			System.out.println("Texto escrito exitosamente en el archivo.");
		} 
		catch (IOException e) 
		{
			System.out.println("Ocurrió un error al escribir en el archivo.");
			e.printStackTrace();
		}
	}

}
