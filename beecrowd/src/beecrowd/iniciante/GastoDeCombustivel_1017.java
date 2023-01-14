package beecrowd.iniciante;

import java.util.Scanner;

public class GastoDeCombustivel_1017 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int speed = read.nextInt();
		int time = read.nextInt();

		double distance = (time * speed);
		double avg = distance / 12;
		System.out.printf("%.4f\n", avg);

		read.close();
	}

}
