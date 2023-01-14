package beecrowd.iniciante;

import java.util.Scanner;

public class ProdutoSimples_1004 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        int PROD, v1, v2;
        
        v1 = read.nextInt();
        v2 = read.nextInt();
        
        PROD = v1 * v2;
        
        System.out.println("PROD = "+PROD);
        read.close();
	}

}
