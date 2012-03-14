package bibliotek80;

/**
 *  @author Nurudin, Glenn, Martin, Janus
 *
 */

public class Bibliotek {
/**
 * Her opretter vi vores statiske klasse kaldet BibType,
 * som skal definere type af bibliotek.
 *
 */
public static enum BibType {
	HOVEDBIBLIOTEK, AFDELINGSBIBLIOTEK;
	public String toString() {
		switch(this) {
		case AFDELINGSBIBLIOTEK:
			return "Afdelingsbibliotek";
		default:
			return "Hovebibliotek";
		}
	}
}
	
private BogEksemplar bogBestand[];
private Person laanere[];
private Ansat ansatte[];
private String navn;
private BibType type;


/**
 * Tom constructor
 */
public Bibliotek() {
	
}

/**
 * Constructor til oprettelse af objekt
 * @param bogBestand
 * @param laanere
 * @param ansatte
 * @param navn
 * @param type
 */
public Bibliotek(BogEksemplar bogBestand[], Person laanere[], Ansat ansatte[], String navn, BibType type) {
	this.bogBestand = bogBestand;
	this.laanere = laanere;
	this.ansatte = ansatte;
	this.navn = navn;
	this.type = type;
}

/**
 * Metode der tilføjer en bog til bogBestand arrayet
 * @param bog
 */
public void addBog(BogEksemplar bog) {
	bogBestand[0] = bog;
}

/**
 * Metode der tilføjer en ansat til ansatte arrayet
 * @param ansat
 */
public void addAnsat(Ansat ansat) {
	ansatte[0] = ansat;
}

/**
 * Metode der tilføjer en laaner til laanere arrayet
 * @param laaner
 */
public void addLaaner(Person laaner) {
	laanere[0] = laaner;
}

/**
 * Metode der uskriver hele bogBestand arrayet
 */
public void udskrivBogListe() {
	for(int i = 0; i < bogBestand.length; i++) {
		System.out.println(bogBestand[i]);
	}
}

/**
 * Metode der udskriver laanere arrayet
 */
public void udskrivLaanere() {
	for(int i = 0; i < laanere.length; i++) {
		System.out.println(laanere[i]);
	}
}

/**
 * Metode der udskriver ansatte arrayet
 */
public void udskrivAnsatte() {
	for(int i = 0; i < ansatte.length; i++) {
		System.out.println(ansatte[i]);
	}
}

/**
 * toString metode der udskriver typen af bibliotek
 */
public String toString() {
	String s = this.type.toString();
	return s;
}
	
}
