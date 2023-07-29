package mundo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EjemploDeUso 
{

	public static void main(String[] args) 
	{
		File archivo = new File("./data/archivo.txt");

		try
		{
			FileReader fileReader = new FileReader(archivo);
			int caracter;
			while ((caracter = fileReader.read()) != -1) 
			{
				System.out.print((char) caracter);
			}
			fileReader.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
