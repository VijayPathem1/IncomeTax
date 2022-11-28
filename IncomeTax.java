/*Write a program to calculate income tax based on gross income taking into consideration 
 * the deductions and advance tax paid. 
 * Quarterwise the advance tax are calculated and 
 * also let the user know tax refund and tax balance to be paid.
 */


import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
	
		
			double tax = 0, income;
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter your annual income ");
			income = sc.nextDouble();
			
			
			if(income < 300000)
				tax = 0;
			
			else if(income >= 300000 && income < 500000)
				tax = 0.1 * (income - 300000);
			
			else if(income >= 500000 && income < 1000000)
				tax = (0.2 * (income - 500000)) + (0.1 * 100000);
			
			else if(income >= 1000000)
				tax = (0.3 * (income - 1000000)) + (0.2 * 200000) + (0.1*100000);
			
			System.out.println("Your income tax amount is "+tax);
		
	}

}
