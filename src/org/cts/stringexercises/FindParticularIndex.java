package org.cts.stringexercises;

//Find the particular character index in string

public class FindParticularIndex {
	public static void main(String[] args) {
		
		String s1 = "GreensTechnology";
		int a1 = s1.lastIndexOf('o');
		System.out.println(a1);
		
		String s2 = "Selenium Automation Tool";
		int a2 = s2.indexOf('o');
		System.out.println(a2);
		
		String s3 = "Velmurugan";
		int a3 = s3.indexOf('n');
		System.out.println(a3);
		
		String s4 = "j a v a p r o g r a m";
		int a4 = s4.lastIndexOf(' ');
		System.out.println(a4);
		
		String s5 = "9940015190";
		int a5 = s5.indexOf('5');
		System.out.println(a5);
	}

}
