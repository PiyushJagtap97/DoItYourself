package Assingmet1;

import java.util.Scanner;

public class smallestno {

	public static void main(String[] args) {
		int a,b,c,small,temp;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        
        temp= a<b?a:b;
        small= c<temp?c:temp;
        
        System.out.println("smallest no " + small );


	}

}
