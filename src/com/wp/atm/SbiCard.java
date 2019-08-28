package com.wp.atm;

public class SbiCard implements ATMcard {

	@Override
	public void pinChange() {
		System.out.println("Sucessfully Changed Pin");
	}

	@Override
	public void balanceInfo() {
		System.out.println("Showing Balance Info Using SBI card");

	}

	@Override
	public void miniStatement() {
		System.out.println("Showing Mini Statement Using SBI card");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw Money Using SBI card");

	}

	@Override
	public void deposits() {
		System.out.println("Depositing money Using SBI card");

	}

}
