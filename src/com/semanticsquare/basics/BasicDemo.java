package com.semanticsquare.basics;

public class BasicDemo {
	/*static void print(){
		System.out.println("Hello, my name is Youkti!");
	}
	
	static void primitives(){
		System.out.println("\n\nHi");
		int intHex = 0x00476899;
		System.out.println(intHex);
		char charInt = 65;
		System.out.println(charInt);
		int intchar = 'A';
		System.out.println(intchar);
	}
	static void array(){
		int[] scores = new int[4];
		scores[0] = 90;
		scores[1] = 40;
		scores[2] = 80; 
		scores[3] = 100;
		//int[] scores =  new int[] {90, 40, 80, 100};
		int[] scores =  {90, 40, 80, 100};
		System.out.println("Score 1: " + scores[0]);
		System.out.println("Score 2: " + scores[1]);
		System.out.println("Score 3: " + scores[2]);
		System.out.println("Score 4: " + scores[3]);
		
		Student[] students = new Student[2];
		students[0] = new Student();
		students[1] = new Student();
		students[0].name = "John";
		students[1].name = "Raj";
		System.out.println("Student 1: " + students[0].name);
		System.out.println("Student 1: " + students[1].name);
	}
	static double sum(double x, double y) {
		return x + y;
	}
	static double avg(double x, double y) {
		double sum = sum(x, y);
		return sum/2;
	}*/
	public void foo() {
		System.out.println("\nPrint this line...");
	}
	public static void main(String[] arg) {
		//print();
		//primitives();
		//array();
		//double d = sum(2.0, 3.0);
		//System.out.println(d);
		//double d2 = avg(2.0, 3.0);
		//System.out.println(d2);
		
		int x = 30;
		if(x >20){
			x = x + 1;
			} else {
				x = x - 1;
			}
		System.out.println(x);
	}
	
}