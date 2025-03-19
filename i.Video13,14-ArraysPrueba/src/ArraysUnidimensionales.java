
public class ArraysUnidimensionales 
{

	public static void main(String[] args) 
	{
		// Array o Vector o Arreglo
		
		// Estructuras de datos: 1. Estaticas 2. Dinamicas
		
		// [][][][][][][][][][]
		
		// Array Unidimensionales / Arrays Multidimensionales
		
		int[] arrayEnteros = new int[10]; // Declaración y construcción de un array.
		
		for(int i=0;i<10;i++)
		{
			arrayEnteros[i] = i*2;
		}
		
		// int numero = 0;
		// arrayEnteros[0] = 45; ESCRITURA
		// numero = arrayEnteros[0]; LECTURA
		
		System.out.println(arrayEnteros[9]);
		arrayEnteros[9] = arrayEnteros[7] + arrayEnteros[8];
		System.out.println(arrayEnteros[9]);
		
		// Declaración, construcción e inicialización directa de arrays
		
		char[] arrayNombre = {'G','u','i','l','l','e','r','m','o'}; // 9 posiciones.
		double[] arrayReales = {24.56, 65.7, 567.54, 234.7656};

		
	}

}
