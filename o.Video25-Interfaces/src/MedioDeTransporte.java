
// Esta interfaz define un CONTRATO: cualquier clase que la implemente
// debe tener un m�todo 'viajar' que reciba un destino como par�metro.

// De esta forma abstraemos el dise�o, yo no necesito saber como voy a
// viajar en el contrato. Dise�o el interfaz, y la clase que lo implemente
// se encargar�.
public interface MedioDeTransporte
{
	// M�todo definido en la interfaz, no se puede implementar aqu�.
	// Se debe implementar en la clase que implemente el interfaz.
	// No suceder�a nada si indicamos que es abstract.
	void viajar(String destino);
	
	// Ejemplificamos el abstract.
	abstract void pruebaViajaAbstracto();

}