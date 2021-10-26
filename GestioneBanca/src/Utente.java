
public class Utente 
{
	private String username;
	private String password;
	
	public Utente (String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	public boolean controllo (String username, String password) 
	{
		if (this.username.equals(username) && this.password.equals(password))
			return true;
		else System.out.println("Utente non esistente");
		return false;
	}
	public void ottieniNome ()
	{
		System.out.println(username);
	}
}

