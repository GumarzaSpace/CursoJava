
// CLASE PRINCIPAL: para ejecutar y ver los conceptos en acci�n.
public class Videojuego
{
	public static void main(String[] args)
	{
		// Polimorfismo: un personaje puede ser un h�roe o un villano.
		Personaje p1 = new Heroe("Luzbel");
		Personaje p2 = new Villano("Sombr�o");

		// Llamadas a m�todos sobrecargados.
		p1.saludar();
		p1.saludar("Carlos");

		// Polimorfismo en acci�n: se llama a la versi�n correcta del m�todo
		// seg�n el objeto real, por defecto al hijo, si sobreescrito en
		// padre e hijo.
		p1.mostrarInfo(); // Llama al m�todo sobrescrito en Heroe.
		p2.mostrarInfo(); // Llama al m�todo sobrescrito en Villano.
		
		// Ahora forzamos llamada a mostrarInfo del padre con el super,
		// previo casting del tipo a Heroe.
		((Heroe) p1).mostrarInfoComoPersonaje();
		
		// Se necesita hacer un cast para acceder a m�todos espec�ficos.
		if (p1 instanceof Heroe)
		{
			((Heroe) p1).usarPoderEspecial();
		}

		// Interfaz en acci�n, polimorfismo en la asignaci�n.
		Atacante atacante1 = new Heroe("Aurora");
		Atacante atacante2 = new Villano("Oscuro");

		atacante1.atacar(); // Cada uno implementa su versi�n de atacar.
		atacante2.atacar();

		// Accediendo a m�todo protegido desde la subclase.
		Heroe heroe = new Heroe("Brillo");
		// Este m�todo llama internamente a uno privado de la clase base.
		heroe.mostrarSecreto(); 
	}
}