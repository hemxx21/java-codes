import java.util.*;
public class Main
{
    static int second(int[] num){
        int len=num.length;
        Arrays.sort(num);
        for(int i=len-2;i<len;i--){
            if(num[i]!=num[i-1]){
                return num[i];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements in array: ");
		int n=sc.nextInt();
		int[] num=new int[n];
		for(int i=0;i<n;i++){
		    System.out.println("enter the elements: ");
		    int a=sc.nextInt();
		    num[i]=a;
		}
		int res=second(num);
		System.out.println(res);
	}
}
