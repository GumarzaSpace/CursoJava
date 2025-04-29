
// SUBCLASE: H�roe hereda de Personaje e implementa Atacante.
class Heroe extends Personaje implements Atacante
{

	public Heroe(String nombre)
	{
		super(nombre);
	}

	// Sobreescritura del m�todo mostrarInfo.
	@Override
	public void mostrarInfo()
	{
		System.out.println("Soy el h�roe " + nombre + " y lucho por la justicia.");
	}

	// M�todo para poder forzar a la llamada a mostrarInfo del padre.
	public void mostrarInfoComoPersonaje()
	{
		super.mostrarInfo(); // Esto llama al m�todo de la clase padre.
	}

	// Implementaci�n del m�todo de la interfaz.
	@Override
	public void atacar()
	{
		System.out.println(nombre + " ataca con su espada brillante.");
	}

	// M�todo espec�fico del h�roe (no est� en la clase padre).
	public void usarPoderEspecial()
	{
		System.out.println(nombre + " usa su poder especial: Rayo de esperanza.");
	}
}