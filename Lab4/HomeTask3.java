import java.util.Scanner;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of days: ");
    int dayCount = sc.nextInt();
    for(int i = 1; i<=dayCount; i++){
      System.out.println("Enter sales for day"+i+": ");
      double total = 0;
      for(int product= 1; product<=3; product++){
        double sale = sc.nextDouble();
        total+=sale;
      }
      if(total>=100 && total<200){
        total = total + (total*0.02);
      }
      else if(total>=200 && total<500){
        total = total + (total*0.05);
      }
      else if(total>=500) {
        total = total + (total*0.1);
      }
      System.out.println("Day"+i+": Total Sales with Tax: "+total);
    }
  }
}