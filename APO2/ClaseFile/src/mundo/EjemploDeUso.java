package mundo;

import java.io.File;

public class EjemploDeUso 
{
	public static void main(String[] args) 
	{
		 // Crear un objeto File que representa un archivo o directorio en el sistema de archivos
        File archivo = new File("./data/archivo.txt");

        // Comprobar si el archivo existe
        boolean existe = archivo.exists();
        System.out.println(existe);

        // Obtener el nombre del archivo o directorio
        String nombre = archivo.getName();
        System.out.println(nombre);

        // Comprobar si es un archivo
        boolean esArchivo = archivo.isFile();
        System.out.println(esArchivo);

        // Comprobar si es un directorio
        boolean esDirectorio = archivo.isDirectory();
        System.out.println(esDirectorio);

        // Obtener la ruta absoluta del archivo o directorio
        String rutaAbsoluta = archivo.getAbsolutePath();
        System.out.println(rutaAbsoluta);

        // Eliminar el archivo o directorio
        //boolean eliminado = archivo.delete();

	}

}
