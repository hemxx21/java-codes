import java.util.*;

public class Main {
    static int third(int[] num) {
        int len = num.length;
        Arrays.sort(num); 

        int count = 1; 
        int last = num[len - 1]; // Start from the largest

        for (int i = len - 2; i >= 0; i--) {
            if (num[i] != last) {
                count++;
                last = num[i];
                if (count == 3) {
                    return num[i]; 
                }
            }
        }

        return num[len - 1]; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the element: ");
            num[i] = sc.nextInt();
        }

        int res = third(num);
        System.out.println("Third largest (or largest if not available): " + res);
    }
}
