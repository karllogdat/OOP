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
		str = str.replaceAll("[a-zA-Z0-9]", "");

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

	public static String toLowerCase(String str) {
		return str.toLowerCase();
	}

	public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
}
