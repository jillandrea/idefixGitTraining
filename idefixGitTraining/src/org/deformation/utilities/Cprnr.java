package org.deformation.utilities;
/*
 * Klasse til cpr-numre
 * Klassen har constructor, checkValidity og toString
 *
 * @author Niels
 * @version sept 10
 *
 */
public class Cprnr {
    private Long cprnr;

    /*
     * Konstruktoer
     * bruges 1 gang per objekt, naar det oprettes med
     * Cprnr nyCpr = new Cprnr(2511450007L);
     *
     * Konstruktoeren skal have samme navn som klassen.
     * Den har ingen type (type Object)
     * Der kan vaere flere konstruktoerer, blot de
     * har hver sin kaldesekvens.
     * Thomas test
     */

    public Cprnr(Long cprInd) {
       cprnr = cprInd;
    }

    /*
     * Accessormetode
     * Leverer vaerdien i sin type
     */
    public Long getCprnr() {
        return this.cprnr;
    }

    /*
     * toString redefinerer java's default
     * metode af samme navn
     * er konventionelt altid String
     */
    public String toString() {
        String aString = String.format("%06d-%04d", this.cprnr / 10000, this.cprnr % 10000);
        return aString;
    }

    /*
     * Metode til modulus 11 kontrol
     * af objektets cprnr
     */
    public boolean checkCprnr() {
		Long sum;
		Long restcpr = this.cprnr;
		sum = 0L;

		sum += (restcpr % 10) * 1;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 5;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 6;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 7;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 2;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 3;
		restcpr = restcpr / 10;
		sum += (restcpr % 10) * 4;
		restcpr = restcpr / 10;
		if (sum % 11 == 0 && sum != 0)
			 return true;
		else
			 return false;
	 }

     public static void main(String[] args) {
         Cprnr c0 = new Cprnr(2511450007L);
         Cprnr c1 = new Cprnr(702900020L);
         System.out.println(c0);
         System.out.println(c1);
     }
}
