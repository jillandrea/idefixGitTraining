package bibliotek80;
import org.deformation.utilities.*;

import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

/**
 * Emne: klasse til den obligatoriske opgave 8.0
 * efteraar 2009 - softwarekonstruktion
 * @author NML
 * @version 0.99 nov 2010
 */

public class Emne implements Serializable {
	private int nr;
	private String navn;

	public Emne(String s, int n) {
		this.nr = n;
		this.navn = s;
	}

	public String toString() {
		return this.nr + " " + this.navn;
	}

    public static void main(String[] args) {
        String filename = "bibliotek80/emnedata.data";

		try {
		    FileOutputStream f_out = new FileOutputStream(filename);
		    ObjectOutputStream obj_out = new ObjectOutputStream (f_out);

            Emne e0 = new Emne("Filosofi", 30);
            System.out.println(e0);
            obj_out.writeObject (e0);

            e0 = new Emne("Programmering", 80);
            System.out.println(e0);
            obj_out.writeObject (e0);
            e0 = new Emne("Programmering, Java", 81);
            System.out.println(e0);
            obj_out.writeObject (e0);
            e0 = new Emne("Datakommunikation", 60);
            System.out.println(e0);
            obj_out.writeObject (e0);
            e0 = new Emne("Datakommunikation, Internet", 62);
            System.out.println(e0);
            obj_out.writeObject (e0);

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
