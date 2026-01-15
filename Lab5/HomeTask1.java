//HomeTask1
import java.util.Scanner;
public class HomeTask1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int space = n-i; space>=1; space--){
        System.out.print(" ");
      }
      for(int number =1; number<=2*i-1; number++){
        System.out.print(number);
      }
      System.out.println();
    }
    for(int i =n-1; i>=1; i--){
      for(int space = n-1; space>=i; space--){
        System.out.print(" ");
      }
      for(int number = 1; number<= 2*i-1; number++){
        System.out.print(number);
      }
      System.out.println();
    }
  }
}
