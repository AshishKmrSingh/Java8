package com.java8.tutorials.classes;

import com.java8.tutorials.interfaces.DefaultMethodInterface;

/**
 * @author Ashish Kumar Singh
 *
 */
public class DefaultMethodTutorial implements DefaultMethodInterface {

	public static void main(String[] args) {
		System.out.println("Executing DefaultMethodTutorial class");
		DefaultMethodInterface obj = new DefaultMethodTutorial();
		obj.myMethod("Hey");
	}
	
	/*
	 * public void myMethod(String arg) {
	 * System.out.println("Default Method in class"); }
	 */

}
