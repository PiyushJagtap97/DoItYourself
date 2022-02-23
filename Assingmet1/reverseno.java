package Assingmet1;

import java.util.Scanner;

public class reverseno {

	public static void main(String[] args) {
		int rev = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
		int a= sc.nextInt();
		while(a !=0) {
			int rem = a%10;
			rev = rev *10 +rem;
			a = a/10;
		}
		
		System.out.println(rev);

	}

}
