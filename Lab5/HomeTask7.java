//HomeTask7
import java.util.Scanner;
public class HomeTask7{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = n;
    int x =3;
    for(int row = 1; row<=n; row++){
      if(count>=1){
        for(int space = 1; space<row; space++){
          System.out.print(" ");
        }
        for(int num = 1; num<=count; num++){
          System.out.print(num);
        }
        count-=2;
        System.out.println();
      }
      else{
        for(int space = 1; space<=n-row; space++){
          System.out.print(" ");
        }
        for(int num =1; num<=x; num++){
          System.out.print(num);
        }
        x+=2;
        System.out.println();
      }
    }
  }
}