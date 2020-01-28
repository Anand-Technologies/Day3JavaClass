package org.cts.string;

//Scenario: Get the address from the user and verify pincode is present or not

public class CheckPincode {
	public static void main (String [] args) {
						//0123456789 - Index
		String address = "Thiruvanmiyur 600021";
		boolean s = address.contains("600");
		System.out.println(s);
		
// to print the pincode only
		String g = address.substring(14,20);
		System.out.println(g);
		
//To print the index of (i) from address
		int h= address.indexOf('i');
		System.out.println(h);
		int k = address.lastIndexOf('i');
		System.out.println(k);
		
//To get Thiruvanmiyur from address & add Chennai District
		String add = " Chennai District";
		String i = address.substring(0,13);
		String j = i.concat(add);
		System.out.println(j);

//To get PhoneNumber from user & check whether Character is present or not
		String a = "9940015190";
		boolean z = a.contains("a");
		System.out.println(z);
	}
}
