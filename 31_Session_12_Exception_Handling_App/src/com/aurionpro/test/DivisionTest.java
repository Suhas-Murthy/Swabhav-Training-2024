package com.aurionpro.test;

public class DivisionTest {
	public static void main(String[] args) {

		try {
			int number1 = Integer.parseInt(args[0]);
			int number2 = Integer.parseInt(args[1]);
			double result = number1 / number2;

			System.out.println("Division : " + result);
		} catch (ArithmeticException exception) {
			System.out.println("Wrong Input for Number 2. It cannot be zero.");

		} catch (IndexOutOfBoundsException exception) {
			System.out.println("Please provide two numbers. Number cannot be  empty");
		} catch (NumberFormatException exception) {
			System.out.println("Only Integer values are allowed	");
		} catch (Exception exception) {
			System.out.println("Something went wrong" + exception);
		}finally {
			System.out.println("Inside Finally. Closing Activities");
		}
		System.out.println("End of Main");
	}
}
