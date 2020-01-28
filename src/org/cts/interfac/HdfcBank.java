package org.cts.interfac;

public class HdfcBank implements RbiBank {

	@Override
	public void deposit() {
		System.out.println("5% Interest");
	}

	@Override
	public void saving() {
		System.out.println("7% Interest");
	}

	@Override
	public void fixed() {
		System.out.println("9% Interest");
	}
	
	public static void main (String [] args) {
		HdfcBank bank = new HdfcBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
	}
}
