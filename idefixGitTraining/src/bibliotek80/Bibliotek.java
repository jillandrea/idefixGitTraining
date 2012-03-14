package bibliotek80;

public class Bibliotek {

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

public Bibliotek() {
	
}

public Bibliotek(BogEksemplar bogBestand[], Person laanere[], Ansat ansatte[], String navn, BibType type) {
	this.bogBestand = bogBestand;
	this.laanere = laanere;
	this.ansatte = ansatte;
	this.navn = navn;
	this.type = type;
}

public void addBog(BogEksemplar bog) {
	bogBestand[0] = bog;
}

public void addAnsat(Ansat ansat) {
	ansatte[0] = ansat;
}

public void addLaaner(Person laaner) {
	laanere[0] = laaner;
}

public void udskrivBogListe() {
	for(int i = 0; i < bogBestand.length; i++) {
		System.out.println(bogBestand[i]);
	}
}

public void udskrivLaanere() {
	for(int i = 0; i < laanere.length; i++) {
		System.out.println(laanere[i]);
	}
}

public void udskrivAnsatte() {
	for(int i = 0; i < ansatte.length; i++) {
		System.out.println(ansatte[i]);
	
}

public String toString() {
	String s = this.type.toString();
	return s;
}
	
}
