
// Clase concreta que implementa el interfaz MedioDeTransporte.
// Aqu� estamos obteniendo forma concreta de viajar: en avi�n.
class Avion implements MedioDeTransporte
{
	@Override
	public void viajar(String destino)
	{
		System.out.println("Volando hacia " + destino + " en avi�n.");
	}

	@Override
	public void pruebaViajaAbstracto()
	{
		// M�todo sin funci�n, prueba del abstract.		
	}
}