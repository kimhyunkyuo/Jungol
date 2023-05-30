package q617;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Name[] p = new Name[5];
		
		for(int i = 0; i<p.length; i++) {
			String name = sc.next();
			int tall =sc.nextInt();		
			p[i] = new Name(name,tall);
			
		}
		sc.close();
		
//		for(int i = 0; i<p.length; i++) {
//			p[i].print();
//		}
		
		Name min = p[0];
		for(int i = 0; i<p.length; i++) {
			if(min.gettall()> p[i].gettall()) {
				min = p[i];
			}
		}
		min.print();
	}
	
}
