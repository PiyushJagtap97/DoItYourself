package Assingmet1;

public class printno {

	public static void main(String[] args) {
        int no =1;
        printno(no);
	}
	public static void printno(int n) {
		if (n<=10)
		{
			System.out.println("num  "+n);
			printno(n+1);
		}
	}

}
