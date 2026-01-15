//Task4

import java.util.Scanner;
public class Hometask4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first side of the triangle: ");
    double side1 = sc.nextDouble();
    System.out.println("Enter the second side of the triangle: ");
    double side2 =  sc.nextDouble();
    System.out.println("Enter the third side of the triangle: ");
    double side3 = sc.nextDouble();
    if(side1==side2 && side2==side3){
      System.out.println("This is a Equilateral triangle");
    }
    else if(side1==side2 || side2==side3 || side1==side3){
      System.out.println("This is a Isosceles triangle");
    }
    else{
      System.out.println("This is a Scalene triangle");
    }
  }
}
