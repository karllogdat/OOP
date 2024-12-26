import java.util.Scanner;

public class Main {
	static String[] getUserSentences(Scanner scanner) {
		String[] sentences = new String[3];

		for (int i = 0; i < 3; i++) {
			System.out.print("SENTENCE >> ");
			sentences[i] = scanner.nextLine();
		}

		return sentences;
	}

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

		String[] userSentences = getUserSentences(console);
		System.out.print("");

		switch (iChoice) {
			case 1:
				for (String sentence : userSentences) {
					System.out.println("REVERSED: " + StringToolkit.reverse(sentence));
				}
				break;

			case 2: 
				break;

			default: 
				System.out.println("Invalid choice: " + iChoice);
				break;
		}

		console.close();
	}
}
