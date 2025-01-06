public class Secondmaxdigit{
  public static void main(String[] args){
    int a=10;
    int b=23;
    int c=4;
    if (a>b && a>c){
      if (b>c){
        System.out.println("the second largest number is"+b);
      }
      else{
        System.out.println("the second largest number is"+c);
      }
    }
    else if (b>a && b>c){
      if (a>c){
        System.out.println("the second largest number is"+a);
      }
      else{
        System.out.println("the second largest number is"+c);
      }
    }
    else if (c>a && c>b) {
      if (a>b){
        System.out.println("the second largest number is"+a);
      }
      else{
        System.out.println("the second largest number is"+b);
      }
    }
  }
}
