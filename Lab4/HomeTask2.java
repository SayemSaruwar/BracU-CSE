import java.util.Scanner;
public class HomeTask2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of students to check: ");
    int students = sc.nextInt();
    for(int i = 1; i<=students; i++){
      System.out.println("Enter student ID: ");
      double number = sc.nextDouble();
      while(number>1){
        number/=2;
        if(number%2==0.0){
          continue;
        }
        else{
          break;
        }
      }
      if(number==1){
        System.out.println("Lucky ID");
      }
      else{
        System.out.println("Not Lucky ID");
      }
    }
  }
}