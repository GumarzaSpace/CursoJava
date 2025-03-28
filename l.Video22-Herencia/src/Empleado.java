
public class Empleado extends Persona
{
	// Atributos
	private String sector;
	private String cargo;
	
	// Constructores
	public Empleado()
	{
		super();
		this.sector = "";
		this.cargo = "";
	}
	
	// id, telefonos, mujer, alergico, sector
	public Empleado(String pId, String[] pTelefonos, boolean pMujer, boolean pAlergico, String pSector)
	{
		super(pId,"","","",pTelefonos, pMujer, pAlergico);
		this.sector = pSector;
		this.cargo = "";
	}
	
	public Empleado(String id, String fechaNacimiento, String nombreCompleto, String direccion,
			String[] telefonos, boolean mujer, boolean alergico, String sector, String cargo)
	{
		
		super(id, fechaNacimiento, nombreCompleto, direccion, telefonos, mujer, alergico);
		this.sector = sector;
		this.cargo = cargo;
	}
	
	// Get & Set
	public String getSector()
	{
		return this.sector;
	}
	
	public void setSector(String sector)
	{
		this.sector = sector;
	}
	
	public String getCargo()
	{
		return this.cargo;
	}
	
	public void setCargo(String cargo)
	{
		this.cargo = cargo;
	}
	
	// Métodos estandar
		// Método prueba para hacer llamada en main.
	public void prueba()
	{
		int i = 0;
		final int j = 1;
		System.out.println(i+"-"+j);
	}
	
	
}
