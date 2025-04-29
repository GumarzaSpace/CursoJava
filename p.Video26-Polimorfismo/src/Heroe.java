
// SUBCLASE: Héroe hereda de Personaje e implementa Atacante.
class Heroe extends Personaje implements Atacante
{

	public Heroe(String nombre)
	{
		super(nombre);
	}

	// Sobreescritura del método mostrarInfo.
	@Override
	public void mostrarInfo()
	{
		System.out.println("Soy el héroe " + nombre + " y lucho por la justicia.");
	}

	// Método para poder forzar a la llamada a mostrarInfo del padre.
	public void mostrarInfoComoPersonaje()
	{
		super.mostrarInfo(); // Esto llama al método de la clase padre.
	}

	// Implementación del método de la interfaz.
	@Override
	public void atacar()
	{
		System.out.println(nombre + " ataca con su espada brillante.");
	}

	// Método específico del héroe (no está en la clase padre).
	public void usarPoderEspecial()
	{
		System.out.println(nombre + " usa su poder especial: Rayo de esperanza.");
	}
}