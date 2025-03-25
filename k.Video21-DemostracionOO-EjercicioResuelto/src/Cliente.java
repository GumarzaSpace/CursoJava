
public class Cliente
{
	/**
	 * Atributos
	 */
	private String id;
	private String nombre;
	private String telefono;
	private Cuenta cuenta;
	
	/**
	 * Constructores 
	 */
	public Cliente()
	{
		this.id = "*";
		this.nombre = "-";
		this.telefono = "0";
		this.cuenta = new Cuenta();
		
	}
	
	public Cliente(String pNombre)
	{
		this.id = "*";
		this.nombre = pNombre;
		this.telefono = "0";
		this.cuenta = new Cuenta();
	}
	
	public Cliente(String pId, String pNombre, String pTelefono, Cuenta pCuenta)
	{
		this.id = pId;
		this.nombre = pNombre;
		this.telefono = pTelefono;
		this.cuenta = pCuenta;
	}
	
	/**
	 * Getters y Setters
	 */
	public String getId()
	{
		return this.id;
	}
	
	public void setId(String pId)
	{
		this.id = pId;
	}
	
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String pNombre)
	{
		this.nombre = pNombre;
	}
	
	public String getTelefono()
	{
		return this.telefono;
	}
	
	public void setTelefono(String pTelefono)
	{
		this.telefono = pTelefono;
	}
	
	public Cuenta getCuenta()
	{
		return this.cuenta;
	}
	
	public void setCuenta(Cuenta pCuenta)
	{
		this.cuenta = pCuenta;
	}
	
	/**
	 * Métodos Estandar
	 */
	public void borrarCuenta()
	{
		System.out.println("SE CIERRA CUENTA. Disponías en la cuenta de €: "+this.cuenta.getSaldo());
		//this.cuenta = null;
		this.cuenta = new Cuenta();
	}
	
}
