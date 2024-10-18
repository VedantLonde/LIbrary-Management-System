package com.cjc.bms.serviceImpl;

import java.util.Scanner;

import com.cjc.bms.model.Account;
import com.cjc.bms.servicei.RBI;

public class Sbi extends Account  implements RBI  {

	public void createAcc() {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter your AccNo");
			setAccNo(sc.nextInt()); 
			
		System.out.println("Enter your Name");
			setName(sc.nextLine());
			
		System.out.println("Enter your mobno");	
			setMobno(sc.nextLine());
			
		System.out.println("Enter your Adharno");	
			setAdharno(sc.nextLine());

		System.out.println("Enter your gender");	
			setGender(sc.nextLine());
		
		System.out.println("Enter your age");
			setAge(sc.nextInt());
		
	
			
			
		
		
	}
	public void displayAllDetails() {
		
		System.out.println(getAccNo());
		System.out.println(getName());
		System.out.println(getMobno());
		System.out.println(getAdharno());
		System.out.println(getGender());
		System.out.println(getAge());
		System.out.println(getBalance());
		
	}
	
	public void deposite() {
		
		System.out.println("Enter amount");
		
		Scanner sc = new Scanner(System.in);
//		int bal = sc.nextInt();
		
		 setBalance(sc.nextInt()); 
		
		
		
		
		System.out.println("succefully money deposited");
		
		
	}
	
	public void withdraw() {
		
		System.out.println("Enter amount");
		
		Scanner sc = new Scanner(System.in);
		int bal = sc.nextInt();
//		System.out.println(getBalance() -  );
		if(getBalance()>bal) {
		setBalance(getBalance()- bal );
		System.out.println("collect your cash");
		}
		else {
			System.out.println("insufficent balance");
			
		}
		
		
	
		
	}
	
	public void balanceCheck() {
		
		System.out.println(getBalance());
	}
}
