package Assingmet1;

public class LCM {

	public static void main(String[] args) {
int a= 20, b=9, gcd=1 ,lcm = 0;
for(int i=1;i<=a && i<=b;++i) {
	if(a%i==0 && b%i==0) {
		gcd =i;
	}
	lcm = (a*b)/gcd;

}
System.out.println(lcm);

	}

}
