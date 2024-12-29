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

First cleans the string using `clean()`. 
Next, the `startIndex`, `endIndex`, and `mid` is obtained, and the string is looped over and compares the characters in the `startIndex` and `endIndex` until the middle.
The `startIndex` and `endIndex` is incremented and decremented respectively.

```java
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
```

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

| Method | `int wordCount(String str)` | 
| --- | --- |
| Returns | `int` |
| Parameter\s | `String str` |
| Description | Counts all the words in a given string |

Words, in this context, are tokens which are separated by whitespaces. 

The method splits the input string `str` using the whitespace delimiter `" "` and returns the resulting array length. 

```java
public static int wordCount(String str) {
		return str.split(" ").length;
	}
```

| Method | `int characterCount(String str)` |
| --- | --- |
| Returns | `int` |
| Parameter\s | `String str` | 
| Description | Counts all characters in the given string | 

All whitespace characters are removed using the `String` class' built-in replace all method.
Whitespaces include `" "`, `\t` and `\n`.

```java
public static int characterCount(String str) {
		return str.replaceAll("\\s", "").length();
	}
```

| Method | `int[] substringFinder(String str)` |
| --- | --- |
| Returns | `int[]` |
| Parameter/s | `String str`, `String substr` |
| Description | Locates the indexes where the `substr` is found in the `str`. Returns the indexes as an integers array. | 

The method utilizes a dynamic array class  of type integer `ArrayList<Integer>`, 
since the number of occurences is unknown.

Using a `for` loop, the method iterates over the `str` and checks the substring at the current index. 
If the substring is equal to `substr`, the current index is added to the dynamic array.

Lastly, the dynamic array is converted to a static array using a for loop.

```java
public static int[] substringFinder(String str, String substr) {
		ArrayList<Integer> indexes = new ArrayList<>();

		for (int i = 0; i < str.length() - substr.length() + 1; i++) {
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
```

| Method | `String toLowerCase(String str)` |
| --- | --- | 
| Returns | `String` | 
| Parameter/s | `String str` | 
| Description | Converts a given string to all lowercase characters | 

The method utilizes the `String` class' built-in `toLowerCase()` method.

```java
public static String toLowerCase(String str) {
		return str.toLowerCase();
	}
```

| Method | `String toUpperCase(String str)` |
| --- | --- | 
| Returns | `String` | 
| Parameter/s | `String str` | 
| Description | Converts a given string to all uppercase characters | 

The method utilizes the `String` class' built-in `toUpperCase()` method.

```java
public static String toUpperCase(String str) {
		return str.toUpperCase();
	}
```
