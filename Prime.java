public class Prime{
  public static void main(String[] args){
    int num = 13;
    for (int i=2;i<num;i++){
      if (num%i==0){
        System.out.println("not prime");
      }
      else{
        System.out.println("prime");
      }
    }
  }
}
