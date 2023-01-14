package beecrowd.iniciante;

import java.util.Scanner;

public class SalarioComBonus_1009 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        String nome = read.next();
        double fixedSalary = read.nextDouble();
        double sold = read.nextDouble();
        
        double total = (sold * 0.15) + fixedSalary;
        
        System.out.printf("TOTAL = R$ %.2f\n", total);
        
        read.close();
	}

}