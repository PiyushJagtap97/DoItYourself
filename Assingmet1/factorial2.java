package Assingmet1;

import java.util.Scanner;

public class factorial2 {
	static int factorial (int n) {
		if(n==0)
			return 1;
		else
			return(n*factorial(n-1));
		
	}

	public static void main(String[] args) {
		
		int i, fact =1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		int no = sc.nextInt();
		 fact= factorial(no);
		 System.out.println("factorial is " + fact);
	
		
           
	}

}
