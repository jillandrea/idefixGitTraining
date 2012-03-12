package bibliotek80;

import org.deformation.utilities.*;
import java.util.*;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Forfatter: klasse til bibliotek80
 * efteraar 2009 - softwarekonstruktion
 * @author NML
 * @version 0.99 nov 2010
 */

public class Forfatter implements Serializable {
	private String navn;
	private Calendar born;
	private Calendar deceased;
	private String bornWhere;

	public Forfatter(String s) {
		this.navn = s;
		this.born = null;
		this.deceased = null;
		this.bornWhere = null;
	}

	public Forfatter(String s, int yr, int mt, int dy, String bp) {
		this.navn = s;
		this.born = new NewGregorianCalendar(yr, mt-1, dy);
		this.bornWhere = bp;
	}

	public Forfatter(String s, int yr, int mt, int dy, int by, int bm, int bd, String bp) {
		this.navn = s;
		this.born = new NewGregorianCalendar(yr, mt-1, dy);
		this.deceased = new NewGregorianCalendar(by, bm-1, bd);
		this.bornWhere = bp;
	}

	public String getForfatter() {
		return this.navn;
	}

	public String toString() {
		String s = this.navn;
        if (this.born != null) {
            s += ", født: " + this.born + ", i " + this.bornWhere;
        }
		if (this.deceased != null)
			s += ", død: " + this.deceased;
        return s;
	}

    public static void main(String[] args) {
        String filename = "bibliotek80/forfatterdata.data";

		try {
		    FileOutputStream f_out = new FileOutputStream(filename);
		    ObjectOutputStream obj_out = new ObjectOutputStream (f_out);

            Forfatter f0 = new Forfatter("Donald E. Knuth", 1938, 1, 18, "Milwaukee");
            System.out.println(f0);
            obj_out.writeObject (f0);

            f0 = new Forfatter("Cay S. Horstmann");
            System.out.println(f0);
            obj_out.writeObject (f0);
            f0 = new Forfatter("Frank M. Carrano");
            System.out.println(f0);
            obj_out.writeObject (f0);
            f0 = new Forfatter("Bertrand Russell", 1872, 3, 18, 1970, 2, 2, "Trelleck");
            System.out.println(f0);
            obj_out.writeObject (f0);
            f0 = new Forfatter("Alfred North Whitehead", 1861, 2, 15, 1947, 12, 30, "Ramsgate, Isle of Thanet");
            System.out.println(f0);
            obj_out.writeObject (f0);
            f0 = new Forfatter("Will Shakespeare", 1564, 11, 25, 1616, 1, 1, "Stratford-Upon-Avon");
            System.out.println(f0);
            obj_out.writeObject (f0);

            obj_out.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Fejlkode: " + e);
            e.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Fejlkode: " + e);
            e.printStackTrace();
        }
    }
}
