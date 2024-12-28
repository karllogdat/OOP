import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("String Manipulation Toolkit");
		System.out.println("====================================================");
		System.out.println("To use the tool, enter a valid choice between 1-10.");
		System.out.println("Then you will be prompted to enter 3 sentences, each");
		System.out.println("sentence is separated by a newline.");
		System.out.println("====================================================");

		System.out.print("");
		System.out.println("Enter choice between 1-10: ");
		System.out.println("    [1] : String Reversal");
		System.out.println("    [2] : Palindrome Checker");
		System.out.println("    [3] : Anagram Checker");
		System.out.println("    [4] : Word Count");
		System.out.println("    [5] : Character Count");
		System.out.println("    [6] : Substring Finder");
		System.out.println("    [7] : Lower Case Converter");
		System.out.println("    [8] : Upper Case Converter");
		System.out.println("    [9] : Vowel Remover");
		System.out.println("    [10]: Consonant Remover");

		System.out.print("");
		System.out.print("CHOICE   >> ");
		int iChoice = console.nextInt();
		console.nextLine();
		System.out.print("");

		System.out.print("ENTER STRING >> ");
		String userSentences = console.nextLine();
		System.out.print("");

		switch (iChoice) {
			case 1:
				System.out.println("REVERSED >> " + StringToolkit.reverse(userSentences));
				break;

			case 2: 
				System.out.println("IS PALINDROME? >> " + StringToolkit.isPalindrome(userSentences));
				break;

			case 3: 
				System.out.print("ENTER STRING TO COMPARE TO >> ");
				String compareAgainst = console.nextLine();
				System.out.println("Comparing against \"" + compareAgainst + "\"");
				System.out.println("IS ANAGRAM? >> " + StringToolkit.isAnagram(userSentences, compareAgainst));
				break;

			case 4: 
				System.out.println("WORD COUNT >> " + StringToolkit.wordCount(userSentences));
				break;
				
			case 5:
				System.out.println("CHAR COUNT >> " + StringToolkit.characterCount(userSentences));
				break;

			case 6: 
				// TODO: fix substringFinder()
				// substringFinder() has problems, 
				// try str = "this this this this"
				// try substr = "this"
				// expected output: 0, 5, 10, 15
				// actual output  : 0, 5, 10
				System.out.print("ENTER SUBSTRING >> ");
				String substr = console.nextLine();
				System.out.println("Substring \"" + substr + "\" is found at indexes: ");
				for (int index : StringToolkit.substringFinder(userSentences, substr)) {
					System.out.println("    [" + index + "]");
				}
				break;

			case 7:
				System.out.println("LOWERCASED >> " + StringToolkit.toLowerCase(userSentences));
				break;

                        case 8:
				System.out.println("UPPERCASED >> " + StringToolkit.toUpperCase(userSentences));
				break;

			case 9:
				System.out.println("NO VOWELS >> " + StringToolkit.removeVowels(userSentences));
				break;

			case 10:
				System.out.println("NO CONSONANTS >> " + StringToolkit.removeConsonants(userSentences));
				break;

			default: 
				System.out.println("Invalid choice: " + iChoice);
				break;
		}

		console.close();
	}
}
