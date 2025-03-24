
public class Principal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Imprimo por consola...");
		
		Edificio miEdificio = new Edificio();
		
		Edificio miEdificioAMedias = new Edificio(54.12, 12);
		
		Edificio miEdificio2 = new Edificio(35.56, 6, 'D', 1995);
		
		System.out.println("Pruebas de GET y SET");
		
		System.out.println(miEdificio2.getAltura());
		
		miEdificio2.setAltura(-5.5);
		System.out.println("He modificado con -5.5");
		
		System.out.println(miEdificio2.getAltura());
		
		
		
		
		
		//miEdificio2.test();
		
		//miEdificioAMedias.imprimirMensaje("Estoy imprimiendo haciendo referencia al edifcio a medias.");
		
		//miEdificio.cerrarPuertasYVentanas("cierro todo");
		
		double alturaPorPlanta = miEdificio2.dimeAlturaPorPlanta();
		System.out.println("La altura por planta es: " + alturaPorPlanta);
		
		System.out.println(miEdificio2.calcularImpuesto());
		
		String datosInmueble = miEdificio2.dimeDatosInmueble();
		System.out.println("Datos del inmueble: " + datosInmueble);
	}

}
