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
	private String history;

	/**
	 * A constructor for the Calculator class which sets the initial value
	 * of 'total', the total from the calculator, to 0.  Also sets a string containing
	 * the operation history to "0".
	 */
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}

	/**
	 * Returns the current total of the Calculator object.
	 *
	 * @return the current total in the Calculator
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Adds an integer to the current value in the Calculator.
	 * Also adds the operation to the Calculator history.
	 *
	 * @param value the integer to be added
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}

	/**
	 * Subtracts an integer value from the Calculator.
	 * Also adds the operation to the Calculator history.
	 *
	 * @param value the integer to be subtracted
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}

	/**
	 * Multiplies the current Calculator total by an integer.
	 * Also adds the operation to the Calculator history.
	 *
	 * @param value the value that multiplies the total
	 */
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}

	/**
	 * Divides the Calculator total by an integer value.  If dividing
	 * by 0, the total is set to 0.  Adds the operation to the history
	 * as well.
	 *
	 * @param value the value that divides the current total
	 */
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total /= value;
		history += " / " + value;
	}

	/**
	 * Returns the history of inputs run on the calculator.
	 *
	 * @return the string of a list of Calculator operations
	 */
	public String getHistory () {
		return history;
	}
}
