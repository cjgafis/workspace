package mundo;

public class Aplicacion 
{
    public static void main(String[] args) 
    {
    	// TODO: CREAR UN MENU PARA CADA METODO DE LA CLASE LISTA
    	
        Lista lista = new Lista();
        lista.agregarAlFinal(new Estudiante("Juan", 18));
        lista.agregarAlFinal(new Estudiante("Maria", 22));
        lista.agregarAlFinal(new Estudiante("Pedro", 20));

        lista.imprimirLista();
    }
}
