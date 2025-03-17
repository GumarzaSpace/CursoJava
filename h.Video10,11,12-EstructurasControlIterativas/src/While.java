import java.util.Scanner;

public class While 
{

	public static void main(String[] args) 
	{
		 // Estructuras control iterativas: FOR, WHILE y DO-WHILE.
		
		// Ejecutar una funcionalidad de manera repetitiva MIENTRAS que la condicion que se evalua sea cierta.
		
		// Introducción de un formulario. Solicitamos la edad.
		
		Scanner teclado = new Scanner(System.in);
		
		int edad = 0;
		
		System.out.println("Hola. Por favor, introduzca su edad:");
		
		edad = teclado.nextInt();
		
		while(edad<1 || edad>150)
		{
			System.out.println("Edad incorrecta. No se aceptan edades menores que 1 o mayores que 150.");
			edad = teclado.nextInt();
		}
		
		System.out.println("Su edad es de " + edad + " años.");
		
		teclado.close();

	}

}
