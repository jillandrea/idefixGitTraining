package org.deformation.utilities;

/*
 * Program Rational.java til behandling af Q: de rationale tal
 * Downey exercise 9.3 (ed. 2008-04-23)
 * @author Niels Muller Larsen
 * @version oct 2011
 */
public class Rational {
	/*
	 * Klassevariabler
	 */
	public static final int MINUS1 = -1;  // her også konstant
	/*
	 * Klassemetoder
	 */
	public static int gcd (int a, int b) {
		/*
		 * @params int a, int b not both 0
		 * @return gcd of a and b
		 */
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	/*
	 * Instansvariabler
	 */
	private int numerator;
	private int denominator;

	/*
	 * Constructor
	 * @params integer numerator
	 * @params integer denominator
	 * Downey 9.3.g
	 */
	public Rational (int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}

	/*
	 * Constructor uden params
	 * Downey 9.3.c, ændret ift Downey
	 */
	public Rational () {
		this.numerator = 0;
		this.denominator = 1;
	}

	/*
	 * metode add, adder to broeker dvs adder broek til this
	 * @params Rational rat
	 * Downey 9.3.l
	 */
	public Rational add (Rational rat) {
		int i = this.numerator * rat.denominator;
		i += rat.numerator * this.denominator;
		int j = this.denominator * rat.denominator;
		Rational q = new Rational(i, j);
		return q.reduce();
	}
	/* ekstra */
	public Rational sub (Rational rat) {
		Rational q = rat.negate();
		q = this.add(q);
		return q.reduce();
	}
	public Rational mul (Rational rat) {
		int i = this.numerator * rat.numerator;
		int j = this.denominator * rat.denominator;
		Rational q = new Rational(i, j);
		return q.reduce();
	}
	public Rational div (Rational rat) {
		Rational q = rat.invert();
		q = this.mul(q);
		return q.reduce();
	}

	/*
	 * Invert, metode
	 * aendrer p/q til g/p
	 * Downey 9.3.i
    */
	public Rational invert () {
		return new Rational(this.denominator, this.numerator);
	}

	/*
	 * metode negate
	 * Downey 9.3.h
	 */
	public Rational negate () {
		return new Rational((this.numerator * Rational.MINUS1), this.denominator);
	}

	/*
	 * metode reduce (forkort)
	 * Downey 9.3.k
	 */
	public Rational reduce () {
		int gcd = gcd(this.numerator, this.denominator);
		return new Rational(this.numerator/gcd, this.denominator/gcd);
	}
	/*
	 * metode toDouble
	 * returnerer brøken som decimaltal
	 * Downey 9.3.j
	 */
	public double toDouble() {
		return (double) this.numerator / this.denominator;
	}

	/*
	 * metode toString
	 * del af Downey 9.3.d
	 */
	public String toString() {
		String s = "";
		if (this.numerator * this.denominator < 0 )
			s = "-";
		s += Math.abs(this.numerator);
		if (Math.abs(this.denominator) == 1)
			return s;
        else if (this.numerator == 0)
            return "0";
		else
			return s + "/" + Math.abs(this.denominator);
	}

	public static void main (String[] args) {
		Rational p = new Rational();
		Rational q = new Rational(2, 3);
		Rational r = new Rational(6,14);
		Rational s = new Rational(9, 6);		// ny broek
		Rational t = new Rational(4, -3);

        System.out.println("0/1: " + p);
        System.out.println("2/3: " + q);
        System.out.println("6/14: " + r);
        System.out.println("9/6: " + s);
        System.out.println("-4/3: " + t);

		q = q.negate(); // Downey 9.3.f      -2/3
		System.out.println("-2/3: " + q);		// bedre end Downey 9.3.d    -2/3
		r = r.invert();                                        //                          7/3
		System.out.println("7/3: " + r);		// bedre end Downey 9.3.d    7/3
		System.out.println("2,333: " + r.toDouble());		// Downey 9.3.j    2.333

		/*
		 * test af Rational.gcd
		 * derefter reduce der bruger gcd
		 * Downey 9.3.k
		 */
		 System.out.println("gcd: 6: " + Rational.gcd(42,96));       // 6

		System.out.println("forkortet:" + r.reduce());      // 7/3
		System.out.println("14/6: " + r);                              // orig 7/3

		System.out.println("forkortet: 3/2: " + s.reduce());      // vis forkortet 3/2
		System.out.println("9/6: " + s);	// vis original broek (skal vaere uforandret)  9/6

		/*
		 * Downey 9.3.l
		 */
		s = s.add(r);
		System.out.println("23/6: " + s);  // 23/6
		r = new Rational(1,6);
		System.out.println("1/6+23/6: " + s.add(r));  // 24/6 => 4/1

		/* ekstra */
		s = new Rational(-10,6);
		t = new Rational(2,3);
		System.out.println("-7/3: " + s.sub(t));
		s = new Rational(-10,6);
		t = new Rational(2,3);
		System.out.println("-10/9: " + s.mul(t));
		s = new Rational(-10,6);
		t = new Rational(2,3);
		System.out.println("5/2: " + s.div(t));

		s = new Rational(2, 3);
		t = new Rational(2, 3);
		System.out.println("0/1: " + s.sub(t));
		System.out.println("Kilroy was here!");
	}

}
