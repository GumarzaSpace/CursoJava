
// CLASE PADRE: Personaje general del videojuego.
class Personaje
{
	String nombre;

	public Personaje(String nombre)
	{
		this.nombre = nombre;
	}

	// Sobrecarga de método saludar (mismo nombre, distintos parámetros).
	public void saludar()
	{
		System.out.println(nombre + " dice: ¡Hola!");
	}

	public void saludar(String otroNombre)
	{
		System.out.println(nombre + " saluda a " + otroNombre + ".");
	}

	// Método general que no está sobreescrito en esta clase, si en hijas.
	public void mostrarInfo()
	{
		System.out.println("Soy un personaje llamado " +nombre);
	}

	// Método exclusivo de la clase base (no será heredado directamente 
	// por las subclases, al ser privado)
	private void secretoDelPersonaje()
	{
		System.out.println("Este es un secreto del personaje que no puede acceder la subclase.");
	}

	// Método protegido: puede ser usado en subclases.
	protected void mostrarSecreto()
	{
		secretoDelPersonaje();
	}
}