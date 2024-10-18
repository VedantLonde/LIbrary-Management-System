package com.cjc.bms.client;
import java.util.Scanner;

//import com.cjc.bms.model.Account;
import com.cjc.bms.serviceImpl.Sbi;
import com.cjc.bms.servicei.RBI;


public class Test {

	public static void main(String[] args) {
		
		RBI bank = new Sbi();
		
		System.out.println("press 1 to create account");
		System.out.println("press 2 to show the details");
		System.out.println("press 3 for money deposte");
		System.out.println("press 4 to withdraw money");
		System.out.println("press 5 to check balance ");
	
		Scanner sc = new  Scanner(System.in);
		int a = sc.nextInt();
				
		switch(a) {
		
		case 1 :
			bank.createAcc();
			break;
	
		case 2 :
			bank.displayAllDetails();
			break;
			
		case 3 :
			bank.deposite();
			break;
		
		case 4:
			bank.withdraw();
			break;
			
		case 5:
			bank.balanceCheck();
			break;
		
	}
		
		Scanner sc1 = new  Scanner(System.in);
		int b = sc1.nextInt();
		
		switch(b) {
		
				case 1 :
					bank.createAcc();
					break;
			
				case 2 :
					bank.displayAllDetails();
					break;
					
				case 3 :
					bank.deposite();
					break;
				
				case 4:
					bank.withdraw();
					break;
					
				case 5:
					bank.balanceCheck();
					break;
		
	}
		
		Scanner sc2 = new  Scanner(System.in);
		int c = sc2.nextInt();
		
		switch(c) {
		
				case 1 :
					bank.createAcc();
					break;
			
				case 2 :
					bank.displayAllDetails();
					break;
					
				case 3 :
					bank.deposite();
					break;
				
				case 4:
					bank.withdraw();
					break;
					
				case 5:
					bank.balanceCheck();
					break;
		
	}
   }
}
