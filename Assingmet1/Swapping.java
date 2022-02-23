package Assingmet1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ; 
		System.out.println("enter nos");
		int a = sc.nextInt();
		int b= sc.nextInt();
		System.out.println("before swap  " +a +" "+ b);
		a= a+b;
		b= a-b;
		a= a-b;
		System.out.println("after swap  " + a +" "+b);
	}

}
