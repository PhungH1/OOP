import java.util.Scanner;

public class Polls {

	public static void main(String[] args) {
		int people;
		int[][] responses = new int[5][10];
		double sum = 0;

		String[] topics = new String[5];
		topics[0] = "Gaming";
		topics[1] = "Animals";
		topics[2] = "Climate";
		topics[3] = "School";
		topics[4] = "Family";
		
		Scanner scnr = new Scanner(System.in);
		System.out.print("How many people are going to rate? ");
		people = scnr.nextInt();
		
		for (int a = 0, k = 0; a < people; a++, k++)
		{
			for(int i = 0, j = 0; i < 5 && j < 5; i++, j++)
			{
				System.out.print(("Person #") + (a + 1) + (" please rate ") + topics[i] + (" from a scale of 1-10. "));
				responses[j][k] = scnr.nextInt();
					
				
			}
		}
		


		double[] ratings = new double[5];
		
		for( int i = 0; i < 5; i++)
		{
			System.out.print(topics[i]);
			
			for(int j = 0; j < people; j++)
			{
				System.out.print("\t" + responses[i][j] + "\t");
				sum = sum + responses[i][j]; 
			}
			System.out.println("The average rating is: " + sum / people);
			ratings[i] = sum;
			sum = 0;
		}
		
		int max = (int) ratings[0];
		
		for(int i = 1; i < 5; i++)
		{
			if(ratings[i - 1] > max)
			{
				max = (int) ratings[i];
				
			}
			
		}
		for(int i = 0; i < 5; i++)
		{
			if(max == ratings[i])
			{
				System.out.println("The topic " + topics[i] + " has the most points with a total of " + max + " points.");
			}
				
		}
		
		double min = ratings[0];
		
		for(int i = 1; i < 5; i++)
		{
			if (ratings[i] < min)
			{
				min = ratings[i];
			}
		}
		
		for(int i = 0; i < 5; i++)
		{
			if(ratings[i] == min)
			{
				System.out.println("The topic " + topics[i] + " has the least points with a total of " + min + " points.");
			}
				
		}
		

	}
	
	

}
