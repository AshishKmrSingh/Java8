package com.java8.tutorials.classes;

import com.java8.tutorials.interfaces.CheckMultipleInheritanceForDefaultMethodI1;
import com.java8.tutorials.interfaces.CheckMultipleInheritanceForDefaultMethodI2;
import com.java8.tutorials.interfaces.CheckMultipleInheritanceForDefaultMethodI3;

public class CheckMultipleInheritanceForDefaultMethodClass implements CheckMultipleInheritanceForDefaultMethodI3
		//implements CheckMultipleInheritanceForDefaultMethodI1, CheckMultipleInheritanceForDefaultMethodI2, CheckMultipleInheritanceForDefaultMethodI3 {
{
	public static void main(String[] args) {
		/*
		 * CheckMultipleInheritanceForDefaultMethodClass obj = new
		 * CheckMultipleInheritanceForDefaultMethodClass(); obj.print();
		 */
		
		CheckMultipleInheritanceForDefaultMethodI1 objI3 = new CheckMultipleInheritanceForDefaultMethodClass(); 
		objI3.print();
		
		/*
		 * CheckMultipleInheritanceForDefaultMethodI1 objI1 = new
		 * CheckMultipleInheritanceForDefaultMethodClass(); objI1.print();
		 * CheckMultipleInheritanceForDefaultMethodI2 objI2 = new
		 * CheckMultipleInheritanceForDefaultMethodClass(); objI2.print();
		 */
	}

	@Override
	public void print() {
		//CheckMultipleInheritanceForDefaultMethodI1.super.print();
		//CheckMultipleInheritanceForDefaultMethodI2.super.print();
		CheckMultipleInheritanceForDefaultMethodI3.super.print();
	}
	
	/*
	 * @Override public void print() { System.out.println("Class: print"); }
	 */

}
