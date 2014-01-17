package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import src.*;

public class TestSomme {

	@Test
	public void testAdditionne() {
		sommable s = new somme();
		assertTrue(s.additionne(3,2)==5);
		
	}

}
