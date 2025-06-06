public class Main
{
	public static void main(String[] args) {
		int[] arr={2,3,4,5,6};
		int[] temp=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++){
		    temp[j++]=arr[i];
		}
		for(int i:temp){
		    System.out.println(i);
		}
	}
}

-----------------------------------------------------------------------------
public class Main
{
	public static void main(String[] args) {
		int[] arr={2,3,4,5,6};
		int[] temp=new int[arr.length];
		temp=arr;
		for(int val:temp){
		    System.out.println(val);
		}
	}
}
