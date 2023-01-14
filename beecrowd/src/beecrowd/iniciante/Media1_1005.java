package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Media1_1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);

		double a = read.nextDouble();
		double b = read.nextDouble();

		if ((a >= 0 && a <= 10.0) && (b >= 0 && b <= 10.0)) {
			double media = ((3.5 * a) + (7.5 * b)) / 11.0;
			System.out.printf("MEDIA = %.5f\n", media);
		}

		read.close();
	}

}
