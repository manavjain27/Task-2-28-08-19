package com.wp.atm;

public class HdfcCard implements ATMcard {

	@Override
	public void pinChange() {
		System.out.println("Successfully changed Pin using HDFC card");
	}

	@Override
	public void balanceInfo() {
		System.out.println("Showing Balance Info using HDFC card");

	}

	@Override
	public void miniStatement() {
		System.out.println("Showing Mini Statement using HDFC card");

	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw Money using HDFC card");

	}

	@Override
	public void deposits() {
		System.out.println("Deposited Money using HDFC card");

	}

}
