package com.java8.tutorials.interfaces;

public interface CheckCannotPutObjectClassMethodInInterface {
	
	default Object clone() throws CloneNotSupportedException {
		
		return "String Object";
	}

}
