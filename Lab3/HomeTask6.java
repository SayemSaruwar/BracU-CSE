import java.util.Scanner;
public class HomeTask6{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer");
    int number = sc.nextInt();
    int count=0;
    int total = 0;
    for(int i = 1; i<number; i++){
      if(number%i==0){
        count++;
        total += i;
      }
    }
    if(count==1){
      System.out.println(number+" is a prime number");
    }
    else{
      System.out.println(number+" is not a prime number");
    }
    if(total==number){
      System.out.println(number+" is a perfect number");
    }
    else{
      System.out.println(number+" is not a perfect number");
    }
  }
}
