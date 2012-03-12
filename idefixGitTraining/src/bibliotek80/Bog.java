package bibliotek80;
import org.deformation.utilities.*;
import java.util.*;
/**
 * Bog: klasse til den obligatoriske opgave 8.0
 * efteraar 2009 - softwarekonstruktion
 * @author NML
 * @version 0.99 nov 2010
 */
import java.io.Serializable;

public class Bog implements Serializable{
    private String titel;
    private int aar;
    private Emne emne;
    private List<Forfatter> forfattere;

    public Bog(String titel, int aar, Emne emne) {
        this.aar = aar;
        this.titel = titel;
        this.emne = emne;
        this.forfattere = new ArrayList<Forfatter>();
    }

    public Bog(String titel, int aar) {
        this.aar = aar;
        this.titel = titel;
        this.emne = null;
        this.forfattere = new ArrayList<Forfatter>();
    }

    public Bog() {}

    public void addForfatter(Forfatter forfatter) {
        this.forfattere.add(forfatter);
    }

    public String toStrForfattere() {
        String s = "";
        Iterator<Forfatter> itr = this.forfattere.iterator();  //  erklaer loop mekanisme
        while (itr.hasNext()) {                                //  loop gennem array
            s += itr.next();
            if (! itr.hasNext())
                s += ": ";
            else
                s += ", ";
        }
        return s;
    }

    public int getAar() {
        return this.aar;
    }

    public Emne getEmne() {
        return this.emne;
    }

    public String getTitel() {
        return this.titel;
    }

    public String toString() {
        String s = "";
        s += this.toStrForfattere();
        s += this.getTitel();
        s += ", " + this.getAar();
        s += ". Emne: " + this.getEmne();
        return s;
    }
}
