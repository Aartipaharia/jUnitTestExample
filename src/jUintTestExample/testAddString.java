package jUintTestExample;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		jUnitTesting junit = new jUnitTesting();
		String result = junit.addString("blue", "whale");
		assertEquals("bluewhale",result);
	}

}
