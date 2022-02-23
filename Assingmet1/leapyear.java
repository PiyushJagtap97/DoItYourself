package Assingmet1;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
          int year;
          Scanner sc = new Scanner (System.in);
          System.out.println("enter no");
          year = sc.nextInt();
          if((year%4==0) && (year%100!=0))
        	  System.out.println("leap year");
          else
        	  System.out.println("non leap year");
       
          
	}

}
