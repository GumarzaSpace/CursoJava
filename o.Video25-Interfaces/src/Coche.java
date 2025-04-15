
// Otra clase concreta: viajar en coche.
// Tambi�n cumple el contrato de la interfaz.
class Coche implements MedioDeTransporte
{
	@Override
	public void viajar(String destino)
	{
		System.out.println("Conduciendo hacia " + destino + " en coche.");
	}

	@Override
	public void pruebaViajaAbstracto()
	{
		// TODO Auto-generated method stub
		
	}
}