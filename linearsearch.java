import java.util.Scanner;
public class Main
{
    static void linear(int n,int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                System.out.println("element found at index"+i);
                return;
            }
            
        }
        System.out.println("element not found");
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] nums={12,3,2,22,4,44,5,55,67};
		System.out.println("enter num to find its index");
		int n=sc.nextInt();
		linear(n,nums);
	}
}
