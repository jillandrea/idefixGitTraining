package org.deformation.utilities;
import java.util.GregorianCalendar;
import java.util.Calendar;
/*
 * extension to GregorianCalendar
 * solves toString problem and [optionally] nulls time fields
 * @author Niels Muller Larsen
 * @version oct 2009
 * @version nov 2010
 */
public class NewGregorianCalendar extends GregorianCalendar{
	public NewGregorianCalendar() {
		super();
		super.set(HOUR_OF_DAY,0);
		super.set(MINUTE,0);
		super.set(SECOND,0);
	}
	public NewGregorianCalendar(int y, int m, int d) {
		super(y, m, d, 0, 0, 0);
	}
	public NewGregorianCalendar(int y, int m, int d, int hh, int mm, int ss) {
		super(y, m, d, hh, mm, ss);
	}

	public String toString() {
		String s = "";
        s += String.format("%4d-%02d-%02d", super.get(Calendar.YEAR), super.get(Calendar.MONTH)+1, super.get(Calendar.DATE));
		if (super.get(Calendar.HOUR_OF_DAY) != 0) {
            s += String.format("T%02d:%02d:%02d\n", super.get(Calendar.HOUR_OF_DAY), super.get(Calendar.MINUTE), super.get(Calendar.SECOND));
		}
		return s;
	}

    public static void main(String[] args) {
        NewGregorianCalendar gc0 = new NewGregorianCalendar();
        NewGregorianCalendar gc1 = new NewGregorianCalendar(2010, 1, 1);
        NewGregorianCalendar gc2 = new NewGregorianCalendar(2010,2,2,14,2,5);
        System.out.println(gc0);
        System.out.println(gc1);
        System.out.println(gc2);
    }
}
