import java.util.*;
public class Main{
    static void move(int[] num){
        int n=num.length;
        int j=0;
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            if(num[i]!=0){
                temp[j++]=num[i];
            }
            
        }
        while(j<n){
            temp[j++]=0;
        }
        for(int i=0;i<n;i++){
            num[i]=temp[i];
        }
        
    }
    public static void main(String[] args){
        int[] num={87,0,43,0,65,0,2,0,56,78};
        move(num);
        for(int i:num){
            System.out.print(" "+i);
        }
    }
}
