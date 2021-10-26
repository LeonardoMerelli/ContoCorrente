public class ContoCorrente
{
	private double saldo = 0.0;
	private float tassof = 0.02;
	private float tassob = 0.03;
	private static numeroConto = 1000;
    public  String tipo;
	
	public ContoCorrente (double saldoIniziale, String tipo)
	{
		saldo = saldoIniziale;
		numeroConto++;
		this.tipo = tipo;
		
	}
    public void versa (double somma)
    {
    	saldo += somma;
    }
    
	public void preleva (double somma)
	{
		if (somma > saldo) System.out.println("Saldo non sufficiente");
		else 
			{
			   saldo -= somma;
			   System.out.println("Somma prelevata " + somma + " €");
			}
	}
	public void ottieniSaldo ()
	{
		 System.out.println(saldo);
	}
	public void maturaInteressi(String tipo)
	{
		if (tipo == "f" && tipo != "b") saldo += saldo*tassof;
		else saldo += saldo*tassob;
	}
	public void modificaTasso(String tipo, float tasso)
	{
		if (tipo == "f" && tipo != "b") this.tassof = tasso;
		else this.tassob = tasso;
	}
	public void ottieniNumero ()
	{
		System.out.println(numeroConto);
	}
	
	
}