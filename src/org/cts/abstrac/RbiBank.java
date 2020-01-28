package org.cts.abstrac;

public abstract class RbiBank {
	
	public abstract void saving();
	public abstract void deposit();
	public void fixed() {
		System.out.println("5% Interest");
	}
}

