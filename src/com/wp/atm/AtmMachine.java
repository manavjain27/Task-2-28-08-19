package com.wp.atm;

public class AtmMachine {
	
	
	ATMcard atmcard;
	
	//Card Injection
	
	public void injectAtmCard(ATMcard atmcard)
	{
		this.atmcard=atmcard;
	}
	
	
	//Balance Info
	public void balanceInfo()
	{
		if(this.atmcard!=null) {
			this.atmcard.balanceInfo();
		}
		else
			System.out.println("Insert Card");
	}
	
	
	//Pin Change
	public void pinChange()
	{
		if(this.atmcard!=null) {
		this.atmcard.pinChange();
		}
		else
			System.out.println("Insert Card");
	}
	
	
	//Mini Statement
	public void miniStatement()
	{
		if(this.atmcard!=null) {
		this.atmcard.miniStatement();
		}
		else
			System.out.println("Insert Card");
	}
	
	
	//Withdraw Money
	public void withdraw()
	{
		if(this.atmcard!=null) {
		this.atmcard.withdraw();
		}
		else
			System.out.println("Insert Card");
	}
	
	
	//Deposited Money
	public void deposits()
	{
		if(this.atmcard!=null) {
		this.atmcard.deposits();
		}
		else
			System.out.println("Insert Card");
	}

	public static void main(String[] args) {
		
		
		// Instance Creation
		AtmMachine atmmachine=new AtmMachine();
		
		//SbiCard Injection
		atmmachine.injectAtmCard(new SbiCard());
		atmmachine.balanceInfo();
		atmmachine.pinChange();
		atmmachine.miniStatement();
		atmmachine.withdraw();
		atmmachine.deposits();
		
		//HDFC Card Injection
		atmmachine.injectAtmCard(new HdfcCard());
		atmmachine.balanceInfo();
		atmmachine.pinChange();
		atmmachine.miniStatement();
		atmmachine.withdraw();
		atmmachine.deposits();
		
		
		//Dena Bank Card
		atmmachine.injectAtmCard(new DenaBank());
		atmmachine.balanceInfo();
		atmmachine.pinChange();
		atmmachine.miniStatement();
		atmmachine.withdraw();
		atmmachine.deposits();
		

	}

}
