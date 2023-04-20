package calc;

import java.util.Scanner;
public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;  
	}
	
	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		Calculator calc=new Calculator();
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the 1st number:");
		int num1 = scan.nextInt();
		
		System.out.println("Input the 2nd number:");
		int num2 = scan.nextInt();
		
		scan.close();
		System.out.println("sum is : " +calc.sum(num1, num2));
		System.out.println("minus is : " +calc.minus(num1, num2));
		System.out.println("Division is : " +calc.divide(num1, num2));
		System.out.println("multiplication is : " +calc.multiply(num1, num2));
	}
}