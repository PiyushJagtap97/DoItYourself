package Assingmet1;

import java.util.Scanner;

public class evenodd {
    // int a;
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no");
        int a= sc.nextInt();
        
        if(a%2==0) {
        	System.out.println("no is even");
        }
        else {
        	System.out.println("no is odd");
        }
        
	}

}
