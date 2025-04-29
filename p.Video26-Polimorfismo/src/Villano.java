
// SUBCLASE: Villano también hereda e implementa Atacante.
class Villano extends Personaje implements Atacante
{

	public Villano(String nombre)
	{
		super(nombre);
	}

	// Sobreescritura del método mostrarInfo.
	@Override
	public void mostrarInfo()
	{
		System.out.println("Soy el villano " + nombre + " y causaré caos.");
	}

	// Implementación del método atacar.
	@Override
	public void atacar()
	{
		System.out.println(nombre + " lanza una bola de oscuridad.");
	}
}