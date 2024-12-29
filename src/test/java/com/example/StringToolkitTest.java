package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToolkitTest {
	@Test
	void testReverseEmpty() {
		assertEquals(StringToolkit.reverse(""), "");
	}

	@Test 
	void testReverse() {
		assertEquals(StringToolkit.reverse("reverse this"), "siht esrever");
	}
}
