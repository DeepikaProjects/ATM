package com.myproject;

import java.util.Scanner;

import com.myproject.AtmImpl;
import com.myproject.AtmInterface;

public class MainClass {

	public static void main(String[] args) {
		
		AtmInterface op=new AtmImpl();
		
		int atmnumber=939088;
		
		int atmpin=0011;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to ATM machine");
		
		System.out.println("Enter ATM number : ");
		
		int atmNumber=sc.nextInt();
		
		System.out.println("Enter ATM PIN : ");
		
		int pin=sc.nextInt();
		
		if(atmnumber==atmNumber)
		{

           while(true)
           {
        	   System.out.println("1.view Balance\n2.withdraw money\n3.DepositAmount\n4.Exit");
        	   int ch=sc.nextInt();
        	   if(ch==1) {
        		   
        		   op.viewbalance();
        		   
        	   }
        	   else if(ch==2) {
        		   
        		   System.out.println("Enter amount to credit: ");
        		   double withdrawAmount=sc.nextDouble();
        		   op.withdrawAmount(withdrawAmount);
        		   
        	   }
               else if(ch==3) {
            	   
            	   System.out.println("Entetr amount to deposit: ");
            	   double depositAmount=sc.nextDouble();
        		   op.depositAmount(depositAmount);        		   
        	   }
               
               else {
            	   System.out.println("Enter correct choice");
               }
           }
		}
		else {
			System.out.println("Enter correct ATM number or pin");
		}
		

	}

}

