package kostana.maksic;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak11 {

	public static void main(String[] args) throws Exception {
		// deklarisanje odsečaka
		double a, b, c;
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za n: ");
		int n = Integer.parseInt(ulaz.readLine());

		for (int i = 1; i <= n; i++) {
			// Unos podataka
			System.out.println("Unesite dužinu odsečka a: ");
			a = Double.parseDouble(ulaz.readLine());
			System.out.println("Unesite dužinu odsečka b: ");
			b = Double.parseDouble(ulaz.readLine());
			System.out.println("Unesite dužinu odsečka c: ");
			c = Double.parseDouble(ulaz.readLine());
			if (a > 0 && b > 0 && c > 0) {
				// Ispitivanje da li zadati odsečci mogu konstruisati trougao
				if ((a + b > c) && (a + c > b) && (b + c > a)) {
					double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
					// Štampanje rzultata
					System.out.println("Površina trougla je " + p);
				} else
					System.out.println("Unete stranice ne čine trougao");
			} else
				System.out.println("Odsečci moraju biti veći od nule");
		}
	}

}
