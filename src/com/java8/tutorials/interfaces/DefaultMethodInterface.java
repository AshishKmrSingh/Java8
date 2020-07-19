package com.java8.tutorials.interfaces;

public interface DefaultMethodInterface {
	
	default void myMethod(String arg) {
		System.out.println("Default Method in interface");
	}
}
