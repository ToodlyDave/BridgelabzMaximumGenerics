package com.generics;

import java.util.Scanner;

public class MaximumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Maximum obj = new Maximum();
		
		System.out.print(" Please enter the first value: ");
		String first = scan.next();
		
		System.out.print(" Please enter the second value: ");
		String second = scan.next();
		
		System.out.print(" Please enter the third value: ");
		String third = scan.next();
		
		obj.findMaxString(first, second, third);
		
		scan.close();
	}

}
