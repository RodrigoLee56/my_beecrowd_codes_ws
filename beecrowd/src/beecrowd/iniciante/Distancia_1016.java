package beecrowd.iniciante;

import java.util.Scanner;

public class Distancia_1016 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int distance = read.nextInt();
		int minutes = (60 * distance) / 30;
		System.out.printf("%d minutos\n", minutes);
		
		read.close();
	}

}
