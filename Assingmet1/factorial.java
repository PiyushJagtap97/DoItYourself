package Assingmet1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
         int i, 
         fact =1;
         Scanner sc = new Scanner(System.in);
         System.out.println("enter no");
         int no = sc.nextInt();
         for(i=1;i<=no;i++) {
        	 
        	 fact = fact*i;
         }
         System.out.println("factorial of given no" + fact);
	}

}
