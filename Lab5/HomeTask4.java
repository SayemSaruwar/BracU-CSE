//HomeTask4
import java.util.Scanner;
public class HomeTask4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 1; i<=n; i++){
      for(int space = n-i; space>=1; space--){
        System.out.print(" ");
      }
      for(int number =1; number<=2*i-1; number++){
        if(number==1 || number==2*i-1){
          System.out.print(number);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    for(int i =n-1; i>=1; i--){
      for(int space = n-1; space>=i; space--){
        System.out.print(" ");
      }
      for(int number = 1; number<= 2*i-1; number++){
        if(number==1 || number==2*i-1){
        System.out.print(number);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}