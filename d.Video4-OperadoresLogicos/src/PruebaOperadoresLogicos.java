
public class PruebaOperadoresLogicos 
{
	public static void main(String[]args)
	{
		// datos l�gicos: true/false
		// boolean nombreVariable;
		
		// negaci�n, igualdad, distinto, mayor que, menor que, mayor o igual que, menor o igual que, OR, AND
		// negaci�n: ! ---> (!false) = true
		// igualdad: == ---> (true == false) = false / �es true igual a false? = false
		// distinto: != ---> (true != false) = true / �es true diferente/distinto a false? = true
		// mayor que: > ---> (6>6) = false / �es 6 mayor que 6? = false
		// menor que: < ---> (4<6) = true / �es 4 menor que 6? = true
		// mayor o igual que: >= ---> (2>=6) = false / �es 2 mayor o igual que 6? = false
		// menor o igual que: <= ---> (5<=6) = true / �es 5 menor o igual que 6? = true
		// OR: || ---> (true || false || true || true || false || true) = true
		// AND: && ---> (true && true && false && true && true && true) = false
		
		boolean datoLogicoUno = true;
		boolean datoLogicoDos = false;
		boolean datoLogicoTres = true;
		boolean resultado = false;
		
		// Comprobaciones de igualdad, distinto y uso de negaci�n
		System.out.println(!datoLogicoUno); // Imprimir� false.
		System.out.println(datoLogicoUno == datoLogicoDos); // Imprimir� false
		System.out.println(datoLogicoUno != datoLogicoDos); // Imprimir� true
		System.out.println();
		
		// Comprobaciones de mayor, menor, o igual que
		System.out.println(6 > 5); // Imprimir� true
		System.out.println(6 < 5); // Imprimir� false
		System.out.println();
		
		System.out.println(10 >= 10); // Imprimir� true
		System.out.println(5 <= 5); // Imprimir� true
		System.out.println();
		
		System.out.println(5 == 5); // Imprimir� true
		System.out.println(10 != 10); // Imprimir� false
		System.out.println();
		
		// Comprobaciones de tipo OR y AND
		System.out.println(true || true); // Imprimir� true
		System.out.println(false && false); // Imprimir� false
		
		
		
		
	}
	
}
