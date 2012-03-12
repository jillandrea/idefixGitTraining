package org.deformation.utilities;

public class MyMath {

	/**
	 * En metode der foretager heltalspotensopl?ftning rekursivt.
     *
     * @author NML
     * @version 2008-09-22
     */
    
     public static long pow(long r, long e) {
         if (e <= 0) {
             return 1;
         } else {
             return r * pow(r, e - 1);
         }
     }
}
