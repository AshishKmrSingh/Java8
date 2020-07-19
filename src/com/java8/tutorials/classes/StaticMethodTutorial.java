package com.java8.tutorials.classes;

import com.java8.tutorials.interfaces.StaticMethodInterface;

/**
 * @author Ashish Kumar Singh
 *
 */
public class StaticMethodTutorial implements StaticMethodInterface {
	
	public static void main(String[] args) {
		System.out.println("Executing StaticMethodTutorial class");
		StaticMethodInterface.myMethod("Hey");
	}
}
