//Task5

import java.util.Scanner;
public class HomeTask5{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka) ");
    int cost = sc.nextInt();
    System.out.println("Enter the amount, customer gave(Taka) ");
    int cash = sc.nextInt();
    if(cost>cash){
      int payMore = cost - cash;
      System.out.printf("Please pay %d taka more\n", payMore);
    }
    else if(cost<cash){
      int giveBack = cash - cost;
      System.out.printf("The returned amount is %d taka\n", giveBack);
      System.out.println("100 taka note: "+ giveBack/100);
      int remMoney = giveBack%100;
      System.out.println("50 taka note: "+ remMoney/50);
      remMoney = remMoney%50;
      System.out.println("20 taka note: "+ remMoney/20);
      remMoney = remMoney%20;
      System.out.println("10 taka note: "+ remMoney/10);
      remMoney = remMoney%10;
      System.out.println("5 taka coin: "+ remMoney/5);
      remMoney = remMoney%5;
      System.out.println("2 taka coin: "+ remMoney/2);
      remMoney = remMoney%2;
      System.out.println("1 taka coin: "+ remMoney/1);
      remMoney = remMoney%1;
    }
    else{
      int needToPay = cash-cost;
      System.out.printf("The returned amount is %d taka\n.", needToPay);
    }
  }
}
