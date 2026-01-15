import java.util.Scanner;
public class HomeTask5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the N-digit vault code:");
    int number = sc.nextInt();
    int x =number;
    int digits = 0;
    while(number>0){
      number/=10;
      digits++;
    }
    int n=1;
    for(int i = 1; i<digits; i++){
      n*=10;
    }
    while(n>=1){
      int y = x/n;
      x = x%n;
      System.out.printf("%d ,",y);
      n/=10;
    }
  }
}