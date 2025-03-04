import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static String sortString(String str) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        Arrays.sort(charArray); // Sort the character array
        return new String(charArray); // Convert sorted array back to string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String sortedString = sortString(input);
        System.out.println("String in alphabetical order: " + sortedString);

        scanner.close();
    }
}
