package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int weight =sc.nextInt();
		int tall = sc.nextInt();
		sc.close();
		
//		System.out.println(height);
//		System.out.println(weight);
		

		int obe = weight + 100 - tall;
		System.out.println(obe);
		if (obe>0) {
			System.out.println("obesity");
		
		}
					
	}

}
