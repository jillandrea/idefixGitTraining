package bibliotek80;
import org.deformation.utilities.*;
/**
 * Person: klasse til den obligatoriske opgave 8.0
 * efteraar 2009 - softwarekonstruktion
 * @author NML
 * @version 0.91 nov 2009
 */
public class Person {
	private Cprnr cpr;
	private String navn;
	private String adresse;
	private double saldo;
	private double saldoYtd;
	private double saldoLtd;
	
	/**
	 * Konstruktoer
	 * @params cpr, navn, adresse
	 */
	public Person(Long cpr, String navn, String adresse) {
		this.cpr = new Cprnr(cpr);
		this.navn = navn;
		this.adresse = adresse;
		this.saldo = 0.0;
		this.saldoYtd = 0.0;
		this.saldoLtd = 0.0;
	}
	/**
	 * Konstruktoer
	 * @params cpr, navn, adresse, saldi
	 */
	public Person(Long cpr, String navn, String adresse, double s, double sY, double sL) {
		this.cpr = new Cprnr(cpr);
		this.navn = navn;
		this.adresse = adresse;
		this.saldo = s;
		this.saldoYtd = sY;
		this.saldoLtd = sL;
		
		
	}
	
	public Long getNavn() {
		return this.cpr.getCprnr();
	}
	
	public void regulerSaldo(double belob) {
		this.saldo += belob;
		this.saldoYtd += belob;
		this.saldoLtd += belob;
	}
	
	public Reservation reserverer(Bog titel, int y, int m, int d) {
		return new Reservation(this, titel, y, m, d);
	}
	
	public String toString() {
		return this.navn + "\n" + this.adresse + "\nBodssaldo: " + this.saldo;
	}
}