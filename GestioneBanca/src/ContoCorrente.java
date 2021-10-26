
public class ContoCorrente {
	private double saldo;
	private int numeroconto numero;
	private static int ultimocontocreato = 1000;
	double tasso = 0.02;
	int somma = 0;
	public ContoCorrente(double saldoIniziale) {
		saldo = saldoIniziale;
		ultimocontocreato++;
		numero = ultimocontocreato;
	}
	public void versa(double somma); {
		saldo += somma;
		System.out.println("Sono stati versati " + somma + "€");
	}
	public boolean preleva(double somma); {
		if( saldo < somma) {
			System.out.println("Non ci sono abbastanza soldi sul conto");
			return false;
		}
		else {
			System.out.println("Sono stati prelevati " + somma + "€");
			saldo -= somma;
			return true;
		}
	}
	public void maturaInteressi() {
		saldo = saldo * tasso;
	}
	public double ottieniSaldo() {
		return saldo;
	}
	public int ottieniNumero() {
		return numeroconto;
	}
	public void modificaTassoFamily(double tassof) {
		tasso = tassof;
	}
	public void modificaTassoBusiness(double tassob) {
		tasso = tassob;
	}

}
