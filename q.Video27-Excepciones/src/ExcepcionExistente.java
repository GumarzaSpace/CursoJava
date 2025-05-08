
// Muestra de ejecución y captura de excepcion existentes en Java.
public class ExcepcionExistente
{
	public static void main(String[] args)
	{
		try
		{
			int resultado = 10 / 0; // Esto lanzará ArithmeticException.
			System.out.println("Resultado: " + resultado);
		} 
		catch (RuntimeException e)
		{
			System.out.println("¡Error! No se puede dividir por cero.");
		}

		System.out.println("Programa continúa...");
	}
}