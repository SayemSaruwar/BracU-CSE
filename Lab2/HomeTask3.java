//Task3
import java.util.Scanner;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first float number ");
    float number1 = sc.nextFloat();
    System.out.println("Enter the second float number ");
    float number2 = sc.nextFloat();
    System.out.println("Enter the third float number ");
    float number3 = sc.nextFloat();
    if(number1> number2 && number1>number3){
      System.out.println("Maximum number is "+ number1);
    }
    else if (number2> number1 && number2>number3){
      System.out.println("Maximum number is "+ number2);
    }
    else{
     System.out.println("Maximum number is "+ number3); 
    }
    if(number1<number2 && number1<number3){
      System.out.println("Minimum number is "+ number1);
    }
    else if(number2<number1 && number2<number3){
      System.out.println("Minimum number is "+ number2);
    }
    else{
      System.out.println("Minimum number is "+ number3);
    }
  }
}
