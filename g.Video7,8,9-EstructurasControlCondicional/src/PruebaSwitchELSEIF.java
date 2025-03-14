
public class PruebaSwitchELSEIF 
{
	
	public static void main(String[] args) 
	{
		
		
		// Condicional
		
		/*
		 * if(5 != 6) { // codigo si es cierto. } else { // codigo si es falso. }
		 */
		
		// comprobaciones múltiples
		
		int numero = 2;
		
		if( numero == 0 || numero == 1 || numero == 2 || numero == 3 
			|| numero == 4 || numero == 5 || numero == 6 || numero == 7 
			|| numero == 8 || numero == 9 )
		{
			System.out.println("El número es un dígito entre 0 y 9.");
		}
		else
		{
			System.out.println("NO esta comprendido entre el 0 y el 9.");
		}
		
		// Comprobación de 0, 1 y 2.
		if(numero == 0)
		{
			System.out.println("El numero vale 0.");
		}
		else if(numero == 1)
		{
			System.out.println("El numero vale 1.");
		}
		else if(numero ==2)
		{
			System.out.println("El numero vale 2.");
		}
		else
		{
			System.out.println("El numero no es el que espero.");
		}
		

		
		boolean comprobado = true && true && true && true;
		System.out.println(comprobado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		// Switch: estructura de control condicional, comprobación múltiple
//		
//	
//		
//		switch(numero)
//		{
//			case 0:
//				System.out.println("El número es 0.");
//				System.out.println("El número es 0.");
//			break;
//		
//			case 1:
//				System.out.println("El numero es 1.");
//			break;
//			
//			case 2:
//				System.out.println("El numero es 2.");
//			break;
//			
//			case 3:
//				System.out.println("El numero es 3.");
//			break;
//			
//			case 4:
//				System.out.println("El numero es 4.");
//			break;
//			
//			case 5:
//				System.out.println("El numero es 5.");
//			break;
//			
//			case 6:
//				System.out.println("El numero es 6.");
//			break;
//			
//			case 7:
//				System.out.println("El numero es 7.");
//			break;
//			
//			case 8:
//				System.out.println("El numero es 8.");
//			break;
//			
//			case 9:
//				System.out.println("El numero es 9.");
//			break;
//				
//		}
		
	}

}
