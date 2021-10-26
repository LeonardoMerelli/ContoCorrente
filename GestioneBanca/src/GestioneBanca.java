import java.util.Scanner;
import java.lang.String;
public class GestioneBanca {
	public static void main(String[] args) {
		System.out.println("Inserire nome, cognome e password");
		Scanner in = new Scanner(System.in);
		String[] nome = new String[100];
		String[] cognome = new String[100];
		String[] password = new String[100];
		nome = in.next();
		cognome = in.next();
		password = in.next();
		TerminaleSportello.TerminaleSportello(nome, cognome, password);
	}
}