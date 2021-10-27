
package GestioneBanca;
import java.util.Scanner;

public class MenuBanca 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		int input;
		boolean flag = true;
		Terminale tm1 = new Terminale();
		do // do while che gestisce il menù iniziale
		{
			do // do while che fa in modo che il numero immesso è 1 o 0 
			{
				System.out.println("------------------------------------");
				System.out.println("---Benvenuto nel menù della Banca---");
				System.out.println("--- 1) Login                     ---");
				System.out.println("--- 0) Exit                      ---");
				System.out.println("------------------------------------" + '\n');
				System.out.println("-> Premere il pulsante [1/0]");
				input = in.nextInt();
				if (input != 1 && input != 0) System.out.println("-> Errore!");
			} while (input != 1 && input != 0);

			switch(input) // switch che fa accedere al login o esce
			{
			case 1: 
			    {
				   tm1.login();
			    }break;
			case 0: 
				{
					System.out.println("-> Arrivederci");
					flag = false;
					break;
				}
			}
		} while(flag);
		in.close();

	}

}
