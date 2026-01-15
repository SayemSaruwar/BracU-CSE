import java.util.Scanner;
public class HomeTask3{
  public static double calcTax(int age, int salary){
    double tax = 0.0;
    if(age<18 || salary<10000){
      tax = 0.0;
    }
    else if(salary>=10000 && salary<=20000){
      tax = (salary*0.07);
    }
    else if(salary>20000){
      tax = (salary*0.14);
    }
    return tax;
  }
  public static void calcYearlyTax(){
    double total = 0.0;
    Scanner sc = new Scanner(System.in);
    int age =0;
    for(int i =0; i<=12; i++){
      if(i==0){
        age = sc.nextInt();
      }
      else{
        int salary = sc.nextInt();
        System.out.print("Month"+i+" tax: ");
        double x = calcTax(age, salary);
        System.out.println(x);
        total+=x;
      }
    }
    System.out.println("Total Yearly Tax: "+total);
  }
  public static void main(String [] args){
    double t = calcTax(20,18000);
    System.out.println(t);
    calcYearlyTax();
  }
}