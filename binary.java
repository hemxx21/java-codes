import java.util.Scanner;
public class Main
{
    static int binary(int left,int right,int n,int[] nums){
        if(left<=right)
        {
            int mid=left+(right-left)/2;
            if(n==nums[mid])
            return mid;
            else if(n>nums[mid])
            return binary(mid+1,right,n,nums);
            else
            return binary(0,mid-1,n,nums);
        }
        return 200;
        
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums={12,14,15,17,22,23,27,29,34,35};
		System.out.println("enter num to find its index");
		int n=sc.nextInt();
		int res=binary(0,9,n,nums);
		if(res!=200)
		System.out.println("element found at:"+res);
		else
		System.out.println("element not found");

	}
}
