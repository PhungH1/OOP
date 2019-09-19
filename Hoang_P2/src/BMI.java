import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		System.out.println("Please choose whether you'd like option 1 for lbs and inches or option 2 for kgs and meters.");
		System.out.println("Enter either 1 or 2.");
		
		int choice;

		
		choice = scnr.nextInt();
		System.out.println("You've chosen option " + choice + ".");
		System.out.println("Please enter your weight.");
		double weight = scnr.nextDouble();
		System.out.println("Please enter your height in inches or meters depending on your option.");
		double height = scnr.nextDouble();
		
		if (choice == 1)
		{
			
			double bmilbs = 703 * weight / (height * height);
			
			System.out.printf("Your BMI is %.2f.\n", bmilbs );
			if (bmilbs < 18.5)
			{
				System.out.println("You are underweight.");
			}
			else if(bmilbs >= 18.5 && bmilbs <= 24.9)
			{
				System.out.println("You are normal weight.");
			}
			else if(bmilbs >= 25.0 && bmilbs <= 29.9)
			{
				System.out.println("You are overweight.");
			}
			else if(bmilbs >= 30)
			{
				System.out.println("You are obese.");
			}
		}
		
		if (choice == 2)
		{
			double bmikgs = weight / (height * height);
			
			System.out.printf("Your BMI is %.2f.\n", bmikgs );
			if (bmikgs < 18.5)
			{
				System.out.println("You are underweight.");
			}
			else if(bmikgs >= 18.5 && bmikgs <= 24.9)
			{
				System.out.println("You are normal weight.");
			}
			else if(bmikgs >= 25.0 && bmikgs <= 29.9)
			{
				System.out.println("You are overweight.");
			}
			else if(bmikgs >= 30)
			{
				System.out.println("You are obese.");
			}			
		}
		

	}

}
