import java.util.Scanner;
public class HomeTask4{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the length array 1: ");
    int n1 = sc.nextInt();
    int [] array1 = new int[n1];
    System.out.println("Please enter the elements of the arr1: ");
    for(int i = 0; i<n1; i++){
      array1[i] = sc.nextInt();
    }
    System.out.println("Please enter the length array 2: ");
    int n2 = sc.nextInt();
    int [] array2 = new int[n2];
    System.out.println("Please enter the elements of the arr2: ");
    for(int i = 0; i<n2; i++){
      array2[i] = sc.nextInt();
    }
    boolean subset = true;
    for(int i = 0; i<n2; i++){
      boolean flag = false;
      for(int j =0; j<n1; j++){
        if(array1[j]==array2[i]){
          flag = true;
          break;
        }
      }
      if(flag == false){
        subset = false;
        break;
      }
    }
    if(subset==false){
      System.out.println("Array 2 is not a subset of Array 1.");
    }
    else{
      System.out.println("Array 2 is a subset of Array 1.");
    }
  }
}