
// Si quisieramos que Perro herede de AnimalMisterioso, no podr�amos.
class Perro extends Animal
{
	// Implementamos el m�todo abstracto proveniente de la clase padre.
	// Estamos obligados a implementar el m�todo aqu�.
	@Override
	public void hacerSonido()
	{
		System.out.println("Guau guau!");
	}
	
	// No puedo sobreescribir mostrarReino.
	// public void mostrarReino()
}