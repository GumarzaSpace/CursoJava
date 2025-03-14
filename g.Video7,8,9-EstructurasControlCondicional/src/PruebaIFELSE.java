
public class PruebaIFELSE 
{

	public static void main(String[] args) 
	{
		// Estructuras de control: 1. Condicionales 2. Iterativas
		
		// 1.
		// Condicion: A. [true] Ejecuciones del plan A
		// 		      B. [false] Ejecuciones del plan B
		
		// ¿Llueve? A. [true] Sacaré un paragüas.
		//          B. [false] NO sacaré paragüas.
	
		// 2. Iterativas
		
		
		// Condicionales
		boolean pruebaIF = false;
		int numeroUno = 5;
		int numeroDos = 5;
		
		// Bloque de codigo donde estas variables modifiquen
		numeroUno = numeroUno - 1;
		numeroDos = numeroDos + 1;
		
		numeroUno = numeroUno - 1;
		numeroDos = numeroDos + 1;
		
		numeroUno = numeroUno - 1;
		numeroDos = numeroDos + 1;
		
		numeroUno = numeroUno - 1;
		numeroDos = numeroDos + 1;
		
		// Instrucción IF ELSE
		
		if(numeroUno != numeroDos)
		{
			// Bloque de ejecución en caso de ser cierto.
			System.out.println("La condición es cierta.");
			
		}
		else
		{
			// En caso de ser falsa.
			System.out.println("La condición es falsa.");
		}
	
	}

}
