
public class PruebaIFELSE 
{

	public static void main(String[] args) 
	{
		// Estructuras de control: 1. Condicionales 2. Iterativas
		
		// 1.
		// Condicion: A. [true] Ejecuciones del plan A
		// 		      B. [false] Ejecuciones del plan B
		
		// �Llueve? A. [true] Sacar� un parag�as.
		//          B. [false] NO sacar� parag�as.
	
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
		
		// Instrucci�n IF ELSE
		
		if(numeroUno != numeroDos)
		{
			// Bloque de ejecuci�n en caso de ser cierto.
			System.out.println("La condici�n es cierta.");
			
		}
		else
		{
			// En caso de ser falsa.
			System.out.println("La condici�n es falsa.");
		}
	
	}

}
