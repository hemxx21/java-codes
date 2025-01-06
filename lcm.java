import java.util.Scanner;
public class lcm
{
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter number 1:");
        int num1=num.nextInt();
        System.out.println("Enter number 2:");
        int num2=num.nextInt();
        int big=num1>num2?num1:num2;
        int lcm=big;
        while(true){
            if(lcm%num1==0 && lcm%num2==0){
                System.out.println("lcm:"+lcm);
                break;}
            else{
                lcm=lcm+big;
            }
        
}
}
}
