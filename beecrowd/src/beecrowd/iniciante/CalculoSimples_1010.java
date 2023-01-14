package beecrowd.iniciante;

import java.util.Scanner;

public class CalculoSimples_1010 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int idPiece1 = read.nextInt();
		int numPiece1 = read.nextInt();
		double valuePiece1 = read.nextDouble();

		int idPiece2 = read.nextInt();
		int numPiece2 = read.nextInt();
		double valuePiece2 = read.nextDouble();

		double total = (numPiece1 * valuePiece1) + (numPiece2 * valuePiece2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		read.close();
	}

}
