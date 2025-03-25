
public class Cuenta
{
	/**
	 * Atributos 
	 */
	private String id;
	private double saldo;
	private double tasaInteres;
	
	/**
	 * Constructores
	 */
	public Cuenta()
	{
		this.id = "RANDOM"+(int) (Math.random()*1000000);
		this.saldo = 0;
		this.tasaInteres = 0;
	}
	
	public Cuenta(double pSaldo)
	{
		this.id = "RANDOM"+(int) (Math.random()*1000000);
		this.saldo = pSaldo;
		this.tasaInteres = 0;
	}
	
	public Cuenta(String pId, double pSaldo, double pTasaInteres)
	{
		this.id = pId;
		this.saldo = pSaldo;
		this.tasaInteres = pTasaInteres;
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
	
	public double getSaldo()
	{
		return this.saldo;
	}
	
	public void setSaldo(double pSaldo)
	{
		this.saldo = pSaldo;
	}
	
	public double getTasaInteres()
	{
		return this.tasaInteres;
	}
	
	public void setTasaInteres(double pTasaInteres)
	{
		this.tasaInteres = pTasaInteres;
	}
	
	/**
	 * Metodos Estandar
	 * 
	 */
	public boolean retirada(double pRetirada)
	{
		if(pRetirada>this.saldo)
			return false;
		
		this.saldo = this.saldo - pRetirada;
		return true;
	}
	
	public void deposito(double pDeposito)
	{
		this.saldo = this.saldo + pDeposito;
	}
	
	
}
