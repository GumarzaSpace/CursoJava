
public class Principal
{
	public static void main(String[] args)
	{
		// Construyo un perro para hacer pruebas.
		Perro miPerro = new Perro();
		miPerro.hacerSonido(); // Muestra: Guau guau!
		miPerro.respirar(); // Muestra: El animal está respirando.
		miPerro.mostrarReino(); // Muestra: Pertenezco al reino: Animalia.
		
		// Construcción del animal misterioso.
		AnimalMisterioso am = new AnimalMisterioso();
		// Imprimo información del animal misterioso.
		am.descripcion();

		// Incrementamos el total de animales creados.
		Utilidades.totalAnimalesExisten++;
		
		// Muestra: Total de animales creados: 1.
		Utilidades.mostrarTotalAnimales(); 
		
		// Incrementamos el total de animales creados (2).
		Utilidades.totalAnimalesExisten++;
		
		// Acceso directo al campo estático sin crear objeto.
		// Animales creados: 2.
		System.out.println("Animales creados (acceso directo): "
		+ Utilidades.totalAnimalesExisten);
	}
}