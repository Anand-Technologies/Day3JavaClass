package org.cts.multiple.inheritance;

public class Child implements Parent1 , Parent2 {

	@Override
	public void test2() {
		System.out.println("test 2");	}

	@Override
	public void test3() {
		System.out.println("test 3");
	}

	@Override
	public void test1() {
		System.out.println("test 1");
	}

	@Override
	public void test4() {
		System.out.println("test 4");
	}
		
		public static void main (String [] args) {
			Child ch=new Child();
			ch.test1();
			ch.test2();
			ch.test3();
			ch.test4();
		}
}
