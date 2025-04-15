
// Clase principal que simula una agencia de viajes.
// Aquí se demuestra el uso de la INTERFAZ como tipo de referencia.
public class AgenciaDeViajes
{
	public static void main(String[] args)
	{

		// Declaramos una variable de tipo interfaz.
		// No sabemos aún si será un avión, coche o tren.
		MedioDeTransporte transporte;

		// Asignamos un objeto Avion a la variable de tipo interfaz.
		// Esto es posible porque Avion implementa MedioDeTransporte.
		transporte = new Avion();
		// Podemos cambiar la implementación sin cambiar el resto 
		// del código, pueden ser aviones, trenes, buses, coches, motos, etc.
		
		// Salida: Volando hacia Tokio en avión.
		transporte.viajar("Tokio");
		
		
		// Ahora cambiamos el objeto a uno de tipo Coche.
		
		// El tipo de la variable (MedioDeTransporte) oculta los detalles 
		// concretos del objeto (en este caso, un Coche).

		// Sólo puedes acceder a los métodos definidos en la interfaz, 
		// aunque el objeto tenga más.
		
		// Abstracción + Polimorfismo.
		// Abstracción: trabajas el comportamiento, no la implementación.
		// Polimorfismo: puedes cambiar el tipo de objeto y funcionará.
		transporte = new Coche();
		
		// Salida: Conduciendo hacia París en coche.
		transporte.viajar("París"); 

		
		// Finalmente, usamos un Tren.
		transporte = new Tren();
		
		// Salida: Viajando en tren hacia Roma.
		transporte.viajar("Roma"); 

		// Los interfaces permiten crear código más flexible y mantenible.
		// Si agregamos más tipos de transporte, no modificamos este código.
	}
}