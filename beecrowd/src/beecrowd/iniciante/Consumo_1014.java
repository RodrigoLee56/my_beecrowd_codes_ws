package beecrowd.iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Consumo_1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.CANADA);
		Scanner read = new Scanner(System.in);

		int distance = read.nextInt();
		double fuel = read.nextDouble();
		
		double consumption = distance / fuel;
		
		System.out.printf("%.3f km/l\n", consumption);

		read.close();
	}

}
