public class HomeTask2{
  public static int power(int base, int exponent){
    if(exponent==1){
      return base;
    }
    else{
      return base*power(base, exponent-1);
    }
  }
  public static void main(String [] args){
    int x = power(5,3);
    System.out.println(x);
  }
}