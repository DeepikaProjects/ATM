package com.myproject;

import com.myproject.ATM;
import com.myproject.AtmInterface;

public  class AtmImpl  implements AtmInterface{

	ATM atm=new ATM();
	public void viewbalance() {
		
		System.out.println("Available balance is: "+atm.getBalance());
			
	}

	
	public void depositAmount(double depositAmount) {
		
		System.out.println(depositAmount+" Deposited successfully");
		atm.setBalance(atm.getBalance()+depositAmount);
		viewbalance();
		
	}



	public void withdrawAmount(double withdrawAmount) {
		
		System.out.println("Collect cash"+withdrawAmount);
		atm.setBalance(atm.getBalance()-withdrawAmount);
		viewbalance();
		
		
	}

	
	

}
