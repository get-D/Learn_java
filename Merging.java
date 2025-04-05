import java.lang.*;
import java.util.Scanner;

class Merging{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		byte c;
		
		System.out.println("Enter values of a and b: ");
		a= sc.nextInt();
		b= sc.nextInt();

		c=(byte)(a<<4);
		c=(byte)(c|b);

		System.out.println("first number: "+((c&0b11110000)>>4));
		System.out.println("second number: "+(c&0b00001111));
	}
}