import java.util.Arrays;

public class OrdenarArray
{

	public static void main(String[] args)
	{
		// Creación y rellenado del array
		int[] array = { 5, 7, -2, 4, 9, 25, 36, -15, -54, -45, 1, 20, 54, -101, 23, 84, 98, -36, 0, 2 };

		// Preparación del ordenamiento
		int iteracionGlobal = 0;
		int iteracionSimple = 0;
		int variableAuxiliarIntercambio = 0;

		// Algoritmo de ordenamiento segun burbuja
		for(iteracionGlobal = 0; iteracionGlobal < (array.length - 1); iteracionGlobal++)
		{
			for(iteracionSimple = 0; iteracionSimple < (array.length - iteracionGlobal - 1); iteracionSimple++)
			{
				if(array[iteracionSimple] < array[iteracionSimple + 1] )
				{
					variableAuxiliarIntercambio = array[iteracionSimple + 1];
					array[iteracionSimple + 1] = array[iteracionSimple];
					array[iteracionSimple] = variableAuxiliarIntercambio;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));

	}

}
