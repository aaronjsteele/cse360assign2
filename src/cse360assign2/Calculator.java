/*
 * Author: Aaron Steele
 * Class ID: 554
 * Assignment #: 2
 *
 * Contains the class definition for a class named
 * Calculator, which allows a user to create a Calculator
 * with basic mathematical operations.
 */

package cse360assign2;

/**
 * A Calculator class which allows a user to create an object which
 * can keep a running total and apply various operations on the total,
 * with results and inputs as integers.  This calculator allows one to
 * add, subtract, multiply, divide, get the total, and return the history
 * of inputs.
 */
public class Calculator {

	private int total;

	/**
	 * A constructor for the Calculator class which sets the initial value
	 * of 'total', the total from the calculator, to 0.
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}

	/**
	 * Returns the current total of the Calculator object.
	 *
	 * @return the current total in the Calculator
	 */
	public int getTotal () {
		return 0;
	}

	/**
	 * Adds an integer to the current value in the Calculator.
	 *
	 * @param value the integer to be added
	 */
	public void add (int value) {
		
	}

	/**
	 * Subtracts an integer value from the Calculator.
	 *
	 * @param value the integer to be subtracted
	 */
	public void subtract (int value) {
		
	}

	/**
	 * Multiplies the current Calculator total by an integer.
	 *
	 * @param value the value that multiplies the total
	 */
	public void multiply (int value) {
		
	}

	/**
	 * Divides the Calculator total by an integer value.
	 *
	 * @param value the value that divides the current total
	 */
	public void divide (int value) {
		
	}

	/**
	 * Returns the history of inputs run on the calculator
	 *
	 * @return the string of a list of Calculator operations
	 */
	public String getHistory () {
		return "";
	}
}
