import java.lang.*;
import java.util.Scanner;

class Swap{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("Enter values of a and b: ");
		a= sc.nextInt();
		b= sc.nextInt();

		a= a^b;
		b= a^b;
		a= a^b;

		System.out.println(a +" "+ b);
	
	}
}