import java.util.*;
public class Main
{
    static int single(int[] arr, int n){
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        while(sum>9){
            int temp=sum;
            sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array:");
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++){
		    System.out.print("enter the elements of array:");
		    int num=sc.nextInt();
		    arr[i]=num;
		}
		int res=single(arr,n);
		System.out.println(res);
    }
}
