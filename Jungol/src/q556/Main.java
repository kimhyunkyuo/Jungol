package q556;

public class Main {

	public static void main(String[] args) {
//	 int [] a = {1,2,3,4,5,6,7,8,9,10};
//	 
//	 for(int i=0; i<a.length; i++ ) {
//		 System.out.print(a[i]+" ");
//	 }
		
	
	int[] num = new int[10];	
	// 첫번째 방법	
//	num[0] = 1;	
//	num[1] = 2;	
//	num[2] = 3;	
//	num[3] = 4;	
	
	
	//두번째 방법
	for(int i=0; i<num.length;i++) {
		num[i] = i+1;}
	
		for(int i=0; i<num.length;i++) {
			System.out.print(num[i]);
			if(i<num.length-1) {
				System.out.print("?");
			}

	}
	
	
 }

}
