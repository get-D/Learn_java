import java.lang.*;
import java.util.Scanner;

class Area{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a,b,c;
		float s, area;
		
		System.out.println("Enter 3 sides: ");
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();

		s=(a+b+c)/2f;

		area= (float)Math.sqrt(s*(s-a)*(s-b)*(s-c));

		System.out.println("Area is: "+ area);
	}
}