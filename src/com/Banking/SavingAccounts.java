package com.Banking;

public class SavingAccounts {

	static int annualInterestRate;   		//Setting interest rate to 4
	private int savingBalance ;					// Initializing balance
	
	
	public int getSavingBalance() {					// Getters and setters for updating saving balance
		return savingBalance;
	}

	public void setSavingBalance(int savingBalance) {
		this.savingBalance = savingBalance;
	}

	public static int getAnnualInterestRate() {			// Getters and setters for updating annual interest
		return annualInterestRate;
	}

	public static void setAnnualInterestRate(int annualInterestRate) {
		SavingAccounts.annualInterestRate = annualInterestRate;
	}


	public void calculateMonthlyInterest(String name, int balance) {						// Method to calculate monthly interest
		
		System.out.println(name+" account balance before adding interest is: "+balance+"\n");
		int monthlyIntrest = (balance*annualInterestRate/100)/12;								// Formula to calculate interest 
		balance += monthlyIntrest;
		setSavingBalance(balance);																// Updating saving balance using getters  
		System.out.println(name+" account balance after adding interest rate is: "+ balance+"\n");
	}
	
	public void modifyInterestRate(int rate) {															// Method to modify interest rate
		setAnnualInterestRate(rate);																// Updating interest rate to 5 using setters
		System.out.println("Interest rate is changed to "+ rate+"\n");
	}
}
