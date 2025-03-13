import java.util.Scanner;

public class PruebaEntradaScanner 
{

	public static void main(String[] args) 
	{
		// System.out.println();
		// System.out.print();
		
		// Llevar a cabo la recodiga de: int, double, char, boolean y String.
		int entero = 0;
		double real = 0.0;
		char caracter = ' ';
		boolean logico = true;
		String cadena = " ";
		
		Scanner entrada = new Scanner(System.in);
		
		// Entero
		System.out.println("Introduzca un numero entero: ");
		entero = entrada.nextInt();
		
		// Real
		System.out.println("Introduzca un numero real: ");
		real = entrada.nextDouble();
		
		// Caracter
		System.out.println("Introduzca un caracter: ");
		caracter = entrada.next().charAt(0); // Hola
		
		// Boolean
		System.out.println("Introduzca un booleano: ");
		logico = entrada.nextBoolean();
		
		// String
		System.out.println("Por favor.");
		System.out.println("Introduzca un String: ");
		entrada.nextLine();
		cadena = entrada.nextLine(); // .next(); .nextLine(); HOLA GUILLERMO
		
		// Mostrar lo introducido
		System.out.println(entero);
		System.out.println(real);
		System.out.println(caracter);
		System.out.println(logico);
		System.out.println(cadena);
		
		entrada.close();
	}

}
