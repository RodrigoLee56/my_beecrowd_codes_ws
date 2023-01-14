package beecrowd.iniciante;

import java.util.Scanner;

public class Esfera_1011 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		double r, volume, pi = 3.14159;
		r = read.nextDouble();
		volume = (4.0 / 3) * pi * Math.pow(r, 3);
		System.out.printf("VOLUME = %.3f\n", volume);

		read.close();
	}

}