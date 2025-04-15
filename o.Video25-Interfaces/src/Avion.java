
// Clase concreta que implementa el interfaz MedioDeTransporte.
// Aquí estamos obteniendo forma concreta de viajar: en avión.
class Avion implements MedioDeTransporte
{
	@Override
	public void viajar(String destino)
	{
		System.out.println("Volando hacia " + destino + " en avión.");
	}

	@Override
	public void pruebaViajaAbstracto()
	{
		// Método sin función, prueba del abstract.		
	}
}