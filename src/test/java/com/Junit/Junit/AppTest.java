package com.Junit.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class removeatest {
	/*
	 * ABCD => BCD
	 * AACD => CD
	 * BACD=>BCD
	 * BBAA =>BBAA
	 *  AABAA => BAA
	 */
	static removeA ra = new removeA();
	@Test
	void test1() {
		
		String actual = ra.rem("ABCD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test2() {
		
		String actual = ra.rem("AACD");
		assertEquals("CD",actual);		
	}
	@Test
	void test3() {
		
		String actual = ra.rem("BACD");
		assertEquals("BCD",actual);		
	}
	@Test
	void test4() {
		
		String actual = ra.rem("BBAA");
		assertEquals("BBAA",actual);		
	}
	@Test
	void test5() {
		
		String actual = ra.rem("AABAA");
		assertEquals("BAA",actual);		
	}

}