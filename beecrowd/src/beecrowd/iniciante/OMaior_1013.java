package beecrowd.iniciante;

import java.util.Scanner;

public class OMaior_1013 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int value1 = read.nextInt();
		int value2 = read.nextInt();
		int value3 = read.nextInt();

		if (value1 > value2 && value1 > value3) {
			System.out.println(value1 + " eh o maior");
		} else if (value2 > value3) {
			System.out.println(value2 + " eh o maior");
		} else {
			System.out.println(value3 + " eh o maior");
		}

		read.close();
	}

}
