
// SUBCLASE: Villano tambi�n hereda e implementa Atacante.
class Villano extends Personaje implements Atacante
{

	public Villano(String nombre)
	{
		super(nombre);
	}

	// Sobreescritura del m�todo mostrarInfo.
	@Override
	public void mostrarInfo()
	{
		System.out.println("Soy el villano " + nombre + " y causar� caos.");
	}

	// Implementaci�n del m�todo atacar.
	@Override
	public void atacar()
	{
		System.out.println(nombre + " lanza una bola de oscuridad.");
	}
}