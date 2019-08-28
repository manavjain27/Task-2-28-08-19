package com.wp.atm;

public class DenaBank implements ATMcard {

	@Override
	public void pinChange() {
		System.out.println("Successfully changed Pin using Dena Bank card");

	}

	@Override
	public void balanceInfo() {
		System.out.println("Showing Balance using Dena Bank card");

	}

	@Override
	public void miniStatement() {
		System.out.println("Showing Mini Statement using Dena Bank card");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw Money using Dena Bank card");

	}

	@Override
	public void deposits() {
		System.out.println("Deposited Money using Dena Bank card");

	}

}
