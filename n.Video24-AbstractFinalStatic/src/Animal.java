
// abstract: clases y métodos.
// Clase abstracta: no se puede instanciar directamente.
abstract class Animal
{
	// Método abstracto: las subclases deben implementarlo.
	public abstract void hacerSonido();

	// Método normal.
	public void respirar()
	{
		// Funcionalidad habitual del método, implementada en este punto.
		System.out.println("El animal está respirando.");
	}

	// final: variables, métodos y clases.
	// Variable final: no puede cambiar su valor después de ser asignada.
	public final String reino = "Animalia";
	// reino = "·"; | Si descomentamos, no podremos compilar.

	// Método final: no puede ser sobrescrito por las subclases.
	public final void mostrarReino()
	{
		System.out.println("Pertenezco al reino: " + reino);
	}
}