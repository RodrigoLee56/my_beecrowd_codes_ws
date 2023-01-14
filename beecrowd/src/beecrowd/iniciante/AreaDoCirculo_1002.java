package beecrowd.iniciante;

import java.util.Scanner;

public class AreaDoCirculo_1002 {

	public static void main(String[] args) {
		double area, n = 3.14159, raio;
		Scanner s = new Scanner(System.in);

		raio = s.nextDouble();
		area = n * (raio * raio);

		System.out.printf("A=%.4f\n", area);
		s.close();
	}

}
