package com.demo.basics;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int fact=1;
		int num=4;
		for(i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println("factorial of "+num+" is " +fact);

	}

}
