
public class ArraysMultidimensionales 
{

	public static void main(String[] args) 
	{
		// Arrays: 1. Unidimensionales 2. Multidimensionales
		
		// [25] [05] [67]
		// [45] [86] [54]
		// [17] [23] [12]
		
		int[][] arrayBidimensionalEnteros = new int[3][3]; 
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				arrayBidimensionalEnteros[i][j] = (i*10)+j;	
			}
		}
		
		/*
		 * int[] arrayEnteros = {456, 65}; System.out.println(arrayEnteros.length);
		 */
		
		for(int i = 0;i<3;i++)
		{
			for(int j = 0;j<3;j++)
			{
				System.out.println(arrayBidimensionalEnteros[i][j]);	
			}
		}
		
		// Ejemplo. Juego de batalla naval.
		// Hundir la flota.
		
		//	x	x	x	x	x	x	x	x
		//	x	x	x	x	x	x	x	x
		//	x	o	o	o	o	x	x	x
		//	x	x	x	x	x	x	x	x
		//	x	x	x	x	x	x	o	x
		//	x	x	x	x	x	x	o	x
		//	o	o	x	x	x	x	o	x
		//	x	x	x	x	x	x	x	x
		
		
	}

}
