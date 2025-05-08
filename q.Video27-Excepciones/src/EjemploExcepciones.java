
// Clase principal para ejecutar el ejemplo
public class EjemploExcepciones
{
	public static void main(String[] args)
	{
		// Cuenta con 100€.
		CuentaBancaria cuenta = new CuentaBancaria(100.0); 

		try
		{
			System.out.println("Saldo actual: " + cuenta.getSaldo() + "€");

			cuenta.retirar(30.0); // Operación válida.
			System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo() + "€");

			cuenta.retirar(80.0); // Esto causará una excepción.
			System.out.println("Retiro exitoso. Nuevo saldo: " + cuenta.getSaldo() + "€");

		} 
		catch (SaldoInsuficienteException e)
		{
			// Capturamos la excepción personalizada y mostramos el mensaje.
			System.out.println("¡Error! " + e.getMessage());
		}

		System.out.println("Programa finalizado correctamente.");
	}
}