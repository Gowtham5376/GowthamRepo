package org.test;

public class Task2 {
	public static void main(String[] args) {
		
	
	
	String S= "Java";
	System.out.println(S);
	
	int a = System.identityHashCode(S);
	System.out.println(a);
	
	String S1= "Java";
	System.out.println(S1);
	int b = System.identityHashCode(S1);
	System.out.println(b);
	
	
	String S2="Welcome";
	System.out.println(S2);
	
	int c = System.identityHashCode(S2);
	System.out.println(c);
		
	}
     
}
	




