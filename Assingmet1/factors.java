package Assingmet1;

import java.util.Scanner;

public class factors {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("no is");
		int a = sc.nextInt();
		System.out.println("factors are ");
		
		for(int i=1;i<=a;++i) {
			if(a%i==0) {
		
			System.out.println(i);
			}
		}
	}

}
