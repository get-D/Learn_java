import java.lang.*;
import java.util.*;

class NumSys{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		sc.close();
		System.out.println("Number System Conversion: ");
		System.out.println("Hexadecimal: "+ Integer.toHexString(x));
		System.out.println("Octal: "+ Integer.toOctalString(x));
		System.out.println("Binary: "+ Integer.toBinaryString(x));
	}
}