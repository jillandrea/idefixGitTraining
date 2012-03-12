package bibliotek80;
import org.deformation.utilities.*;

/**
 * Ansat: klasse til den obligatoriske opgave bibliotek80
 *
 * @author     NML
 * @created    16. november 2010
 * @version    Fall 2010
 */
public class Ansat extends Person {
    /**
     *  Description of the Field
     */
    public static int UGE = 37;
    private String stilling;
    private Rational arbejdstid;

    /**
     * Konstruktoer
     *
     * @param  cpr       Description of the Parameter
     * @param  navn      Description of the Parameter
     * @param  adresse   Description of the Parameter
     * @param  stilling  Description of the Parameter
     * @param  timer     Description of the Parameter
     * @params           cpr, navn, adresse
     */
    public Ansat(Long cpr, String navn, String adresse, String stilling, int timer) {
        super(cpr, navn, adresse);
        this.stilling = stilling;
        this.arbejdstid = new Rational(timer, Ansat.UGE);
    }

    /**
     *  Gets the stilling attribute of the Ansat object
     *
     * @return    The stilling value
     */
    public String getStilling() {
        return this.stilling;
    }

    /**
     *  Gets the fuldTid attribute of the Ansat object
     *
     * @return    The fuldTid value
     */
    public boolean isFuldTid() {
        if (arbejdstid.toDouble() != 1) {
            return false;
        }
        return true;
    }

    /**
     *  Description of the Method
     *
     * @return    Description of the Return Value
     */
    public String toString() {
        return this.getNavn() + ", " + this.getStilling();
    }
}
