package beecrowd.iniciante;

import java.util.Scanner;

public class Area_1012 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		double triangle, circle, trapezio, square, rectangle, a, b, c;
		double pi = 3.14159;
		a = read.nextDouble();
		b = read.nextDouble();
		c = read.nextDouble();

		triangle = (a * c) / 2.0;
		circle = pi * Math.pow(c, 2);
		trapezio = ((a + b) * c) / 2.0;
		square = Math.pow(b, 2);
		rectangle = a * b;

		System.out.printf("TRIANGULO: %.3f\n", triangle);
		System.out.printf("CIRCULO: %.3f\n", circle);
		System.out.printf("TRAPEZIO: %.3f\n", trapezio);
		System.out.printf("QUADRADO: %.3f\n", square);
		System.out.printf("RETANGULO: %.3f\n", rectangle);
		
		read.close();
	}

}
