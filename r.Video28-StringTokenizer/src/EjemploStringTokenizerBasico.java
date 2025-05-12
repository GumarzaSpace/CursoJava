import java.util.StringTokenizer;

//Ejemplo básico de uso de StringTokenizer.
public class EjemploStringTokenizerBasico
{
	public static void main(String[] args)
	{
		
		// Creamos una cadena de texto sencilla.
		String texto = "Esta es una cadena simple de ejemplo";
		// Creamos el StringTokenizer con la cadena (usa espacios como delimitadores).

		StringTokenizer tokenizer = new StringTokenizer(texto);

		// Recorremos todos los tokens que hay en la cadena.
		while (tokenizer.hasMoreTokens())
		{
			// nextToken(), devuelve el siguiente token.
			String token = tokenizer.nextToken();
			System.out.println(token);
		}

		
		// Versión personalizada y diferenciada.
		// Si queremos usar un delimitador diferente, por ejemplo una coma.
		String listaFrutas = "manzana,platano,naranja";
		
		// Creamos un StringTokenizer indicando la coma como delimitador
		StringTokenizer tokenizer2 = new StringTokenizer(listaFrutas, ",");
		
		// Recorremos los tokens usando la coma como separador.
		while (tokenizer2.hasMoreTokens())
		{
			String fruta = tokenizer2.nextToken();
			System.out.println(fruta);
		}
	}
}