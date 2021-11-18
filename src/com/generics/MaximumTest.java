package com.generics;

import java.util.Scanner;

public class MaximumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Maximum obj = new Maximum();
		
		System.out.print(" Please enter the first value: ");
		int first = scan.nextInt();
		
		System.out.print(" Please enter the second value: ");
		int second = scan.nextInt();
		
		System.out.print(" Please enter the third value: ");
		int third = scan.nextInt();
		
		obj.findMax(first, second, third);
		
		scan.close();
	}

}
