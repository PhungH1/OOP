import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int num4;
		
		System.out.println("Please enter 4 digits.");
		num1 = scnr.nextInt();  
		num2 = scnr.nextInt();  
		num3 = scnr.nextInt();  
		num4 = scnr.nextInt();  
		
		num1 = (num1 + 7) % 10;
		num2 = (num2 + 7) % 10; 
		num3 = (num3 + 7) % 10; 
		num4 = (num4 + 7) % 10; 
		System.out.println(num3 + " " + num4 + " " + num1 + " " + num2);
	}

}
