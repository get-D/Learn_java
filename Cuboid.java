import java.lang.*;
import java.util.Scanner;

class Cuboid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		float l,b,h;
		float area, vol;
		
		System.out.println("Enter length, breadth, height: ");
		l= sc.nextFloat();
		b= sc.nextFloat();
		h= sc.nextFloat();

		area= 2*(l*b+b*h+l*h);

		vol= l*b*h;

		System.out.println("Total area is: "+ area);
		System.out.println("Total volume is: "+ vol);
	}
}