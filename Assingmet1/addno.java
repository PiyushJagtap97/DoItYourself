package Assingmet1;

import java.util.Scanner;

public class addno {

	public static void main(String[] args) {
      int x,y;
      Scanner sc = new Scanner (System.in);
      x=sc.nextInt();
      y=sc.nextInt();
      while(y!=0) {
    	  int carry = x&y;
    	  x=x^y;
    	  y= carry<<1;
      }
      System.out.println("sum " +x);

	}

}
