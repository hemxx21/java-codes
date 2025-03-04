import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; // Example array
        System.out.println("Original array: " + Arrays.toString(arr));

        // Reverse the array
        int left = 0, right = arr.length - 1;
        while (left < right) {
            // Swap elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        System.out.println("Reversed array: " + Arrays.toString(arr));
    }
}
