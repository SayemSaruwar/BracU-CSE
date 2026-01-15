//HomeTask3
import java.util.Scanner;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count =1;
    for(int row = n; row>=1; row--){
      for(int space = 1; space<= row-1; space++){
        System.out.print(" ");
      }
      for(int number  =1; number<=2*count-1; number++){
        if(row==1 || row==n){
          System.out.print(number);
        }
        else if(number==1 || number==2*count-1){
          System.out.print(number);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
      count++;
    }
  }
}