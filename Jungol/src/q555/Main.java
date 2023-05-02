package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	char[] a= new char[10]; 
		String str="";
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<a.length; i++){
			str = sc.next();
			a[i] = str.charAt(0);
		}
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]);
		}

//	char[] ar = new char[10];
//	ar[0] = sc.next().charAt(0);
//	ar[1] = sc.next().charAt(0);
//	ar[2] = sc.next().charAt(0);
//	ar[3] = sc.next().charAt(0);
//	ar[4] = sc.next().charAt(0);
//	ar[5] = sc.next().charAt(0);
//	ar[6] = sc.next().charAt(0);
//	ar[7] = sc.next().charAt(0);
//	ar[8] = sc.next().charAt(0);
//	ar[9] = sc.next().charAt(0);
//	sc.close();
//	
//	
//	System.out.printf("%c%c%c%c%c%c%c%c%c%c",ar[0],ar[1],ar[2],ar[3],ar[4],ar[5],ar[6],ar[7],ar[8],ar[9]);
//	

	 
	
		

	}

}
