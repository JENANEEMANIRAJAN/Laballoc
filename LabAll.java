package laball;

import java.util.Scanner;

public class LabAll {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		while(1==1) {
			n=n+1;
			if(n==a) {
				System.out.println("L1");
				break;
			}
			if(n==b) {
				System.out.println("L2");
				break;
		    }
			if(n==c) {
				System.out.println("L3");
				break;
		}
	}
		sc.close();

}
}
