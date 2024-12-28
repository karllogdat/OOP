import java.util.ArrayList;
import java.util.Arrays;

public class StringToolkit {
	/**
	 * Converts a string to lowercase, trims extra whitespace, and removes
	 * unnecessary symbols
	 *
	 * @param str string to convert
	 * @return normalized string
	 */
	private static String clean(String str) {
		str = str.toLowerCase();
		str = str.trim();
		str = str.replaceAll("[^a-zA-Z0-9]", "");

		return str;
	}

	/**
	 * Reverses a string
	 * 
	 * @param str string to reverse
	 * @return reversed string
	 */
	public static String reverse(String str) {
		char[] reversed = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			reversed[str.length() - 1 - i] = str.charAt(i);
		}

		return new String(reversed);
	}

	/**
	 * Checks whether a given string is a palindrome
	 * 
	 * @param str string to check
	 */
	public static boolean isPalindrome(String str) {
		if (str == null || str.isEmpty()) {
			return false;
		}

		str = clean(str);

		int mid = str.length() / 2;
		int startIndex = 0;
		int endIndex = str.length() - 1;

		while (startIndex <= mid) {
			if (str.charAt(startIndex) != str.charAt(endIndex)) {
				return false;
			}

			startIndex++;
			endIndex--;
		}

		return true;
	}

	/**
	 * Checks whether or not two strings are anagrams.
	 * <p>
	 * Before checking, the two strings are normalized using the `clean()` method.
	 * Extra symbols and whitespaces are ignored and both strings are converted
	 * to lowercase.
	 *
	 * @param str1 first string
	 * @param str2 second string
	 */
	public static boolean isAnagram(String str1, String str2) {
		str1 = clean(str1);
		str2 = clean(str2);

		if (str1.length() != str2.length()) {
			return false;
		}

		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();

		Arrays.sort(str1Array);
		Arrays.sort(str2Array);

		if (Arrays.equals(str1Array, str2Array)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Counts all the words in the given string 
	 *
	 * @param str string to count all words
	 * @return word count
	 */
	public static int wordCount(String str) {
		return str.split(" ").length;
	}

	/**
	 * Counts all characters in the given string
	 * <p>
	 * Whitespaces do not count as characters and as such replaced.
	 *
	 * @param str string to count all characters
	 * @return character count
	 */
	public static int characterCount(String str) {
		return str.replaceAll("\\s", "").length();
	}

	public static int[] substringFinder(String str, String substr) {
		ArrayList<Integer> indexes = new ArrayList<>();

		for (int i = 0; i < str.length() - substr.length(); i++) {
			if (substr.equals(str.substring(i, i+substr.length()))) {
				indexes.add(i);
			}
		}

		int indexes_arr[] = new int[indexes.size()];
		for (int i = 0; i < indexes.size(); i++) {
			indexes_arr[i] = indexes.get(i);
		}

		return indexes_arr;
	}

	/**
	 * Converts a string to lowercase using the built-in toLowerCase() method
	 *
	 * @param str string to convert
	 * @return lowercase string 
	 */
	public static String toLowerCase(String str) {
		return str.toLowerCase();
	}

        /**
	 * Converts a string to uppercase using the built-in toUpperCase() method
	 *
	 * @param str string to convert
	 * @return uppercase string 
	 */
	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}

	/**
	 * Remove all vowels in given string 
	 *
	 * @param str target strings 
	 * @return string with removed vowels 
	 */
	public static String removeVowels(String str) {
		return str.replaceAll("[aeiouAEIOU]", "");
	}

	/**
	 * Remove all consonants in given string 
	 *
	 * @param str target string 
	 * @return string with removed consonants 
	 */
	public static String removeConsonants(String str) {
		return str.replaceAll(
				"[bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ]",
				""
				);
	}
}
