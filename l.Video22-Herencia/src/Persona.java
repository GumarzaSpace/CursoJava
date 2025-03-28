
public class Persona
{
	// Atributos
	private String id;
	private String fechaNacimiento;
	private String nombreCompleto;
	private String direccion;
	private String[] telefonos;
	private boolean mujer;
	private boolean alergico;
	
	// Constructores
	public Persona()
	{
		this.id = "";
		this.fechaNacimiento = "";
		this.nombreCompleto = "";
		this.direccion = "";
		this.telefonos = new String[10];
		this.mujer = false;
		this.alergico = false;
	}
	
	public Persona(String pId)
	{
		this.id = pId;
		this.fechaNacimiento = "";
		this.nombreCompleto = "";
		this.direccion = "";
		this.telefonos = new String[10];
		this.mujer = false;
		this.alergico = false;
	}
	
	public Persona(String id, String fechaNacimiento, String nombreCompleto, String direccion, String[] telefonos,
			boolean mujer, boolean alergico)
	{
		this.id = id;
		this.fechaNacimiento = fechaNacimiento;
		this.nombreCompleto = nombreCompleto;
		this.direccion = direccion;
		this.telefonos = telefonos;
		this.mujer = mujer;
		this.alergico = alergico;
	}
	
	
	// Get & Set
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public String getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombreCompleto()
	{
		return nombreCompleto;
	}
	public void setNombreCompleto(String nombreCompleto)
	{
		this.nombreCompleto = nombreCompleto;
	}
	public String getDireccion()
	{
		return direccion;
	}
	public void setDireccion(String direccion)
	{
		this.direccion = direccion;
	}
	public String[] getTelefonos()
	{
		return telefonos;
	}
	public void setTelefonos(String[] telefonos)
	{
		this.telefonos = telefonos;
	}
	public boolean getMujer()
	{
		return mujer;
	}
	public void setMujer(boolean mujer)
	{
		this.mujer = mujer;
	}
	public boolean getAlergico()
	{
		return alergico;
	}
	public void setAlergico(boolean alergico)
	{
		this.alergico = alergico;
	}
	
	// Metodos Estandar
	
	
	
}
