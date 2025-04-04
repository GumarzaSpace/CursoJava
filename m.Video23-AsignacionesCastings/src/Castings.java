
public class Castings
{

	public static void main(String[] args)
	{
		// Demostraci�n de castings.
		// Declaraci�n y asignaci�n de un tipo primitivo int.
		int num1 = 10;

		// Declaraci�n y asignaci�n de un objeto Integer.
		Integer num2 = 20;

		// Operaciones b�sicas
		int suma = num1 + num2; // Auto-unboxing de num2.
		// Conversi�n autom�tica en el tipo int.
		Integer multiplicacion = num1 * num2; // Auto-boxing del resultado.

		// Impresi�n de resultados.
		System.out.println("Suma: " + suma);
		System.out.println("Multiplicaci�n: " + multiplicacion);

		// Comparaci�n de int e Integer.
		if (num1 == num2)
		{ // Auto-unboxing de num2.
			System.out.println("num1 y num2 son iguales");
		} else
		{
			System.out.println("num1 y num2 son diferentes");
		}
		
		// Parte 2.
		
		int num3 = 10;
		Integer num4 = num3; // Auto-boxing.
		
		num3 = 10;
		num4 = Integer.valueOf(num3);
		int intPrueba = num4.intValue();
		System.out.println(intPrueba);
		
		Integer num5 = 20;
		int num6 = num5; // Auto-unboxing.
		System.out.println(num6);
		
		num5 = 20;
		num6 = num5.intValue();
		
		// Demostraci�n de uso de instanceof.

		// Uso de instanceof
		if (num2 instanceof Integer)
		{
		    System.out.println("num2 es una instancia de Integer.");
		    num6 = num2.intValue();
		    System.out.println("Para que veas num6: "+num6);
		}
		
		// Declaraci�n de objetos de diferentes tipos, extrayendo desde la clase raiz de todas las herencias.
		Object obj1 = "Hola mundo!";
		Object obj2 = 100;
		Object obj3 = 2.25;

		if (obj1 instanceof String) {
		    System.out.println("obj1 es una instancia de String.");
		}
		if (obj2 instanceof Integer) {
		    System.out.println("obj2 es una instancia de Integer.");
		}
		if (obj3 instanceof Double) {
		    System.out.println("obj3 es una instancia de Double.");
		}
		
		// Ejemplo final de instance of, referenciando a tipos de la herencia.
		Animal miAnimal = new Perro();

        if (miAnimal instanceof Perro) {
            System.out.println("miAnimal es una instancia de Perro.");
        } else if (miAnimal instanceof Gato) {
            System.out.println("miAnimal es una instancia de Gato.");
        } else {
            System.out.println("miAnimal es una instancia de Animal.");
        }

        Object miAnimal2 = new Perro();
        Perro p = (Perro) miAnimal2;
	}

}

class Casita {}
class Animal {}
class Perro extends Animal {}
class Gato extends Animal {}
