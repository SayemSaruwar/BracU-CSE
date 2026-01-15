//Task2
import java.util.Scanner;
public class HomeTask2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    System.out.println("Enter your electricity consumption amount: ");
    int kWh = sc.nextInt();
    double cost=0;
    if(age<18 && age>0){
      cost =  (kWh*15)-((kWh*15)*0.2);
    }
    else if(age>=18 && age<=60){
      cost  = (kWh*15);
    }
    else if(age>60){
      cost =  (kWh*15)-((kWh*15)*0.1);
    }
    if(kWh>100){
      cost = cost + (cost*0.05);
    }
    System.out.println("Final Bill: "+cost+" Taka");
  }
}
