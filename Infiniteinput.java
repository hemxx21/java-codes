import.java.util.Scanner;
public class Infiniteinput{
  public static void main(String[] args){
    int sum=0;
    Scanner scanner = new scanner(System.in);
    for (int i=0;i>0;i++){
      System.out.println("enter number:");
      int sc=scanner.nextInt();
      if (sc==0){
        break;
      }
      else{
        sum=sum+sc;
      }
    }
  }
}
