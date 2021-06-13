package org.studyeasy;

import java.util.Scanner;

public class shape extends Area {

	public static void main(String[] args) {
		
		shape circle = new shape();
		circle.Area1(l);
		shape rectangle= new shape();
		rectangle.Area(12,2);
		shape square= new shape();
		square.Area(12);
		shape cylinder= new shape();
		cylinder.Area(12, 33, 23);
		
		
		System.out.println("Enter value of length:");
		
		java.util.Scanner myObj = new Scanner(System.in);
		int l = myObj.nextInt(); 
		
		System.out.println(circle.Area1(l));
		System.out.println(	rectangle.Area(l,2));
		System.out.println(square.Area(l));
		System.out.println(cylinder.Area(l, 33, 23));
		
	}

}
