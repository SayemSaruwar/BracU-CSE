import java.util.Scanner;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Energy amount:");
    int energy = sc.nextInt();
    System.out.println("Enter Number of rivers:");
    int rivers = sc.nextInt();
    for(int i = 1; i<=rivers; i++){
      System.out.println("Enter river Distance D"+i);
      int distance = sc.nextInt();
      if(distance<=5){
        energy-=2;
      }
      else{
        energy=energy-(distance/2);
      }
      if(energy<0){
        System.out.println("Tired at river "+i);
        break;
      }
      else if(i==rivers){
        System.out.println("All Done");
        System.out.println(energy+" energy left");
      }
    }
  }
}