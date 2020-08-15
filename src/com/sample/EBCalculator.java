package com.sample;

public class EBCalculator {

	private int units;
	private double bill;

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double billCalculate() {

		if (units < 0 && units <= 100) {
			bill = (units * 0) + 150;
		} else if (units > 100 && units <= 200) {
			bill = ((100 * 0) + (units - 100) * 2);
		} else if (units > 200 && units <= 500) {
			bill = ((100 * 0) + (100 * 2) + (units - 200) * 3);
		} else if (units > 500) {
			bill = ((100 * 0) + (100 * 2) + (100 * 3) + (units - 500) * 6.60);
		} else {
			bill = 0;
		}
		System.out.println("The Bill to Pay is: Rs." + bill);
		return bill;
	}
}
