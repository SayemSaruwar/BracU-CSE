import java.util.Scanner;
public class HomeTask1{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("N: ");
    int n = sc.nextInt();
    int[] array = new int[n];
    for(int i = 0; i<n; i++){
      array[i] = sc.nextInt();
    }
    System.out.println("Original array: ");
    for(int i = 0; i<n; i++){
      System.out.print(array[i]+" ");
    }
    System.out.println();
    for(int i =0; i<n; i++){
      if(array[i]>0){
        array[i] = 1;
      }
      else if(array[i]<0){
        array[i] =0;
      }
    }
    System.out.println("After modifying: ");
    for(int i = 0; i<n; i++){
      System.out.print(array[i]+" ");
    }
  }
}
