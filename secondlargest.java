import java.util.Scanner;

public class SecondLargestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Get the array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Initialize variables to store largest and second largest values
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int num : numbers) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        // Print the result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }

        scanner.close();
    }
}
