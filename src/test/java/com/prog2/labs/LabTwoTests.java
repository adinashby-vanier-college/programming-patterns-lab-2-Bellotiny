
package com.prog2.labs;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

/**
 * DO NOT MODIFY ANYTHING IN THIS FILE.
 */
class LabTwoTests {

	@Test
	void averageValueTest1() {
		List<Integer> list = Arrays.asList(5, 10, 15, 20);
		
		assertEquals(12.5, LabTwo.averageValue(list));
	}
	
	@Test
	void convertToUpperCaseTest1() {
		List<String> list = Arrays.asList("hellO", "jAmes");
		
		Object[] actual = (Object[]) LabTwo.convertToUpperCase(list).toArray();
		Object[] expected = {"HELLO", "JAMES"};
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void filterStringsTest1() {
		List<String> list = Arrays.asList("geORGE", "aQW", "aPP", "fRR");
		
		Object[] actual = (Object[]) LabTwo.filterStrings(list).toArray();
		Object[] expected = {"aQW", "aPP"};
		
		
		assertArrayEquals(expected, actual);
	}
	
	@Test
	void commaSeparatedStringsTest1() {
		List<Integer> list = Arrays.asList(3, 44, 59, 99, 6);
		
		String actual = LabTwo.commaSeparatedStrings(list);
		String expected = "o3,e44,o59,o99,e6";
		
		
		assertEquals(expected, actual);
	}
	
}
