public class CopiaSuperficialProfunda
{
	public static void main(String[] args)
	{
		Coche coche1 = new Coche("Rojo");
		Persona p1 = new Persona("Juan", coche1);

		// Copia SUPERFICIAL: p2 y p1 comparten el mismo coche. Se usan las referencias de los objetos, apuntan mismo sitio.
		Persona p2 = new Persona(p1.nombre, coche1); // Tambien p1.coche, junto con coche1, sería válido. Misma referencia.
		p2.nombre = "Carlos";
		p2.coche.color = "Azul"; // Está afectando a p1 también, p1 tiene referenciado coche1 como 'su coche'.

		
		System.out.println("Después de copia superficial:");
		System.out.println(coche1.color); // Azul
		p1.mostrarCoche(); // Azul.
		p2.mostrarCoche(); // Azul.

		
		coche1.color = "Arcoiris";
		System.out.println("\nDespués de copia superficial v2:");
		System.out.println(coche1.color); // Arcoiris
		p1.mostrarCoche(); // Arcoiris.
		p2.mostrarCoche(); // Arcoiris.
		
		
		// Copia PROFUNDA: p3 tiene su propio coche independiente, obtenido en copiar.
		Persona p3 = new Persona(p1.nombre, p1.coche.copiar()); // Se clona el coche, esto implica construir un nuevo objeto.
		
		System.out.println("\nCopia profunda, trans construir p3:");
		p3.mostrarCoche(); // Arcoiris (independiente).

	
		p3.nombre = "Pedro";
		p3.coche.color = "Amarillo"; // No afecta a p1.
		
		
		System.out.println("\nTrans construir y modificar p3:");
		p3.mostrarCoche(); // Amarillo (independiente).

		
		System.out.println("\nDespués de copia profunda de p1, habiendo modificado p3:");
		p1.mostrarCoche(); // Arcoiris (quedó modificado antes).
		p3.mostrarCoche(); // Amarillo (independiente).
	}
}

class Coche
{
	String color;

	public Coche(String color)
	{
		this.color = color;
	}

	// Método para clonar un Coche (crear una copia profunda). Conocido como clone del interface Cloneable.
	// Creamos la misma funcionalidad con un método propio, de forma manual.
	public Coche copiar()
	{
		// Crea copia exacta del objeto en memoria. Se clonan las referencias internas para evitar copias superficiales.
		return new Coche(this.color);
	}
}

class Persona
{
	String nombre;
	Coche coche; // Referencia a otro objeto
	
	public Persona(String nombre, Coche coche)
	{
		this.nombre = nombre;
		this.coche = coche;
	}

	public void mostrar()
	{
		System.out.println("Nombre: " + nombre);
	}
	
	public void mostrarCoche()
	{
		System.out.println("Nombre: " + nombre + ", Coche: " + coche.color);
	}
}