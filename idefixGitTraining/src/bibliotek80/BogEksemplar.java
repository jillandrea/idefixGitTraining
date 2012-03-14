package bibliotek80;

public class BogEksemplar {

private int eksplNr;

public BogEksemplar() {
	
}

public BogEksemplar(int eksplNr) {
	this.eksplNr = eksplNr;
}

public int getEksemplar() {
	return this.eksplNr;
}

public String toString() {
	String s = eksplNr + "";
	
	return s;
}
	
}
