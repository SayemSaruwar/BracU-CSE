import java.util.Scanner;
public class HomeTask8{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int input = sc.nextInt();
    int posCount = 0;
    int negCount = 0;
    for(int i = 1; i<=input; i++){
      System.out.print("Enter number"+i+":");
      int number = sc.nextInt();
      if(number>=0){
        posCount++;
      }
      else{
        negCount++;
      }
    }
    System.out.println(posCount+" Non-negative Numbers");
    System.out.println(negCount+" negative Numbers");
  }
}