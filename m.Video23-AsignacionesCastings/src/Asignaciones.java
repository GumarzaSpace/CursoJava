public class Asignaciones
{
	public static void main(String[] args)
	{
		// 1. Asignaciones de tipos primitivos.
		int a = 10;
		int b = a; // Copia del valor (no afecta al original, no se usa referencia sino que se captura el valor).
		System.out.println("Valor de b a la mitad: " + b);
		b = 20;
		System.out.println("Valor de a: " + a + ", Valor de b: " + b);

		// 2. Asignaciones de objetos (uso de referencias en memoria).
		Persona p1 = new Persona("Ana", null);
		Persona p2 = p1; // Ambas variables están apuntando al mismo objeto.
		p2.nombre = "Todos somos Pepe"; // Modifica el objeto p1 y p2 al mismo tiempo.
		System.out.println("Tras modificar p2:");
		p1.mostrar();
		p2.mostrar();
	}
}
