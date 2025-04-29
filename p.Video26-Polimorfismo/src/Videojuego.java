
// CLASE PRINCIPAL: para ejecutar y ver los conceptos en acción.
public class Videojuego
{
	public static void main(String[] args)
	{
		// Polimorfismo: un personaje puede ser un héroe o un villano.
		Personaje p1 = new Heroe("Luzbel");
		Personaje p2 = new Villano("Sombrío");

		// Llamadas a métodos sobrecargados.
		p1.saludar();
		p1.saludar("Carlos");

		// Polimorfismo en acción: se llama a la versión correcta del método
		// según el objeto real, por defecto al hijo, si sobreescrito en
		// padre e hijo.
		p1.mostrarInfo(); // Llama al método sobrescrito en Heroe.
		p2.mostrarInfo(); // Llama al método sobrescrito en Villano.
		
		// Ahora forzamos llamada a mostrarInfo del padre con el super,
		// previo casting del tipo a Heroe.
		((Heroe) p1).mostrarInfoComoPersonaje();
		
		// Se necesita hacer un cast para acceder a métodos específicos.
		if (p1 instanceof Heroe)
		{
			((Heroe) p1).usarPoderEspecial();
		}

		// Interfaz en acción, polimorfismo en la asignación.
		Atacante atacante1 = new Heroe("Aurora");
		Atacante atacante2 = new Villano("Oscuro");

		atacante1.atacar(); // Cada uno implementa su versión de atacar.
		atacante2.atacar();

		// Accediendo a método protegido desde la subclase.
		Heroe heroe = new Heroe("Brillo");
		// Este método llama internamente a uno privado de la clase base.
		heroe.mostrarSecreto(); 
	}
}