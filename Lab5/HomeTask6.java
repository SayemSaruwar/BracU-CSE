//HomeTask6
import java.util.Scanner;
public class HomeTask6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =n;
    for(int row = 1; row<=n; row++){
      for(int space = 1; space<row; space++){
        System.out.print(" ");
      }
      for(int num =1; num<=count; num++){
        System.out.print(num);
      }
      for(int num =count-1; num>=1; num--){
        System.out.print(num);
      }
      count--;
      System.out.println();
    }
  }
}