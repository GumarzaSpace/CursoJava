
// Las excepciones son situaciones an�malas o errores que pueden ocurrir 
// durante la ejecuci�n de un programa. Por ejemplo: intentar dividir por cero, 
// leer un archivo que no existe o acceder a un elemento fuera de los l�mites 
// de un array.

// Lanzamiento con throw, captura con try-catch y propagaci�n con throws.
// [Consultar excepciones existentes en Java].

// Creaci�n de la clase para la excepci�n personalizada.
// Esta debe ser hija de la clase Exception.
// Checked, obligadas, y unchecked, no obligadas (RuntimeException).
class SaldoInsuficienteException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SaldoInsuficienteException(String mensaje)
	{
		// Llamamos al constructor de Exception con un mensaje.
		super(mensaje);
	}
}