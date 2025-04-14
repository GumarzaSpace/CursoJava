
// Si quisieramos que Perro herede de AnimalMisterioso, no podríamos.
class Perro extends Animal
{
	// Implementamos el método abstracto proveniente de la clase padre.
	// Estamos obligados a implementar el método aquí.
	@Override
	public void hacerSonido()
	{
		System.out.println("Guau guau!");
	}
	
	// No puedo sobreescribir mostrarReino.
	// public void mostrarReino()
}