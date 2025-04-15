
// Esta interfaz define un CONTRATO: cualquier clase que la implemente
// debe tener un método 'viajar' que reciba un destino como parámetro.

// De esta forma abstraemos el diseño, yo no necesito saber como voy a
// viajar en el contrato. Diseño el interfaz, y la clase que lo implemente
// se encargará.
public interface MedioDeTransporte
{
	// Método definido en la interfaz, no se puede implementar aquí.
	// Se debe implementar en la clase que implemente el interfaz.
	// No sucedería nada si indicamos que es abstract.
	void viajar(String destino);
	
	// Ejemplificamos el abstract.
	abstract void pruebaViajaAbstracto();

}