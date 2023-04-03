package com.yedam.inter2;

public class InterExample {

	public static void main(String[] args) {
		InterfaceC ic = new Implements();
		ic.methodA();
		ic.methodB();
		ic.methodC();
		
		InterfaceB bc = new Implements();
		bc.methodB();
		
		InterfaceC ac = new Implements();
		ac.methodA();

	}

}
