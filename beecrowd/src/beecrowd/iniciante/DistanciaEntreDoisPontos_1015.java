package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntreDoisPontos_1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);
		Scanner read = new Scanner(System.in);

		double x1 = read.nextDouble();
		double y1 = read.nextDouble();
		double x2 = read.nextDouble();
		double y2 = read.nextDouble();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
		System.out.printf("%.4f\n", distance);
		read.close();
	}

}
