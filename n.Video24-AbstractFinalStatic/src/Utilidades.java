
class Utilidades
{
	// static: variables y métodos.
	// Variable estática: pertenece a la clase, no a los objetos.
	public static int totalAnimalesExisten = 0;

	// Método estático: pertenece a la clase, se llama sin crear un objeto.
	public static void mostrarTotalAnimales()
	{
		System.out.println("Total de animales creados: " + totalAnimalesExisten);
	}
}