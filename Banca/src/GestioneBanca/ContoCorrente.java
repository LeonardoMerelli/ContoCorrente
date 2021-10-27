package GestioneBanca;

public class ContoCorrente 
{
	//private String username;
	private double saldo;
	private static int numeroConto = 1000;
	private String tipo;
	
	//costruttore
	public ContoCorrente ()
	{
		//this.tipo = tipo;
		this.saldo = 0;
		numeroConto++;
		//int numeroConto = this.numeroConto;
	}
	
	public String getTipo ()
	{
		return tipo;
	}
	public void setTipo (String tipo)
	{
		this.tipo = tipo;
	}
	public int getNumeroConto ()
	{
		return numeroConto;
	}
	public double getSaldo ()
	{
		return saldo;
	}
	public void versa (double somma)
	{
		saldo += somma;
		System.out.println("-> Sono stati versati " + somma + "€");
	}
	public void preleva (double somma)
	{
		if (saldo > somma) 
			{
			 saldo -= somma;
			 System.out.println("-> Sono stati prelevati " + somma + "€");
			}
		else 
		System.out.println("-> Saldo insufficiente, versare prima il denaro!");
	}
	public void visualizza()
	{
		System.out.println("-> Il numero del conto è "+ getNumeroConto());
	    System.out.println("-> Il tipo del conto è "+ getTipo());
		System.out.println("-> Il saldo è pari a "+ getSaldo() +" €");
	}	
	
}
