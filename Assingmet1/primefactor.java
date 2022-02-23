package Assingmet1;

import java.util.Scanner;

public class primefactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no;
Scanner sc = new Scanner(System.in);
System.out.println("enter no");
no = sc.nextInt();
for(int i=2;i<no;i++) {
	while(no%1==0) {
		System.out.println(i);
		no=no/i;
	}
}
if(no>2) {
	System.out.println(no);
}
	}

}
