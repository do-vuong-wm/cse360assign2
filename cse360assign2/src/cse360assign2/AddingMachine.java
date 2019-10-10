/**
 * Name: Vuong Do
 * Class ID: CSE360
 * Assignment #: 2
 * 
 * Contains AddingMachine class
 */
package cse360assign2;

import java.util.*;

/**
 * AddingMachine Class
 * Has methods to add and subtract to a total,
 * total can be shown with getTotal method.
 * Keep the transactions stored and can be shown by toString,
 * can clear transactions by clear method.
 * 
 * @author Vuong Do
 *
 */
public class AddingMachine {

	private int total;
	private LinkedList<String> transactionList = new LinkedList<String>();
	
	/**
	 * Default constructor,
	 * initializes total
	 * 
	 */
	public AddingMachine () {
		
		total = 0;  // not needed - included for clarity
		
		transactionList.push("0");
		
	}
	
	/**
	 * Returns the total
	 * 
	 * @return the total
	 */
	public int getTotal () {
		
		return total;
		
	}
	
	/**
	 * Add the value given to total
	 * 
	 * @param value the value to add to total
	 */
	public void add (int value) {
		
		total += value;
		
		transactionList.push("+");
		transactionList.push(String.valueOf(value));
		
	}
	
	/**
	 * Subtract the value given from total
	 * 
	 * @param value the value to subtract from total
	 */
	public void subtract (int value) {
		
		total -= value;
		
		transactionList.push("-");
		transactionList.push(String.valueOf(value));
		
	}
	
	/**
	 * Returns the string representation of the transactions
	 * 
	 * @return a string representation of the transactions
	 */
	public String toString () {
		
		String transactions = "";
		int sizeOfList = transactionList.size();
		
		for(int i = (sizeOfList-1); i  > -1; i--) {
			
			if(i != 0)
				transactions += transactionList.get(i) + " ";
			else
				transactions += transactionList.get(i);
			
		}
		
		return transactions;
		
	}

	/**
	 * Clears the transactions
	 */
	public void clear() {
		transactionList.clear();
	}
}
