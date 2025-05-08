
// Clase CuentaBancaria, simula una cuenta bancaria simple.
class CuentaBancaria
{
	private double saldo;

	public CuentaBancaria(double saldoInicial)
	{
		this.saldo = saldoInicial;
	}

	// Método para consultar el saldo.
	public double getSaldo()
	{
		return this.saldo;
	}

	// Método para retirar dinero, controlado con excepciones.
	public void retirar(double cantidad) throws SaldoInsuficienteException
	{
		if (cantidad > saldo)
		{
			// Lanzamos la excepción personalizada porque saldo insuficiente.
			throw new SaldoInsuficienteException("No hay suficiente "
					+ "saldo para retirar " + cantidad + "€");
		}
		saldo -= cantidad; // Se descuenta si todo va bien.
	}
}