//HomeTask2
import java.util.Scanner;
public class HomeTask2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int row = n; row>=1; row--){
      for(int space = row-1; space>=1; space--){
        System.out.print(" ");
      }
      for(int number = row; number<=n; number++){
        if(row == n || row==n-1 || row == 1){
        System.out.print(number);
        }
        else if(number==row || number == n){
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