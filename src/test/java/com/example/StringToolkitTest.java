package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StringToolkitTest {
	@Test 
	void testReverse() {
		assertEquals("hello", StringToolkit.reverse("olleh"));
		assertEquals("", StringToolkit.reverse(""));
		assertEquals("f", StringToolkit.reverse("f"));
		assertEquals("racecar", StringToolkit.reverse("racecar"));
	}

	@Test 
	void testIsPalindrome() {
		assertTrue(StringToolkit.isPalindrome("aibohphobia"));
		assertTrue(StringToolkit.isPalindrome(""));
		assertTrue(StringToolkit.isPalindrome("f"));
		assertTrue(StringToolkit.isPalindrome("A man, a plan, a canal: Panama!"));
		assertFalse(StringToolkit.isPalindrome("Hello world!"));
		assertFalse(StringToolkit.isPalindrome("fa"));
	}

	@Test
	void testIsAnagram() {
		assertTrue(StringToolkit.isAnagram("Undertale", "Deltarune"));
		assertFalse(StringToolkit.isAnagram("hello", "world"));

		assertTrue(StringToolkit.isAnagram("", ""));
		assertTrue(StringToolkit.isAnagram("f", "f"));
		assertFalse(StringToolkit.isAnagram("f", "g"));

		assertTrue(StringToolkit.isAnagram("a man, a plan, a canal", "a canal, a man, a plan"));

		assertFalse(StringToolkit.isAnagram("helo", "helooo"));
	}

	@Test
	void testWordCount() {
		assertEquals(4, StringToolkit.wordCount("This has 4 words"));

		assertEquals(0, StringToolkit.wordCount(""));
		assertEquals(1, StringToolkit.wordCount("helloworld"));
		assertEquals(1, StringToolkit.wordCount("hyphenated-word"));
		assertEquals(3, StringToolkit.wordCount("123 word !word"));
	}

	@Test
	void testCharacterCount() {
		assertEquals(0, StringToolkit.characterCount(""));
		assertEquals(1, StringToolkit.characterCount("a"));
		assertEquals(3, StringToolkit.characterCount("aAa"));
		assertEquals(5, StringToolkit.characterCount("hello"));
		assertEquals(10, StringToolkit.characterCount("hello world"));
		assertEquals(1, StringToolkit.characterCount("   a   "));
		assertEquals(3, StringToolkit.characterCount("!@#"));
	}

	@Test 
	void testSubstringFinder() {
		assertArrayEquals(
				new int[]{0, 5, 10},
				StringToolkit.substringFinder("this this this", "this")
				);
		assertArrayEquals(
				new int[]{6},
				StringToolkit.substringFinder("hello world", "world")
				);
		assertArrayEquals(
				new int[]{0, 3, 6},
				StringToolkit.substringFinder("abcabcabc", "abc")
				);

		assertArrayEquals(
				new int[]{},
				StringToolkit.substringFinder("", "empty")
				);
		assertArrayEquals(
				new int[]{0, 1, 2, 3, 4, 5},
				StringToolkit.substringFinder("hello", "")
				);
		assertArrayEquals(
				new int[]{},
				StringToolkit.substringFinder("hello", "helloworld")
				);

		assertArrayEquals(
				new int[]{},
				StringToolkit.substringFinder("This", "this")
				);

	}

	@Test 
	void testToLowerCase() {
		assertEquals("hello", StringToolkit.toLowerCase("HELLO"));
		assertEquals("hello", StringToolkit.toLowerCase("hello"));
		assertEquals("hello", StringToolkit.toLowerCase("HeLlO"));
		assertEquals("", StringToolkit.toLowerCase(""));
		assertEquals("123 !has n#umbers", StringToolkit.toLowerCase("123 !HaS N#umBers"));
		assertEquals("a", StringToolkit.toLowerCase("A"));
		assertEquals("  hello\t", StringToolkit.toLowerCase("  HELLO\t"));
	}

	@Test 
	void testToUpperCase() {
		assertEquals("HELLO", StringToolkit.toUpperCase("HELLO"));
		assertEquals("HELLO", StringToolkit.toUpperCase("hello"));
		assertEquals("HELLO", StringToolkit.toUpperCase("HeLlO"));
		assertEquals("", StringToolkit.toUpperCase(""));
		assertEquals("123 !HAS N#UMBERS", StringToolkit.toUpperCase("123 !HaS N#umBers"));
		assertEquals("A", StringToolkit.toUpperCase("a"));
		assertEquals("  HELLO\t", StringToolkit.toUpperCase("  hello\t"));
	}

	@Test 
	void testRemoveVowels() {
		assertEquals("hlL wrld!", StringToolkit.removeVowels("hElLo wOrld!"));
		assertEquals("", StringToolkit.removeVowels("AEIOUaeiou"));
		assertEquals("rhythm", StringToolkit.removeVowels("rhythm"));
		assertEquals("b", StringToolkit.removeVowels("b"));
		assertEquals("", StringToolkit.removeVowels("a"));
		assertEquals("", StringToolkit.removeVowels(""));
	}

	@Test 
	void testRemoveConsonants() {
		assertEquals("Eo O", StringToolkit.removeConsonants("hEllo wORlD"));
		assertEquals("", StringToolkit.removeConsonants("BcDfG"));
		assertEquals("AeIoU", StringToolkit.removeConsonants("AeIoU"));
		assertEquals("", StringToolkit.removeConsonants("B"));
		assertEquals("a", StringToolkit.removeConsonants("a"));
		assertEquals("", StringToolkit.removeConsonants(""));
	}

}
