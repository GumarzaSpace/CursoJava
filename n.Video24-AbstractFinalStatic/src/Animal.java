
// abstract: clases y m�todos.
// Clase abstracta: no se puede instanciar directamente.
abstract class Animal
{
	// M�todo abstracto: las subclases deben implementarlo.
	public abstract void hacerSonido();

	// M�todo normal.
	public void respirar()
	{
		// Funcionalidad habitual del m�todo, implementada en este punto.
		System.out.println("El animal est� respirando.");
	}

	// final: variables, m�todos y clases.
	// Variable final: no puede cambiar su valor despu�s de ser asignada.
	public final String reino = "Animalia";
	// reino = "�"; | Si descomentamos, no podremos compilar.

	// M�todo final: no puede ser sobrescrito por las subclases.
	public final void mostrarReino()
	{
		System.out.println("Pertenezco al reino: " + reino);
	}
}