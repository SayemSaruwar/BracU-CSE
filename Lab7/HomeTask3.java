import java.util.Scanner;
public class HomeTask3{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the array: ");
    int n = sc.nextInt();
    Double[] array = new Double[n];
    for(int i = 0; i<n; i++){
      System.out.println("Enter a number: ");
      array[i] = sc.nextDouble();
    }
    Double max = array[0];
    int maxIndex =0;
    Double total = 0.0;
    for(int i = 0; i<n; i++){
      total += array[i];
      if(array[i]>max){
        max = array[i];
        maxIndex = i;
      }
    }
    Double min = array[0];
    int minIndex = 0;
    for(int i = 0; i<n; i++){
      if(array[i]<min){
        min = array[i];
        minIndex = i;
      }
    }
    System.out.println("Maximum element "+max+" found at index "+maxIndex);
    System.out.println("Minimum element "+min+" found at index "+minIndex);
    System.out.println("Summation: "+total);
    System.out.println("Average: "+(total/n));
  }
}