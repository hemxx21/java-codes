import java.util.*;
public class Main {
    static boolean rot(String s, String goal) {
        if(s.length() != goal.length()) {
            return false;
        }
        String a = s + s;
        return a.contains(goal);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String goal=sc.nextLine();
        if(rot(s, goal)) {
            System.out.println("Yes, it is a rotation.");
        } else {
            System.out.println("No, it's not a rotation.");
        }
    }
}
