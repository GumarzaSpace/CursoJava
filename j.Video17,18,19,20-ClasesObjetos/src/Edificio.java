
public class Edificio 
{
	// Atributos
	// Cada uno de los atributos que dispone esta clase
	// altura, numeroPlantas, eficienciaEnergetica y anhoConstruccion
	// public, protected y private
	private double altura;
	private int numeroPlantas;
	private char eficienciaEnergetica;
	private int anhoConstruccion;
	
	// Constructores
	// Metodos que me permiten hacer una instancia de una clase, generando un objeto
	public Edificio()
	{
		this.altura = 0;
		this.numeroPlantas = 0;
		this.eficienciaEnergetica = 'Z';
		this.anhoConstruccion = 0;
	}
	
	public Edificio(double parametroAltura, int parametroNumeroPlantas)
	{
		this.altura = parametroAltura;
		this.numeroPlantas = parametroNumeroPlantas;
		this.eficienciaEnergetica = 'Z';
		this.anhoConstruccion = 0;
	}
	
	public Edificio(double paramAltura, int paramNumeroPlantas, char paramEficienciaEnergetica, int paramAnhoConstruccion)
	{
		this.altura = paramAltura;
		this.numeroPlantas = paramNumeroPlantas;
		this.eficienciaEnergetica = paramEficienciaEnergetica;
		this.anhoConstruccion = paramAnhoConstruccion;
	}
	
	// Getters and Setters
	// Get Altura
	public double getAltura()
	{
		return this.altura;
	}
	
	// Set Altura
	public void setAltura(double pAltura)
	{
		this.altura = pAltura;	
	}
	
	public int getNumeroPlantas()
	{
		return this.numeroPlantas;
	}
	
	public void setNumeroPlantas(int pNumeroPlantas)
	{
		this.numeroPlantas = pNumeroPlantas;
	}
	
	public char getEficienciaEnergetica()
	{
		return this.eficienciaEnergetica;
	}
	
	public void setEficienciaEnergetica(char pEficienciaEnergetica)
	{
		this.eficienciaEnergetica = pEficienciaEnergetica;
	}
	
	public int getAnhoConstruccion()
	{
		return this.anhoConstruccion;
	}
	
	public void setAnhoConstruccion(int pAnhoConstruccion)
	{
		this.anhoConstruccion = pAnhoConstruccion;
	}
	
	
	// Métodos
	// Metodos estandar para llevar a cabo funcionalidades propias de esos objetos
		// Cerrar puertas y ventanas
		// Abrir puertas y ventanas
	
	// this
	// uso del punto (.)
	// miMetododePrueba
	public void test()
	{
		System.out.println("hola.");
	}
	
	public void imprimirMensaje(String miMensaje)
	{
		System.out.println("El mensaje que se desea imprimir es: "+miMensaje);
	}
	
	public void cerrarPuertasYVentanas()
	{
		System.out.println("Se estan cerrando todas las puertas y las ventanas");
	}
	
	public void cerrarPuertasYVentanas(String mensaje)
	{
		System.out.println(mensaje);
	}
	
	
	// Metodo: modificador de acceso + TIPO VALOR de RETORNO + nombre del método + parametros ()
	// Tipos de valores: int, double, char, boolean, etc. y String, Integer, Scanner, Edificio, Coche, Arbol + void
	
	public double dimeAlturaPorPlanta()
	{
		// Codigo funcional va aquí
		return this.altura/this.numeroPlantas;
		
		// Código NO alcanzado NUNCA!!!!!
	}
	
	public double calcularImpuesto()
	{
		if(this.anhoConstruccion<1950)
		{	
			return 0;
		}
		else
		{
			if(this.anhoConstruccion<2000)
			{
				return 1750.50;
			}
			else
			{
				return 5000;
			}
		}
	}
	
	public boolean tieneCertificadoEnergetico()
	{
		if(this.eficienciaEnergetica == 'A' || this.eficienciaEnergetica == 'B' || this.eficienciaEnergetica == 'C')
			return true;
		else
			return false;
	}
	
	// Metodo toString
	public String dimeDatosInmueble()
	{
		return this.altura+","+this.anhoConstruccion+","+this.eficienciaEnergetica+","+this.numeroPlantas;
	}
	
	
}
