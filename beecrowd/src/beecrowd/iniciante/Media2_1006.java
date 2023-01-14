package beecrowd.iniciante;

import java.util.Scanner;

public class Media2_1006 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
        double a, b, c, media;
        
        a = read.nextDouble();
        b = read.nextDouble();
        c = read.nextDouble();
        
        media = ((2 * a) + (3 * b) + (5 * c)) / 10;
        
        System.out.printf("MEDIA = %.1f\n", media);
        read.close();
	}

}
