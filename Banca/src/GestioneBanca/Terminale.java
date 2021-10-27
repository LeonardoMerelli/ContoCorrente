package GestioneBanca;
import java.util.Scanner;

public class Terminale 
{
	Scanner in = new Scanner(System.in);
	Utente user1 = new Utente("Tommaso", "1234"); //inizializziamo una matrice di utenti 
	Utente user2 = new Utente("Nicola", "1234");
	Utente user3 = new Utente("Leonardo", "1234");
	Utente user[] = {user1, user2,user3};
	String username, pwd;
	int input, prove = 3;
	
	public Terminale()
	{
		
	}
	
	
	public int login()
	{
		Scanner in = new Scanner(System.in);
		int input;
		boolean controllo1 = false, controllo2 = false;
		do //
		{ 
			do // do while che fa in modo che il numero inserito sia 0 1 o 2
			{
		        System.out.println("------------------------------------");
		        System.out.println("---------------LOGIN----------------");
	         	System.out.println("--- 1) Accedi                    ---");
	        	System.out.println("--- 2) Registrati                ---");
	        	System.out.println("--- 0) Menu                      ---");
		        System.out.println("------------------------------------");
		        System.out.println("-> Premere il pulsante [1/2/0]");
		        input = in.nextInt();
		        if (input != 1 && input != 0 && input != 2) System.out.println("-> Errore!");
		   } while(input != 1 && input != 0 && input != 2);

		   switch (input) // switch che gestisce Accedi(1) Registra(2) o l'uscita
		   {
		   case 1: //Accedi
		   {
			   System.out.print('\n' + "-> Inserire username:  ");
			   username = in.next();
			   int i = 0;
			   while (i<3 && !controllo1) // while che controlla se l'utente è già registrato 
			   {
			      	if (user[i].controlloUsername(username,user[i].getNome())) 
			      	{
			      		do  // dopo aver fatto il controllo dell'username controlla se la password 
			      			// coincide per un massimo di 3 tentativi di immissione
			      		{
			      			   System.out.print('\n' + "-> Inserire password:  ");
			      			   pwd = in.next();
			      		       if (user[i].controlloPwd(pwd,user[i].getPwd())) controllo1 = true;
			      		       prove--;
			      		} while (prove >= 0 && !controllo1);
			      		if (prove+1 == 0) 
			      			{
			      			System.out.print('\n' + "-> Tentativi esauriti Utente bloccato" + '\n');
			      			return 0;
			      			}
			      	}
			      	i++;
			   }
			   if (controllo1) Menu1(); // entra nel menù per il contocorrente per accedere 
			                           // a vari metodi (preleva, versa etc)
			   else System.out.println('\n' + "-> Utente non presente");	
		   };break;
		   case 2: // Registra
		   {
		       System.out.println('\n' + "-> Benvenuto");
			   System.out.println("-> Inserire username:");
			   username = in.next();
			   int i = 0;
			   while(i<3 && !controllo2) // verifica se l'utente è gia presente 
			   {
			    	if (!user[i].controlloUsername(username,user[i].getNome()))
			    		controllo2 = true;
			    	i++;
			   }
			   if (!controllo2) Menu2(); // entra nel menù per la registrazione serve degli utenti non inizializzati 
			   else System.out.println('\n' + "-> Utente già presente, prova ad accedere");
		   };break;
		   case 0:return 0;
		   }
		} while(true);

	}
	
	public void Menu1() // 
	{
	
	}
	public void Menu2() //
	{
	
	}


}
