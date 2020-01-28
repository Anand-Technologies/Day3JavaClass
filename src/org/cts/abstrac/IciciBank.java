package org.cts.abstrac;

public class IciciBank extends RbiBank {

	@Override
	public void saving() {
		System.out.println("6% Interest");
	}
	
	@Override
	public void deposit() {
	System.out.println("9% Interest");	
	}
	
	public static void main(String[] args) {
		IciciBank bank= new IciciBank();
		bank.saving();
		bank.deposit();
		bank.fixed();
	}
}
