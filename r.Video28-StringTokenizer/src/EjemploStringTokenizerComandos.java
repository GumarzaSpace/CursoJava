import java.util.StringTokenizer;

public class EjemploStringTokenizerComandos
{
	public static void main(String[] args)
	{
		// Simulaci�n de procesamiento de un comando introducido por el usuario.
		String comando = "login usuario123 clave456";

		// Creamos un StringTokenizer para separar el comando en partes usando espacios, defecto.
		StringTokenizer tokenizer = new StringTokenizer(comando);

		// Obtenemos la primera parte del comando ("login").
		String accion = tokenizer.nextToken();

		// Dependiendo de la acci�n, procesamos el comando.
		if ("login".equals(accion))
		{
			// Si la acci�n es 'login', obtenemos el siguiente token como usuario.
			String usuario = tokenizer.nextToken();
			
			// Luego obtenemos el siguiente token como contrase�a.
			String contrasena = tokenizer.nextToken();
			
			// Mostramos o procesamos los datos obtenidos.
			System.out.println("Acci�n: " + accion);
			System.out.println("Usuario: " + usuario);
			System.out.println("Contrase�a: " + contrasena);
		} 
		else
		{
			// En caso de no reconocer la acci�n, mostramos un mensaje.
			System.out.println("Comando no reconocido: " + accion);
		}
	}
}