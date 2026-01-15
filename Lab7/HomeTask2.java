import java.util.Scanner;
public class HomeTask2{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("N: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i = 0; i<n; i++){
      System.out.println("Enter a number: ");
      array[i] = sc.nextInt();
    }
    int num = sc.nextInt();
    boolean flag = false;
    int index = 0;
    for(int i =0; i<n; i++){
      if(array[i]==num){
        flag = true;
        index = i;
       break;
      }
    }
    if(flag == true){
      System.out.println(num+" is at index "+index);
    }
    else{
      System.out.println("Element not found");
    }
  }
}