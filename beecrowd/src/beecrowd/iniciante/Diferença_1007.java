package beecrowd.iniciante;

import java.util.Scanner;

public class Diferença_1007 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int a, b, c, d, DIFERENCA;
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = s.nextInt();
        
        DIFERENCA = (a * b - c * d);
        
        System.out.println("DIFERENCA = "+DIFERENCA);
        
        s.close();
	}

}
