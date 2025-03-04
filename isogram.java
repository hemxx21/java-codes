import java.util.Scanner;

public class IsogramCheck {
    public static boolean isIsogram(String str) {
        str = str.toLowerCase(); // Convert to lowercase to handle case sensitivity

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false; // If any letter repeats, it's not an isogram
                }
            }
        }
        return true; // No letter repeats
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isIsogram(word)) {
            System.out.println(word + " is an isogram.");
        } else {
            System.out.println(word + " is NOT an isogram.");
        }

        scanner.close();
    }
}
