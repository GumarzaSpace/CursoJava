
// Una tercera clase concreta: viajar en tren.
// Cumple con la interfaz.
class Tren implements MedioDeTransporte
{
	@Override
	public void viajar(String destino)
	{
		System.out.println("Viajando en tren hacia " + destino + ".");
	}

	@Override
	public void pruebaViajaAbstracto()
	{
		// M�todo sin funci�n, prueba del abstract.
	}
}