package beecrowd.iniciante;

import java.util.Scanner;

public class Salario_1008 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int idEmployee = s.nextInt();
		int workedHours = s.nextInt();
		double valuePerHour = s.nextDouble();
		double salary = workedHours * valuePerHour;
		System.out.println("NUMBER = " + idEmployee);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		s.close();
	}

}
