/**
 * Name: Vuong Do
 * Class ID: CSE360
 * Assignment #: 2
 * 
 * Contains AddingMachineTest class
 */
package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * AddingMachineTest Class tests
 * using Junit
 * 
 * @author Vuong Do
 *
 */
class AddingMachineTest {
	
	@Test
	void testAdd() {
		AddingMachine newMachine = new AddingMachine();
		newMachine.add(1);
		
		assertEquals(newMachine.getTotal(), 1);
	}
	
	@Test
	void testSubtract() {
		AddingMachine newMachine = new AddingMachine();
		newMachine.subtract(100);
		
		assertEquals(newMachine.getTotal(), -100);
	}

	@Test
	void testToString() {
		AddingMachine newMachine = new AddingMachine();
		newMachine.add(1);
		newMachine.subtract(2);
		
		assertEquals(newMachine.toString(), "0 + 1 - 2");
	}

}
