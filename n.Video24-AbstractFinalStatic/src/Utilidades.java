
class Utilidades
{
	// static: variables y m�todos.
	// Variable est�tica: pertenece a la clase, no a los objetos.
	public static int totalAnimalesExisten = 0;

	// M�todo est�tico: pertenece a la clase, se llama sin crear un objeto.
	public static void mostrarTotalAnimales()
	{
		System.out.println("Total de animales creados: " + totalAnimalesExisten);
	}
}