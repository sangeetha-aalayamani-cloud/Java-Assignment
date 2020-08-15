package com.sample;

import java.util.Scanner;
/**
 * 
 * @author Sangeetha
 *
 */
public class FutureInvestment_01 {

	private static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
	try {
		int formatter = 19;
		
		System.out.print("Input the investment amount: ");
		double investment = input.nextDouble();
		
		System.out.print("Input the rate of interest: ");
		double rate = input.nextDouble();
		
		System.out.print("Input number of years: ");
		int year = input.nextInt();

		rate *= 0.01;

		System.out.println("Years    FutureValue");
		
		for (int m = 1; m <= year; m++) {
			
			if (m >= 10) 
				formatter = 18;
				System.out.printf(m + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate / 12, m));
		  }
	  } catch(Exception e) {
		  e.printStackTrace();
	  } finally {
		  input.close();
	  }
	}

	/**
	 * Get futureInvestmentValue
	 * 
	 * @param investmentAmount
	 * @param monthlyInterestRate
	 * @param years
	 * @return
	 */
	private static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
	}

}
