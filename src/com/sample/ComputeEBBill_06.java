package com.sample;

import java.util.Scanner;

public class ComputeEBBill_06 extends EBCalculator {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
	 try {
		ComputeEBBill_06 c = new ComputeEBBill_06();
		System.out.println("Enter the Units Consumed:");
		int units = input.nextInt();
		System.out.println("Units Consumed: "+units);
		c.setUnits(units);
		c.billCalculate();

	 } catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	}

}
