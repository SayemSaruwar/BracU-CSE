//HomeTask5
import java.util.Scanner;
public class HomeTask5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =1;
    for(int i = n; i>=1; i--){
      for(int space = i; space>=1; space--){
        System.out.print(" ");
      }
      for(int num = 1; num<=count ; num++){
        System.out.print(num);
      }
      for(int num = count-1; num>= 1; num--){
        System.out.print(num);
      }
      count++;
      System.out.println();
    }
  }
}