# Machine Problem Repository

## Method Definition

| Method | `String reverse(String str)` |
|---|---|
| Returns | `String` |
| Parameter/s | `String str` | 
| Description | Reverses a string. | 

Creates a `char[]` with the length of input string. Using a `for` loop,
it iterates through the input string (starting from the end) and 
assigns the respective character to the new `char[]`. The `char[]` 
is then converted and returned as a `String` using the `String()` 
constructor.

```java
public static String reverse(String str) {
		char[] reversed = new char[str.length()];

		for (int i = 0; i < str.length(); i++) {
			reversed[str.length() - 1 - i] = str.charAt(i);
		}

		return new String(reversed);
	}
```

| Method | `boolean isPalindrome(String str)` |
|---|---|
| Returns | `boolean` |
| Parameter/s | `String str` | 
| Description | Checks whether the input string is a palindrome. | 

! TODO !
[ ] add input normalization in method

| Method | `boolean isAnagram(String str1, String str2)` |
|---|---|
| Returns | `boolean` |
| Parameter/s | `String str1`, `String str2` | 
| Description | Checks whether two strings are anagrams. | 

Before checking if they are anagrams, the input strings are 
cleaned using a private method `clean()` by removing spaces and symbols. 

After cleaning the inputs, both strings are converted into `char[]` 
and sorted. If the sorted arrays are equal, the input strings must 
be anagrams of each other.

```java
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
```
