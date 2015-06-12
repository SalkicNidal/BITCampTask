package ba.bitcamp.exercise;

import java.util.Arrays;

public class Faculty {
   
	String name;
	String [] departments;
	Boolean isBologna;
	
	
	@Override
	public String toString() {
		
		String s = "Name:" + name + "\n";
		s = s + "Bologna?" + isBologna + "\n";
		s = s + Arrays.toString(departments);
		
		return s;
	}
	
}
