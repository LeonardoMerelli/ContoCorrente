package GestioneBanca;

public class Utente 
{
	private String nome;
	private String password;
	public Utente(String nome, String password)
	{
		this.nome = nome;
		this.password = password;
	}
	public String getNome()
	{
		return nome;
	}
	public boolean controlloUsername (String nome, String Cnome)
	{
		if (nome.equals(Cnome)) return true;
		return false;
	}
	public boolean controlloPwd (String pwd, String Cpwd)
	{
		if (pwd.equals(Cpwd)) return true;
		return false;
	}
	protected String getPwd()
	{
		return this.password;
	}
}
