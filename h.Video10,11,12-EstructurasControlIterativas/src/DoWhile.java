import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) 
	{
		// Estr. control iterativas: For, While y Do-While.
		
		
		// WHILE- Comprobacion de una condicion, mientras sea cierta ejecuta una serie instrucciones de forma iterativa.
		
		double salario = 0;
		Scanner teclado = new Scanner(System.in);
		
		/*
		 * while(numero != 666) { // ins1 // ins2 // ins3 }
		 */
		
		// DO-WHILE- Ejecutan unas instrucciones de manera iterativa, despues se comprueba una condición.
		// Comprobación y validación de formulario. Solicitamos un salario.
		
		do
		{
			System.out.println("Hola. Por favor, introduce tu salario (debe ser positivo):");
			salario = teclado.nextDouble();
		}
		while(salario<=0);
		
		System.out.println("Tu salario es: " + salario);
		System.out.println("Finalizamos");
		teclado.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
