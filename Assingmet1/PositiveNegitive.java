package Assingmet1;

import java.util.Scanner;

public class PositiveNegitive {

	public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter no");
                int no = sc.nextInt();
                if(no>0)
                	System.out.println("no is +ve");
                else if(no<0)
                System.out.println("no is -ve");
                else
                System.out.println("no is zero");
	}

}
