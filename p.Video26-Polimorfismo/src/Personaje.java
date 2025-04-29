
// CLASE PADRE: Personaje general del videojuego.
class Personaje
{
	String nombre;

	public Personaje(String nombre)
	{
		this.nombre = nombre;
	}

	// Sobrecarga de m�todo saludar (mismo nombre, distintos par�metros).
	public void saludar()
	{
		System.out.println(nombre + " dice: �Hola!");
	}

	public void saludar(String otroNombre)
	{
		System.out.println(nombre + " saluda a " + otroNombre + ".");
	}

	// M�todo general que no est� sobreescrito en esta clase, si en hijas.
	public void mostrarInfo()
	{
		System.out.println("Soy un personaje llamado " +nombre);
	}

	// M�todo exclusivo de la clase base (no ser� heredado directamente 
	// por las subclases, al ser privado)
	private void secretoDelPersonaje()
	{
		System.out.println("Este es un secreto del personaje que no puede acceder la subclase.");
	}

	// M�todo protegido: puede ser usado en subclases.
	protected void mostrarSecreto()
	{
		secretoDelPersonaje();
	}
}