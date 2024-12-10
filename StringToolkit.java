import java.util.Arrays;

public class StringToolkit {
	public static String reverse(String str) {
		char[] reversed = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			reversed[str.length() - 1 - i] = str.charAt(i);
		}

		return new String(reversed);
	}

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

	public static boolean isAnagram(String str1, String str2) {
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
}
