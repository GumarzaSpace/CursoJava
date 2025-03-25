
public class Prueba
{

	public static void main(String[] args)
	{
		Cuenta cuenta1 = new Cuenta("RETJ1576", 25678.23, 1.5);
		Cuenta cuenta2 = new Cuenta("KGA296", 2494.07, 2.75);
		Cuenta cuenta3 = new Cuenta("PER23", 347912.56, 5.75);
		Cuenta cuenta4 = new Cuenta(45346.75);
		
		Cliente pepe = new Cliente("PE23", "PEPE ROL SAIZ", "958769241", cuenta3);
		Cliente luis = new Cliente("LU02", "LUIS SAZ PEZ", "621784554", cuenta1);
		Cliente jon = new Cliente("JO12", "JON LOPEZ SAZ", "921465466", cuenta2);
		Cliente ana = new Cliente("ANA SAZ RUIZ");
		
		/*
		 * System.out.println(cuenta1.getTasaInteres());
		 * System.out.println(cuenta3.getSaldo());
		 * System.out.println(cuenta4.getSaldo()); System.out.println(cuenta4.getId());
		 * System.out.println(cuenta4.getTasaInteres());
		 * 
		 * cuenta4.setId("AN43"); cuenta4.setTasaInteres(1.9);
		 * 
		 * System.out.println(cuenta4.getId());
		 * System.out.println(cuenta4.getTasaInteres());
		 */
		
		/*
		 * System.out.println(ana.getId()); System.out.println(ana.getTelefono());
		 * System.out.println(jon.getNombre());
		 */
		
		ana.setId("AN43");
		ana.setTelefono("621478595");
		ana.setCuenta(cuenta4);
		
		System.out.println(ana.getId());
		System.out.println(ana.getNombre());
		System.out.println(ana.getTelefono());
		System.out.println(ana.getCuenta().getId()+"-"+ana.getCuenta().getSaldo());
		
		System.out.println(ana.getCuenta().retirada(8782.36));
		System.out.println(ana.getCuenta().getSaldo());
		ana.getCuenta().deposito(153455.45);
		System.out.println(ana.getCuenta().getSaldo());
	}

}
