package org.cts.stringexercises;

//check the given two input string is equals or not 

public class CheckEquality {
	public static void main(String[] args) {
			String s1 = "Java";
			String s2 = "Java";
			boolean b = s1.equals(s2);
			System.out.println(b);
			
			String s3 = "Java";
			String s4 = "java";
			boolean c = s3.equals(s4);
			System.out.println(c);
			
			String s5 = "Green Technology";
			String s6 = "GreenTechnology";
			boolean d = s5.equals(s6);
			System.out.println(d);
			
			String s7 = "Anand";
			String s8 = "anand";
			boolean e = s7.equalsIgnoreCase(s8);
			System.out.println(e);
			
	}

}
