package Assingmet1;

import java.util.Scanner;

public class sumofdigits {

	public static void main(String[] args) {
     int no,digit,sum=0;
   System.out.println("enter no");
   Scanner sc = new Scanner(System.in) ;   
   no= sc.nextInt();
        while(no>0)
        {
        	digit=no%10;
        	sum=sum+digit;
        	no=no/10;
        }
        System.out.println("sum" +sum);
	}

}
