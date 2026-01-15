import java.util.Scanner;
public class HomeTask1{
  public static boolean isPrime(int n){
    if(n<=1){
      return false;
    }
    for(int i = 2; i<n; i++){
      if(n%i==0){
        return false;
      }
    }
    return true;
  }
  public static boolean isPerfect(int n){
    int total = 0;
    if(n<=1){
      return false;
    }
    for(int i =1; i<n; i++){
      if(n%i==0){
        total+=i;
      }
    }
    if(total==n){
      return true;
    }
    return false;
  }
  public static int special_sum(int n){
    int sum =0;
    for(int i =0; i<=n; i++){
      if(isPrime(i)==true){
        sum+=i;
      }
      else if(isPerfect(i)==true){
        sum+=i;
      }
    }
    return sum;
  }
  public static void main(String [] args){
    boolean check = isPrime(10);
    System.out.println(check);
    check = isPerfect(6);
    System.out.println(check);
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int result = special_sum(x);
    System.out.println(result);

  }
}
