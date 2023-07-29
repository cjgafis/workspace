package mundo;

/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 * Crea objetos Empleado, llama a sus métodos y muestra los resultados.
 */
public class MainApp 
{

    /**
     * Método principal que se ejecuta al iniciar la aplicación.
     * 
     * @param args argumentos de la línea de comandos (no se utilizan en este ejemplo)
     */
    public static void main(String[] args) 
    {
        // Crear objetos Empleado
        Empleado empleado1 = new Empleado("Juan Pérez", 1, 2000.0);
        Empleado empleado2 = new Empleado("Ana García", 2, 2500.0);

        // Mostrar la información de los empleados utilizando el método toString
        System.out.println("Empleado 1: " + empleado1.toString());
        System.out.println("Empleado 2: " + empleado2.toString());

        // Calcular y mostrar el salario anual de los empleados
        double salarioAnualEmpleado1 = empleado1.calcularSalarioAnual();
        double salarioAnualEmpleado2 = empleado2.calcularSalarioAnual();
        System.out.println("Salario anual Empleado 1: " + salarioAnualEmpleado1);
        System.out.println("Salario anual Empleado 2: " + salarioAnualEmpleado2);

        // Calcular y mostrar el bono de los empleados
        double bonoEmpleado1 = empleado1.calcularBono();
        double bonoEmpleado2 = empleado2.calcularBono();
        System.out.println("Bono Empleado 1: " + bonoEmpleado1);
        System.out.println("Bono Empleado 2: " + bonoEmpleado2);
    }
}

