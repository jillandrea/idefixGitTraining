package bibliotek80;

/**
 *  @author Nurudin, Glenn, Martin, Janus
 *
 */

public class BogEksemplar {

private int eksplNr;

/**
 * Tom constructor
 */
public BogEksemplar() {
	
}

/**
 * Constructor der opretter et objekt af typen BogEksemplar
 * @param eksplNr
 */
public BogEksemplar(int eksplNr) {
	this.eksplNr = eksplNr;
}

/**
 * returnere eksplNr attributten
 * @return
 */
public int getEksemplar() {
	return this.eksplNr;
}

/**
 * toString metode der udskriver eksplNr attributten
 */
public String toString() {
	String s = eksplNr + "";
	
	return s;
}
	
}
