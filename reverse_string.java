import java.util.*;
public class Main {
    static String reverse(String s) {
        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String res = reverse(s);
        System.out.println(res);
    }
}
