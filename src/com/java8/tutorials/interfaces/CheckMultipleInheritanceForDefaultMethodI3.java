package com.java8.tutorials.interfaces;

public interface CheckMultipleInheritanceForDefaultMethodI3 extends CheckMultipleInheritanceForDefaultMethodI1,CheckMultipleInheritanceForDefaultMethodI2 {
	
	public default void print() {
		System.out.println("I3 : print");
	}
	
}
