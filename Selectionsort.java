public class Main {
    static void selection(int n, int[] nums) {
        int min;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j; // Find the index of the minimum element
                }
            }
            // Swap only after finding the minimum in the inner loop
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 12, 56, 6, 34, 99, 102, 32};
        selection(nums.length, nums); // Pass correct length
        for (int a : nums) {
            System.out.print(a + " ");
        }
    }
}
