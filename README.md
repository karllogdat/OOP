# Machine Problem Repository

## Method Definition

`reverse(String str)`

| | |
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
