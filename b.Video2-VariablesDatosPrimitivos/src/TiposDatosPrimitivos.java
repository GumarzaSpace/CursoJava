
public class TiposDatosPrimitivos 
{

	public static void main(String[] args) 
	{
		// int, double, char y boolean.
		
		// int: numeros enteros -> -infinito, 0, +infinito; Parte ENTERA -> 14, 56, 186, -987, 354127
		
		// double: numeros reales -> -infinito, 0, +infinito; Parte ENTERA y DECIMAL -> -25,76 / 65,71 / 8923,567 / 25
		
		// char: caracteres (simple) -> cualquier letra, simbolo, ASCII; 	J -> 'J'
		
		// boolean: valor l�gico -> (false/true)
		
		// variable - constante (Numero PI)
		
		// tipoDato nombre; DECLARACI�N de una variable
		int miPrimeraVariableEntera;
		
		// nombre = [VALOR]; INICIALIZACI�N
		miPrimeraVariableEntera = 7;
		
		// nombre = [VALOR]; ASIGNACI�N
		miPrimeraVariableEntera = 12;
		
		// Variables double, char y boolean
		double variableReal;
		char variableCaracter;
		boolean variableBooleana;
		
		// Inicializamos las variables
		variableReal = 0;
		variableCaracter = 'x';
		variableBooleana = false;
		
		// Asignaci�n de nuevos valores a variables
		miPrimeraVariableEntera = 100;
		variableReal = 12.56;
		variableCaracter = 'Z';
		variableBooleana = true;
		
		System.out.println(miPrimeraVariableEntera);
		System.out.println(variableReal);
		System.out.println(variableCaracter);
		System.out.println(variableBooleana);

	}

}
