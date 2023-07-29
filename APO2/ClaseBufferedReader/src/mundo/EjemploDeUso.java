package mundo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjemploDeUso 
{
	public static void main(String[] args) 
	{
		try
		{
			File archivo = new File("./data/archivo.txt");
			FileReader fileReader = new FileReader(archivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String linea;
			while ((linea = bufferedReader.readLine()) != null) 
			{
				System.out.println(linea);
			}
			bufferedReader.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
