import java.util.Scanner;

public class Main {
	private static int getUserInput() {
		Scanner console = new Scanner(System.in);
		int input = -1;

		System.out.println("Enter an option between 1-10");
		while (input == -1) {
			input = console.nextInt();

			if (input >= 1 && input <= 10) {
				break;
			} else {
				System.out.println("Please enter a valid option (1-10)");
				input = -1;
			}
		}

		console.close();
		return input;
	}

	private static void processUserInput(int input) {

	}

	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);

		String input = console.nextLine();
		String input2 = console.nextLine();

		System.out.println(StringToolkit.reverse(input));
		System.out.println(StringToolkit.isPalindrome(input));
		System.out.println(StringToolkit.isAnagram(input, input2));
		System.out.println(StringToolkit.toLowerCase(input));
		System.out.println(StringToolkit.toUpperCase(input2));

		console.close();
	}
}
