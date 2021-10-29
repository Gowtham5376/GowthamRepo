package org.test;

public class Task1 extends methodoverload{
	public  int empinfo1(int id , String name) {
		return id;
	

	}
	public int empinfo2(int id , String name) {
		return id;
	}
	public static void main(String[] args) {
	Task1 m = new Task1();
		int empinfo = m.empinfo1(123, "sustoi");
		System.out.println(empinfo);
	}
	
	
	
}
