package com.Banking;

public class AccountHolder {

	public static void main(String[] args) {
	
		SavingAccounts.setAnnualInterestRate(4);
		
		SavingAccounts saver1 = new SavingAccounts(); 				// Object saver1 to calculate rate 
		saver1.calculateMonthlyInterest("saver1",2000);
		
		SavingAccounts saver2 = new SavingAccounts();				// Object saver2 to calculate rate
		saver2.calculateMonthlyInterest("saver2",3000);
		
		saver1.modifyInterestRate(5);								// Modifying interest rate using setters
		
		int saver1balance = saver1.getSavingBalance();				// Using getter to store the updated balance for saver1
		saver1.calculateMonthlyInterest("saver1", saver1balance);
		
		int saver2balance =  saver2.getSavingBalance();
		saver2.calculateMonthlyInterest("saver2", saver2balance);	// Using getter to store the updated balance for saver2
	}
}
